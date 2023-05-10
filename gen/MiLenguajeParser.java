// Generated from C:/Users/Nicol/Documents/Lenguajes/TRADUCTOR_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeParser extends Parser {
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
	public static final int
		RULE_inicio = 0, RULE_sentencia = 1, RULE_sentenciaElse = 2, RULE_stepF = 3, 
<<<<<<< HEAD
		RULE_sub = 4, RULE_if = 5, RULE_while = 6, RULE_for = 7, RULE_identSentencia = 8, 
		RULE_identFor = 9, RULE_arrayAsignaciones = 10, RULE_valor = 11, RULE_variable = 12, 
		RULE_arrayOperacion = 13, RULE_operaciones = 14, RULE_operacionesLog = 15, 
		RULE_operacionesStep = 16, RULE_variableLog = 17, RULE_variableStep = 18, 
		RULE_sentenciaIf = 19, RULE_sentenciaElseIf = 20, RULE_funcionContinuidad = 21, 
		RULE_funcionVar = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencia", "sentenciaElse", "stepF", "sub", "if", "while", 
			"for", "identSentencia", "identFor", "arrayAsignaciones", "valor", "variable", 
			"arrayOperacion", "operaciones", "operacionesLog", "operacionesStep", 
			"variableLog", "variableStep", "sentenciaIf", "sentenciaElseIf", "funcionContinuidad", 
			"funcionVar"
=======
		RULE_identSentencia = 4, RULE_identFor = 5, RULE_arrayAsignaciones = 6, 
		RULE_valor = 7, RULE_variable = 8, RULE_arrayOperacion = 9, RULE_operaciones = 10, 
		RULE_operacionesLog = 11, RULE_operacionesStep = 12, RULE_variableLog = 13, 
		RULE_variableStep = 14, RULE_sentenciaIf = 15, RULE_sentenciaElseIf = 16, 
		RULE_funcionContinuidad = 17, RULE_funcionVar = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencia", "sentenciaElse", "stepF", "identSentencia", "identFor", 
			"arrayAsignaciones", "valor", "variable", "arrayOperacion", "operaciones", 
			"operacionesLog", "operacionesStep", "variableLog", "variableStep", "sentenciaIf", 
			"sentenciaElseIf", "funcionContinuidad", "funcionVar"
>>>>>>> origin/master
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

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(46);
			sentenciaElse();
			setState(47);
=======
			setState(38);
			sentenciaElse();
			setState(39);
>>>>>>> origin/master
			sentencia();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
<<<<<<< HEAD
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
=======
		public TerminalNode Sub() { return getToken(MiLenguajeParser.Sub, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public TerminalNode EndSub() { return getToken(MiLenguajeParser.EndSub, 0); }
>>>>>>> origin/master
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
<<<<<<< HEAD
			setState(53);
=======
			setState(48);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sub:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(49);
				sub();
				setState(50);
=======
				setState(41);
				match(Sub);
				setState(42);
				match(Id);
				setState(43);
				sentenciaElse();
				setState(44);
				match(EndSub);
				setState(45);
>>>>>>> origin/master
				inicio();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(52);
=======
				setState(47);
>>>>>>> origin/master
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaElseContext extends ParserRuleContext {
<<<<<<< HEAD
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public TerminalNode Goto() { return getToken(MiLenguajeParser.Goto, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
=======
		public TerminalNode If() { return getToken(MiLenguajeParser.If, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Then() { return getToken(MiLenguajeParser.Then, 0); }
		public SentenciaIfContext sentenciaIf() {
			return getRuleContext(SentenciaIfContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(MiLenguajeParser.EndIf, 0); }
		public List<SentenciaElseContext> sentenciaElse() {
			return getRuleContexts(SentenciaElseContext.class);
		}
		public SentenciaElseContext sentenciaElse(int i) {
			return getRuleContext(SentenciaElseContext.class,i);
		}
		public TerminalNode While() { return getToken(MiLenguajeParser.While, 0); }
		public TerminalNode EndWhile() { return getToken(MiLenguajeParser.EndWhile, 0); }
		public TerminalNode For() { return getToken(MiLenguajeParser.For, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public IdentForContext identFor() {
			return getRuleContext(IdentForContext.class,0);
		}
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
		public StepFContext stepF() {
			return getRuleContext(StepFContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(MiLenguajeParser.EndFor, 0); }
		public TerminalNode Goto() { return getToken(MiLenguajeParser.Goto, 0); }
>>>>>>> origin/master
		public TerminalNode Program() { return getToken(MiLenguajeParser.Program, 0); }
		public TerminalNode Tkn_period() { return getToken(MiLenguajeParser.Tkn_period, 0); }
		public FuncionContinuidadContext funcionContinuidad() {
			return getRuleContext(FuncionContinuidadContext.class,0);
		}
		public TerminalNode Stack() { return getToken(MiLenguajeParser.Stack, 0); }
		public TerminalNode TextWindow() { return getToken(MiLenguajeParser.TextWindow, 0); }
		public TerminalNode Array() { return getToken(MiLenguajeParser.Array, 0); }
		public IdentSentenciaContext identSentencia() {
			return getRuleContext(IdentSentenciaContext.class,0);
		}
		public SentenciaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaElseContext sentenciaElse() throws RecognitionException {
		SentenciaElseContext _localctx = new SentenciaElseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentenciaElse);
		try {
<<<<<<< HEAD
			setState(92);
=======
			setState(107);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(55);
				if_();
				setState(56);
=======
				setState(50);
				match(If);
				setState(51);
				match(Tkn_left_paren);
				setState(52);
				variable();
				setState(53);
				match(Tkn_right_paren);
				setState(54);
				match(Then);
				setState(55);
				sentenciaIf();
				setState(56);
				match(EndIf);
				setState(57);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(58);
				while_();
				setState(59);
=======
				setState(59);
				match(While);
				setState(60);
				match(Tkn_left_paren);
				setState(61);
				variable();
				setState(62);
				match(Tkn_right_paren);
				setState(63);
				sentenciaElse();
				setState(64);
				match(EndWhile);
				setState(65);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(61);
				for_();
				setState(62);
=======
				setState(67);
				match(For);
				setState(68);
				match(Id);
				setState(69);
				identFor();
				setState(70);
				match(Tkn_equals);
				setState(71);
				variable();
				setState(72);
				match(To);
				setState(73);
				variable();
				setState(74);
				stepF();
				setState(75);
				sentenciaElse();
				setState(76);
				match(EndFor);
				setState(77);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(64);
				match(Goto);
				setState(65);
				match(Id);
				setState(66);
=======
				setState(79);
				match(Goto);
				setState(80);
				match(Id);
				setState(81);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(67);
				match(Program);
				setState(68);
				match(Tkn_period);
				setState(69);
				funcionContinuidad();
				setState(70);
=======
				setState(82);
				match(Program);
				setState(83);
				match(Tkn_period);
				setState(84);
				funcionContinuidad();
				setState(85);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(72);
				match(Stack);
				setState(73);
				match(Tkn_period);
				setState(74);
				funcionContinuidad();
				setState(75);
=======
				setState(87);
				match(Stack);
				setState(88);
				match(Tkn_period);
				setState(89);
				funcionContinuidad();
				setState(90);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD
				setState(77);
				match(TextWindow);
				setState(78);
				match(Tkn_period);
				setState(79);
				funcionContinuidad();
				setState(80);
=======
				setState(92);
				match(TextWindow);
				setState(93);
				match(Tkn_period);
				setState(94);
				funcionContinuidad();
				setState(95);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< HEAD
				setState(82);
				match(Array);
				setState(83);
				match(Tkn_period);
				setState(84);
				funcionContinuidad();
				setState(85);
=======
				setState(97);
				match(Array);
				setState(98);
				match(Tkn_period);
				setState(99);
				funcionContinuidad();
				setState(100);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< HEAD
				setState(87);
				match(Id);
				setState(88);
				identSentencia();
				setState(89);
=======
				setState(102);
				match(Id);
				setState(103);
				identSentencia();
				setState(104);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case EOF:
			case Else:
			case EndIf:
			case ElseIf:
			case EndWhile:
			case EndFor:
			case Sub:
			case EndSub:
				enterOuterAlt(_localctx, 10);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StepFContext extends ParserRuleContext {
		public TerminalNode Step() { return getToken(MiLenguajeParser.Step, 0); }
		public VariableStepContext variableStep() {
			return getRuleContext(VariableStepContext.class,0);
		}
		public StepFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStepF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStepF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStepF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepFContext stepF() throws RecognitionException {
		StepFContext _localctx = new StepFContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stepF);
		try {
<<<<<<< HEAD
			setState(97);
=======
			setState(112);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Step:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(94);
				match(Step);
				setState(95);
=======
				setState(109);
				match(Step);
				setState(110);
>>>>>>> origin/master
				variableStep();
				}
				break;
			case If:
			case Goto:
			case While:
			case For:
			case EndFor:
			case Array:
			case Stack:
			case Program:
			case TextWindow:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
<<<<<<< HEAD
	public static class SubContext extends ParserRuleContext {
		public TerminalNode Sub() { return getToken(MiLenguajeParser.Sub, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public TerminalNode EndSub() { return getToken(MiLenguajeParser.EndSub, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Sub);
			setState(100);
			match(Id);
			setState(101);
			sentenciaElse();
			setState(102);
			match(EndSub);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MiLenguajeParser.If, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Then() { return getToken(MiLenguajeParser.Then, 0); }
		public SentenciaIfContext sentenciaIf() {
			return getRuleContext(SentenciaIfContext.class,0);
		}
		public TerminalNode EndIf() { return getToken(MiLenguajeParser.EndIf, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(If);
			setState(105);
			match(Tkn_left_paren);
			setState(106);
			variable();
			setState(107);
			match(Tkn_right_paren);
			setState(108);
			match(Then);
			setState(109);
			sentenciaIf();
			setState(110);
			match(EndIf);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MiLenguajeParser.While, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public TerminalNode EndWhile() { return getToken(MiLenguajeParser.EndWhile, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(While);
			setState(113);
			match(Tkn_left_paren);
			setState(114);
			variable();
			setState(115);
			match(Tkn_right_paren);
			setState(116);
			sentenciaElse();
			setState(117);
			match(EndWhile);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(MiLenguajeParser.For, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public IdentForContext identFor() {
			return getRuleContext(IdentForContext.class,0);
		}
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
		public StepFContext stepF() {
			return getRuleContext(StepFContext.class,0);
		}
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public TerminalNode EndFor() { return getToken(MiLenguajeParser.EndFor, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(For);
			setState(120);
			match(Id);
			setState(121);
			identFor();
			setState(122);
			match(Tkn_equals);
			setState(123);
			variable();
			setState(124);
			match(To);
			setState(125);
			variable();
			setState(126);
			stepF();
			setState(127);
			sentenciaElse();
			setState(128);
			match(EndFor);
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

	@SuppressWarnings("CheckReturnValue")
=======
>>>>>>> origin/master
	public static class IdentSentenciaContext extends ParserRuleContext {
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Tkn_colon() { return getToken(MiLenguajeParser.Tkn_colon, 0); }
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public ArrayAsignacionesContext arrayAsignaciones() {
			return getRuleContext(ArrayAsignacionesContext.class,0);
		}
		public IdentSentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identSentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIdentSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIdentSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIdentSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentSentenciaContext identSentencia() throws RecognitionException {
		IdentSentenciaContext _localctx = new IdentSentenciaContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 16, RULE_identSentencia);
		try {
			setState(140);
=======
		enterRule(_localctx, 8, RULE_identSentencia);
		try {
			setState(124);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(130);
				match(Tkn_left_paren);
				setState(131);
=======
				setState(114);
				match(Tkn_left_paren);
				setState(115);
>>>>>>> origin/master
				match(Tkn_right_paren);
				}
				break;
			case Tkn_colon:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(132);
=======
				setState(116);
>>>>>>> origin/master
				match(Tkn_colon);
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(133);
				match(Tkn_equals);
				setState(134);
=======
				setState(117);
				match(Tkn_equals);
				setState(118);
>>>>>>> origin/master
				variable();
				}
				break;
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(135);
				match(Tkn_left_brac);
				setState(136);
				variable();
				setState(137);
				match(Tkn_right_brac);
				setState(138);
=======
				setState(119);
				match(Tkn_left_brac);
				setState(120);
				variable();
				setState(121);
				match(Tkn_right_brac);
				setState(122);
>>>>>>> origin/master
				arrayAsignaciones();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentForContext extends ParserRuleContext {
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public IdentForContext identFor() {
			return getRuleContext(IdentForContext.class,0);
		}
		public IdentForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIdentFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIdentFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIdentFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentForContext identFor() throws RecognitionException {
		IdentForContext _localctx = new IdentForContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 18, RULE_identFor);
		try {
			setState(148);
=======
		enterRule(_localctx, 10, RULE_identFor);
		try {
			setState(132);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(142);
				match(Tkn_left_brac);
				setState(143);
				variable();
				setState(144);
				match(Tkn_right_brac);
				setState(145);
=======
				setState(126);
				match(Tkn_left_brac);
				setState(127);
				variable();
				setState(128);
				match(Tkn_right_brac);
				setState(129);
>>>>>>> origin/master
				identFor();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAsignacionesContext extends ParserRuleContext {
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public ArrayAsignacionesContext arrayAsignaciones() {
			return getRuleContext(ArrayAsignacionesContext.class,0);
		}
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public ArrayAsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAsignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArrayAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArrayAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArrayAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAsignacionesContext arrayAsignaciones() throws RecognitionException {
		ArrayAsignacionesContext _localctx = new ArrayAsignacionesContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 20, RULE_arrayAsignaciones);
		try {
			setState(157);
=======
		enterRule(_localctx, 12, RULE_arrayAsignaciones);
		try {
			setState(141);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(150);
				match(Tkn_left_brac);
				setState(151);
				variable();
				setState(152);
				match(Tkn_right_brac);
				setState(153);
=======
				setState(134);
				match(Tkn_left_brac);
				setState(135);
				variable();
				setState(136);
				match(Tkn_right_brac);
				setState(137);
>>>>>>> origin/master
				arrayAsignaciones();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(155);
				match(Tkn_equals);
				setState(156);
=======
				setState(139);
				match(Tkn_equals);
				setState(140);
>>>>>>> origin/master
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode True() { return getToken(MiLenguajeParser.True, 0); }
		public TerminalNode False() { return getToken(MiLenguajeParser.False, 0); }
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public ArrayOperacionContext arrayOperacion() {
			return getRuleContext(ArrayOperacionContext.class,0);
		}
		public TerminalNode Tkn_number() { return getToken(MiLenguajeParser.Tkn_number, 0); }
		public TerminalNode Tkn_text() { return getToken(MiLenguajeParser.Tkn_text, 0); }
		public TerminalNode Program() { return getToken(MiLenguajeParser.Program, 0); }
		public TerminalNode Tkn_period() { return getToken(MiLenguajeParser.Tkn_period, 0); }
		public FuncionContinuidadContext funcionContinuidad() {
			return getRuleContext(FuncionContinuidadContext.class,0);
		}
		public TerminalNode Stack() { return getToken(MiLenguajeParser.Stack, 0); }
		public TerminalNode TextWindow() { return getToken(MiLenguajeParser.TextWindow, 0); }
		public TerminalNode Array() { return getToken(MiLenguajeParser.Array, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 22, RULE_valor);
		try {
			setState(181);
=======
		enterRule(_localctx, 14, RULE_valor);
		try {
			setState(165);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(159);
				match(Tkn_left_paren);
				setState(160);
				variable();
				setState(161);
=======
				setState(143);
				match(Tkn_left_paren);
				setState(144);
				variable();
				setState(145);
>>>>>>> origin/master
				match(Tkn_right_paren);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(163);
=======
				setState(147);
>>>>>>> origin/master
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(164);
=======
				setState(148);
>>>>>>> origin/master
				match(False);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(165);
				match(Id);
				setState(166);
=======
				setState(149);
				match(Id);
				setState(150);
>>>>>>> origin/master
				arrayOperacion();
				}
				break;
			case Tkn_number:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(167);
=======
				setState(151);
>>>>>>> origin/master
				match(Tkn_number);
				}
				break;
			case Tkn_text:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(168);
=======
				setState(152);
>>>>>>> origin/master
				match(Tkn_text);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD
				setState(169);
				match(Program);
				setState(170);
				match(Tkn_period);
				setState(171);
=======
				setState(153);
				match(Program);
				setState(154);
				match(Tkn_period);
				setState(155);
>>>>>>> origin/master
				funcionContinuidad();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< HEAD
				setState(172);
				match(Stack);
				setState(173);
				match(Tkn_period);
				setState(174);
=======
				setState(156);
				match(Stack);
				setState(157);
				match(Tkn_period);
				setState(158);
>>>>>>> origin/master
				funcionContinuidad();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< HEAD
				setState(175);
				match(TextWindow);
				setState(176);
				match(Tkn_period);
				setState(177);
=======
				setState(159);
				match(TextWindow);
				setState(160);
				match(Tkn_period);
				setState(161);
>>>>>>> origin/master
				funcionContinuidad();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 10);
				{
<<<<<<< HEAD
				setState(178);
				match(Array);
				setState(179);
				match(Tkn_period);
				setState(180);
=======
				setState(162);
				match(Array);
				setState(163);
				match(Tkn_period);
				setState(164);
>>>>>>> origin/master
				funcionContinuidad();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 24, RULE_variable);
		try {
			setState(190);
=======
		enterRule(_localctx, 16, RULE_variable);
		try {
			setState(174);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
			case Array:
			case Stack:
			case Program:
			case True:
			case False:
			case TextWindow:
			case Tkn_number:
			case Tkn_text:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(183);
				valor();
				setState(184);
=======
				setState(167);
				valor();
				setState(168);
>>>>>>> origin/master
				operaciones();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(186);
				match(Tkn_minus);
				setState(187);
				valor();
				setState(188);
=======
				setState(170);
				match(Tkn_minus);
				setState(171);
				valor();
				setState(172);
>>>>>>> origin/master
				operaciones();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayOperacionContext extends ParserRuleContext {
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public ArrayOperacionContext arrayOperacion() {
			return getRuleContext(ArrayOperacionContext.class,0);
		}
		public ArrayOperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArrayOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArrayOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArrayOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperacionContext arrayOperacion() throws RecognitionException {
		ArrayOperacionContext _localctx = new ArrayOperacionContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 26, RULE_arrayOperacion);
		try {
			setState(198);
=======
		enterRule(_localctx, 18, RULE_arrayOperacion);
		try {
			setState(182);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(192);
				match(Tkn_left_brac);
				setState(193);
				variable();
				setState(194);
				match(Tkn_right_brac);
				setState(195);
=======
				setState(176);
				match(Tkn_left_brac);
				setState(177);
				variable();
				setState(178);
				match(Tkn_right_brac);
				setState(179);
>>>>>>> origin/master
				arrayOperacion();
				}
				break;
			case EOF:
			case Tkn_equals:
			case Tkn_comma:
			case Tkn_right_brac:
			case Tkn_left_paren:
			case Tkn_right_paren:
			case Tkn_plus:
			case Tkn_minus:
			case Tkn_times:
			case Tkn_div:
			case Tkn_leq:
			case Tkn_geq:
			case Tkn_diff:
			case Tkn_less:
			case Tkn_greater:
			case If:
			case Else:
			case EndIf:
			case ElseIf:
			case Goto:
			case While:
			case EndWhile:
			case For:
			case EndFor:
			case To:
			case Step:
			case Sub:
			case EndSub:
			case Array:
			case Stack:
			case Program:
			case True:
			case False:
			case TextWindow:
			case Or:
			case And:
			case Tkn_number:
			case Tkn_text:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesContext extends ParserRuleContext {
		public TerminalNode Tkn_plus() { return getToken(MiLenguajeParser.Tkn_plus, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public TerminalNode Tkn_times() { return getToken(MiLenguajeParser.Tkn_times, 0); }
		public TerminalNode Tkn_div() { return getToken(MiLenguajeParser.Tkn_div, 0); }
		public TerminalNode And() { return getToken(MiLenguajeParser.And, 0); }
		public TerminalNode Or() { return getToken(MiLenguajeParser.Or, 0); }
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public VariableLogContext variableLog() {
			return getRuleContext(VariableLogContext.class,0);
		}
		public TerminalNode Tkn_leq() { return getToken(MiLenguajeParser.Tkn_leq, 0); }
		public TerminalNode Tkn_geq() { return getToken(MiLenguajeParser.Tkn_geq, 0); }
		public TerminalNode Tkn_diff() { return getToken(MiLenguajeParser.Tkn_diff, 0); }
		public TerminalNode Tkn_less() { return getToken(MiLenguajeParser.Tkn_less, 0); }
		public TerminalNode Tkn_greater() { return getToken(MiLenguajeParser.Tkn_greater, 0); }
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 28, RULE_operaciones);
		try {
			setState(225);
=======
		enterRule(_localctx, 20, RULE_operaciones);
		try {
			setState(209);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(200);
				match(Tkn_plus);
				setState(201);
=======
				setState(184);
				match(Tkn_plus);
				setState(185);
>>>>>>> origin/master
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(202);
				match(Tkn_minus);
				setState(203);
=======
				setState(186);
				match(Tkn_minus);
				setState(187);
>>>>>>> origin/master
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(204);
				match(Tkn_times);
				setState(205);
=======
				setState(188);
				match(Tkn_times);
				setState(189);
>>>>>>> origin/master
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(206);
				match(Tkn_div);
				setState(207);
=======
				setState(190);
				match(Tkn_div);
				setState(191);
>>>>>>> origin/master
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(208);
				match(And);
				setState(209);
=======
				setState(192);
				match(And);
				setState(193);
>>>>>>> origin/master
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(210);
				match(Or);
				setState(211);
=======
				setState(194);
				match(Or);
				setState(195);
>>>>>>> origin/master
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD
				setState(212);
				match(Tkn_equals);
				setState(213);
=======
				setState(196);
				match(Tkn_equals);
				setState(197);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
<<<<<<< HEAD
				setState(214);
				match(Tkn_leq);
				setState(215);
=======
				setState(198);
				match(Tkn_leq);
				setState(199);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
<<<<<<< HEAD
				setState(216);
				match(Tkn_geq);
				setState(217);
=======
				setState(200);
				match(Tkn_geq);
				setState(201);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
<<<<<<< HEAD
				setState(218);
				match(Tkn_diff);
				setState(219);
=======
				setState(202);
				match(Tkn_diff);
				setState(203);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
<<<<<<< HEAD
				setState(220);
				match(Tkn_less);
				setState(221);
=======
				setState(204);
				match(Tkn_less);
				setState(205);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
<<<<<<< HEAD
				setState(222);
				match(Tkn_greater);
				setState(223);
=======
				setState(206);
				match(Tkn_greater);
				setState(207);
>>>>>>> origin/master
				variableLog();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesLogContext extends ParserRuleContext {
		public TerminalNode Tkn_plus() { return getToken(MiLenguajeParser.Tkn_plus, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public TerminalNode Tkn_times() { return getToken(MiLenguajeParser.Tkn_times, 0); }
		public TerminalNode Tkn_div() { return getToken(MiLenguajeParser.Tkn_div, 0); }
		public TerminalNode And() { return getToken(MiLenguajeParser.And, 0); }
		public TerminalNode Or() { return getToken(MiLenguajeParser.Or, 0); }
		public OperacionesLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionesLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperacionesLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperacionesLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperacionesLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesLogContext operacionesLog() throws RecognitionException {
		OperacionesLogContext _localctx = new OperacionesLogContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 30, RULE_operacionesLog);
		try {
			setState(240);
=======
		enterRule(_localctx, 22, RULE_operacionesLog);
		try {
			setState(224);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(227);
				match(Tkn_plus);
				setState(228);
=======
				setState(211);
				match(Tkn_plus);
				setState(212);
>>>>>>> origin/master
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(229);
				match(Tkn_minus);
				setState(230);
=======
				setState(213);
				match(Tkn_minus);
				setState(214);
>>>>>>> origin/master
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(231);
				match(Tkn_times);
				setState(232);
=======
				setState(215);
				match(Tkn_times);
				setState(216);
>>>>>>> origin/master
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(233);
				match(Tkn_div);
				setState(234);
=======
				setState(217);
				match(Tkn_div);
				setState(218);
>>>>>>> origin/master
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(235);
				match(And);
				setState(236);
=======
				setState(219);
				match(And);
				setState(220);
>>>>>>> origin/master
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(237);
				match(Or);
				setState(238);
=======
				setState(221);
				match(Or);
				setState(222);
>>>>>>> origin/master
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesStepContext extends ParserRuleContext {
		public TerminalNode Tkn_plus() { return getToken(MiLenguajeParser.Tkn_plus, 0); }
		public VariableStepContext variableStep() {
			return getRuleContext(VariableStepContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public TerminalNode Tkn_times() { return getToken(MiLenguajeParser.Tkn_times, 0); }
		public TerminalNode Tkn_div() { return getToken(MiLenguajeParser.Tkn_div, 0); }
		public OperacionesStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionesStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperacionesStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperacionesStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperacionesStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesStepContext operacionesStep() throws RecognitionException {
		OperacionesStepContext _localctx = new OperacionesStepContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 32, RULE_operacionesStep);
		try {
			setState(251);
=======
		enterRule(_localctx, 24, RULE_operacionesStep);
		try {
			setState(235);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(242);
				match(Tkn_plus);
				setState(243);
=======
				setState(226);
				match(Tkn_plus);
				setState(227);
>>>>>>> origin/master
				variableStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(244);
				match(Tkn_minus);
				setState(245);
=======
				setState(228);
				match(Tkn_minus);
				setState(229);
>>>>>>> origin/master
				variableStep();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(246);
				match(Tkn_times);
				setState(247);
=======
				setState(230);
				match(Tkn_times);
				setState(231);
>>>>>>> origin/master
				variableStep();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(248);
				match(Tkn_div);
				setState(249);
=======
				setState(232);
				match(Tkn_div);
				setState(233);
>>>>>>> origin/master
				variableStep();
				}
				break;
			case If:
			case Goto:
			case While:
			case For:
			case EndFor:
			case Array:
			case Stack:
			case Program:
			case TextWindow:
			case Id:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableLogContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionesLogContext operacionesLog() {
			return getRuleContext(OperacionesLogContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public VariableLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVariableLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVariableLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVariableLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableLogContext variableLog() throws RecognitionException {
		VariableLogContext _localctx = new VariableLogContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 34, RULE_variableLog);
		try {
			setState(258);
=======
		enterRule(_localctx, 26, RULE_variableLog);
		try {
			setState(242);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
			case Array:
			case Stack:
			case Program:
			case True:
			case False:
			case TextWindow:
			case Tkn_number:
			case Tkn_text:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(253);
				valor();
				setState(254);
=======
				setState(237);
				valor();
				setState(238);
>>>>>>> origin/master
				operacionesLog();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(256);
				match(Tkn_minus);
				setState(257);
=======
				setState(240);
				match(Tkn_minus);
				setState(241);
>>>>>>> origin/master
				operacionesLog();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStepContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OperacionesStepContext operacionesStep() {
			return getRuleContext(OperacionesStepContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public VariableStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVariableStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVariableStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVariableStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStepContext variableStep() throws RecognitionException {
		VariableStepContext _localctx = new VariableStepContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 36, RULE_variableStep);
		try {
			setState(265);
=======
		enterRule(_localctx, 28, RULE_variableStep);
		try {
			setState(249);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
			case Array:
			case Stack:
			case Program:
			case True:
			case False:
			case TextWindow:
			case Tkn_number:
			case Tkn_text:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(260);
				valor();
				setState(261);
=======
				setState(244);
				valor();
				setState(245);
>>>>>>> origin/master
				operacionesStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(263);
				match(Tkn_minus);
				setState(264);
=======
				setState(247);
				match(Tkn_minus);
				setState(248);
>>>>>>> origin/master
				operacionesStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaIfContext extends ParserRuleContext {
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public SentenciaElseIfContext sentenciaElseIf() {
			return getRuleContext(SentenciaElseIfContext.class,0);
		}
		public SentenciaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaIfContext sentenciaIf() throws RecognitionException {
		SentenciaIfContext _localctx = new SentenciaIfContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 38, RULE_sentenciaIf);
		try {
			setState(271);
=======
		enterRule(_localctx, 30, RULE_sentenciaIf);
		try {
			setState(255);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(267);
				sentenciaElse();
				setState(268);
=======
				setState(251);
				sentenciaElse();
				setState(252);
>>>>>>> origin/master
				sentenciaElseIf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaElseIfContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(MiLenguajeParser.ElseIf, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Then() { return getToken(MiLenguajeParser.Then, 0); }
		public SentenciaIfContext sentenciaIf() {
			return getRuleContext(SentenciaIfContext.class,0);
		}
		public TerminalNode Else() { return getToken(MiLenguajeParser.Else, 0); }
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public SentenciaElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaElseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaElseIfContext sentenciaElseIf() throws RecognitionException {
		SentenciaElseIfContext _localctx = new SentenciaElseIfContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 40, RULE_sentenciaElseIf);
		try {
			setState(283);
=======
		enterRule(_localctx, 32, RULE_sentenciaElseIf);
		try {
			setState(267);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ElseIf:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(273);
				match(ElseIf);
				setState(274);
				match(Tkn_left_paren);
				setState(275);
				variable();
				setState(276);
				match(Tkn_right_paren);
				setState(277);
				match(Then);
				setState(278);
=======
				setState(257);
				match(ElseIf);
				setState(258);
				match(Tkn_left_paren);
				setState(259);
				variable();
				setState(260);
				match(Tkn_right_paren);
				setState(261);
				match(Then);
				setState(262);
>>>>>>> origin/master
				sentenciaIf();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(280);
				match(Else);
				setState(281);
=======
				setState(264);
				match(Else);
				setState(265);
>>>>>>> origin/master
				sentenciaElse();
				}
				break;
			case EndIf:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContinuidadContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MiLenguajeParser.Id, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public FuncionVarContext funcionVar() {
			return getRuleContext(FuncionVarContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public FuncionContinuidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionContinuidad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFuncionContinuidad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFuncionContinuidad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncionContinuidad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContinuidadContext funcionContinuidad() throws RecognitionException {
		FuncionContinuidadContext _localctx = new FuncionContinuidadContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 42, RULE_funcionContinuidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(Id);
			setState(286);
			match(Tkn_left_paren);
			setState(287);
			funcionVar();
			setState(288);
=======
		enterRule(_localctx, 34, RULE_funcionContinuidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(Id);
			setState(270);
			match(Tkn_left_paren);
			setState(271);
			funcionVar();
			setState(272);
>>>>>>> origin/master
			match(Tkn_right_paren);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionVarContext extends ParserRuleContext {
		public TerminalNode Tkn_comma() { return getToken(MiLenguajeParser.Tkn_comma, 0); }
		public FuncionVarContext funcionVar() {
			return getRuleContext(FuncionVarContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FuncionVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFuncionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFuncionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFuncionVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionVarContext funcionVar() throws RecognitionException {
		FuncionVarContext _localctx = new FuncionVarContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 44, RULE_funcionVar);
		try {
			setState(296);
=======
		enterRule(_localctx, 36, RULE_funcionVar);
		try {
			setState(280);
>>>>>>> origin/master
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_comma:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(290);
				match(Tkn_comma);
				setState(291);
=======
				setState(274);
				match(Tkn_comma);
				setState(275);
>>>>>>> origin/master
				funcionVar();
				}
				break;
			case Tkn_left_paren:
			case Tkn_minus:
			case Array:
			case Stack:
			case Program:
			case True:
			case False:
			case TextWindow:
			case Tkn_number:
			case Tkn_text:
			case Id:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(292);
				variable();
				setState(293);
=======
				setState(276);
				variable();
				setState(277);
>>>>>>> origin/master
				funcionVar();
				}
				break;
			case Tkn_right_paren:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
<<<<<<< HEAD
		"\u0004\u0001+\u012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
=======
		"\u0004\u0001+\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
>>>>>>> origin/master
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
<<<<<<< HEAD
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002"+
=======
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
>>>>>>> origin/master
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
<<<<<<< HEAD
		"\u0003\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"b\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008d\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009e\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00b6\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bf\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00c7\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e2\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00f1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00fc\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0103\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u010a\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0110\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u011c\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0129\b\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0000\u014b\u0000.\u0001"+
		"\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004\\\u0001\u0000"+
		"\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000"+
		"\nh\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000ew\u0001\u0000"+
		"\u0000\u0000\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000"+
		"\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000"+
		"\u0000\u0000\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00c6\u0001\u0000"+
		"\u0000\u0000\u001c\u00e1\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000"+
		"\u0000\u0000 \u00fb\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000\u0000"+
		"\u0000$\u0109\u0001\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000("+
		"\u011b\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,\u0128\u0001"+
		"\u0000\u0000\u0000./\u0003\u0004\u0002\u0000/0\u0003\u0002\u0001\u0000"+
		"0\u0001\u0001\u0000\u0000\u000012\u0003\b\u0004\u000023\u0003\u0000\u0000"+
		"\u000036\u0001\u0000\u0000\u000046\u0005\u0000\u0000\u000151\u0001\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u0000"+
		"78\u0003\n\u0005\u000089\u0003\u0004\u0002\u00009]\u0001\u0000\u0000\u0000"+
		":;\u0003\f\u0006\u0000;<\u0003\u0004\u0002\u0000<]\u0001\u0000\u0000\u0000"+
		"=>\u0003\u000e\u0007\u0000>?\u0003\u0004\u0002\u0000?]\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0017\u0000\u0000AB\u0005+\u0000\u0000B]\u0003\u0004\u0002"+
		"\u0000CD\u0005\"\u0000\u0000DE\u0005\u0002\u0000\u0000EF\u0003*\u0015"+
		"\u0000FG\u0003\u0004\u0002\u0000G]\u0001\u0000\u0000\u0000HI\u0005!\u0000"+
		"\u0000IJ\u0005\u0002\u0000\u0000JK\u0003*\u0015\u0000KL\u0003\u0004\u0002"+
		"\u0000L]\u0001\u0000\u0000\u0000MN\u0005%\u0000\u0000NO\u0005\u0002\u0000"+
		"\u0000OP\u0003*\u0015\u0000PQ\u0003\u0004\u0002\u0000Q]\u0001\u0000\u0000"+
		"\u0000RS\u0005 \u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0003*\u0015\u0000"+
		"UV\u0003\u0004\u0002\u0000V]\u0001\u0000\u0000\u0000WX\u0005+\u0000\u0000"+
		"XY\u0003\u0010\b\u0000YZ\u0003\u0004\u0002\u0000Z]\u0001\u0000\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\7\u0001\u0000\u0000\u0000\\:\u0001\u0000\u0000"+
		"\u0000\\=\u0001\u0000\u0000\u0000\\@\u0001\u0000\u0000\u0000\\C\u0001"+
		"\u0000\u0000\u0000\\H\u0001\u0000\u0000\u0000\\M\u0001\u0000\u0000\u0000"+
		"\\R\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005\u001d\u0000\u0000"+
		"_b\u0003$\u0012\u0000`b\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0005\u001e"+
		"\u0000\u0000de\u0005+\u0000\u0000ef\u0003\u0004\u0002\u0000fg\u0005\u001f"+
		"\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0005\u0012\u0000\u0000ij\u0005"+
		"\u0007\u0000\u0000jk\u0003\u0018\f\u0000kl\u0005\b\u0000\u0000lm\u0005"+
		"\u0014\u0000\u0000mn\u0003&\u0013\u0000no\u0005\u0015\u0000\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0018\u0000\u0000qr\u0005\u0007\u0000"+
		"\u0000rs\u0003\u0018\f\u0000st\u0005\b\u0000\u0000tu\u0003\u0004\u0002"+
		"\u0000uv\u0005\u0019\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\u001a"+
		"\u0000\u0000xy\u0005+\u0000\u0000yz\u0003\u0012\t\u0000z{\u0005\u0001"+
		"\u0000\u0000{|\u0003\u0018\f\u0000|}\u0005\u001c\u0000\u0000}~\u0003\u0018"+
		"\f\u0000~\u007f\u0003\u0006\u0003\u0000\u007f\u0080\u0003\u0004\u0002"+
		"\u0000\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u000f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u008d\u0005\b\u0000\u0000"+
		"\u0084\u008d\u0005\u0004\u0000\u0000\u0085\u0086\u0005\u0001\u0000\u0000"+
		"\u0086\u008d\u0003\u0018\f\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088"+
		"\u0089\u0003\u0018\f\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008b"+
		"\u0003\u0014\n\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u0082\u0001"+
		"\u0000\u0000\u0000\u008c\u0084\u0001\u0000\u0000\u0000\u008c\u0085\u0001"+
		"\u0000\u0000\u0000\u008c\u0087\u0001\u0000\u0000\u0000\u008d\u0011\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u0003"+
		"\u0018\f\u0000\u0090\u0091\u0005\u0006\u0000\u0000\u0091\u0092\u0003\u0012"+
		"\t\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0005\u0000"+
		"\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098\u0099\u0005\u0006\u0000\u0000"+
		"\u0099\u009a\u0003\u0014\n\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u0001\u0000\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d\u0096"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u0015"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0018\f\u0000\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00b6\u0001"+
		"\u0000\u0000\u0000\u00a3\u00b6\u0005#\u0000\u0000\u00a4\u00b6\u0005$\u0000"+
		"\u0000\u00a5\u00a6\u0005+\u0000\u0000\u00a6\u00b6\u0003\u001a\r\u0000"+
		"\u00a7\u00b6\u0005(\u0000\u0000\u00a8\u00b6\u0005)\u0000\u0000\u00a9\u00aa"+
		"\u0005\"\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00b6\u0003"+
		"*\u0015\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000"+
		"\u0000\u00ae\u00b6\u0003*\u0015\u0000\u00af\u00b0\u0005%\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0002\u0000\u0000\u00b1\u00b6\u0003*\u0015\u0000\u00b2\u00b3"+
		"\u0005 \u0000\u0000\u00b3\u00b4\u0005\u0002\u0000\u0000\u00b4\u00b6\u0003"+
		"*\u0015\u0000\u00b5\u009f\u0001\u0000\u0000\u0000\u00b5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000\u00b5\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0016"+
		"\u000b\u0000\u00b8\u00b9\u0003\u001c\u000e\u0000\u00b9\u00bf\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\n\u0000\u0000\u00bb\u00bc\u0003\u0016\u000b"+
		"\u0000\u00bc\u00bd\u0003\u001c\u000e\u0000\u00bd\u00bf\u0001\u0000\u0000"+
		"\u0000\u00be\u00b7\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bf\u0019\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0005\u0000"+
		"\u0000\u00c1\u00c2\u0003\u0018\f\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000"+
		"\u00c3\u00c4\u0003\u001a\r\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\t\u0000\u0000\u00c9\u00e2\u0003\u0018\f\u0000\u00ca\u00cb"+
		"\u0005\n\u0000\u0000\u00cb\u00e2\u0003\u0018\f\u0000\u00cc\u00cd\u0005"+
		"\u000b\u0000\u0000\u00cd\u00e2\u0003\u0018\f\u0000\u00ce\u00cf\u0005\f"+
		"\u0000\u0000\u00cf\u00e2\u0003\u0018\f\u0000\u00d0\u00d1\u0005\'\u0000"+
		"\u0000\u00d1\u00e2\u0003\u0018\f\u0000\u00d2\u00d3\u0005&\u0000\u0000"+
		"\u00d3\u00e2\u0003\u0018\f\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5"+
		"\u00e2\u0003\"\u0011\u0000\u00d6\u00d7\u0005\r\u0000\u0000\u00d7\u00e2"+
		"\u0003\"\u0011\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9\u00e2\u0003"+
		"\"\u0011\u0000\u00da\u00db\u0005\u000f\u0000\u0000\u00db\u00e2\u0003\""+
		"\u0011\u0000\u00dc\u00dd\u0005\u0010\u0000\u0000\u00dd\u00e2\u0003\"\u0011"+
		"\u0000\u00de\u00df\u0005\u0011\u0000\u0000\u00df\u00e2\u0003\"\u0011\u0000"+
		"\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00c8\u0001\u0000\u0000\u0000"+
		"\u00e1\u00ca\u0001\u0000\u0000\u0000\u00e1\u00cc\u0001\u0000\u0000\u0000"+
		"\u00e1\u00ce\u0001\u0000\u0000\u0000\u00e1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00e1\u00d2\u0001\u0000\u0000\u0000\u00e1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00e1\u00d6\u0001\u0000\u0000\u0000\u00e1\u00d8\u0001\u0000\u0000\u0000"+
		"\u00e1\u00da\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u001d\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\t\u0000\u0000\u00e4"+
		"\u00f1\u0003\u0018\f\u0000\u00e5\u00e6\u0005\n\u0000\u0000\u00e6\u00f1"+
		"\u0003\u0018\f\u0000\u00e7\u00e8\u0005\u000b\u0000\u0000\u00e8\u00f1\u0003"+
		"\u0018\f\u0000\u00e9\u00ea\u0005\f\u0000\u0000\u00ea\u00f1\u0003\u0018"+
		"\f\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec\u00f1\u0003\u0018\f\u0000"+
		"\u00ed\u00ee\u0005&\u0000\u0000\u00ee\u00f1\u0003\u0018\f\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e3\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e5\u0001\u0000\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u001f\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3\u00fc"+
		"\u0003$\u0012\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u00fc\u0003"+
		"$\u0012\u0000\u00f6\u00f7\u0005\u000b\u0000\u0000\u00f7\u00fc\u0003$\u0012"+
		"\u0000\u00f8\u00f9\u0005\f\u0000\u0000\u00f9\u00fc\u0003$\u0012\u0000"+
		"\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f4\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc!\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u0016\u000b\u0000\u00fe"+
		"\u00ff\u0003\u001e\u000f\u0000\u00ff\u0103\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\n\u0000\u0000\u0101\u0103\u0003\u001e\u000f\u0000\u0102\u00fd"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103#\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0003\u0016\u000b\u0000\u0105\u0106\u0003"+
		" \u0010\u0000\u0106\u010a\u0001\u0000\u0000\u0000\u0107\u0108\u0005\n"+
		"\u0000\u0000\u0108\u010a\u0003 \u0010\u0000\u0109\u0104\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a%\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0003\u0004\u0002\u0000\u010c\u010d\u0003(\u0014\u0000\u010d"+
		"\u0110\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u010b\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\'\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0016\u0000\u0000\u0112\u0113"+
		"\u0005\u0007\u0000\u0000\u0113\u0114\u0003\u0018\f\u0000\u0114\u0115\u0005"+
		"\b\u0000\u0000\u0115\u0116\u0005\u0014\u0000\u0000\u0116\u0117\u0003&"+
		"\u0013\u0000\u0117\u011c\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0013"+
		"\u0000\u0000\u0119\u011c\u0003\u0004\u0002\u0000\u011a\u011c\u0001\u0000"+
		"\u0000\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c)\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005+\u0000\u0000\u011e\u011f\u0005\u0007\u0000\u0000"+
		"\u011f\u0120\u0003,\u0016\u0000\u0120\u0121\u0005\b\u0000\u0000\u0121"+
		"+\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u0003\u0000\u0000\u0123\u0129"+
		"\u0003,\u0016\u0000\u0124\u0125\u0003\u0018\f\u0000\u0125\u0126\u0003"+
		",\u0016\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000"+
		"\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129-\u0001\u0000\u0000"+
		"\u0000\u00115\\a\u008c\u0094\u009d\u00b5\u00be\u00c6\u00e1\u00f0\u00fb"+
		"\u0102\u0109\u010f\u011b\u0128";
=======
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0085\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u008e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00af\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00b7\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d2\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e1\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ec\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f3"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00fa\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0100\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u010c\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0119\b\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0000\u013f\u0000&\u0001\u0000\u0000\u0000\u00020\u0001\u0000"+
		"\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000"+
		"\b|\u0001\u0000\u0000\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u008d\u0001"+
		"\u0000\u0000\u0000\u000e\u00a5\u0001\u0000\u0000\u0000\u0010\u00ae\u0001"+
		"\u0000\u0000\u0000\u0012\u00b6\u0001\u0000\u0000\u0000\u0014\u00d1\u0001"+
		"\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00eb\u0001"+
		"\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000\u0000\u001c\u00f9\u0001"+
		"\u0000\u0000\u0000\u001e\u00ff\u0001\u0000\u0000\u0000 \u010b\u0001\u0000"+
		"\u0000\u0000\"\u010d\u0001\u0000\u0000\u0000$\u0118\u0001\u0000\u0000"+
		"\u0000&\'\u0003\u0004\u0002\u0000\'(\u0003\u0002\u0001\u0000(\u0001\u0001"+
		"\u0000\u0000\u0000)*\u0005\u001e\u0000\u0000*+\u0005+\u0000\u0000+,\u0003"+
		"\u0004\u0002\u0000,-\u0005\u001f\u0000\u0000-.\u0003\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/1\u0005\u0000\u0000\u00010)\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0005"+
		"\u0012\u0000\u000034\u0005\u0007\u0000\u000045\u0003\u0010\b\u000056\u0005"+
		"\b\u0000\u000067\u0005\u0014\u0000\u000078\u0003\u001e\u000f\u000089\u0005"+
		"\u0015\u0000\u00009:\u0003\u0004\u0002\u0000:l\u0001\u0000\u0000\u0000"+
		";<\u0005\u0018\u0000\u0000<=\u0005\u0007\u0000\u0000=>\u0003\u0010\b\u0000"+
		">?\u0005\b\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0019\u0000\u0000"+
		"AB\u0003\u0004\u0002\u0000Bl\u0001\u0000\u0000\u0000CD\u0005\u001a\u0000"+
		"\u0000DE\u0005+\u0000\u0000EF\u0003\n\u0005\u0000FG\u0005\u0001\u0000"+
		"\u0000GH\u0003\u0010\b\u0000HI\u0005\u001c\u0000\u0000IJ\u0003\u0010\b"+
		"\u0000JK\u0003\u0006\u0003\u0000KL\u0003\u0004\u0002\u0000LM\u0005\u001b"+
		"\u0000\u0000MN\u0003\u0004\u0002\u0000Nl\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0017\u0000\u0000PQ\u0005+\u0000\u0000Ql\u0003\u0004\u0002\u0000RS\u0005"+
		"\"\u0000\u0000ST\u0005\u0002\u0000\u0000TU\u0003\"\u0011\u0000UV\u0003"+
		"\u0004\u0002\u0000Vl\u0001\u0000\u0000\u0000WX\u0005!\u0000\u0000XY\u0005"+
		"\u0002\u0000\u0000YZ\u0003\"\u0011\u0000Z[\u0003\u0004\u0002\u0000[l\u0001"+
		"\u0000\u0000\u0000\\]\u0005%\u0000\u0000]^\u0005\u0002\u0000\u0000^_\u0003"+
		"\"\u0011\u0000_`\u0003\u0004\u0002\u0000`l\u0001\u0000\u0000\u0000ab\u0005"+
		" \u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0003\"\u0011\u0000de\u0003"+
		"\u0004\u0002\u0000el\u0001\u0000\u0000\u0000fg\u0005+\u0000\u0000gh\u0003"+
		"\b\u0004\u0000hi\u0003\u0004\u0002\u0000il\u0001\u0000\u0000\u0000jl\u0001"+
		"\u0000\u0000\u0000k2\u0001\u0000\u0000\u0000k;\u0001\u0000\u0000\u0000"+
		"kC\u0001\u0000\u0000\u0000kO\u0001\u0000\u0000\u0000kR\u0001\u0000\u0000"+
		"\u0000kW\u0001\u0000\u0000\u0000k\\\u0001\u0000\u0000\u0000ka\u0001\u0000"+
		"\u0000\u0000kf\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0005"+
		"\u0001\u0000\u0000\u0000mn\u0005\u001d\u0000\u0000nq\u0003\u001c\u000e"+
		"\u0000oq\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rs\u0005\u0007\u0000\u0000"+
		"s}\u0005\b\u0000\u0000t}\u0005\u0004\u0000\u0000uv\u0005\u0001\u0000\u0000"+
		"v}\u0003\u0010\b\u0000wx\u0005\u0005\u0000\u0000xy\u0003\u0010\b\u0000"+
		"yz\u0005\u0006\u0000\u0000z{\u0003\f\u0006\u0000{}\u0001\u0000\u0000\u0000"+
		"|r\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000|u\u0001\u0000\u0000"+
		"\u0000|w\u0001\u0000\u0000\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u0005\u0000\u0000\u007f\u0080\u0003\u0010\b\u0000\u0080\u0081\u0005\u0006"+
		"\u0000\u0000\u0081\u0082\u0003\n\u0005\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u000b\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088\u0003\u0010\b\u0000\u0088"+
		"\u0089\u0005\u0006\u0000\u0000\u0089\u008a\u0003\f\u0006\u0000\u008a\u008e"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c\u008e"+
		"\u0003\u0010\b\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0007"+
		"\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0005\b\u0000"+
		"\u0000\u0092\u00a6\u0001\u0000\u0000\u0000\u0093\u00a6\u0005#\u0000\u0000"+
		"\u0094\u00a6\u0005$\u0000\u0000\u0095\u0096\u0005+\u0000\u0000\u0096\u00a6"+
		"\u0003\u0012\t\u0000\u0097\u00a6\u0005(\u0000\u0000\u0098\u00a6\u0005"+
		")\u0000\u0000\u0099\u009a\u0005\"\u0000\u0000\u009a\u009b\u0005\u0002"+
		"\u0000\u0000\u009b\u00a6\u0003\"\u0011\u0000\u009c\u009d\u0005!\u0000"+
		"\u0000\u009d\u009e\u0005\u0002\u0000\u0000\u009e\u00a6\u0003\"\u0011\u0000"+
		"\u009f\u00a0\u0005%\u0000\u0000\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1"+
		"\u00a6\u0003\"\u0011\u0000\u00a2\u00a3\u0005 \u0000\u0000\u00a3\u00a4"+
		"\u0005\u0002\u0000\u0000\u00a4\u00a6\u0003\"\u0011\u0000\u00a5\u008f\u0001"+
		"\u0000\u0000\u0000\u00a5\u0093\u0001\u0000\u0000\u0000\u00a5\u0094\u0001"+
		"\u0000\u0000\u0000\u00a5\u0095\u0001\u0000\u0000\u0000\u00a5\u0097\u0001"+
		"\u0000\u0000\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5\u0099\u0001"+
		"\u0000\u0000\u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u009f\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\u000f\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8\u00a9\u0003"+
		"\u0014\n\u0000\u00a9\u00af\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\n"+
		"\u0000\u0000\u00ab\u00ac\u0003\u000e\u0007\u0000\u00ac\u00ad\u0003\u0014"+
		"\n\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00af\u0011\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\u0005\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000"+
		"\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b4\u0003\u0012\t\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u0013\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9\u00d2"+
		"\u0003\u0010\b\u0000\u00ba\u00bb\u0005\n\u0000\u0000\u00bb\u00d2\u0003"+
		"\u0010\b\u0000\u00bc\u00bd\u0005\u000b\u0000\u0000\u00bd\u00d2\u0003\u0010"+
		"\b\u0000\u00be\u00bf\u0005\f\u0000\u0000\u00bf\u00d2\u0003\u0010\b\u0000"+
		"\u00c0\u00c1\u0005\'\u0000\u0000\u00c1\u00d2\u0003\u0010\b\u0000\u00c2"+
		"\u00c3\u0005&\u0000\u0000\u00c3\u00d2\u0003\u0010\b\u0000\u00c4\u00c5"+
		"\u0005\u0001\u0000\u0000\u00c5\u00d2\u0003\u001a\r\u0000\u00c6\u00c7\u0005"+
		"\r\u0000\u0000\u00c7\u00d2\u0003\u001a\r\u0000\u00c8\u00c9\u0005\u000e"+
		"\u0000\u0000\u00c9\u00d2\u0003\u001a\r\u0000\u00ca\u00cb\u0005\u000f\u0000"+
		"\u0000\u00cb\u00d2\u0003\u001a\r\u0000\u00cc\u00cd\u0005\u0010\u0000\u0000"+
		"\u00cd\u00d2\u0003\u001a\r\u0000\u00ce\u00cf\u0005\u0011\u0000\u0000\u00cf"+
		"\u00d2\u0003\u001a\r\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00b8"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ba\u0001\u0000\u0000\u0000\u00d1\u00bc"+
		"\u0001\u0000\u0000\u0000\u00d1\u00be\u0001\u0000\u0000\u0000\u00d1\u00c0"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c2\u0001\u0000\u0000\u0000\u00d1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00d1\u00c6\u0001\u0000\u0000\u0000\u00d1\u00c8"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d1\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u0015\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\t\u0000\u0000\u00d4\u00e1\u0003\u0010\b\u0000\u00d5\u00d6\u0005"+
		"\n\u0000\u0000\u00d6\u00e1\u0003\u0010\b\u0000\u00d7\u00d8\u0005\u000b"+
		"\u0000\u0000\u00d8\u00e1\u0003\u0010\b\u0000\u00d9\u00da\u0005\f\u0000"+
		"\u0000\u00da\u00e1\u0003\u0010\b\u0000\u00db\u00dc\u0005\'\u0000\u0000"+
		"\u00dc\u00e1\u0003\u0010\b\u0000\u00dd\u00de\u0005&\u0000\u0000\u00de"+
		"\u00e1\u0003\u0010\b\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d5\u0001\u0000\u0000\u0000\u00e0\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d9\u0001\u0000\u0000\u0000\u00e0\u00db"+
		"\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\t\u0000\u0000\u00e3\u00ec\u0003\u001c\u000e\u0000\u00e4\u00e5\u0005"+
		"\n\u0000\u0000\u00e5\u00ec\u0003\u001c\u000e\u0000\u00e6\u00e7\u0005\u000b"+
		"\u0000\u0000\u00e7\u00ec\u0003\u001c\u000e\u0000\u00e8\u00e9\u0005\f\u0000"+
		"\u0000\u00e9\u00ec\u0003\u001c\u000e\u0000\u00ea\u00ec\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e2\u0001\u0000\u0000\u0000\u00eb\u00e4\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u0019\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0003\u000e\u0007\u0000\u00ee\u00ef\u0003\u0016\u000b"+
		"\u0000\u00ef\u00f3\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000"+
		"\u00f1\u00f3\u0003\u0016\u000b\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u001b\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0003\u000e\u0007\u0000\u00f5\u00f6\u0003\u0018\f\u0000\u00f6"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u00fa"+
		"\u0003\u0018\f\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003"+
		"\u0004\u0002\u0000\u00fc\u00fd\u0003 \u0010\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u001f\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0005\u0016\u0000\u0000\u0102\u0103\u0005\u0007"+
		"\u0000\u0000\u0103\u0104\u0003\u0010\b\u0000\u0104\u0105\u0005\b\u0000"+
		"\u0000\u0105\u0106\u0005\u0014\u0000\u0000\u0106\u0107\u0003\u001e\u000f"+
		"\u0000\u0107\u010c\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0013\u0000"+
		"\u0000\u0109\u010c\u0003\u0004\u0002\u0000\u010a\u010c\u0001\u0000\u0000"+
		"\u0000\u010b\u0101\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000"+
		"\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c!\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0005+\u0000\u0000\u010e\u010f\u0005\u0007\u0000\u0000\u010f"+
		"\u0110\u0003$\u0012\u0000\u0110\u0111\u0005\b\u0000\u0000\u0111#\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0119\u0003"+
		"$\u0012\u0000\u0114\u0115\u0003\u0010\b\u0000\u0115\u0116\u0003$\u0012"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000\u0000"+
		"\u0000\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119%\u0001\u0000\u0000\u0000"+
		"\u00110kp|\u0084\u008d\u00a5\u00ae\u00b6\u00d1\u00e0\u00eb\u00f2\u00f9"+
		"\u00ff\u010b\u0118";
>>>>>>> origin/master
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}