from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from ClassLayoutListenerJava.header_listener import HeaderListener
from ClassLayoutListenerJava.body_listener import BodyListener

#listener to handle the whole file
class FileListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterU2cFile(self, ctx : ClassLayoutParser.U2cFileContext):

        h_listener = HeaderListener()
        ctx.classHeading().enterRule(h_listener)

        b_listener = BodyListener()
        ctx.body().enterRule(b_listener)

        self.content = h_listener.content + b_listener.content


