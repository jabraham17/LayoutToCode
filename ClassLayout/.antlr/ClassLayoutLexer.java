// Generated from /Users/abraham/Development/Python/uml_to_code/ClassLayout/ClassLayout.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClassLayoutLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AccessModifier=1, StaticModifier=2, FinalModifier=3, Seperator=4, ReturnSpecifier=5, 
		ParamaterSeperator=6, ValueAssignment=7, DefaultKeyword=8, GetKeyword=9, 
		SetKeyword=10, AllKeyword=11, Name=12, Value=13, Newline=14, Comment=15, 
		Whitespace=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Lowercase", "Uppercase", "Digit", "AccessModifier", "StaticModifier", 
		"FinalModifier", "Seperator", "ReturnSpecifier", "ParamaterSeperator", 
		"ValueAssignment", "DefaultKeyword", "GetKeyword", "SetKeyword", "AllKeyword", 
		"Name", "Value", "Newline", "Comment", "Whitespace"
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


	public ClassLayoutLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ClassLayout.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\5\20U\n\20\3\20\3\20\3\20\3\20\7\20[\n\20\f\20\16\20^\13\20\3\21\6\21"+
		"a\n\21\r\21\16\21b\3\21\3\21\6\21g\n\21\r\21\16\21h\5\21k\n\21\3\21\3"+
		"\21\7\21o\n\21\f\21\16\21r\13\21\3\21\5\21u\n\21\3\22\5\22x\n\22\3\22"+
		"\3\22\6\22|\n\22\r\22\16\22}\3\23\3\23\3\23\3\23\7\23\u0084\n\23\f\23"+
		"\16\23\u0087\13\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\4p\u0085\2"+
		"\25\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r"+
		"\37\16!\17#\20%\21\'\22\3\2\7\3\2c|\3\2C\\\3\2\62;\5\2%%--//\4\2\13\13"+
		"\"\"\2\u009b\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3"+
		"\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2\2\2\27=\3\2\2\2"+
		"\31E\3\2\2\2\33I\3\2\2\2\35M\3\2\2\2\37T\3\2\2\2!t\3\2\2\2#{\3\2\2\2%"+
		"\177\3\2\2\2\'\u008c\3\2\2\2)*\t\2\2\2*\4\3\2\2\2+,\t\3\2\2,\6\3\2\2\2"+
		"-.\t\4\2\2.\b\3\2\2\2/\60\t\5\2\2\60\n\3\2\2\2\61\62\7u\2\2\62\f\3\2\2"+
		"\2\63\64\7h\2\2\64\16\3\2\2\2\65\66\7<\2\2\66\20\3\2\2\2\678\7@\2\28\22"+
		"\3\2\2\29:\7.\2\2:\24\3\2\2\2;<\7?\2\2<\26\3\2\2\2=>\7f\2\2>?\7g\2\2?"+
		"@\7h\2\2@A\7c\2\2AB\7w\2\2BC\7n\2\2CD\7v\2\2D\30\3\2\2\2EF\7i\2\2FG\7"+
		"g\2\2GH\7v\2\2H\32\3\2\2\2IJ\7u\2\2JK\7g\2\2KL\7v\2\2L\34\3\2\2\2MN\7"+
		"c\2\2NO\7n\2\2OP\7n\2\2P\36\3\2\2\2QU\5\3\2\2RU\5\5\3\2SU\7a\2\2TQ\3\2"+
		"\2\2TR\3\2\2\2TS\3\2\2\2U\\\3\2\2\2V[\5\3\2\2W[\5\5\3\2X[\5\7\4\2Y[\7"+
		"a\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]"+
		"\3\2\2\2] \3\2\2\2^\\\3\2\2\2_a\5\7\4\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2cj\3\2\2\2df\7\60\2\2eg\5\7\4\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2ik\3\2\2\2jd\3\2\2\2jk\3\2\2\2ku\3\2\2\2lp\7)\2\2mo\13\2\2"+
		"\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7)\2"+
		"\2t`\3\2\2\2tl\3\2\2\2u\"\3\2\2\2vx\7\17\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2"+
		"\2\2y|\7\f\2\2z|\7\17\2\2{w\3\2\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3"+
		"\2\2\2~$\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085\3"+
		"\2\2\2\u0082\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\5#\22\2\u0089\u008a\3\2\2\2\u008a\u008b\b\23\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\t\6\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\24\2\2"+
		"\u008f(\3\2\2\2\17\2TZ\\bhjptw{}\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}