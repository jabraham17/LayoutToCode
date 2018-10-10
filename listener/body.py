from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from .attribute import AttributeListener
from .constructor import ConstructorListener
from .method import MethodListener
from .getset import GetSetListener
from class_composer.class_composer import Class
from class_composer.attribute import Attribute

# listener to handle body rule
class BodyListener(ClassLayoutListener):
    def __init__(self, cla: Class):
        self.cla = cla

    def enterBody(self, ctx:ClassLayoutParser.BodyContext):
        # determine what type each child is and split off into seperate listeners
        for a in ctx.getChildren():
            # get the correct listener, should always be one of these 4
            if isinstance(a, ClassLayoutParser.AttributeContext):
                attr = Attribute()
                listener = AttributeListener(attr)
                a.enterRule(listener)
                self.cla.comp.append(attr)
            elif isinstance(a, ClassLayoutParser.ConstructorContext):
                listener = ConstructorListener()
                a.enterRule(listener)
                # self.cla.comp.append(listener.attr)
            elif isinstance(a, ClassLayoutParser.MethodContext):
                listener = MethodListener()
                a.enterRule(listener)
                # self.cla.comp.append(listener.attr)
            elif isinstance(a, ClassLayoutParser.GetsetContext):
                listener = GetSetListener()
                a.enterRule(listener)
                # self.cla.comp.append(listener.attr)
            else:
                raise TypeError('Type of element in the body was not handled')
