
from .attribute import Attribute

# struct for a a parameter set
class Parameter:
    def __init__(self, **values):
        # make sure kind is a str
        kind = values.get('kind', '')
        assert isinstance(kind, str), "'kind' must be of type 'str'"
        self.kind = kind

        # if not set, will use a default var name
        # make sure name is a str
        name = values.get('name', None)
        assert isinstance(name, str) or isinstance(name, type(None)), "'name' must be of type 'str'"
        self.name = name

        # this is the reference name, only used in constructor to link params to attrs
        # make sure ref is a str
        ref = values.get('ref', '')
        assert isinstance(ref, str), "'ref' must be of type 'str'"
        self.ref = ref

        # the attr that is set from the ref
        self.ref_attr = None

    # set the ref_attr variable
    def set_attr(self, all_attrs: [Attribute]):

        # remove all vars from list that dont match the ref
        possible_vars = list(filter(lambda x: x.name == self.ref, all_attrs))

        num_of_possibilities = len(possible_vars)
        if num_of_possibilities == 0:
            raise ValueError(f'There are no attributes matching \'{self.ref}\'')
        elif num_of_possibilities >= 2:
            raise ValueError(f'There are multiple attributes matching \'{self.ref}\'')
        else:
            self.ref_attr = possible_vars[0]

    # return the params as a sting
    # note this will not print the ref, as this is used inside the block the parameters are apart of
    # the variable def_name is used if self.name is None, if both are none raise an error
    def param_str(self, lang):
        s = []
        if lang == 'java':
            s.append(self.kind)
            if self.name is not None:
                s.append(self.name)
            else:
                raise ValueError("This parameter has no name")
        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ' '.join(s)
