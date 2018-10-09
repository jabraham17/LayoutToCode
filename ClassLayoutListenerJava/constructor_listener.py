from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener

#listener to handle constructors
class ConstructorListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''