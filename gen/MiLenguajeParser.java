// Generated from C:/Users/princ/IdeaProjects/Traductor_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
		RULE_sentencia = 0, RULE_sentenciaElse = 1, RULE_stepF = 2, RULE_identSentencia = 3, 
		RULE_identFor = 4, RULE_arrayAsignaciones = 5, RULE_valor = 6, RULE_variable = 7, 
		RULE_arrayOperacion = 8, RULE_operaciones = 9, RULE_operacionesLog = 10, 
		RULE_operacionesStep = 11, RULE_variableLog = 12, RULE_variableStep = 13, 
		RULE_sentenciaIf = 14, RULE_funcionContinuidad = 15, RULE_funcionVar = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentencia", "sentenciaElse", "stepF", "identSentencia", "identFor", 
			"arrayAsignaciones", "valor", "variable", "arrayOperacion", "operaciones", 
			"operacionesLog", "operacionesStep", "variableLog", "variableStep", "sentenciaIf", 
			"funcionContinuidad", "funcionVar"
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
	public static class SentenciaContext extends ParserRuleContext {
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
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode While() { return getToken(MiLenguajeParser.While, 0); }
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
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
		public TerminalNode Sub() { return getToken(MiLenguajeParser.Sub, 0); }
		public TerminalNode EndSub() { return getToken(MiLenguajeParser.EndSub, 0); }
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
		enterRule(_localctx, 0, RULE_sentencia);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(If);
				setState(35);
				match(Tkn_left_paren);
				setState(36);
				variable();
				setState(37);
				match(Tkn_right_paren);
				setState(38);
				match(Then);
				setState(39);
				sentenciaIf();
				setState(40);
				match(EndIf);
				setState(41);
				sentencia();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(While);
				setState(44);
				match(Tkn_left_paren);
				setState(45);
				variable();
				setState(46);
				match(Tkn_right_paren);
				setState(47);
				sentenciaElse();
				setState(48);
				match(EndWhile);
				setState(49);
				sentencia();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(For);
				setState(52);
				match(Id);
				setState(53);
				identFor();
				setState(54);
				match(Tkn_equals);
				setState(55);
				variable();
				setState(56);
				match(To);
				setState(57);
				variable();
				setState(58);
				stepF();
				setState(59);
				sentenciaElse();
				setState(60);
				match(EndFor);
				setState(61);
				sentencia();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(Goto);
				setState(64);
				match(Id);
				setState(65);
				sentencia();
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				match(Program);
				setState(67);
				match(Tkn_period);
				setState(68);
				funcionContinuidad();
				setState(69);
				sentencia();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(Stack);
				setState(72);
				match(Tkn_period);
				setState(73);
				funcionContinuidad();
				setState(74);
				sentencia();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				match(TextWindow);
				setState(77);
				match(Tkn_period);
				setState(78);
				funcionContinuidad();
				setState(79);
				sentencia();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(Array);
				setState(82);
				match(Tkn_period);
				setState(83);
				funcionContinuidad();
				setState(84);
				sentencia();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				match(Id);
				setState(87);
				identSentencia();
				setState(88);
				sentencia();
				}
				break;
			case Sub:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				match(Sub);
				setState(91);
				match(Id);
				setState(92);
				sentenciaElse();
				setState(93);
				match(EndSub);
				setState(94);
				sentencia();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
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
		enterRule(_localctx, 2, RULE_sentenciaElse);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(If);
				setState(100);
				match(Tkn_left_paren);
				setState(101);
				variable();
				setState(102);
				match(Tkn_right_paren);
				setState(103);
				match(Then);
				setState(104);
				sentenciaIf();
				setState(105);
				match(EndIf);
				setState(106);
				sentenciaElse();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(While);
				setState(109);
				match(Tkn_left_paren);
				setState(110);
				variable();
				setState(111);
				match(Tkn_right_paren);
				setState(112);
				sentenciaElse();
				setState(113);
				match(EndWhile);
				setState(114);
				sentenciaElse();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(For);
				setState(117);
				match(Id);
				setState(118);
				identFor();
				setState(119);
				match(Tkn_equals);
				setState(120);
				variable();
				setState(121);
				match(To);
				setState(122);
				variable();
				setState(123);
				stepF();
				setState(124);
				sentenciaElse();
				setState(125);
				match(EndFor);
				setState(126);
				sentenciaElse();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(Goto);
				setState(129);
				match(Id);
				setState(130);
				sentenciaElse();
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(Program);
				setState(132);
				match(Tkn_period);
				setState(133);
				funcionContinuidad();
				setState(134);
				sentenciaElse();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(Stack);
				setState(137);
				match(Tkn_period);
				setState(138);
				funcionContinuidad();
				setState(139);
				sentenciaElse();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(TextWindow);
				setState(142);
				match(Tkn_period);
				setState(143);
				funcionContinuidad();
				setState(144);
				sentenciaElse();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				match(Array);
				setState(147);
				match(Tkn_period);
				setState(148);
				funcionContinuidad();
				setState(149);
				sentenciaElse();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(Id);
				setState(152);
				identSentencia();
				setState(153);
				sentenciaElse();
				}
				break;
			case EndIf:
			case EndWhile:
			case EndFor:
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
		enterRule(_localctx, 4, RULE_stepF);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Step:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(Step);
				setState(159);
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
		enterRule(_localctx, 6, RULE_identSentencia);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(Tkn_left_paren);
				setState(164);
				match(Tkn_right_paren);
				}
				break;
			case Tkn_colon:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(Tkn_colon);
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(Tkn_equals);
				setState(167);
				variable();
				}
				break;
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(Tkn_left_brac);
				setState(169);
				variable();
				setState(170);
				match(Tkn_right_brac);
				setState(171);
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
		enterRule(_localctx, 8, RULE_identFor);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(Tkn_left_brac);
				setState(176);
				variable();
				setState(177);
				match(Tkn_right_brac);
				setState(178);
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
		enterRule(_localctx, 10, RULE_arrayAsignaciones);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(Tkn_left_brac);
				setState(184);
				variable();
				setState(185);
				match(Tkn_right_brac);
				setState(186);
				arrayAsignaciones();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(Tkn_equals);
				setState(189);
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
		enterRule(_localctx, 12, RULE_valor);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(Tkn_left_paren);
				setState(193);
				variable();
				setState(194);
				match(Tkn_right_paren);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(False);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(Id);
				setState(199);
				arrayOperacion();
				}
				break;
			case Tkn_number:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(Tkn_number);
				}
				break;
			case Tkn_text:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(Tkn_text);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				match(Program);
				setState(203);
				match(Tkn_period);
				setState(204);
				funcionContinuidad();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(Stack);
				setState(206);
				match(Tkn_period);
				setState(207);
				funcionContinuidad();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				match(TextWindow);
				setState(209);
				match(Tkn_period);
				setState(210);
				funcionContinuidad();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				match(Array);
				setState(212);
				match(Tkn_period);
				setState(213);
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			setState(223);
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
				setState(216);
				valor();
				setState(217);
				operaciones();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(Tkn_minus);
				setState(220);
				valor();
				setState(221);
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
		enterRule(_localctx, 16, RULE_arrayOperacion);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(Tkn_left_brac);
				setState(226);
				variable();
				setState(227);
				match(Tkn_right_brac);
				setState(228);
				arrayOperacion();
				}
				break;
			case EOF:
			case Tkn_equals:
			case Tkn_right_brac:
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
			case EndIf:
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
			case TextWindow:
			case Or:
			case And:
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
		enterRule(_localctx, 18, RULE_operaciones);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(Tkn_plus);
				setState(234);
				variable();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(Tkn_minus);
				setState(236);
				variable();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(Tkn_times);
				setState(238);
				variable();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(Tkn_div);
				setState(240);
				variable();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(And);
				setState(242);
				variable();
				}
				break;
			case Or:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(Or);
				setState(244);
				variable();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(Tkn_equals);
				setState(246);
				variableLog();
				}
				break;
			case Tkn_leq:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				match(Tkn_leq);
				setState(248);
				variableLog();
				}
				break;
			case Tkn_geq:
				enterOuterAlt(_localctx, 9);
				{
				setState(249);
				match(Tkn_geq);
				setState(250);
				variableLog();
				}
				break;
			case Tkn_diff:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				match(Tkn_diff);
				setState(252);
				variableLog();
				}
				break;
			case Tkn_less:
				enterOuterAlt(_localctx, 11);
				{
				setState(253);
				match(Tkn_less);
				setState(254);
				variableLog();
				}
				break;
			case Tkn_greater:
				enterOuterAlt(_localctx, 12);
				{
				setState(255);
				match(Tkn_greater);
				setState(256);
				variableLog();
				}
				break;
			case EOF:
			case Tkn_right_brac:
			case Tkn_right_paren:
			case If:
			case EndIf:
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
			case TextWindow:
			case Id:
				enterOuterAlt(_localctx, 13);
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
		enterRule(_localctx, 20, RULE_operacionesLog);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(Tkn_plus);
				setState(261);
				variable();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(Tkn_minus);
				setState(263);
				variable();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(Tkn_times);
				setState(265);
				variable();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(Tkn_div);
				setState(267);
				variable();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(And);
				setState(269);
				variable();
				}
				break;
			case Or:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(Or);
				setState(271);
				variable();
				}
				break;
			case EOF:
			case Tkn_right_brac:
			case Tkn_right_paren:
			case If:
			case EndIf:
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
			case TextWindow:
			case Id:
				enterOuterAlt(_localctx, 7);
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
		enterRule(_localctx, 22, RULE_operacionesStep);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(Tkn_plus);
				setState(276);
				variableStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Tkn_minus);
				setState(278);
				variableStep();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(Tkn_times);
				setState(280);
				variableStep();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(Tkn_div);
				setState(282);
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
		enterRule(_localctx, 24, RULE_variableLog);
		try {
			setState(291);
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
				setState(286);
				valor();
				setState(287);
				operacionesLog();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(Tkn_minus);
				setState(290);
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
		enterRule(_localctx, 26, RULE_variableStep);
		try {
			setState(298);
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
				setState(293);
				valor();
				setState(294);
				operacionesStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(Tkn_minus);
				setState(297);
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
		enterRule(_localctx, 28, RULE_sentenciaIf);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				sentenciaElse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(ElseIf);
				setState(302);
				match(Tkn_left_paren);
				setState(303);
				variable();
				setState(304);
				match(Tkn_right_paren);
				setState(305);
				match(Then);
				setState(306);
				sentenciaIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(Else);
				setState(309);
				sentenciaElse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
		enterRule(_localctx, 30, RULE_funcionContinuidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(Id);
			setState(314);
			match(Tkn_left_paren);
			setState(315);
			funcionVar();
			setState(316);
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
		enterRule(_localctx, 32, RULE_funcionVar);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(Tkn_comma);
				setState(319);
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
				setState(320);
				variable();
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
		"\u0004\u0001+\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"b\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009d\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ae\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b6\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00bf\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00d7\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00e0\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00e8\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0103\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0112\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u011d\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0124\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u012b\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0138\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0143\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000"+
		"\u0174\u0000a\u0001\u0000\u0000\u0000\u0002\u009c\u0001\u0000\u0000\u0000"+
		"\u0004\u00a1\u0001\u0000\u0000\u0000\u0006\u00ad\u0001\u0000\u0000\u0000"+
		"\b\u00b5\u0001\u0000\u0000\u0000\n\u00be\u0001\u0000\u0000\u0000\f\u00d6"+
		"\u0001\u0000\u0000\u0000\u000e\u00df\u0001\u0000\u0000\u0000\u0010\u00e7"+
		"\u0001\u0000\u0000\u0000\u0012\u0102\u0001\u0000\u0000\u0000\u0014\u0111"+
		"\u0001\u0000\u0000\u0000\u0016\u011c\u0001\u0000\u0000\u0000\u0018\u0123"+
		"\u0001\u0000\u0000\u0000\u001a\u012a\u0001\u0000\u0000\u0000\u001c\u0137"+
		"\u0001\u0000\u0000\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u0142\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0012\u0000\u0000#$\u0005\u0007\u0000\u0000"+
		"$%\u0003\u000e\u0007\u0000%&\u0005\b\u0000\u0000&\'\u0005\u0014\u0000"+
		"\u0000\'(\u0003\u001c\u000e\u0000()\u0005\u0015\u0000\u0000)*\u0003\u0000"+
		"\u0000\u0000*b\u0001\u0000\u0000\u0000+,\u0005\u0018\u0000\u0000,-\u0005"+
		"\u0007\u0000\u0000-.\u0003\u000e\u0007\u0000./\u0005\b\u0000\u0000/0\u0003"+
		"\u0002\u0001\u000001\u0005\u0019\u0000\u000012\u0003\u0000\u0000\u0000"+
		"2b\u0001\u0000\u0000\u000034\u0005\u001a\u0000\u000045\u0005+\u0000\u0000"+
		"56\u0003\b\u0004\u000067\u0005\u0001\u0000\u000078\u0003\u000e\u0007\u0000"+
		"89\u0005\u001c\u0000\u00009:\u0003\u000e\u0007\u0000:;\u0003\u0004\u0002"+
		"\u0000;<\u0003\u0002\u0001\u0000<=\u0005\u001b\u0000\u0000=>\u0003\u0000"+
		"\u0000\u0000>b\u0001\u0000\u0000\u0000?@\u0005\u0017\u0000\u0000@A\u0005"+
		"+\u0000\u0000Ab\u0003\u0000\u0000\u0000BC\u0005\"\u0000\u0000CD\u0005"+
		"\u0002\u0000\u0000DE\u0003\u001e\u000f\u0000EF\u0003\u0000\u0000\u0000"+
		"Fb\u0001\u0000\u0000\u0000GH\u0005!\u0000\u0000HI\u0005\u0002\u0000\u0000"+
		"IJ\u0003\u001e\u000f\u0000JK\u0003\u0000\u0000\u0000Kb\u0001\u0000\u0000"+
		"\u0000LM\u0005%\u0000\u0000MN\u0005\u0002\u0000\u0000NO\u0003\u001e\u000f"+
		"\u0000OP\u0003\u0000\u0000\u0000Pb\u0001\u0000\u0000\u0000QR\u0005 \u0000"+
		"\u0000RS\u0005\u0002\u0000\u0000ST\u0003\u001e\u000f\u0000TU\u0003\u0000"+
		"\u0000\u0000Ub\u0001\u0000\u0000\u0000VW\u0005+\u0000\u0000WX\u0003\u0006"+
		"\u0003\u0000XY\u0003\u0000\u0000\u0000Yb\u0001\u0000\u0000\u0000Z[\u0005"+
		"\u001e\u0000\u0000[\\\u0005+\u0000\u0000\\]\u0003\u0002\u0001\u0000]^"+
		"\u0005\u001f\u0000\u0000^_\u0003\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`b\u0005\u0000\u0000\u0001a\"\u0001\u0000\u0000\u0000a+\u0001\u0000"+
		"\u0000\u0000a3\u0001\u0000\u0000\u0000a?\u0001\u0000\u0000\u0000aB\u0001"+
		"\u0000\u0000\u0000aG\u0001\u0000\u0000\u0000aL\u0001\u0000\u0000\u0000"+
		"aQ\u0001\u0000\u0000\u0000aV\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000b\u0001\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0012\u0000\u0000de\u0005\u0007\u0000\u0000ef\u0003\u000e\u0007\u0000"+
		"fg\u0005\b\u0000\u0000gh\u0005\u0014\u0000\u0000hi\u0003\u001c\u000e\u0000"+
		"ij\u0005\u0015\u0000\u0000jk\u0003\u0002\u0001\u0000k\u009d\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0018\u0000\u0000mn\u0005\u0007\u0000\u0000no\u0003"+
		"\u000e\u0007\u0000op\u0005\b\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0005"+
		"\u0019\u0000\u0000rs\u0003\u0002\u0001\u0000s\u009d\u0001\u0000\u0000"+
		"\u0000tu\u0005\u001a\u0000\u0000uv\u0005+\u0000\u0000vw\u0003\b\u0004"+
		"\u0000wx\u0005\u0001\u0000\u0000xy\u0003\u000e\u0007\u0000yz\u0005\u001c"+
		"\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0003\u0004\u0002\u0000|}\u0003"+
		"\u0002\u0001\u0000}~\u0005\u001b\u0000\u0000~\u007f\u0003\u0002\u0001"+
		"\u0000\u007f\u009d\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0017\u0000"+
		"\u0000\u0081\u0082\u0005+\u0000\u0000\u0082\u009d\u0003\u0002\u0001\u0000"+
		"\u0083\u0084\u0005\"\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085"+
		"\u0086\u0003\u001e\u000f\u0000\u0086\u0087\u0003\u0002\u0001\u0000\u0087"+
		"\u009d\u0001\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000\u0089\u008a"+
		"\u0005\u0002\u0000\u0000\u008a\u008b\u0003\u001e\u000f\u0000\u008b\u008c"+
		"\u0003\u0002\u0001\u0000\u008c\u009d\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005%\u0000\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0090\u0003"+
		"\u001e\u000f\u0000\u0090\u0091\u0003\u0002\u0001\u0000\u0091\u009d\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005 \u0000\u0000\u0093\u0094\u0005\u0002"+
		"\u0000\u0000\u0094\u0095\u0003\u001e\u000f\u0000\u0095\u0096\u0003\u0002"+
		"\u0001\u0000\u0096\u009d\u0001\u0000\u0000\u0000\u0097\u0098\u0005+\u0000"+
		"\u0000\u0098\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0003\u0002\u0001"+
		"\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009cc\u0001\u0000\u0000\u0000\u009cl\u0001\u0000\u0000\u0000\u009c"+
		"t\u0001\u0000\u0000\u0000\u009c\u0080\u0001\u0000\u0000\u0000\u009c\u0083"+
		"\u0001\u0000\u0000\u0000\u009c\u0088\u0001\u0000\u0000\u0000\u009c\u008d"+
		"\u0001\u0000\u0000\u0000\u009c\u0092\u0001\u0000\u0000\u0000\u009c\u0097"+
		"\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u0003"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001d\u0000\u0000\u009f\u00a2"+
		"\u0003\u001a\r\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u0005\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0007\u0000\u0000\u00a4\u00ae\u0005"+
		"\b\u0000\u0000\u00a5\u00ae\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005\u0001"+
		"\u0000\u0000\u00a7\u00ae\u0003\u000e\u0007\u0000\u00a8\u00a9\u0005\u0005"+
		"\u0000\u0000\u00a9\u00aa\u0003\u000e\u0007\u0000\u00aa\u00ab\u0005\u0006"+
		"\u0000\u0000\u00ab\u00ac\u0003\n\u0005\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a3\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a6\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ae\u0007\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0005\u0000"+
		"\u0000\u00b0\u00b1\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005\u0006\u0000"+
		"\u0000\u00b2\u00b3\u0003\b\u0004\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\t\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0005\u0000\u0000\u00b8\u00b9\u0003\u000e\u0007\u0000\u00b9"+
		"\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb\u0003\n\u0005\u0000\u00bb\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u00bf"+
		"\u0003\u000e\u0007\u0000\u00be\u00b7\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u000b\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0007\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3"+
		"\u0005\b\u0000\u0000\u00c3\u00d7\u0001\u0000\u0000\u0000\u00c4\u00d7\u0005"+
		"#\u0000\u0000\u00c5\u00d7\u0005$\u0000\u0000\u00c6\u00c7\u0005+\u0000"+
		"\u0000\u00c7\u00d7\u0003\u0010\b\u0000\u00c8\u00d7\u0005(\u0000\u0000"+
		"\u00c9\u00d7\u0005)\u0000\u0000\u00ca\u00cb\u0005\"\u0000\u0000\u00cb"+
		"\u00cc\u0005\u0002\u0000\u0000\u00cc\u00d7\u0003\u001e\u000f\u0000\u00cd"+
		"\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d7"+
		"\u0003\u001e\u000f\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0002\u0000\u0000\u00d2\u00d7\u0003\u001e\u000f\u0000\u00d3\u00d4\u0005"+
		" \u0000\u0000\u00d4\u00d5\u0005\u0002\u0000\u0000\u00d5\u00d7\u0003\u001e"+
		"\u000f\u0000\u00d6\u00c0\u0001\u0000\u0000\u0000\u00d6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00c5\u0001\u0000\u0000\u0000\u00d6\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00c8\u0001\u0000\u0000\u0000\u00d6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00d6\u00ca\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d7\r\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\f\u0006"+
		"\u0000\u00d9\u00da\u0003\u0012\t\u0000\u00da\u00e0\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0003\f\u0006\u0000\u00dd"+
		"\u00de\u0003\u0012\t\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00d8"+
		"\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00e0\u000f"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0005\u0000\u0000\u00e2\u00e3"+
		"\u0003\u000e\u0007\u0000\u00e3\u00e4\u0005\u0006\u0000\u0000\u00e4\u00e5"+
		"\u0003\u0010\b\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e1\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u0011\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005"+
		"\t\u0000\u0000\u00ea\u0103\u0003\u000e\u0007\u0000\u00eb\u00ec\u0005\n"+
		"\u0000\u0000\u00ec\u0103\u0003\u000e\u0007\u0000\u00ed\u00ee\u0005\u000b"+
		"\u0000\u0000\u00ee\u0103\u0003\u000e\u0007\u0000\u00ef\u00f0\u0005\f\u0000"+
		"\u0000\u00f0\u0103\u0003\u000e\u0007\u0000\u00f1\u00f2\u0005\'\u0000\u0000"+
		"\u00f2\u0103\u0003\u000e\u0007\u0000\u00f3\u00f4\u0005&\u0000\u0000\u00f4"+
		"\u0103\u0003\u000e\u0007\u0000\u00f5\u00f6\u0005\u0001\u0000\u0000\u00f6"+
		"\u0103\u0003\u0018\f\u0000\u00f7\u00f8\u0005\r\u0000\u0000\u00f8\u0103"+
		"\u0003\u0018\f\u0000\u00f9\u00fa\u0005\u000e\u0000\u0000\u00fa\u0103\u0003"+
		"\u0018\f\u0000\u00fb\u00fc\u0005\u000f\u0000\u0000\u00fc\u0103\u0003\u0018"+
		"\f\u0000\u00fd\u00fe\u0005\u0010\u0000\u0000\u00fe\u0103\u0003\u0018\f"+
		"\u0000\u00ff\u0100\u0005\u0011\u0000\u0000\u0100\u0103\u0003\u0018\f\u0000"+
		"\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00e9\u0001\u0000\u0000\u0000"+
		"\u0102\u00eb\u0001\u0000\u0000\u0000\u0102\u00ed\u0001\u0000\u0000\u0000"+
		"\u0102\u00ef\u0001\u0000\u0000\u0000\u0102\u00f1\u0001\u0000\u0000\u0000"+
		"\u0102\u00f3\u0001\u0000\u0000\u0000\u0102\u00f5\u0001\u0000\u0000\u0000"+
		"\u0102\u00f7\u0001\u0000\u0000\u0000\u0102\u00f9\u0001\u0000\u0000\u0000"+
		"\u0102\u00fb\u0001\u0000\u0000\u0000\u0102\u00fd\u0001\u0000\u0000\u0000"+
		"\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0013\u0001\u0000\u0000\u0000\u0104\u0105\u0005\t\u0000\u0000\u0105"+
		"\u0112\u0003\u000e\u0007\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107\u0112"+
		"\u0003\u000e\u0007\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u0112"+
		"\u0003\u000e\u0007\u0000\u010a\u010b\u0005\f\u0000\u0000\u010b\u0112\u0003"+
		"\u000e\u0007\u0000\u010c\u010d\u0005\'\u0000\u0000\u010d\u0112\u0003\u000e"+
		"\u0007\u0000\u010e\u010f\u0005&\u0000\u0000\u010f\u0112\u0003\u000e\u0007"+
		"\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u0104\u0001\u0000\u0000"+
		"\u0000\u0111\u0106\u0001\u0000\u0000\u0000\u0111\u0108\u0001\u0000\u0000"+
		"\u0000\u0111\u010a\u0001\u0000\u0000\u0000\u0111\u010c\u0001\u0000\u0000"+
		"\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0112\u0015\u0001\u0000\u0000\u0000\u0113\u0114\u0005\t\u0000\u0000"+
		"\u0114\u011d\u0003\u001a\r\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116"+
		"\u011d\u0003\u001a\r\u0000\u0117\u0118\u0005\u000b\u0000\u0000\u0118\u011d"+
		"\u0003\u001a\r\u0000\u0119\u011a\u0005\f\u0000\u0000\u011a\u011d\u0003"+
		"\u001a\r\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0113\u0001\u0000"+
		"\u0000\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0117\u0001\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u0017\u0001\u0000\u0000\u0000\u011e\u011f\u0003\f\u0006"+
		"\u0000\u011f\u0120\u0003\u0014\n\u0000\u0120\u0124\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005\n\u0000\u0000\u0122\u0124\u0003\u0014\n\u0000\u0123"+
		"\u011e\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124"+
		"\u0019\u0001\u0000\u0000\u0000\u0125\u0126\u0003\f\u0006\u0000\u0126\u0127"+
		"\u0003\u0016\u000b\u0000\u0127\u012b\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005\n\u0000\u0000\u0129\u012b\u0003\u0016\u000b\u0000\u012a\u0125\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u001b\u0001"+
		"\u0000\u0000\u0000\u012c\u0138\u0003\u0002\u0001\u0000\u012d\u012e\u0005"+
		"\u0016\u0000\u0000\u012e\u012f\u0005\u0007\u0000\u0000\u012f\u0130\u0003"+
		"\u000e\u0007\u0000\u0130\u0131\u0005\b\u0000\u0000\u0131\u0132\u0005\u0014"+
		"\u0000\u0000\u0132\u0133\u0003\u001c\u000e\u0000\u0133\u0138\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005\u0013\u0000\u0000\u0135\u0138\u0003\u0002"+
		"\u0001\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000"+
		"\u0000\u0000\u0137\u012d\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u001d\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0005+\u0000\u0000\u013a\u013b\u0005\u0007\u0000"+
		"\u0000\u013b\u013c\u0003 \u0010\u0000\u013c\u013d\u0005\b\u0000\u0000"+
		"\u013d\u001f\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u0003\u0000\u0000"+
		"\u013f\u0143\u0003 \u0010\u0000\u0140\u0143\u0003\u000e\u0007\u0000\u0141"+
		"\u0143\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143"+
		"!\u0001\u0000\u0000\u0000\u0010a\u009c\u00a1\u00ad\u00b5\u00be\u00d6\u00df"+
		"\u00e7\u0102\u0111\u011c\u0123\u012a\u0137\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}