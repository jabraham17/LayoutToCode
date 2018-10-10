from .composer import Composer
from .modifier import Modifier

# frame work for a class
class Class(Composer):
    def __init__(self, **values):

        mod = values.get('mod', Modifier())
        assert isinstance(mod, Modifier), "'mod' must be of type 'Modifier'"
        self.mod = mod

        # check that name is a str
        name = values.get('name', '')
        assert isinstance(name, str), "'name' must be of type 'str'"
        self.name = name

        # check that sname is a str
        sname = values.get('sname', '')
        assert isinstance(sname, str), "'sname' must be of type 'str'"
        self.sname = sname

        # check that list of composer objects was composed entirely of composer objects
        comp = values.get('comp', [])
        assert all(isinstance(c, Composer) for c in comp), "All 'comp' values must be of type 'Composer'"
        self.comp = comp

    # get only the Composer values that are of type kind
    def get_all_of_kind(self, kind: type(Composer)):
        return list(filter(lambda x: isinstance(x, kind), self.comp))

    def write(self, lang):
        s = []
        if lang == 'java':

            # add mod str
            s.append(self.mod.mod_str(lang) + ' ')

            s.append('class ')
            if self.name == '':
                raise ValueError('No name for class was supplied')
            else:
                s.append(self.name)

            if self.sname != '':
                s.append(f' extends {self.sname}')

            s.append('\n')
            s.append('{')
            s.append('\n')

            for c in self.comp:
                s.append(c.write(lang))

            s.append('}')
            s.append('\n')
        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ''.join(s)
