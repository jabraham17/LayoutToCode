from .composer import Composer
from .modifier import Modifier

# frame work for an attribute
class Attribute(Composer):
    def __init__(self, **values):

        # check that mod is a modifier
        mod = values.get('mod', Modifier())
        assert isinstance(mod, Modifier), "'mod' must be of type 'Modifier'"
        self.mod = mod

        # check that name is a str
        name = values.get('name', '')
        assert isinstance(name, str), "'name' must be of type 'str'"
        self.name = name

        # check that kind is a str
        # NOTE: kind is same thing as type, using kind to avoid namespace issues
        kind = values.get('kind', '')
        assert isinstance(kind, str), "'name' must be of type 'str'"
        self.kind = kind

        # default value can be whatever the user passes
        dval = values.get('dval', '')
        self.dval = dval

    # return the code for this class in the specified language
    def write(self, lang):
        s = []
        if lang == 'java':

            # get the modifier string
            mod_str = self.mod.mod_str(lang)
            if mod_str != '':
                s.append(mod_str)

            if self.kind == '':
                raise ValueError('No type was supplied for variable')
            else:
                s.append(self.kind)

            if self.name == '':
                raise ValueError('No name for variable was supplied')
            else:
                s.append(self.name)
        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return '\t' + ' '.join(s) + ';\n'
