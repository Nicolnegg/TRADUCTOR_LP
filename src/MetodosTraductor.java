import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MetodosTraductor implements MiLenguajeListener {
    @Override
    public void enterSentencia(MiLenguajeParser.SentenciaContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitSentencia(MiLenguajeParser.SentenciaContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx) {

    }

    @Override
    public void exitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx) {

    }

    @Override
    public void enterStepF(MiLenguajeParser.StepFContext ctx) {

    }

    @Override
    public void exitStepF(MiLenguajeParser.StepFContext ctx) {

    }

    @Override
    public void enterIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx) {

    }

    @Override
    public void exitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx) {

    }

    @Override
    public void enterIdentFor(MiLenguajeParser.IdentForContext ctx) {

    }

    @Override
    public void exitIdentFor(MiLenguajeParser.IdentForContext ctx) {

    }

    @Override
    public void enterArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx) {

    }

    @Override
    public void exitArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx) {

    }

    @Override
    public void enterValor(MiLenguajeParser.ValorContext ctx) {

    }

    @Override
    public void exitValor(MiLenguajeParser.ValorContext ctx) {

    }

    @Override
    public void enterVariable(MiLenguajeParser.VariableContext ctx) {

    }

    @Override
    public void exitVariable(MiLenguajeParser.VariableContext ctx) {

    }

    @Override
    public void enterArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx) {

    }

    @Override
    public void exitArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx) {

    }

    @Override
    public void enterOperaciones(MiLenguajeParser.OperacionesContext ctx) {

    }

    @Override
    public void exitOperaciones(MiLenguajeParser.OperacionesContext ctx) {

    }

    @Override
    public void enterOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx) {

    }

    @Override
    public void exitOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx) {

    }

    @Override
    public void enterOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx) {

    }

    @Override
    public void exitOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx) {

    }

    @Override
    public void enterVariableLog(MiLenguajeParser.VariableLogContext ctx) {

    }

    @Override
    public void exitVariableLog(MiLenguajeParser.VariableLogContext ctx) {

    }

    @Override
    public void enterVariableStep(MiLenguajeParser.VariableStepContext ctx) {

    }

    @Override
    public void exitVariableStep(MiLenguajeParser.VariableStepContext ctx) {

    }

    @Override
    public void enterSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx) {

    }

    @Override
    public void exitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx) {

    }

    @Override
    public void enterFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx) {

    }

    @Override
    public void exitFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx) {

    }

    @Override
    public void enterFuncionVar(MiLenguajeParser.FuncionVarContext ctx) {

    }

    @Override
    public void exitFuncionVar(MiLenguajeParser.FuncionVarContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
