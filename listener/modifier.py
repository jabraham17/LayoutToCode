from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from class_composer.composer import Composer
from class_composer.modifier import Modifier

# listener to handle all modifiers, access, static, and final
class ModifierListener(ClassLayoutListener):
    def __init__(self):
        self.mod = Modifier()

    def enterModifiers(self, ctx: ClassLayoutParser.ModifiersContext):

        # handle the access modifiers
        if ctx.AccessModifier():
            access = ctx.AccessModifier().getText()
            if access == '-':
                self.mod.acc = 'pri'
            elif access == '+':
                self.mod.acc = 'pub'
            elif access == '#':
                self.mod.acc = 'pro'

        # handle the static modifier
        if ctx.staticModifier():
            self.mod.stat = True

        # handle the final modifier
        if ctx.finalModifier():
            self.mod.fin = True
