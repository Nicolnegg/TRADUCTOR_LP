// Generated from C:/Users/princ/IdeaProjects/Traductor_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Tkn_equals=1, Tkn_period=2, Tkn_comma=3, Tkn_colon=4, Tkn_left_brac=5, 
		Tkn_right_brac=6, Tkn_left_paren=7, Tkn_right_paren=8, Tkn_plus=9, Tkn_minus=10, 
		Tkn_times=11, Tkn_div=12, Tkn_leq=13, Tkn_geq=14, Tkn_diff=15, Tkn_less=16, 
		Tkn_greater=17, If=18, Else=19, Then=20, EndIf=21, ElseIf=22, Goto=23, 
		While=24, EndWhile=25, For=26, EndFor=27, To=28, Step=29, Sub=30, EndSub=31, 
		Array=32, Stack=33, Program=34, True=35, False=36, TextWindow=37, Or=38, 
		And=39, Tkn_number=40, Tkn_text=41, ESPACIO=42, Id=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Tkn_equals", "Tkn_period", "Tkn_comma", "Tkn_colon", "Tkn_left_brac", 
			"Tkn_right_brac", "Tkn_left_paren", "Tkn_right_paren", "Tkn_plus", "Tkn_minus", 
			"Tkn_times", "Tkn_div", "Tkn_leq", "Tkn_geq", "Tkn_diff", "Tkn_less", 
			"Tkn_greater", "If", "Else", "Then", "EndIf", "ElseIf", "Goto", "While", 
			"EndWhile", "For", "EndFor", "To", "Step", "Sub", "EndSub", "Array", 
			"Stack", "Program", "True", "False", "TextWindow", "Or", "And", "Tkn_number", 
			"Tkn_text", "ESPACIO", "Id"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'.'", "','", "':'", "'['", "']'", "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'<='", "'>='", "'<>'", "'<'", "'>'", "'If'", "'Else'", 
			"'Then'", "'EndIf'", "'ElseIf'", "'Goto'", "'While'", "'EndWhile'", "'For'", 
			"'EndFor'", "'To'", "'Step'", "'Sub'", "'EndSub'", "'Array'", "'Stack'", 
			"'Program'", "'\"TRUE\"'", "'\"FALSE\"'", "'TextWindow'", "'Or'", "'And'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Tkn_equals", "Tkn_period", "Tkn_comma", "Tkn_colon", "Tkn_left_brac", 
			"Tkn_right_brac", "Tkn_left_paren", "Tkn_right_paren", "Tkn_plus", "Tkn_minus", 
			"Tkn_times", "Tkn_div", "Tkn_leq", "Tkn_geq", "Tkn_diff", "Tkn_less", 
			"Tkn_greater", "If", "Else", "Then", "EndIf", "ElseIf", "Goto", "While", 
			"EndWhile", "For", "EndFor", "To", "Step", "Sub", "EndSub", "Array", 
			"Stack", "Program", "True", "False", "TextWindow", "Or", "And", "Tkn_number", 
			"Tkn_text", "ESPACIO", "Id"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

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
		"\u0004\u0000+\u0127\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0004"+
		"\'\u00ff\b\'\u000b\'\f\'\u0100\u0001\'\u0001\'\u0005\'\u0105\b\'\n\'\f"+
		"\'\u0108\t\'\u0001\'\u0004\'\u010b\b\'\u000b\'\f\'\u010c\u0003\'\u010f"+
		"\b\'\u0001(\u0001(\u0005(\u0113\b(\n(\f(\u0116\t(\u0001(\u0001(\u0001"+
		")\u0004)\u011b\b)\u000b)\f)\u011c\u0001)\u0001)\u0001*\u0001*\u0005*\u0123"+
		"\b*\n*\f*\u0126\t*\u0000\u0000+\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+\u0001\u0000\u0006\u0001\u0000"+
		"09\u0001\u0000..\u0001\u0000\"\"\u0003\u0000\t\n\r\r  \u0018\u0000AZa"+
		"z\u00a0\u00a1\u00a3\u00b6\u00b8\u00bf\u00c2\u00c4\u00c6\u00c6\u0152\u0153"+
		"\u0160\u0161\u0178\u0178\u017d\u017e\u0192\u0192\u02c6\u02c6\u02dc\u02dc"+
		"\u2013\u2013\u2018\u201a\u201c\u201e\u2020\u2022\u2026\u2026\u2030\u2030"+
		"\u2039\u203a\u20ac\u20ac\u2122\u2122\u8000\ufffd\u8000\ufffd\u001a\u0000"+
		"09AZ__az\u00a0\u00a1\u00a3\u00b6\u00b8\u00bf\u00c2\u00c4\u00c6\u00c6\u0152"+
		"\u0153\u0160\u0161\u0178\u0178\u017d\u017e\u0192\u0192\u02c6\u02c6\u02dc"+
		"\u02dc\u2013\u2013\u2018\u201a\u201c\u201e\u2020\u2022\u2026\u2026\u2030"+
		"\u2030\u2039\u203a\u20ac\u20ac\u2122\u2122\u8000\ufffd\u8000\ufffd\u012d"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0001W\u0001\u0000\u0000\u0000\u0003Y"+
		"\u0001\u0000\u0000\u0000\u0005[\u0001\u0000\u0000\u0000\u0007]\u0001\u0000"+
		"\u0000\u0000\t_\u0001\u0000\u0000\u0000\u000ba\u0001\u0000\u0000\u0000"+
		"\rc\u0001\u0000\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011g\u0001"+
		"\u0000\u0000\u0000\u0013i\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000"+
		"\u0000\u0017m\u0001\u0000\u0000\u0000\u0019o\u0001\u0000\u0000\u0000\u001b"+
		"r\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fx\u0001"+
		"\u0000\u0000\u0000!z\u0001\u0000\u0000\u0000#|\u0001\u0000\u0000\u0000"+
		"%\u007f\u0001\u0000\u0000\u0000\'\u0084\u0001\u0000\u0000\u0000)\u0089"+
		"\u0001\u0000\u0000\u0000+\u008f\u0001\u0000\u0000\u0000-\u0096\u0001\u0000"+
		"\u0000\u0000/\u009b\u0001\u0000\u0000\u00001\u00a1\u0001\u0000\u0000\u0000"+
		"3\u00aa\u0001\u0000\u0000\u00005\u00ae\u0001\u0000\u0000\u00007\u00b5"+
		"\u0001\u0000\u0000\u00009\u00b8\u0001\u0000\u0000\u0000;\u00bd\u0001\u0000"+
		"\u0000\u0000=\u00c1\u0001\u0000\u0000\u0000?\u00c8\u0001\u0000\u0000\u0000"+
		"A\u00ce\u0001\u0000\u0000\u0000C\u00d4\u0001\u0000\u0000\u0000E\u00dc"+
		"\u0001\u0000\u0000\u0000G\u00e3\u0001\u0000\u0000\u0000I\u00eb\u0001\u0000"+
		"\u0000\u0000K\u00f6\u0001\u0000\u0000\u0000M\u00f9\u0001\u0000\u0000\u0000"+
		"O\u010e\u0001\u0000\u0000\u0000Q\u0110\u0001\u0000\u0000\u0000S\u011a"+
		"\u0001\u0000\u0000\u0000U\u0120\u0001\u0000\u0000\u0000WX\u0005=\u0000"+
		"\u0000X\u0002\u0001\u0000\u0000\u0000YZ\u0005.\u0000\u0000Z\u0004\u0001"+
		"\u0000\u0000\u0000[\\\u0005,\u0000\u0000\\\u0006\u0001\u0000\u0000\u0000"+
		"]^\u0005:\u0000\u0000^\b\u0001\u0000\u0000\u0000_`\u0005[\u0000\u0000"+
		"`\n\u0001\u0000\u0000\u0000ab\u0005]\u0000\u0000b\f\u0001\u0000\u0000"+
		"\u0000cd\u0005(\u0000\u0000d\u000e\u0001\u0000\u0000\u0000ef\u0005)\u0000"+
		"\u0000f\u0010\u0001\u0000\u0000\u0000gh\u0005+\u0000\u0000h\u0012\u0001"+
		"\u0000\u0000\u0000ij\u0005-\u0000\u0000j\u0014\u0001\u0000\u0000\u0000"+
		"kl\u0005*\u0000\u0000l\u0016\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000"+
		"n\u0018\u0001\u0000\u0000\u0000op\u0005<\u0000\u0000pq\u0005=\u0000\u0000"+
		"q\u001a\u0001\u0000\u0000\u0000rs\u0005>\u0000\u0000st\u0005=\u0000\u0000"+
		"t\u001c\u0001\u0000\u0000\u0000uv\u0005<\u0000\u0000vw\u0005>\u0000\u0000"+
		"w\u001e\u0001\u0000\u0000\u0000xy\u0005<\u0000\u0000y \u0001\u0000\u0000"+
		"\u0000z{\u0005>\u0000\u0000{\"\u0001\u0000\u0000\u0000|}\u0005I\u0000"+
		"\u0000}~\u0005f\u0000\u0000~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"E\u0000\u0000\u0080\u0081\u0005l\u0000\u0000\u0081\u0082\u0005s\u0000"+
		"\u0000\u0082\u0083\u0005e\u0000\u0000\u0083&\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005T\u0000\u0000\u0085\u0086\u0005h\u0000\u0000\u0086\u0087\u0005"+
		"e\u0000\u0000\u0087\u0088\u0005n\u0000\u0000\u0088(\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005E\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b"+
		"\u008c\u0005d\u0000\u0000\u008c\u008d\u0005I\u0000\u0000\u008d\u008e\u0005"+
		"f\u0000\u0000\u008e*\u0001\u0000\u0000\u0000\u008f\u0090\u0005E\u0000"+
		"\u0000\u0090\u0091\u0005l\u0000\u0000\u0091\u0092\u0005s\u0000\u0000\u0092"+
		"\u0093\u0005e\u0000\u0000\u0093\u0094\u0005I\u0000\u0000\u0094\u0095\u0005"+
		"f\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097\u0005G\u0000"+
		"\u0000\u0097\u0098\u0005o\u0000\u0000\u0098\u0099\u0005t\u0000\u0000\u0099"+
		"\u009a\u0005o\u0000\u0000\u009a.\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"W\u0000\u0000\u009c\u009d\u0005h\u0000\u0000\u009d\u009e\u0005i\u0000"+
		"\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0"+
		"0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005E\u0000\u0000\u00a2\u00a3\u0005"+
		"n\u0000\u0000\u00a3\u00a4\u0005d\u0000\u0000\u00a4\u00a5\u0005W\u0000"+
		"\u0000\u00a5\u00a6\u0005h\u0000\u0000\u00a6\u00a7\u0005i\u0000\u0000\u00a7"+
		"\u00a8\u0005l\u0000\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a92\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005F\u0000\u0000\u00ab\u00ac\u0005o\u0000"+
		"\u0000\u00ac\u00ad\u0005r\u0000\u0000\u00ad4\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005E\u0000\u0000\u00af\u00b0\u0005n\u0000\u0000\u00b0\u00b1\u0005"+
		"d\u0000\u0000\u00b1\u00b2\u0005F\u0000\u0000\u00b2\u00b3\u0005o\u0000"+
		"\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b46\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005T\u0000\u0000\u00b6\u00b7\u0005o\u0000\u0000\u00b78\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005S\u0000\u0000\u00b9\u00ba\u0005t\u0000"+
		"\u0000\u00ba\u00bb\u0005e\u0000\u0000\u00bb\u00bc\u0005p\u0000\u0000\u00bc"+
		":\u0001\u0000\u0000\u0000\u00bd\u00be\u0005S\u0000\u0000\u00be\u00bf\u0005"+
		"u\u0000\u0000\u00bf\u00c0\u0005b\u0000\u0000\u00c0<\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005E\u0000\u0000\u00c2\u00c3\u0005n\u0000\u0000\u00c3"+
		"\u00c4\u0005d\u0000\u0000\u00c4\u00c5\u0005S\u0000\u0000\u00c5\u00c6\u0005"+
		"u\u0000\u0000\u00c6\u00c7\u0005b\u0000\u0000\u00c7>\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005A\u0000\u0000\u00c9\u00ca\u0005r\u0000\u0000\u00ca"+
		"\u00cb\u0005r\u0000\u0000\u00cb\u00cc\u0005a\u0000\u0000\u00cc\u00cd\u0005"+
		"y\u0000\u0000\u00cd@\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005S\u0000"+
		"\u0000\u00cf\u00d0\u0005t\u0000\u0000\u00d0\u00d1\u0005a\u0000\u0000\u00d1"+
		"\u00d2\u0005c\u0000\u0000\u00d2\u00d3\u0005k\u0000\u0000\u00d3B\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005P\u0000\u0000\u00d5\u00d6\u0005r\u0000"+
		"\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\u00d8\u0005g\u0000\u0000\u00d8"+
		"\u00d9\u0005r\u0000\u0000\u00d9\u00da\u0005a\u0000\u0000\u00da\u00db\u0005"+
		"m\u0000\u0000\u00dbD\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\"\u0000"+
		"\u0000\u00dd\u00de\u0005T\u0000\u0000\u00de\u00df\u0005R\u0000\u0000\u00df"+
		"\u00e0\u0005U\u0000\u0000\u00e0\u00e1\u0005E\u0000\u0000\u00e1\u00e2\u0005"+
		"\"\u0000\u0000\u00e2F\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\"\u0000"+
		"\u0000\u00e4\u00e5\u0005F\u0000\u0000\u00e5\u00e6\u0005A\u0000\u0000\u00e6"+
		"\u00e7\u0005L\u0000\u0000\u00e7\u00e8\u0005S\u0000\u0000\u00e8\u00e9\u0005"+
		"E\u0000\u0000\u00e9\u00ea\u0005\"\u0000\u0000\u00eaH\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005T\u0000\u0000\u00ec\u00ed\u0005e\u0000\u0000\u00ed"+
		"\u00ee\u0005x\u0000\u0000\u00ee\u00ef\u0005t\u0000\u0000\u00ef\u00f0\u0005"+
		"W\u0000\u0000\u00f0\u00f1\u0005i\u0000\u0000\u00f1\u00f2\u0005n\u0000"+
		"\u0000\u00f2\u00f3\u0005d\u0000\u0000\u00f3\u00f4\u0005o\u0000\u0000\u00f4"+
		"\u00f5\u0005w\u0000\u0000\u00f5J\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"O\u0000\u0000\u00f7\u00f8\u0005r\u0000\u0000\u00f8L\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0005A\u0000\u0000\u00fa\u00fb\u0005n\u0000\u0000\u00fb"+
		"\u00fc\u0005d\u0000\u0000\u00fcN\u0001\u0000\u0000\u0000\u00fd\u00ff\u0007"+
		"\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0106\u0007"+
		"\u0001\u0000\u0000\u0103\u0105\u0007\u0000\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010f\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b\u0007"+
		"\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u00fe\u0001"+
		"\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010fP\u0001\u0000"+
		"\u0000\u0000\u0110\u0114\u0005\"\u0000\u0000\u0111\u0113\b\u0002\u0000"+
		"\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005\"\u0000\u0000\u0118R\u0001\u0000\u0000\u0000"+
		"\u0119\u011b\u0007\u0003\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0006)\u0000\u0000\u011fT\u0001\u0000\u0000\u0000\u0120\u0124"+
		"\u0007\u0004\u0000\u0000\u0121\u0123\u0007\u0005\u0000\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125V\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\b\u0000\u0100\u0106"+
		"\u010c\u010e\u0114\u011c\u0124\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}