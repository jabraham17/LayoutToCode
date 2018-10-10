from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from class_composer.getset import GetSet

# listener to handle getters and setters
class GetSetListener(ClassLayoutListener):
    def __init__(self):
        self.getset = GetSet()

    def enterGetset(self, ctx: ClassLayoutParser.GetsetContext):

        # setup kind, whether get or set
        if ctx.GetKeyword():
            self.getset.kind = 'get'
        else:
            self.getset.kind = 'set'

        # if all, set varname to all and later it will be handled
        # otherwise just use the varname supplied
        if ctx.AllKeyword():
            self.getset.varname = 'all'
        else:
            self.getset.varname = ctx.Name().getText()
