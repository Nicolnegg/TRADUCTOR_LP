// Generated from C:/Users/Nicol/Documents/Lenguajes/TRADUCTOR_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiLenguajeParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiLenguajeParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaElse}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaElse}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#stepF}.
	 * @param ctx the parse tree
	 */
	void enterStepF(MiLenguajeParser.StepFContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#stepF}.
	 * @param ctx the parse tree
	 */
	void exitStepF(MiLenguajeParser.StepFContext ctx);
	/**
<<<<<<< HEAD
	 * Enter a parse tree produced by {@link MiLenguajeParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(MiLenguajeParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(MiLenguajeParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(MiLenguajeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(MiLenguajeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(MiLenguajeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(MiLenguajeParser.ForContext ctx);
	/**
=======
>>>>>>> origin/master
	 * Enter a parse tree produced by {@link MiLenguajeParser#identSentencia}.
	 * @param ctx the parse tree
	 */
	void enterIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#identSentencia}.
	 * @param ctx the parse tree
	 */
	void exitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#identFor}.
	 * @param ctx the parse tree
	 */
	void enterIdentFor(MiLenguajeParser.IdentForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#identFor}.
	 * @param ctx the parse tree
	 */
	void exitIdentFor(MiLenguajeParser.IdentForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arrayAsignaciones}.
	 * @param ctx the parse tree
	 */
	void enterArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arrayAsignaciones}.
	 * @param ctx the parse tree
	 */
	void exitArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(MiLenguajeParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(MiLenguajeParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiLenguajeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiLenguajeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arrayOperacion}.
	 * @param ctx the parse tree
	 */
	void enterArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arrayOperacion}.
	 * @param ctx the parse tree
	 */
	void exitArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(MiLenguajeParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(MiLenguajeParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operacionesLog}.
	 * @param ctx the parse tree
	 */
	void enterOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operacionesLog}.
	 * @param ctx the parse tree
	 */
	void exitOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operacionesStep}.
	 * @param ctx the parse tree
	 */
	void enterOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operacionesStep}.
	 * @param ctx the parse tree
	 */
	void exitOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#variableLog}.
	 * @param ctx the parse tree
	 */
	void enterVariableLog(MiLenguajeParser.VariableLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#variableLog}.
	 * @param ctx the parse tree
	 */
	void exitVariableLog(MiLenguajeParser.VariableLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#variableStep}.
	 * @param ctx the parse tree
	 */
	void enterVariableStep(MiLenguajeParser.VariableStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#variableStep}.
	 * @param ctx the parse tree
	 */
	void exitVariableStep(MiLenguajeParser.VariableStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcionContinuidad}.
	 * @param ctx the parse tree
	 */
	void enterFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcionContinuidad}.
	 * @param ctx the parse tree
	 */
	void exitFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcionVar}.
	 * @param ctx the parse tree
	 */
	void enterFuncionVar(MiLenguajeParser.FuncionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcionVar}.
	 * @param ctx the parse tree
	 */
	void exitFuncionVar(MiLenguajeParser.FuncionVarContext ctx);
}