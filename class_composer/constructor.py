from .composer import Composer
from .modifier import Modifier
from .attribute import Attribute
from .parameter import Parameter

class Constructor(Composer):
    def __init__(self, **values):

        # check that mod is a modifier
        mod = values.get('mod', Modifier())
        assert isinstance(mod, Modifier), "'mod' must be of type 'Modifier'"
        self.mod = mod

        # name of the class should be a str
        name = values.get('name', '')
        assert isinstance(name, str), "'name' must be of type 'str'"
        self.name = name

        # check that the kind is a str and is either 'def' for default or 'par' for parameterized
        kind = values.get('kind', '')
        assert isinstance(kind, str), "'kind' must be of type 'str'"
        assert kind == 'def' or kind == 'par' or kind == '', "'kind' must be either 'def' or 'par'"
        self.kind = kind

        # list of attributes with default values to be set
        def_attrs = values.get('def_attrs', [Attribute])
        assert isinstance(def_attrs, type([Attribute])), "'def_attrs' must be a list of type 'Attribute'"
        self.def_attrs = def_attrs

        # list of parameters
        params = values.get('params', [])
        assert isinstance(params, list), "'params' must be of type 'list'"
        self.params: [Parameter] = params

    # setup each parameter, setting default names and adding reference attrs
    def setup_params(self, attrs: [Attribute]):

        # before we begin, def_attrs must be set
        self.def_attrs = list(filter(lambda x: x.dval is not None, attrs))

        default_varname = 'var'
        num_defaults = 1
        for param in self.params:
            # check if a default var name needs to be set
            if param.name is None:
                param.name = f'{default_varname}{num_defaults}'
                num_defaults += 1
            # check if a reference attr needs to be set
            possible_ref = list(filter(lambda x: param.ref == x.name, attrs))
            if len(possible_ref) == 1:
                param.ref_attr = possible_ref[0]
                # we have found a ref_attr, but what if that attr has a default value
                # we no longer want it, so we remove it from the default attrs list
                if param.ref_attr in self.def_attrs:
                    self.def_attrs.remove(param.ref_attr)

    def write(self, lang):

        s = []
        if lang == 'java':
            # inistal tab
            s.append('\t')

            # add mod str
            mod_str = self.mod.mod_str(lang)
            if mod_str != '':
                s.append(mod_str)
                s.append(' ')

            # have constructor write header line
            s.append(self.name)
            s.append('(')
            p = []
            for param in self.params:
                p.append(param.param_str(lang))
            s.append(', '.join(p))
            s.append(')')

            # new line
            s.append('\n')
            s.append('\t')
            s.append('{')
            s.append('\n')
            s.append('\t\t')

            r = []
            # run all params with refs
            for param in filter(lambda x: x.ref_attr is not None, self.params):
                param_ref = []
                param_ref.append('this.')
                param_ref.append(param.ref)
                param_ref.append(' = ')
                param_ref.append(param.name)
                param_ref.append(';')
                r.append(''.join(param_ref))

            # run all default values
            for attr in self.def_attrs:
                param_def = []
                param_def.append('this.')
                param_def.append(attr.name)
                param_def.append(' = ')
                param_def.append(attr.dval)
                param_def.append(';')
                r.append(''.join(param_def))

            # add all param and default values
            s.append('\n\t\t'.join(r))

            # close constructor
            s.append('\n\t')
            s.append('}')
            s.append('\n')

        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ''.join(s)
