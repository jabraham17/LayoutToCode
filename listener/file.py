from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from .header import HeaderListener
from .body import BodyListener
from class_composer.class_composer import Class

# listener to handle the whole file
class FileListener(ClassLayoutListener):
    def __init__(self):
        self.c = Class()

    def enterU2cFile(self, ctx : ClassLayoutParser.U2cFileContext):

        h_listener = HeaderListener(self.c)
        ctx.classHeading().enterRule(h_listener)

        b_listener = BodyListener(self.c)
        ctx.body().enterRule(b_listener)


