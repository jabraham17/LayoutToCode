ANTLR=java -Xmx500M -cp antlr/antlr-4.7.1-complete.jar org.antlr.v4.Tool

GRAMMAR=ClassLayout.g4

OUTPUT=ClassLayout

GREEN=\033[0;32m
RED=\033[0;31m
COLOR_OFF=\033[0m

ENV=env
PYTHON=$(ENV)/bin/python
PIP=$(ENV)/bin/pip

.PHONY: runTest buildGrammar clean

# the envirmoent needs to be running to run
runTest: buildGrammar loadLibs
	@echo -e "$(GREEN)Running test.l2c through script inside of env$(COLOR_OFF)"
	@./$(PYTHON) layout2code.py test.l2c
	@echo -e "$(GREEN)Done$(COLOR_OFF)"

# save external libs in requirements.txt
saveLibs: mkEnv
	@echo -e "$(GREEN)Saving libs to requirements.txt$(COLOR_OFF)"
	@./$(PIP) -q freeze > requirements.txt
	@echo -e "$(GREEN)Done$(COLOR_OFF)"

# load external libs
loadLibs: mkEnv
	@echo -e "$(GREEN)Loading libs from requirements.txt$(COLOR_OFF)"
	@./$(PIP) -q install -r requirements.txt
	@echo -e "$(GREEN)Done$(COLOR_OFF)"

# creates python envirmoent
mkEnv:
	@if [ command -v virtualenv >/dev/null 2>&1 ] ; \
	then \
		echo -e "$(RED)virtualenv needs to be installed$(COLOR_OFF)"; \
	else \
		if [ ! -d $(ENV) ] ; \
		then \
			echo -e "$(GREEN)Creating $(ENV)$(COLOR_OFF)"; \
			virtualenv -q --python=python3.6 $(ENV); \
			echo -e "$(GREEN)Done$(COLOR_OFF)"; \
		else \
			echo -e "$(GREEN)$(ENV) already exists$(COLOR_OFF)"; \
		fi; \
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

cleanEnv:
	@echo -e "$(GREEN)Cleaning $(ENV)......$(COLOR_OFF)"
	@rm -rf $(ENV)
	@echo -e "$(GREEN)Done$(COLOR_OFF)"