// Generated from /Users/abraham/Development/Python/uml_to_code/ClassLayout/ClassLayout.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassLayoutParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AccessModifier=1, StaticModifier=2, FinalModifier=3, Seperator=4, ReturnSpecifier=5, 
		ParamaterSeperator=6, ValueAssignment=7, DefaultKeyword=8, GetKeyword=9, 
		SetKeyword=10, AllKeyword=11, Name=12, Value=13, Newline=14, Comment=15, 
		Whitespace=16;
	public static final int
		RULE_u2cFile = 0, RULE_classHeading = 1, RULE_superClass = 2, RULE_attribute = 3, 
		RULE_defaultValue = 4, RULE_constructor = 5, RULE_constructorParameter = 6, 
		RULE_method = 7, RULE_methodReturnType = 8, RULE_methodParameter = 9, 
		RULE_getset = 10, RULE_modifiers = 11, RULE_staticModifier = 12, RULE_finalModifier = 13, 
		RULE_variable = 14, RULE_variableReference = 15;
	public static final String[] ruleNames = {
		"u2cFile", "classHeading", "superClass", "attribute", "defaultValue", 
		"constructor", "constructorParameter", "method", "methodReturnType", "methodParameter", 
		"getset", "modifiers", "staticModifier", "finalModifier", "variable", 
		"variableReference"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'s'", "'f'", "':'", "'>'", "','", "'='", "'default'", "'get'", 
		"'set'", "'all'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AccessModifier", "StaticModifier", "FinalModifier", "Seperator", 
		"ReturnSpecifier", "ParamaterSeperator", "ValueAssignment", "DefaultKeyword", 
		"GetKeyword", "SetKeyword", "AllKeyword", "Name", "Value", "Newline", 
		"Comment", "Whitespace"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ClassLayout.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassLayoutParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class U2cFileContext extends ParserRuleContext {
		public ClassHeadingContext classHeading() {
			return getRuleContext(ClassHeadingContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClassLayoutParser.EOF, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<GetsetContext> getset() {
			return getRuleContexts(GetsetContext.class);
		}
		public GetsetContext getset(int i) {
			return getRuleContext(GetsetContext.class,i);
		}
		public U2cFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u2cFile; }
	}

	public final U2cFileContext u2cFile() throws RecognitionException {
		U2cFileContext _localctx = new U2cFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_u2cFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			classHeading();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AccessModifier) | (1L << StaticModifier) | (1L << FinalModifier) | (1L << DefaultKeyword) | (1L << GetKeyword) | (1L << SetKeyword) | (1L << Name) | (1L << Newline))) != 0)) {
				{
				setState(37);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(33);
					attribute();
					}
					break;
				case 2:
					{
					setState(34);
					constructor();
					}
					break;
				case 3:
					{
					setState(35);
					method();
					}
					break;
				case 4:
					{
					setState(36);
					getset();
					}
					break;
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassHeadingContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public TerminalNode Newline() { return getToken(ClassLayoutParser.Newline, 0); }
		public SuperClassContext superClass() {
			return getRuleContext(SuperClassContext.class,0);
		}
		public ClassHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeading; }
	}

	public final ClassHeadingContext classHeading() throws RecognitionException {
		ClassHeadingContext _localctx = new ClassHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classHeading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			modifiers();
			setState(45);
			match(Name);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Seperator) {
				{
				setState(46);
				superClass();
				}
			}

			setState(49);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperClassContext extends ParserRuleContext {
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public SuperClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superClass; }
	}

	public final SuperClassContext superClass() throws RecognitionException {
		SuperClassContext _localctx = new SuperClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_superClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Seperator);
			setState(52);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public TerminalNode Newline() { return getToken(ClassLayoutParser.Newline, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			modifiers();
			setState(55);
			variable();
			setState(56);
			match(Name);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ValueAssignment) {
				{
				setState(57);
				defaultValue();
				}
			}

			setState(60);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode ValueAssignment() { return getToken(ClassLayoutParser.ValueAssignment, 0); }
		public TerminalNode Value() { return getToken(ClassLayoutParser.Value, 0); }
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ValueAssignment);
			setState(63);
			match(Value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Newline() { return getToken(ClassLayoutParser.Newline, 0); }
		public TerminalNode DefaultKeyword() { return getToken(ClassLayoutParser.DefaultKeyword, 0); }
		public List<ConstructorParameterContext> constructorParameter() {
			return getRuleContexts(ConstructorParameterContext.class);
		}
		public ConstructorParameterContext constructorParameter(int i) {
			return getRuleContext(ConstructorParameterContext.class,i);
		}
		public List<TerminalNode> ParamaterSeperator() { return getTokens(ClassLayoutParser.ParamaterSeperator); }
		public TerminalNode ParamaterSeperator(int i) {
			return getToken(ClassLayoutParser.ParamaterSeperator, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			modifiers();
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DefaultKeyword:
				{
				setState(66);
				match(DefaultKeyword);
				}
				break;
			case Name:
			case Newline:
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Name) {
					{
					setState(67);
					constructorParameter();
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ParamaterSeperator) {
						{
						{
						setState(68);
						match(ParamaterSeperator);
						setState(69);
						constructorParameter();
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorParameterContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstructorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorParameter; }
	}

	public final ConstructorParameterContext constructorParameter() throws RecognitionException {
		ConstructorParameterContext _localctx = new ConstructorParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructorParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(81);
				variableReference();
				}
				break;
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(84);
				variable();
				}
				break;
			}
			setState(87);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public TerminalNode Newline() { return getToken(ClassLayoutParser.Newline, 0); }
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public MethodReturnTypeContext methodReturnType() {
			return getRuleContext(MethodReturnTypeContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			modifiers();
			setState(90);
			match(Name);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					methodParameter();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ParamaterSeperator) {
				{
				setState(97);
				methodReturnType();
				}
			}

			setState(100);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReturnTypeContext extends ParserRuleContext {
		public TerminalNode ParamaterSeperator() { return getToken(ClassLayoutParser.ParamaterSeperator, 0); }
		public TerminalNode ReturnSpecifier() { return getToken(ClassLayoutParser.ReturnSpecifier, 0); }
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public MethodReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturnType; }
	}

	public final MethodReturnTypeContext methodReturnType() throws RecognitionException {
		MethodReturnTypeContext _localctx = new MethodReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ParamaterSeperator);
			setState(103);
			match(ReturnSpecifier);
			setState(104);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParameterContext extends ParserRuleContext {
		public TerminalNode ParamaterSeperator() { return getToken(ClassLayoutParser.ParamaterSeperator, 0); }
		public List<TerminalNode> Name() { return getTokens(ClassLayoutParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ClassLayoutParser.Name, i);
		}
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ParamaterSeperator);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(107);
				match(Name);
				setState(108);
				match(Seperator);
				}
				break;
			}
			setState(111);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetsetContext extends ParserRuleContext {
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public TerminalNode Newline() { return getToken(ClassLayoutParser.Newline, 0); }
		public TerminalNode GetKeyword() { return getToken(ClassLayoutParser.GetKeyword, 0); }
		public TerminalNode SetKeyword() { return getToken(ClassLayoutParser.SetKeyword, 0); }
		public TerminalNode AllKeyword() { return getToken(ClassLayoutParser.AllKeyword, 0); }
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public GetsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getset; }
	}

	public final GetsetContext getset() throws RecognitionException {
		GetsetContext _localctx = new GetsetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==GetKeyword || _la==SetKeyword) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(Seperator);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==AllKeyword || _la==Name) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(ClassLayoutParser.AccessModifier, 0); }
		public StaticModifierContext staticModifier() {
			return getRuleContext(StaticModifierContext.class,0);
		}
		public FinalModifierContext finalModifier() {
			return getRuleContext(FinalModifierContext.class,0);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AccessModifier) {
				{
				setState(118);
				match(AccessModifier);
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StaticModifier) {
				{
				setState(121);
				staticModifier();
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FinalModifier) {
				{
				setState(124);
				finalModifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticModifierContext extends ParserRuleContext {
		public TerminalNode StaticModifier() { return getToken(ClassLayoutParser.StaticModifier, 0); }
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public StaticModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticModifier; }
	}

	public final StaticModifierContext staticModifier() throws RecognitionException {
		StaticModifierContext _localctx = new StaticModifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_staticModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(StaticModifier);
			setState(128);
			match(Seperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalModifierContext extends ParserRuleContext {
		public TerminalNode FinalModifier() { return getToken(ClassLayoutParser.FinalModifier, 0); }
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public FinalModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalModifier; }
	}

	public final FinalModifierContext finalModifier() throws RecognitionException {
		FinalModifierContext _localctx = new FinalModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_finalModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FinalModifier);
			setState(131);
			match(Seperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public TerminalNode Seperator() { return getToken(ClassLayoutParser.Seperator, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Name);
			setState(134);
			match(Seperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ClassLayoutParser.Name, 0); }
		public List<TerminalNode> Seperator() { return getTokens(ClassLayoutParser.Seperator); }
		public TerminalNode Seperator(int i) {
			return getToken(ClassLayoutParser.Seperator, i);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(Name);
			setState(137);
			match(Seperator);
			setState(138);
			match(Seperator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\5\7N\n\7\5\7P\n\7\3\7\3\7\3\b\5"+
		"\bU\n\b\3\b\5\bX\n\b\3\b\3\b\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\t\5"+
		"\te\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13p\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\5\rz\n\r\3\r\5\r}\n\r\3\r\5\r\u0080\n\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\2\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\13\f\3\2\r\16\2\u008f"+
		"\2\"\3\2\2\2\4.\3\2\2\2\6\65\3\2\2\2\b8\3\2\2\2\n@\3\2\2\2\fC\3\2\2\2"+
		"\16T\3\2\2\2\20[\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2\26s\3\2\2\2\30y\3\2\2"+
		"\2\32\u0081\3\2\2\2\34\u0084\3\2\2\2\36\u0087\3\2\2\2 \u008a\3\2\2\2\""+
		")\5\4\3\2#(\5\b\5\2$(\5\f\7\2%(\5\20\t\2&(\5\26\f\2\'#\3\2\2\2\'$\3\2"+
		"\2\2\'%\3\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)"+
		"\3\2\2\2,-\7\2\2\3-\3\3\2\2\2./\5\30\r\2/\61\7\16\2\2\60\62\5\6\4\2\61"+
		"\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\20\2\2\64\5\3\2\2\2\65"+
		"\66\7\6\2\2\66\67\7\16\2\2\67\7\3\2\2\289\5\30\r\29:\5\36\20\2:<\7\16"+
		"\2\2;=\5\n\6\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\20\2\2?\t\3\2\2\2@A\7"+
		"\t\2\2AB\7\17\2\2B\13\3\2\2\2CO\5\30\r\2DP\7\n\2\2EJ\5\16\b\2FG\7\b\2"+
		"\2GI\5\16\b\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2"+
		"\2\2ME\3\2\2\2MN\3\2\2\2NP\3\2\2\2OD\3\2\2\2OM\3\2\2\2PQ\3\2\2\2QR\7\20"+
		"\2\2R\r\3\2\2\2SU\5 \21\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5\36\20\2WV"+
		"\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\16\2\2Z\17\3\2\2\2[\\\5\30\r\2\\`\7\16"+
		"\2\2]_\5\24\13\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2ce\5\22\n\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\20\2\2g\21\3\2\2\2"+
		"hi\7\b\2\2ij\7\7\2\2jk\7\16\2\2k\23\3\2\2\2lo\7\b\2\2mn\7\16\2\2np\7\6"+
		"\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\16\2\2r\25\3\2\2\2st\t\2\2\2tu"+
		"\7\6\2\2uv\t\3\2\2vw\7\20\2\2w\27\3\2\2\2xz\7\3\2\2yx\3\2\2\2yz\3\2\2"+
		"\2z|\3\2\2\2{}\5\32\16\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\5\34"+
		"\17\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\7\4"+
		"\2\2\u0082\u0083\7\6\2\2\u0083\33\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u0086"+
		"\7\6\2\2\u0086\35\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\6\2\2\u0089"+
		"\37\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7\6\2"+
		"\2\u008d!\3\2\2\2\21\')\61<JMOTW`doy|\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}