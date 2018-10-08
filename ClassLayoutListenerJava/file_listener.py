import antlr4 as a4
from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from ClassLayoutListenerJava.header_listener import HeaderListener

#listener to handle the whole file
class FileListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterU2cFile(self, ctx : ClassLayoutParser.U2cFileContext):

        listener = HeaderListener()
        ctx.classHeading().enterRule(listener)
        self.content = listener.content

        map(ctx.attribute())

