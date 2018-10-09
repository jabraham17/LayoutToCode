from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from ClassLayoutListenerJava.modifier_listener import  ModifierListener

#listener to handle the header
class HeaderListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterClassHeading(self, ctx:ClassLayoutParser.ClassHeadingContext):

        heading = []

        #handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        heading.append(modifier_listener.content)

        #get the class name
        heading.append(ctx.Name().getText())

        #check for a super type
        if ctx.superClass():
            heading.append(f'extends {ctx.superClass().Name().getText()}')

        self.content = ' '.join(heading)
