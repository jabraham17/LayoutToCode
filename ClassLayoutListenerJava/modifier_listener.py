import antlr4 as a4
from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener

#listener to handle all modifiers, access, static, and final
class ModifierListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterModifiers(self, ctx:ClassLayoutParser.ModifiersContext):
        modifiers = []

        #handle the access modifiers
        if ctx.AccessModifier():
            access = ctx.AccessModifier().getText()
            if access == '-':
                modifiers.append('private')
            elif access == '+':
                modifiers.append('public')
            elif access == '#':
                modifiers.append('protected')

        # handle the static modifier
        if ctx.staticModifier():
            modifiers.append('static')

        # handle the final modifier
        if ctx.finalModifier():
            modifiers.append('final')

        self.content += ' '.join(modifiers)
