from .composer import Composer
from .attribute import Attribute

# class writer for getters and setters
class GetSet(Composer):
    def __init__(self, **values):

        # check that kind is either 'get' or 'set'
        kind = values.get('kind', '')
        assert isinstance(kind, str), "'kind' must be of type 'str'"
        assert kind == 'get' or kind == 'set' or kind == '', "'kind' must be either 'get' or 'set'"
        self.kind = kind

        # check that varname is a string
        varname = values.get('varname', '')
        assert isinstance(varname, str), "'varname' must be of type 'str'"
        self.varname = varname

        # var that will be set by set_var
        self.attrs = []

    # use the local varname,
    # and the inputed list of attributes to set the correct Attribute to var
    def set_attr(self, all_attrs: [Attribute]):

        # if this is a getter or setter for all, possible_vars shoudl just be attrs
        if self.varname == 'all':
            possible_vars = all_attrs
        else:
            # remove all that do not have varname as a name
            possible_vars = list(filter(lambda x: x.name == self.varname, all_attrs))

        num_of_possibilities = len(possible_vars)

        if num_of_possibilities == 0:
            raise ValueError(f'There are no attributes matching \'{self.varname}\'')
        else:
            self.attrs = possible_vars

    def write(self, lang):
        s = []
        if lang == 'java':
            # got through all attrs and write them to the attr arr
            for attr in self.attrs:
                attr_arr = []
                first_letter_cap = attr.name.capitalize()

                if self.kind == 'get':
                    attr_arr.append('\t')
                    attr_arr.append('public ')
                    attr_arr.append(attr.kind)
                    attr_arr.append(' get')
                    attr_arr.append(first_letter_cap)
                    attr_arr.append('()')
                    attr_arr.append('\n\t')
                    attr_arr.append('{')
                    attr_arr.append('\n\t\t')
                    attr_arr.append('return ')
                    attr_arr.append(attr.name)
                    attr_arr.append(';')
                    attr_arr.append('\n\t')
                    attr_arr.append('}')
                    attr_arr.append('\n')
                elif self.kind == 'set':
                    attr_arr.append('\t')
                    attr_arr.append('public void set')
                    attr_arr.append(first_letter_cap)
                    attr_arr.append('(')
                    attr_arr.append(attr.kind)
                    attr_arr.append(' ')
                    attr_arr.append(attr.name)
                    attr_arr.append(')')
                    attr_arr.append('\n\t')
                    attr_arr.append('{')
                    attr_arr.append('\n\t\t')
                    attr_arr.append('this.')
                    attr_arr.append(attr.name)
                    attr_arr.append(' = ')
                    attr_arr.append(attr.name)
                    attr_arr.append(';')
                    attr_arr.append('\n\t')
                    attr_arr.append('}')
                    attr_arr.append('\n')

                s.append(''.join(attr_arr))
        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ''.join(s)

