import antlr4 as a4
from ClassLayout.ClassLayoutLexer import ClassLayoutLexer
from ClassLayout.ClassLayoutParser import ClassLayoutParser
from .file import FileListener

# compile for java
def compile(filename):
    
    # prepare file to be parsed
    inputfile = a4.FileStream(filename)
    lexer = ClassLayoutLexer(inputfile)
    stream = a4.CommonTokenStream(lexer)
    # parse to a tree
    parser = ClassLayoutParser(stream)
    tree = parser.u2cFile()

    # open the listener
    fl = FileListener()

    # walk the tree
    walker = a4.ParseTreeWalker()
    walker.walk(fl, tree)

    print(fl.c.write('java'))
