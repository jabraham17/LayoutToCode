from .composer import Composer
from .modifier import Modifier
from .parameter import Parameter

class Method(Composer):
    def __init__(self, **values):
        # check that mod is a modifier
        mod = values.get('mod', Modifier())
        assert isinstance(mod, Modifier), "'mod' must be of type 'Modifier'"
        self.mod = mod

        # name of the method should be a str
        name = values.get('name', '')
        assert isinstance(name, str), "'name' must be of type 'str'"
        self.name = name

        # list of parameters, note that references are ignored
        params = values.get('params', [])
        assert isinstance(params, list), "'params' must be of type 'list'"
        self.params: [Parameter] = params

        # the type to be returned
        # if blank the method is void
        rtype = values.get('rtype', '')
        assert isinstance(rtype, str), "'name' must be of type 'str'"
        self.rtype = rtype

    # setup each parameter, setting default names
    def setup_params(self):
        default_varname = 'var'
        num_defaults = 1
        for param in self.params:
            # check if a default var name needs to be set
            if param.name is None:
                param.name = f'{default_varname}{num_defaults}'
                num_defaults += 1

    def write(self, lang):

        # setup the paramaters
        self.setup_params()

        s = []
        if lang == 'java':
            # iniatal tab
            s.append('\t')

            # add mod str
            mod_str = self.mod.mod_str(lang)
            if mod_str != '':
                s.append(mod_str)
                s.append(' ')

            # return type of the method
            r_str = self.rtype if self.rtype != '' else 'void'
            s.append(r_str)
            s.append(' ')

            # method name and parameters
            s.append(self.name)
            s.append('(')
            p = []
            for param in self.params:
                p.append(param.param_str(lang))
            s.append(', '.join(p))
            s.append(')')

            # new line
            s.append('\n')
            #brackets
            s.append('\t{\n\t\t\n\t}\n')

        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ''.join(s)

