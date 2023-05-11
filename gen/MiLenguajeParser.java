// Generated from C:/Users/Usuario/OneDrive/Escritorio/Proyecto lenguajes/TRADUCTOR_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
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
		RULE_while = 8, RULE_forCondicion = 9, RULE_toCondicion = 10, RULE_for = 11, 
		RULE_identSentencia = 12, RULE_identFor = 13, RULE_arrayAsignacionesCondicion = 14, 
		RULE_arrayAsignaciones = 15, RULE_valor = 16, RULE_variable = 17, RULE_arrayOperacionCondicion = 18, 
		RULE_arrayOperacion = 19, RULE_operaciones = 20, RULE_operacionesLog = 21, 
		RULE_operacionesStep = 22, RULE_variableLog = 23, RULE_variableStep = 24, 
		RULE_sentenciaIf = 25, RULE_sentenciaElseIf = 26, RULE_elseifCondicion = 27, 
		RULE_elseif = 28, RULE_funcionContinuidad = 29, RULE_funcionVar = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencia", "sentenciaElse", "stepF", "sub", "ifCondicion", 
			"if", "whileCondicion", "while", "forCondicion", "toCondicion", "for", 
			"identSentencia", "identFor", "arrayAsignacionesCondicion", "arrayAsignaciones", 
			"valor", "variable", "arrayOperacionCondicion", "arrayOperacion", "operaciones", 
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
			"'Program'", null, null, "'TextWindow'", "'Or'", "'And'"
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
			setState(62);
			sentenciaElse();
			setState(63);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sub:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				sub();
				setState(66);
				inicio();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				if_();
				setState(72);
				sentenciaElse();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				while_();
				setState(75);
				sentenciaElse();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				for_();
				setState(78);
				sentenciaElse();
				}
				break;
			case Goto:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(Goto);
				setState(81);
				match(Id);
				setState(82);
				sentenciaElse();
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(Program);
				setState(84);
				match(Tkn_period);
				setState(85);
				funcionContinuidad();
				setState(86);
				sentenciaElse();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(Stack);
				setState(89);
				match(Tkn_period);
				setState(90);
				funcionContinuidad();
				setState(91);
				sentenciaElse();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				match(TextWindow);
				setState(94);
				match(Tkn_period);
				setState(95);
				funcionContinuidad();
				setState(96);
				sentenciaElse();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				match(Array);
				setState(99);
				match(Tkn_period);
				setState(100);
				funcionContinuidad();
				setState(101);
				sentenciaElse();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(Id);
				setState(104);
				identSentencia();
				setState(105);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Step:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(Step);
				setState(111);
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
			setState(115);
			match(Sub);
			setState(116);
			match(Id);
			setState(117);
			sentenciaElse();
			setState(118);
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
			setState(120);
			match(If);
			setState(121);
			match(Tkn_left_paren);
			setState(122);
			variable();
			setState(123);
			match(Tkn_right_paren);
			setState(124);
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
			setState(126);
			ifCondicion();
			setState(127);
			sentenciaIf();
			setState(128);
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
			setState(130);
			match(While);
			setState(131);
			match(Tkn_left_paren);
			setState(132);
			variable();
			setState(133);
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
			setState(135);
			whileCondicion();
			setState(136);
			sentenciaElse();
			setState(137);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ToCondicionContext toCondicion() {
			return getRuleContext(ToCondicionContext.class,0);
		}
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
			setState(139);
			match(For);
			setState(140);
			match(Id);
			setState(141);
			identFor();
			setState(142);
			match(Tkn_equals);
			setState(143);
			variable();
			setState(144);
			toCondicion();
			setState(145);
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
	public static class ToCondicionContext extends ParserRuleContext {
		public TerminalNode To() { return getToken(MiLenguajeParser.To, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ToCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterToCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitToCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitToCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToCondicionContext toCondicion() throws RecognitionException {
		ToCondicionContext _localctx = new ToCondicionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_toCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(To);
			setState(148);
			variable();
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
		enterRule(_localctx, 22, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			forCondicion();
			setState(151);
			sentenciaElse();
			setState(152);
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
		enterRule(_localctx, 24, RULE_identSentencia);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(Tkn_left_paren);
				setState(155);
				match(Tkn_right_paren);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(Tkn_colon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(Tkn_equals);
				setState(158);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
		enterRule(_localctx, 26, RULE_identFor);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(Tkn_left_brac);
				setState(163);
				variable();
				setState(164);
				match(Tkn_right_brac);
				setState(165);
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
		enterRule(_localctx, 28, RULE_arrayAsignacionesCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Tkn_left_brac);
			setState(171);
			variable();
			setState(172);
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
		enterRule(_localctx, 30, RULE_arrayAsignaciones);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				arrayAsignacionesCondicion();
				setState(175);
				arrayAsignaciones();
				}
				break;
			case Tkn_equals:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(Tkn_equals);
				setState(178);
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
		enterRule(_localctx, 32, RULE_valor);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_paren:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Tkn_left_paren);
				setState(182);
				variable();
				setState(183);
				match(Tkn_right_paren);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(False);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(Id);
				setState(188);
				arrayOperacion();
				}
				break;
			case Tkn_number:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(Tkn_number);
				}
				break;
			case Tkn_text:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(Tkn_text);
				}
				break;
			case Program:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(Program);
				setState(192);
				match(Tkn_period);
				setState(193);
				funcionContinuidad();
				}
				break;
			case Stack:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				match(Stack);
				setState(195);
				match(Tkn_period);
				setState(196);
				funcionContinuidad();
				}
				break;
			case TextWindow:
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				match(TextWindow);
				setState(198);
				match(Tkn_period);
				setState(199);
				funcionContinuidad();
				}
				break;
			case Array:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				match(Array);
				setState(201);
				match(Tkn_period);
				setState(202);
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
		enterRule(_localctx, 34, RULE_variable);
		try {
			setState(212);
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
				setState(205);
				valor();
				setState(206);
				operaciones();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(Tkn_minus);
				setState(209);
				valor();
				setState(210);
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
		enterRule(_localctx, 36, RULE_arrayOperacionCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Tkn_left_brac);
			setState(215);
			variable();
			setState(216);
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
		enterRule(_localctx, 38, RULE_arrayOperacion);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_left_brac:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				arrayOperacionCondicion();
				setState(219);
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
		enterRule(_localctx, 40, RULE_operaciones);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(Tkn_plus);
				setState(225);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(Tkn_minus);
				setState(227);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(Tkn_times);
				setState(229);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(Tkn_div);
				setState(231);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(And);
				setState(233);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(Or);
				setState(235);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(Tkn_equals);
				setState(237);
				variableLog();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				match(Tkn_leq);
				setState(239);
				variableLog();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				match(Tkn_geq);
				setState(241);
				variableLog();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(242);
				match(Tkn_diff);
				setState(243);
				variableLog();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(244);
				match(Tkn_less);
				setState(245);
				variableLog();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(246);
				match(Tkn_greater);
				setState(247);
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
		enterRule(_localctx, 42, RULE_operacionesLog);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(Tkn_plus);
				setState(252);
				variableLog();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(Tkn_minus);
				setState(254);
				variableLog();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(Tkn_times);
				setState(256);
				variableLog();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(Tkn_div);
				setState(258);
				variableLog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				match(And);
				setState(260);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(Or);
				setState(262);
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
		enterRule(_localctx, 44, RULE_operacionesStep);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_plus:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(Tkn_plus);
				setState(267);
				variableStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(Tkn_minus);
				setState(269);
				variableStep();
				}
				break;
			case Tkn_times:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(Tkn_times);
				setState(271);
				variableStep();
				}
				break;
			case Tkn_div:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(Tkn_div);
				setState(273);
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
		enterRule(_localctx, 46, RULE_variableLog);
		try {
			setState(282);
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
				setState(277);
				valor();
				setState(278);
				operacionesLog();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(Tkn_minus);
				setState(281);
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
		enterRule(_localctx, 48, RULE_variableStep);
		try {
			setState(289);
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
				setState(284);
				valor();
				setState(285);
				operacionesStep();
				}
				break;
			case Tkn_minus:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(Tkn_minus);
				setState(288);
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
		enterRule(_localctx, 50, RULE_sentenciaIf);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				sentenciaElse();
				setState(292);
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
		enterRule(_localctx, 52, RULE_sentenciaElseIf);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ElseIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				elseif();
				setState(298);
				sentenciaElseIf();
				}
				break;
			case Else:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(Else);
				setState(301);
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
		enterRule(_localctx, 54, RULE_elseifCondicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(ElseIf);
			setState(306);
			match(Tkn_left_paren);
			setState(307);
			variable();
			setState(308);
			match(Tkn_right_paren);
			setState(309);
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
		enterRule(_localctx, 56, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			elseifCondicion();
			setState(312);
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
		enterRule(_localctx, 58, RULE_funcionContinuidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Id);
			setState(315);
			match(Tkn_left_paren);
			setState(316);
			funcionVar();
			setState(317);
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
		enterRule(_localctx, 60, RULE_funcionVar);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tkn_comma:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(Tkn_comma);
				setState(320);
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
				setState(321);
				variable();
				setState(322);
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
		"\u0004\u0001+\u0148\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00a9\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b4"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cc"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00d5\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00df\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00fa\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0109\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0114"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u011b\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0122\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0128\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0130\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u0146\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<\u0000\u0000\u0160\u0000>\u0001\u0000\u0000\u0000\u0002"+
		"E\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006q\u0001"+
		"\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nx\u0001\u0000\u0000\u0000"+
		"\f~\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010"+
		"\u0087\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u0093\u0001\u0000\u0000\u0000\u0016\u0096\u0001\u0000\u0000\u0000\u0018"+
		"\u00a0\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000\u0000\u0000\u001c"+
		"\u00aa\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00cb"+
		"\u0001\u0000\u0000\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00d6\u0001"+
		"\u0000\u0000\u0000&\u00de\u0001\u0000\u0000\u0000(\u00f9\u0001\u0000\u0000"+
		"\u0000*\u0108\u0001\u0000\u0000\u0000,\u0113\u0001\u0000\u0000\u0000."+
		"\u011a\u0001\u0000\u0000\u00000\u0121\u0001\u0000\u0000\u00002\u0127\u0001"+
		"\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006\u0131\u0001\u0000\u0000"+
		"\u00008\u0137\u0001\u0000\u0000\u0000:\u013a\u0001\u0000\u0000\u0000<"+
		"\u0145\u0001\u0000\u0000\u0000>?\u0003\u0004\u0002\u0000?@\u0003\u0002"+
		"\u0001\u0000@\u0001\u0001\u0000\u0000\u0000AB\u0003\b\u0004\u0000BC\u0003"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DF\u0005\u0000\u0000\u0001"+
		"EA\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GH\u0003\f\u0006\u0000HI\u0003\u0004\u0002\u0000Im\u0001\u0000"+
		"\u0000\u0000JK\u0003\u0010\b\u0000KL\u0003\u0004\u0002\u0000Lm\u0001\u0000"+
		"\u0000\u0000MN\u0003\u0016\u000b\u0000NO\u0003\u0004\u0002\u0000Om\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0017\u0000\u0000QR\u0005+\u0000\u0000Rm\u0003"+
		"\u0004\u0002\u0000ST\u0005\"\u0000\u0000TU\u0005\u0002\u0000\u0000UV\u0003"+
		":\u001d\u0000VW\u0003\u0004\u0002\u0000Wm\u0001\u0000\u0000\u0000XY\u0005"+
		"!\u0000\u0000YZ\u0005\u0002\u0000\u0000Z[\u0003:\u001d\u0000[\\\u0003"+
		"\u0004\u0002\u0000\\m\u0001\u0000\u0000\u0000]^\u0005%\u0000\u0000^_\u0005"+
		"\u0002\u0000\u0000_`\u0003:\u001d\u0000`a\u0003\u0004\u0002\u0000am\u0001"+
		"\u0000\u0000\u0000bc\u0005 \u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003"+
		":\u001d\u0000ef\u0003\u0004\u0002\u0000fm\u0001\u0000\u0000\u0000gh\u0005"+
		"+\u0000\u0000hi\u0003\u0018\f\u0000ij\u0003\u0004\u0002\u0000jm\u0001"+
		"\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lG\u0001\u0000\u0000\u0000"+
		"lJ\u0001\u0000\u0000\u0000lM\u0001\u0000\u0000\u0000lP\u0001\u0000\u0000"+
		"\u0000lS\u0001\u0000\u0000\u0000lX\u0001\u0000\u0000\u0000l]\u0001\u0000"+
		"\u0000\u0000lb\u0001\u0000\u0000\u0000lg\u0001\u0000\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000m\u0005\u0001\u0000\u0000\u0000no\u0005\u001d\u0000"+
		"\u0000or\u00030\u0018\u0000pr\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000"+
		"\u0000qp\u0001\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000st\u0005"+
		"\u001e\u0000\u0000tu\u0005+\u0000\u0000uv\u0003\u0004\u0002\u0000vw\u0005"+
		"\u001f\u0000\u0000w\t\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000\u0000"+
		"yz\u0005\u0007\u0000\u0000z{\u0003\"\u0011\u0000{|\u0005\b\u0000\u0000"+
		"|}\u0005\u0014\u0000\u0000}\u000b\u0001\u0000\u0000\u0000~\u007f\u0003"+
		"\n\u0005\u0000\u007f\u0080\u00032\u0019\u0000\u0080\u0081\u0005\u0015"+
		"\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0018\u0000"+
		"\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085\u0003\"\u0011\u0000"+
		"\u0085\u0086\u0005\b\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003\u000e\u0007\u0000\u0088\u0089\u0003\u0004\u0002\u0000\u0089"+
		"\u008a\u0005\u0019\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u001a\u0000\u0000\u008c\u008d\u0005+\u0000\u0000\u008d\u008e"+
		"\u0003\u001a\r\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0090\u0003"+
		"\"\u0011\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0092\u0003\u0006"+
		"\u0003\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001c"+
		"\u0000\u0000\u0094\u0095\u0003\"\u0011\u0000\u0095\u0015\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098\u0003\u0004\u0002\u0000"+
		"\u0098\u0099\u0005\u001b\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u00a1\u0005\b\u0000\u0000\u009c"+
		"\u00a1\u0005\u0004\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e"+
		"\u00a1\u0003\"\u0011\u0000\u009f\u00a1\u0003\u001e\u000f\u0000\u00a0\u009a"+
		"\u0001\u0000\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u0019"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000\u00a3\u00a4"+
		"\u0003\"\u0011\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a6\u0003"+
		"\u001a\r\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0005"+
		"\u0000\u0000\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u00ad\u0005\u0006\u0000"+
		"\u0000\u00ad\u001d\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u001c\u000e"+
		"\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0001\u0000\u0000\u00b2\u00b4\u0003\"\u0011\u0000"+
		"\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0007\u0000\u0000"+
		"\u00b6\u00b7\u0003\"\u0011\u0000\u00b7\u00b8\u0005\b\u0000\u0000\u00b8"+
		"\u00cc\u0001\u0000\u0000\u0000\u00b9\u00cc\u0005#\u0000\u0000\u00ba\u00cc"+
		"\u0005$\u0000\u0000\u00bb\u00bc\u0005+\u0000\u0000\u00bc\u00cc\u0003&"+
		"\u0013\u0000\u00bd\u00cc\u0005(\u0000\u0000\u00be\u00cc\u0005)\u0000\u0000"+
		"\u00bf\u00c0\u0005\"\u0000\u0000\u00c0\u00c1\u0005\u0002\u0000\u0000\u00c1"+
		"\u00cc\u0003:\u001d\u0000\u00c2\u00c3\u0005!\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0002\u0000\u0000\u00c4\u00cc\u0003:\u001d\u0000\u00c5\u00c6\u0005%\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000\u00c7\u00cc\u0003:\u001d\u0000"+
		"\u00c8\u00c9\u0005 \u0000\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca"+
		"\u00cc\u0003:\u001d\u0000\u00cb\u00b5\u0001\u0000\u0000\u0000\u00cb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00ba\u0001\u0000\u0000\u0000\u00cb\u00bb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00bd\u0001\u0000\u0000\u0000\u00cb\u00be"+
		"\u0001\u0000\u0000\u0000\u00cb\u00bf\u0001\u0000\u0000\u0000\u00cb\u00c2"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		" \u0010\u0000\u00ce\u00cf\u0003(\u0014\u0000\u00cf\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u00d2\u0003 \u0010\u0000"+
		"\u00d2\u00d3\u0003(\u0014\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d5"+
		"#\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7\u00d8"+
		"\u0003\"\u0011\u0000\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9%\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0003$\u0012\u0000\u00db\u00dc\u0003&\u0013"+
		"\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000"+
		"\u0000\u00de\u00da\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\'\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\t\u0000\u0000"+
		"\u00e1\u00fa\u0003\"\u0011\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3"+
		"\u00fa\u0003\"\u0011\u0000\u00e4\u00e5\u0005\u000b\u0000\u0000\u00e5\u00fa"+
		"\u0003\"\u0011\u0000\u00e6\u00e7\u0005\f\u0000\u0000\u00e7\u00fa\u0003"+
		"\"\u0011\u0000\u00e8\u00e9\u0005\'\u0000\u0000\u00e9\u00fa\u0003\"\u0011"+
		"\u0000\u00ea\u00eb\u0005&\u0000\u0000\u00eb\u00fa\u0003\"\u0011\u0000"+
		"\u00ec\u00ed\u0005\u0001\u0000\u0000\u00ed\u00fa\u0003.\u0017\u0000\u00ee"+
		"\u00ef\u0005\r\u0000\u0000\u00ef\u00fa\u0003.\u0017\u0000\u00f0\u00f1"+
		"\u0005\u000e\u0000\u0000\u00f1\u00fa\u0003.\u0017\u0000\u00f2\u00f3\u0005"+
		"\u000f\u0000\u0000\u00f3\u00fa\u0003.\u0017\u0000\u00f4\u00f5\u0005\u0010"+
		"\u0000\u0000\u00f5\u00fa\u0003.\u0017\u0000\u00f6\u00f7\u0005\u0011\u0000"+
		"\u0000\u00f7\u00fa\u0003.\u0017\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e0\u0001\u0000\u0000\u0000\u00f9\u00e2\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e4\u0001\u0000\u0000\u0000\u00f9\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e8\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f9\u00ec\u0001\u0000\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f0\u0001\u0000\u0000\u0000\u00f9\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa)\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\t\u0000\u0000\u00fc\u0109\u0003.\u0017\u0000\u00fd\u00fe"+
		"\u0005\n\u0000\u0000\u00fe\u0109\u0003.\u0017\u0000\u00ff\u0100\u0005"+
		"\u000b\u0000\u0000\u0100\u0109\u0003.\u0017\u0000\u0101\u0102\u0005\f"+
		"\u0000\u0000\u0102\u0109\u0003.\u0017\u0000\u0103\u0104\u0005\'\u0000"+
		"\u0000\u0104\u0109\u0003\"\u0011\u0000\u0105\u0106\u0005&\u0000\u0000"+
		"\u0106\u0109\u0003\"\u0011\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108"+
		"\u00fb\u0001\u0000\u0000\u0000\u0108\u00fd\u0001\u0000\u0000\u0000\u0108"+
		"\u00ff\u0001\u0000\u0000\u0000\u0108\u0101\u0001\u0000\u0000\u0000\u0108"+
		"\u0103\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109+\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0005\t\u0000\u0000\u010b\u0114\u00030\u0018\u0000\u010c\u010d\u0005"+
		"\n\u0000\u0000\u010d\u0114\u00030\u0018\u0000\u010e\u010f\u0005\u000b"+
		"\u0000\u0000\u010f\u0114\u00030\u0018\u0000\u0110\u0111\u0005\f\u0000"+
		"\u0000\u0111\u0114\u00030\u0018\u0000\u0112\u0114\u0001\u0000\u0000\u0000"+
		"\u0113\u010a\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000"+
		"\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0112\u0001\u0000\u0000\u0000\u0114-\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0003 \u0010\u0000\u0116\u0117\u0003*\u0015\u0000\u0117\u011b\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005\n\u0000\u0000\u0119\u011b\u0003*"+
		"\u0015\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b/\u0001\u0000\u0000\u0000\u011c\u011d\u0003 \u0010\u0000"+
		"\u011d\u011e\u0003,\u0016\u0000\u011e\u0122\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\n\u0000\u0000\u0120\u0122\u0003,\u0016\u0000\u0121\u011c"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u01221\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0003\u0004\u0002\u0000\u0124\u0125\u0003"+
		"4\u001a\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000"+
		"\u0000\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u01283\u0001\u0000\u0000\u0000\u0129\u012a\u00038\u001c\u0000"+
		"\u012a\u012b\u00034\u001a\u0000\u012b\u0130\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\u0013\u0000\u0000\u012d\u0130\u0003\u0004\u0002\u0000\u012e"+
		"\u0130\u0001\u0000\u0000\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f"+
		"\u012c\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"5\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0016\u0000\u0000\u0132\u0133"+
		"\u0005\u0007\u0000\u0000\u0133\u0134\u0003\"\u0011\u0000\u0134\u0135\u0005"+
		"\b\u0000\u0000\u0135\u0136\u0005\u0014\u0000\u0000\u01367\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u00036\u001b\u0000\u0138\u0139\u0003\u0004\u0002"+
		"\u0000\u01399\u0001\u0000\u0000\u0000\u013a\u013b\u0005+\u0000\u0000\u013b"+
		"\u013c\u0005\u0007\u0000\u0000\u013c\u013d\u0003<\u001e\u0000\u013d\u013e"+
		"\u0005\b\u0000\u0000\u013e;\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"\u0003\u0000\u0000\u0140\u0146\u0003<\u001e\u0000\u0141\u0142\u0003\""+
		"\u0011\u0000\u0142\u0143\u0003<\u001e\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u013f\u0001\u0000\u0000"+
		"\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000"+
		"\u0000\u0146=\u0001\u0000\u0000\u0000\u0011Elq\u00a0\u00a8\u00b3\u00cb"+
		"\u00d4\u00de\u00f9\u0108\u0113\u011a\u0121\u0127\u012f\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}