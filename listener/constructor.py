from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from class_composer.constructor import Constructor
from .modifier import ModifierListener
from class_composer.parameter import Parameter

# listener to handle constructors
class ConstructorListener(ClassLayoutListener):
    def __init__(self):
        self.constructor = Constructor()

    def enterConstructor(self, ctx: ClassLayoutParser.ConstructorContext):

        # handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        self.constructor.mod = modifier_listener.mod

        # if its default, dont try and run params
        if ctx.DefaultKeyword():
            self.constructor.kind = 'def'
        else:
            # run the param listener for each param
            for child in ctx.getChildren():
                if isinstance(child, ClassLayoutParser.ConstructorParameterContext):
                    child.enterRule(self)

    def enterConstructorParameter(self, ctx: ClassLayoutParser.ConstructorParameterContext):
        param = Parameter()
        # check if a var name has been supplied and set if it has
        if ctx.variable():
            param.name = ctx.variable().Name().getText()
        # check if a ref has been supplied and set if it has
        if ctx.variableReference():
            param.ref = ctx.variableReference().Name().getText()
        # ckind should always be supplied
        param.kind = ctx.Name().getText()
        self.constructor.params.append(param)
