from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from class_composer.method import Method
from .modifier import ModifierListener
from class_composer.parameter import Parameter


# listener to handle methods
class MethodListener(ClassLayoutListener):
    def __init__(self):
        self.method = Method()

    def enterMethod(self, ctx: ClassLayoutParser.MethodContext):

        # handle the modifiers
        modifier_listener = ModifierListener()
        ctx.modifiers().enterRule(modifier_listener)
        self.method.mod = modifier_listener.mod

        # get the methods name
        self.method.name = ctx.Name().getText()

        for child in ctx.getChildren():
            if isinstance(child, ClassLayoutParser.MethodParameterContext) or \
                    isinstance(child, ClassLayoutParser.MethodReturnTypeContext):
                child.enterRule(self)

    def enterMethodParameter(self, ctx: ClassLayoutParser.MethodParameterContext):
        param = Parameter()
        # check if a var name has been supplied and set if it has
        if ctx.methodParameterVar():
            param.name = ctx.methodParameterVar().Name().getText()
        # ckind should always be supplied
        param.kind = ctx.Name().getText()
        self.method.params.append(param)

    def enterMethodReturnType(self, ctx: ClassLayoutParser.MethodReturnTypeContext):
        # check for a type
        if ctx.Name():
            # there is a type, set it
            self.method.rtype = ctx.Name().getText()
