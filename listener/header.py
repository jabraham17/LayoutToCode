from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from .modifier import ModifierListener
from class_composer.class_composer import Class

# listener to handle the header
class HeaderListener(ClassLayoutListener):
    def __init__(self, cla: Class):
        self.cla = cla

    def enterClassHeading(self, ctx: ClassLayoutParser.ClassHeadingContext):

        # handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        self.cla.mod = modifier_listener.mod

        # get the class name
        self.cla.name = ctx.Name().getText()

        # check for a super type
        if ctx.superClass():
            self.cla.sname = ctx.superClass().Name().getText()
