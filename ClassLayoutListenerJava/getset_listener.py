from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener

#listener to handle getters and setters
class GetSetListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''