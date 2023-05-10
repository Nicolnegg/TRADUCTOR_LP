// Generated from C:/Users/Nicol/Documents/Lenguajes/TRADUCTOR_LP/Grammar\MiLenguaje.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(MiLenguajeParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stepF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStepF(MiLenguajeParser.StepFContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#identSentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#identFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFor(MiLenguajeParser.IdentForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arrayAsignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(MiLenguajeParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiLenguajeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#arrayOperacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(MiLenguajeParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operacionesLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operacionesStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#variableLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableLog(MiLenguajeParser.VariableLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#variableStep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStep(MiLenguajeParser.VariableStepContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcionContinuidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionVar(MiLenguajeParser.FuncionVarContext ctx);
}