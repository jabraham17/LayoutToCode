from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from .modifier import ModifierListener
from class_composer.attribute import Attribute

# listener to handle attributes
class AttributeListener(ClassLayoutListener):
    def __init__(self, attr: Attribute):
        self.attr = attr

    def enterAttribute(self, ctx: ClassLayoutParser.AttributeContext):

        # handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        self.attr.mod = modifier_listener.mod

        # get the variable name and type
        self.attr.name = ctx.variable().Name().getText()
        self.attr.kind = ctx.Name().getText()

        # check for default value
        if ctx.defaultValue():
            self.attr.dval = ctx.defaultValue().Value().getText()
