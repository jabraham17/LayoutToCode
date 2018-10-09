from ClassLayout.ClassLayoutParser import ClassLayoutParser
from ClassLayout.ClassLayoutListener import ClassLayoutListener
from ClassLayoutListenerJava.attribute_listener import AttributeListener

#listener to handle body rule
class BodyListener(ClassLayoutListener):
    def __init__(self):
        self.content = ''

    def enterBody(self, ctx:ClassLayoutParser.BodyContext):
        body = []
        #determine what type each child is and split off into seperate listeners
        for a in ctx.getChildren():
            #get the correct listener, should always be one of these 4
            if isinstance(a, ClassLayoutParser.AttributeContext):
                listener = AttributeListener()
            elif isinstance(a, ClassLayoutParser.ConstructorContext):
                listener = ConstructorListener()
            elif isinstance(a, ClassLayoutParser.MethodContext):
                listener = MethodListener()
            elif isinstance(a, ClassLayoutParser.GetsetContext):
                listener = GetSetListener()
            else
                raise TypeError('Type of element in the body was not handled')

            a.enterRule(listener)
            body.append(listener.content)

        self.content = '\n'.join(body)
