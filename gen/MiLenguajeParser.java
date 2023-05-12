// Generated from D:/Trabajos UN/2023-1/Lenguajes de programación/TRADUCTOR_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
		RULE_sub = 4, RULE_ifCondicion = 5, RULE_if = 6, RULE_whileCondicion = 7, 
		RULE_while = 8, RULE_forCondicion = 9, RULE_for = 10, RULE_identSentencia = 11, 
		RULE_identFor = 12, RULE_arrayAsignacionesCondicion = 13, RULE_arrayAsignaciones = 14, 
		RULE_valor = 15, RULE_variable = 16, RULE_arrayOperacionCondicion = 17, 
		RULE_arrayOperacion = 18, RULE_operaciones = 19, RULE_operacionesLog = 20, 
		RULE_operacionesStep = 21, RULE_variableLog = 22, RULE_variableStep = 23, 
		RULE_sentenciaIf = 24, RULE_sentenciaElseIf = 25, RULE_elseifCondicion = 26, 
		RULE_elseif = 27, RULE_funcionContinuidad = 28, RULE_funcionVar = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencia", "sentenciaElse", "stepF", "sub", "ifCondicion", 
			"if", "whileCondicion", "while", "forCondicion", "for", "identSentencia", 
			"identFor", "arrayAsignacionesCondicion", "arrayAsignaciones", "valor", 
			"variable", "arrayOperacionCondicion", "arrayOperacion", "operaciones", 
			"operacionesLog", "operacionesStep", "variableLog", "variableStep", "sentenciaIf", 
			"sentenciaElseIf", "elseifCondicion", "elseif", "funcionContinuidad", 
			"funcionVar"
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
			setState(60);
			sentenciaElse();
			setState(61);
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
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sub:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				sub();
				setState(64);
				inicio();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				if_();
				setState(70);
				sentenciaElse();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				while_();
				setState(73);
				sentenciaElse();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				for_();
				setState(76);
				sentenciaElse();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				match(Goto);
				setState(79);
				match(Id);
				setState(80);
				sentenciaElse();
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(Program);
				setState(82);
				match(Tkn_period);
				setState(83);
				funcionContinuidad();
				setState(84);
				sentenciaElse();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(Stack);
				setState(87);
				match(Tkn_period);
				setState(88);
				funcionContinuidad();
				setState(89);
				sentenciaElse();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(TextWindow);
				setState(92);
				match(Tkn_period);
				setState(93);
				funcionContinuidad();
				setState(94);
				sentenciaElse();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				match(Array);
				setState(97);
				match(Tkn_period);
				setState(98);
				funcionContinuidad();
				setState(99);
				sentenciaElse();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				match(Id);
				setState(102);
				identSentencia();
				setState(103);
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Step:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(Step);
				setState(109);
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
			setState(113);
			match(Sub);
			setState(114);
			match(Id);
			setState(115);
			sentenciaElse();
			setState(116);
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
	public static class IfCondicionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MiLenguajeParser.If, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Then() { return getToken(MiLenguajeParser.Then, 0); }
		public IfCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIfCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIfCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIfCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondicionContext ifCondicion() throws RecognitionException {
		IfCondicionContext _localctx = new IfCondicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(If);
			setState(119);
			match(Tkn_left_paren);
			setState(120);
			variable();
			setState(121);
			match(Tkn_right_paren);
			setState(122);
			match(Then);
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
		public IfCondicionContext ifCondicion() {
			return getRuleContext(IfCondicionContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			ifCondicion();
			setState(125);
			sentenciaIf();
			setState(126);
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
	public static class WhileCondicionContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MiLenguajeParser.While, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public WhileCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhileCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhileCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitWhileCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCondicionContext whileCondicion() throws RecognitionException {
		WhileCondicionContext _localctx = new WhileCondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(While);
			setState(129);
			match(Tkn_left_paren);
			setState(130);
			variable();
			setState(131);
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
	public static class WhileContext extends ParserRuleContext {
		public WhileCondicionContext whileCondicion() {
			return getRuleContext(WhileCondicionContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			whileCondicion();
			setState(134);
			sentenciaElse();
			setState(135);
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
	public static class ForCondicionContext extends ParserRuleContext {
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
		public ForCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCondicionContext forCondicion() throws RecognitionException {
		ForCondicionContext _localctx = new ForCondicionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(For);
			setState(138);
			match(Id);
			setState(139);
			identFor();
			setState(140);
			match(Tkn_equals);
			setState(141);
			variable();
			setState(142);
			match(To);
			setState(143);
			variable();
			setState(144);
			stepF();
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
		public ForCondicionContext forCondicion() {
			return getRuleContext(ForCondicionContext.class,0);
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
		enterRule(_localctx, 20, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			forCondicion();
			setState(147);
			sentenciaElse();
			setState(148);
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
	public static class IdentSentenciaContext extends ParserRuleContext {
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Tkn_colon() { return getToken(MiLenguajeParser.Tkn_colon, 0); }
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_identSentencia);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(Tkn_left_paren);
				setState(151);
				match(Tkn_right_paren);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(Tkn_colon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(Tkn_equals);
				setState(154);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				arrayAsignaciones();
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
		enterRule(_localctx, 24, RULE_identFor);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(Tkn_left_brac);
				setState(159);
				variable();
				setState(160);
				match(Tkn_right_brac);
				setState(161);
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
	public static class ArrayAsignacionesCondicionContext extends ParserRuleContext {
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public ArrayAsignacionesCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAsignacionesCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArrayAsignacionesCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArrayAsignacionesCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArrayAsignacionesCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAsignacionesCondicionContext arrayAsignacionesCondicion() throws RecognitionException {
		ArrayAsignacionesCondicionContext _localctx = new ArrayAsignacionesCondicionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayAsignacionesCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Tkn_left_brac);
			setState(167);
			variable();
			setState(168);
			match(Tkn_right_brac);
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
		public ArrayAsignacionesCondicionContext arrayAsignacionesCondicion() {
			return getRuleContext(ArrayAsignacionesCondicionContext.class,0);
		}
		public ArrayAsignacionesContext arrayAsignaciones() {
			return getRuleContext(ArrayAsignacionesContext.class,0);
		}
		public TerminalNode Tkn_equals() { return getToken(MiLenguajeParser.Tkn_equals, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_arrayAsignaciones);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				arrayAsignacionesCondicion();
				setState(171);
				arrayAsignaciones();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Tkn_equals);
				setState(174);
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
		enterRule(_localctx, 30, RULE_valor);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(Tkn_left_paren);
				setState(178);
				variable();
				setState(179);
				match(Tkn_right_paren);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(False);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(Id);
				setState(184);
				arrayOperacion();
				}
				break;
			case Tkn_number:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(Tkn_number);
				}
				break;
			case Tkn_text:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(Tkn_text);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(Program);
				setState(188);
				match(Tkn_period);
				setState(189);
				funcionContinuidad();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(Stack);
				setState(191);
				match(Tkn_period);
				setState(192);
				funcionContinuidad();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				match(TextWindow);
				setState(194);
				match(Tkn_period);
				setState(195);
				funcionContinuidad();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 10);
				{
				setState(196);
				match(Array);
				setState(197);
				match(Tkn_period);
				setState(198);
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
		enterRule(_localctx, 32, RULE_variable);
		try {
			setState(208);
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
				setState(201);
				valor();
				setState(202);
				operaciones();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(Tkn_minus);
				setState(205);
				valor();
				setState(206);
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
	public static class ArrayOperacionCondicionContext extends ParserRuleContext {
		public TerminalNode Tkn_left_brac() { return getToken(MiLenguajeParser.Tkn_left_brac, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_brac() { return getToken(MiLenguajeParser.Tkn_right_brac, 0); }
		public ArrayOperacionCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOperacionCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArrayOperacionCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArrayOperacionCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitArrayOperacionCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOperacionCondicionContext arrayOperacionCondicion() throws RecognitionException {
		ArrayOperacionCondicionContext _localctx = new ArrayOperacionCondicionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayOperacionCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Tkn_left_brac);
			setState(211);
			variable();
			setState(212);
			match(Tkn_right_brac);
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
		public ArrayOperacionCondicionContext arrayOperacionCondicion() {
			return getRuleContext(ArrayOperacionCondicionContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_arrayOperacion);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				arrayOperacionCondicion();
				setState(215);
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
		enterRule(_localctx, 38, RULE_operaciones);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(Tkn_plus);
				setState(221);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Tkn_minus);
				setState(223);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(Tkn_times);
				setState(225);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(Tkn_div);
				setState(227);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(And);
				setState(229);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(Or);
				setState(231);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(Tkn_equals);
				setState(233);
				variableLog();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				match(Tkn_leq);
				setState(235);
				variableLog();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				match(Tkn_geq);
				setState(237);
				variableLog();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(238);
				match(Tkn_diff);
				setState(239);
				variableLog();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(240);
				match(Tkn_less);
				setState(241);
				variableLog();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(242);
				match(Tkn_greater);
				setState(243);
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
		public VariableLogContext variableLog() {
			return getRuleContext(VariableLogContext.class,0);
		}
		public TerminalNode Tkn_minus() { return getToken(MiLenguajeParser.Tkn_minus, 0); }
		public TerminalNode Tkn_times() { return getToken(MiLenguajeParser.Tkn_times, 0); }
		public TerminalNode Tkn_div() { return getToken(MiLenguajeParser.Tkn_div, 0); }
		public TerminalNode And() { return getToken(MiLenguajeParser.And, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_operacionesLog);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(Tkn_plus);
				setState(248);
				variableLog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(Tkn_minus);
				setState(250);
				variableLog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(Tkn_times);
				setState(252);
				variableLog();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(Tkn_div);
				setState(254);
				variableLog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(And);
				setState(256);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(Or);
				setState(258);
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
		enterRule(_localctx, 42, RULE_operacionesStep);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(Tkn_plus);
				setState(263);
				variableStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(Tkn_minus);
				setState(265);
				variableStep();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(Tkn_times);
				setState(267);
				variableStep();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(Tkn_div);
				setState(269);
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
		enterRule(_localctx, 44, RULE_variableLog);
		try {
			setState(278);
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
				setState(273);
				valor();
				setState(274);
				operacionesLog();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(Tkn_minus);
				setState(277);
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
		enterRule(_localctx, 46, RULE_variableStep);
		try {
			setState(285);
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
				setState(280);
				valor();
				setState(281);
				operacionesStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(Tkn_minus);
				setState(284);
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
		enterRule(_localctx, 48, RULE_sentenciaIf);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				sentenciaElse();
				setState(288);
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
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public SentenciaElseIfContext sentenciaElseIf() {
			return getRuleContext(SentenciaElseIfContext.class,0);
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
		enterRule(_localctx, 50, RULE_sentenciaElseIf);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ElseIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				elseif();
				setState(294);
				sentenciaElseIf();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(Else);
				setState(297);
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
	public static class ElseifCondicionContext extends ParserRuleContext {
		public TerminalNode ElseIf() { return getToken(MiLenguajeParser.ElseIf, 0); }
		public TerminalNode Tkn_left_paren() { return getToken(MiLenguajeParser.Tkn_left_paren, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Tkn_right_paren() { return getToken(MiLenguajeParser.Tkn_right_paren, 0); }
		public TerminalNode Then() { return getToken(MiLenguajeParser.Then, 0); }
		public ElseifCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElseifCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElseifCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitElseifCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifCondicionContext elseifCondicion() throws RecognitionException {
		ElseifCondicionContext _localctx = new ElseifCondicionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseifCondicion);
		try {
			enterOuterAlt(_localctx, 1);
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
	public static class ElseifContext extends ParserRuleContext {
		public ElseifCondicionContext elseifCondicion() {
			return getRuleContext(ElseifCondicionContext.class,0);
		}
		public SentenciaElseContext sentenciaElse() {
			return getRuleContext(SentenciaElseContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			elseifCondicion();
			setState(308);
			sentenciaElse();
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
		enterRule(_localctx, 56, RULE_funcionContinuidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Id);
			setState(311);
			match(Tkn_left_paren);
			setState(312);
			funcionVar();
			setState(313);
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
		enterRule(_localctx, 58, RULE_funcionVar);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(Tkn_comma);
				setState(316);
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
				setState(317);
				variable();
				setState(318);
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
		"\u0004\u0001+\u0144\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"D\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009d\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a5\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00b0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00c8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d1\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00db\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00f6\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0105\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0110\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0117\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u011e\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0124\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u012c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0142\b\u001d\u0001\u001d"+
		"\u0000\u0000\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0000\u015d\u0000"+
		"<\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004j\u0001"+
		"\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000"+
		"\u0000\nv\u0001\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u0080"+
		"\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0089"+
		"\u0001\u0000\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u009c"+
		"\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e\u00c7"+
		"\u0001\u0000\u0000\u0000 \u00d0\u0001\u0000\u0000\u0000\"\u00d2\u0001"+
		"\u0000\u0000\u0000$\u00da\u0001\u0000\u0000\u0000&\u00f5\u0001\u0000\u0000"+
		"\u0000(\u0104\u0001\u0000\u0000\u0000*\u010f\u0001\u0000\u0000\u0000,"+
		"\u0116\u0001\u0000\u0000\u0000.\u011d\u0001\u0000\u0000\u00000\u0123\u0001"+
		"\u0000\u0000\u00002\u012b\u0001\u0000\u0000\u00004\u012d\u0001\u0000\u0000"+
		"\u00006\u0133\u0001\u0000\u0000\u00008\u0136\u0001\u0000\u0000\u0000:"+
		"\u0141\u0001\u0000\u0000\u0000<=\u0003\u0004\u0002\u0000=>\u0003\u0002"+
		"\u0001\u0000>\u0001\u0001\u0000\u0000\u0000?@\u0003\b\u0004\u0000@A\u0003"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000BD\u0005\u0000\u0000\u0001"+
		"C?\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0003\u0001\u0000"+
		"\u0000\u0000EF\u0003\f\u0006\u0000FG\u0003\u0004\u0002\u0000Gk\u0001\u0000"+
		"\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0003\u0004\u0002\u0000Jk\u0001\u0000"+
		"\u0000\u0000KL\u0003\u0014\n\u0000LM\u0003\u0004\u0002\u0000Mk\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0017\u0000\u0000OP\u0005+\u0000\u0000Pk\u0003\u0004"+
		"\u0002\u0000QR\u0005\"\u0000\u0000RS\u0005\u0002\u0000\u0000ST\u00038"+
		"\u001c\u0000TU\u0003\u0004\u0002\u0000Uk\u0001\u0000\u0000\u0000VW\u0005"+
		"!\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u00038\u001c\u0000YZ\u0003\u0004"+
		"\u0002\u0000Zk\u0001\u0000\u0000\u0000[\\\u0005%\u0000\u0000\\]\u0005"+
		"\u0002\u0000\u0000]^\u00038\u001c\u0000^_\u0003\u0004\u0002\u0000_k\u0001"+
		"\u0000\u0000\u0000`a\u0005 \u0000\u0000ab\u0005\u0002\u0000\u0000bc\u0003"+
		"8\u001c\u0000cd\u0003\u0004\u0002\u0000dk\u0001\u0000\u0000\u0000ef\u0005"+
		"+\u0000\u0000fg\u0003\u0016\u000b\u0000gh\u0003\u0004\u0002\u0000hk\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jE\u0001\u0000\u0000\u0000"+
		"jH\u0001\u0000\u0000\u0000jK\u0001\u0000\u0000\u0000jN\u0001\u0000\u0000"+
		"\u0000jQ\u0001\u0000\u0000\u0000jV\u0001\u0000\u0000\u0000j[\u0001\u0000"+
		"\u0000\u0000j`\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000k\u0005\u0001\u0000\u0000\u0000lm\u0005\u001d\u0000"+
		"\u0000mp\u0003.\u0017\u0000np\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0005"+
		"\u001e\u0000\u0000rs\u0005+\u0000\u0000st\u0003\u0004\u0002\u0000tu\u0005"+
		"\u001f\u0000\u0000u\t\u0001\u0000\u0000\u0000vw\u0005\u0012\u0000\u0000"+
		"wx\u0005\u0007\u0000\u0000xy\u0003 \u0010\u0000yz\u0005\b\u0000\u0000"+
		"z{\u0005\u0014\u0000\u0000{\u000b\u0001\u0000\u0000\u0000|}\u0003\n\u0005"+
		"\u0000}~\u00030\u0018\u0000~\u007f\u0005\u0015\u0000\u0000\u007f\r\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0018\u0000\u0000\u0081\u0082\u0005"+
		"\u0007\u0000\u0000\u0082\u0083\u0003 \u0010\u0000\u0083\u0084\u0005\b"+
		"\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086\u0003\u000e"+
		"\u0007\u0000\u0086\u0087\u0003\u0004\u0002\u0000\u0087\u0088\u0005\u0019"+
		"\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u001a"+
		"\u0000\u0000\u008a\u008b\u0005+\u0000\u0000\u008b\u008c\u0003\u0018\f"+
		"\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008e\u0003 \u0010\u0000"+
		"\u008e\u008f\u0005\u001c\u0000\u0000\u008f\u0090\u0003 \u0010\u0000\u0090"+
		"\u0091\u0003\u0006\u0003\u0000\u0091\u0013\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003\u0012\t\u0000\u0093\u0094\u0003\u0004\u0002\u0000\u0094\u0095"+
		"\u0005\u001b\u0000\u0000\u0095\u0015\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u0007\u0000\u0000\u0097\u009d\u0005\b\u0000\u0000\u0098\u009d\u0005"+
		"\u0004\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009d\u0003"+
		" \u0010\u0000\u009b\u009d\u0003\u001c\u000e\u0000\u009c\u0096\u0001\u0000"+
		"\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u0017\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u00a0\u0003 \u0010"+
		"\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1\u00a2\u0003\u0018\f\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000"+
		"\u00a7\u00a8\u0003 \u0010\u0000\u00a8\u00a9\u0005\u0006\u0000\u0000\u00a9"+
		"\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u001a\r\u0000\u00ab\u00ac"+
		"\u0003\u001c\u000e\u0000\u00ac\u00b0\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0001\u0000\u0000\u00ae\u00b0\u0003 \u0010\u0000\u00af\u00aa\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u001d\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00b3\u0003"+
		" \u0010\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00c8\u0001\u0000"+
		"\u0000\u0000\u00b5\u00c8\u0005#\u0000\u0000\u00b6\u00c8\u0005$\u0000\u0000"+
		"\u00b7\u00b8\u0005+\u0000\u0000\u00b8\u00c8\u0003$\u0012\u0000\u00b9\u00c8"+
		"\u0005(\u0000\u0000\u00ba\u00c8\u0005)\u0000\u0000\u00bb\u00bc\u0005\""+
		"\u0000\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00c8\u00038\u001c"+
		"\u0000\u00be\u00bf\u0005!\u0000\u0000\u00bf\u00c0\u0005\u0002\u0000\u0000"+
		"\u00c0\u00c8\u00038\u001c\u0000\u00c1\u00c2\u0005%\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0002\u0000\u0000\u00c3\u00c8\u00038\u001c\u0000\u00c4\u00c5\u0005"+
		" \u0000\u0000\u00c5\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c8\u00038\u001c"+
		"\u0000\u00c7\u00b1\u0001\u0000\u0000\u0000\u00c7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00b6\u0001\u0000\u0000\u0000\u00c7\u00b7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00c7\u00bb\u0001\u0000\u0000\u0000\u00c7\u00be\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f"+
		"\u0000\u00ca\u00cb\u0003&\u0013\u0000\u00cb\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000\u00ce"+
		"\u00cf\u0003&\u0013\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d1!\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000\u00d3\u00d4\u0003"+
		" \u0010\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5#\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0003\"\u0011\u0000\u00d7\u00d8\u0003$\u0012\u0000"+
		"\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000"+
		"\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db%\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\t\u0000\u0000\u00dd"+
		"\u00f6\u0003 \u0010\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00f6"+
		"\u0003 \u0010\u0000\u00e0\u00e1\u0005\u000b\u0000\u0000\u00e1\u00f6\u0003"+
		" \u0010\u0000\u00e2\u00e3\u0005\f\u0000\u0000\u00e3\u00f6\u0003 \u0010"+
		"\u0000\u00e4\u00e5\u0005\'\u0000\u0000\u00e5\u00f6\u0003 \u0010\u0000"+
		"\u00e6\u00e7\u0005&\u0000\u0000\u00e7\u00f6\u0003 \u0010\u0000\u00e8\u00e9"+
		"\u0005\u0001\u0000\u0000\u00e9\u00f6\u0003,\u0016\u0000\u00ea\u00eb\u0005"+
		"\r\u0000\u0000\u00eb\u00f6\u0003,\u0016\u0000\u00ec\u00ed\u0005\u000e"+
		"\u0000\u0000\u00ed\u00f6\u0003,\u0016\u0000\u00ee\u00ef\u0005\u000f\u0000"+
		"\u0000\u00ef\u00f6\u0003,\u0016\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000"+
		"\u00f1\u00f6\u0003,\u0016\u0000\u00f2\u00f3\u0005\u0011\u0000\u0000\u00f3"+
		"\u00f6\u0003,\u0016\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00dc"+
		"\u0001\u0000\u0000\u0000\u00f5\u00de\u0001\u0000\u0000\u0000\u00f5\u00e0"+
		"\u0001\u0000\u0000\u0000\u00f5\u00e2\u0001\u0000\u0000\u0000\u00f5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00f5\u00e6\u0001\u0000\u0000\u0000\u00f5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ea\u0001\u0000\u0000\u0000\u00f5\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f5\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\t\u0000\u0000\u00f8\u0105\u0003,\u0016\u0000\u00f9\u00fa\u0005\n\u0000"+
		"\u0000\u00fa\u0105\u0003,\u0016\u0000\u00fb\u00fc\u0005\u000b\u0000\u0000"+
		"\u00fc\u0105\u0003,\u0016\u0000\u00fd\u00fe\u0005\f\u0000\u0000\u00fe"+
		"\u0105\u0003,\u0016\u0000\u00ff\u0100\u0005\'\u0000\u0000\u0100\u0105"+
		"\u0003 \u0010\u0000\u0101\u0102\u0005&\u0000\u0000\u0102\u0105\u0003 "+
		"\u0010\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00f7\u0001\u0000"+
		"\u0000\u0000\u0104\u00f9\u0001\u0000\u0000\u0000\u0104\u00fb\u0001\u0000"+
		"\u0000\u0000\u0104\u00fd\u0001\u0000\u0000\u0000\u0104\u00ff\u0001\u0000"+
		"\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000"+
		"\u0000\u0000\u0105)\u0001\u0000\u0000\u0000\u0106\u0107\u0005\t\u0000"+
		"\u0000\u0107\u0110\u0003.\u0017\u0000\u0108\u0109\u0005\n\u0000\u0000"+
		"\u0109\u0110\u0003.\u0017\u0000\u010a\u010b\u0005\u000b\u0000\u0000\u010b"+
		"\u0110\u0003.\u0017\u0000\u010c\u010d\u0005\f\u0000\u0000\u010d\u0110"+
		"\u0003.\u0017\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0106\u0001"+
		"\u0000\u0000\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u010f\u010a\u0001"+
		"\u0000\u0000\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u0110+\u0001\u0000\u0000\u0000\u0111\u0112\u0003\u001e"+
		"\u000f\u0000\u0112\u0113\u0003(\u0014\u0000\u0113\u0117\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0117\u0003(\u0014\u0000"+
		"\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000"+
		"\u0117-\u0001\u0000\u0000\u0000\u0118\u0119\u0003\u001e\u000f\u0000\u0119"+
		"\u011a\u0003*\u0015\u0000\u011a\u011e\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0005\n\u0000\u0000\u011c\u011e\u0003*\u0015\u0000\u011d\u0118\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e/\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0003\u0004\u0002\u0000\u0120\u0121\u00032\u0019"+
		"\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u01241\u0001\u0000\u0000\u0000\u0125\u0126\u00036\u001b\u0000\u0126"+
		"\u0127\u00032\u0019\u0000\u0127\u012c\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0005\u0013\u0000\u0000\u0129\u012c\u0003\u0004\u0002\u0000\u012a\u012c"+
		"\u0001\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000\u012b\u0128"+
		"\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c3\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005\u0016\u0000\u0000\u012e\u012f\u0005"+
		"\u0007\u0000\u0000\u012f\u0130\u0003 \u0010\u0000\u0130\u0131\u0005\b"+
		"\u0000\u0000\u0131\u0132\u0005\u0014\u0000\u0000\u01325\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u00034\u001a\u0000\u0134\u0135\u0003\u0004\u0002\u0000"+
		"\u01357\u0001\u0000\u0000\u0000\u0136\u0137\u0005+\u0000\u0000\u0137\u0138"+
		"\u0005\u0007\u0000\u0000\u0138\u0139\u0003:\u001d\u0000\u0139\u013a\u0005"+
		"\b\u0000\u0000\u013a9\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u0003"+
		"\u0000\u0000\u013c\u0142\u0003:\u001d\u0000\u013d\u013e\u0003 \u0010\u0000"+
		"\u013e\u013f\u0003:\u001d\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140"+
		"\u0142\u0001\u0000\u0000\u0000\u0141\u013b\u0001\u0000\u0000\u0000\u0141"+
		"\u013d\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142"+
		";\u0001\u0000\u0000\u0000\u0011Cjo\u009c\u00a4\u00af\u00c7\u00d0\u00da"+
		"\u00f5\u0104\u010f\u0116\u011d\u0123\u012b\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}