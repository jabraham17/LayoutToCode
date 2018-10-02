#!/bin/sh

cd ClassLayout
java -Xmx500M -cp "$ANTLR_PATH:$CLASSPATH" org.antlr.v4.Tool -Dlanguage=Python3 ClassLayout.g4
cd .antlr
javac *.java