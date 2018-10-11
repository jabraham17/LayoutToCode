
# struct for a a modifier set
class Modifier:
    def __init__(self, **values):
        # make sure acccess modifier is a str and is one of the following '', 'pri', 'pub', 'pro'
        acc = values.get('acc', '')
        assert isinstance(acc, str), "'mod' must be of type 'str'"
        assert acc == '' or acc == 'pri' or acc == 'pub' or acc == 'pro', "the 'mod value passed was not valid'"
        self.acc = acc

        # make sure stat is a bool
        stat = values.get('stat', False)
        assert isinstance(stat, bool), "'stat' must be of type 'bool'"
        self.stat = stat

        # make sure fin is a bool
        fin = values.get('fin', False)
        assert isinstance(fin, bool), "'fin' must be of type 'bool'"
        self.fin = fin

    # return the modfiers as as string
    def mod_str(self, lang):
        s = []
        if lang == 'java':
            if self.acc == 'pri':
                s.append('private')
            elif self.acc == 'pub':
                s.append('public')
            elif self.acc == 'pro':
                s.append('protected')

            if self.stat:
                s.append('static')

            if self.fin:
                s.append('final')
        else:
            raise ValueError('Language passed did not match any currently supported languages')

        return ' '.join(s)
