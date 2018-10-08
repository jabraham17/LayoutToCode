ANTLR=java -Xmx500M -cp ${ANTLR_PATH}:${CLASSPATH} org.antlr.v4.Tool

GRAMMAR=ClassLayout.g4

OUTPUT=ClassLayout

buildGrammar: clean mkdirs
	$(ANTLR) -o $(OUTPUT) -Dlanguage=Python3 $(GRAMMAR)

mkdirs:
	mkdir -p $(OUTPUT)

clean:
	rm -r $(OUTPUT)