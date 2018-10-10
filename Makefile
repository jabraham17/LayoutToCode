ANTLR=java -Xmx500M -cp antlr/antlr-4.7.1-complete.jar org.antlr.v4.Tool

GRAMMAR=ClassLayout.g4

OUTPUT=ClassLayout

GREEN=\033[0;32m
RED=\033[0;31m
COLOR_OFF=\033[0m

.PHONY: runTest buildGrammar clean

# the envirmoent needs to be running to run
runTest: buildGrammar
	@if [ -z "${VIRTUAL_ENV}" ] ; \
	then \
		echo -e "$(RED)Need to start the env$(COLOR_OFF)"; \
	else \
		echo -e "$(GREEN)Running test.l2c through script inside of env$(COLOR_OFF)"; \
		python layout2code.py test.l2c; \
		echo -e "$(GREEN)Done$(COLOR_OFF)"; \
	fi; \

buildGrammar: clean
	@echo -e "$(GREEN)Building grammar and creating listeners$(COLOR_OFF)"
	@mkdir -p $(OUTPUT)
	@$(ANTLR) -o $(OUTPUT) -Dlanguage=Python3 $(GRAMMAR)
	@echo -e "$(GREEN)Done$(COLOR_OFF)"

clean:
	@echo -e "$(GREEN)Cleaning......$(COLOR_OFF)"
	@rm -rf $(OUTPUT)
	@echo -e "$(GREEN)Done$(COLOR_OFF)"