from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener

#listener to handle attributes
class AttributeListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterAttribute(self, ctx:ClassLayoutParser.AttributeContext):

        attribute = []

        # handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        attribute.append(modifier_listener.content)

        #get the variable name and type
        attribute.append(ctx.Name().getText())
        attribute.append(ctx.variable().getText())

