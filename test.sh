#!/bin/sh

TEST_FILE=`pwd`
TEST_FILE=$TEST_FILE/$1
echo $TEST_FILE
cd ClassLayout/.antlr
java org.antlr.v4.gui.TestRig ClassLayout u2cFile -tokens -gui $TEST_FILE