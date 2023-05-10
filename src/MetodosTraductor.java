import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MetodosTraductor implements MiLenguajeListener {
    int identacion =0;
    public String idmult(int n){
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += "\t";
        }
        return s;
    }

    @Override
    public void enterInicio(MiLenguajeParser.InicioContext ctx) {

    }

    @Override
    public void exitInicio(MiLenguajeParser.InicioContext ctx) {

    }

    @Override
    public void enterSentencia(MiLenguajeParser.SentenciaContext ctx) {

    }

    @Override
    public void exitSentencia(MiLenguajeParser.SentenciaContext ctx) {}

    @Override
    public void enterSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx) {
        if (!ctx.isEmpty()){
            if(ctx.Goto()!=null){
                System.out.println("#No existe etiquetas en python");
            }
            else if(ctx.Program()!=null){
                if(ctx.Id().getText().equals("Delay")){
                    System.out.print(idmult(identacion) + "time.sleep");
                }
                else{
                    System.out.println("#No existe Program en python");
                }
            }
            else if(ctx.Stack()!=null){
                System.out.println("#No existe stack en python");
            }
            else if(ctx.TextWindow()!=null){
                System.out.print(idmult(identacion) + "print");
            }
            else if(ctx.Id()!=null){
                System.out.print(idmult(identacion) + ctx.Id().getText());
            }
        }
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
    public void enterSub(MiLenguajeParser.SubContext ctx) {
        if (!ctx.isEmpty()){
            if (ctx.Sub()!=null) {
                System.out.print("Def ");
                if (ctx.Id()!=null) {
                    String value = ctx.Id().getText();
                    System.out.println(value +"():");
                    identacion +=1;
                }
            }
        }
    }

    @Override
    public void exitSub(MiLenguajeParser.SubContext ctx) {
        if (ctx.EndSub()!=null) {
            identacion -=1;
        }
    }

    @Override
    public void enterIf(MiLenguajeParser.IfContext ctx) {
        if (ctx.If() != null) {
            System.out.print(idmult(identacion)+"if ");
            if (ctx.Tkn_left_paren() != null) {
                System.out.print("(");
                if (ctx.Tkn_right_paren() != null) {
                    System.out.print(")");
                    if (ctx.Then() != null) {
                        System.out.println(":");
                        identacion +=1;
                    }
                }
            }
        }
    }

    @Override
    public void exitIf(MiLenguajeParser.IfContext ctx) {
        if (ctx.EndIf()!=null) {
            identacion -=1;
        }
    }

    @Override
    public void enterWhile(MiLenguajeParser.WhileContext ctx) {
        if (ctx.While() != null) {
            System.out.print(idmult(identacion)+"while  ");
            if (ctx.Tkn_left_paren() != null) {
                System.out.print("(");
                if (ctx.Tkn_right_paren() != null) {
                    System.out.print(")");
                    if (ctx.EndWhile() != null) {
                        System.out.println(":");
                        identacion +=1;
                    }
                }
            }
        }
    }

    @Override
    public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        if (ctx.EndWhile()!=null) {
            identacion -= 1;
        }
    }

    @Override
    public void enterFor(MiLenguajeParser.ForContext ctx) {
        if (ctx.For() != null) {
            System.out.print(idmult(identacion)+"for  ");
            if (ctx.Id() != null) {
                System.out.print(ctx.Id().getText());
                if (ctx.Tkn_equals() != null) {
                    System.out.print(" in ");
                    if (ctx.To() != null) {
                        System.out.println(" range ():");
                        identacion +=1;
                    }
                }
            }
        }
    }

    @Override
    public void exitFor(MiLenguajeParser.ForContext ctx) {
        if (ctx.EndFor()!=null) {
            identacion -= 1;
        }
    }

    @Override
    public void enterIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx) {
        if(ctx.Tkn_left_paren()!=null){
            System.out.print("(");
            if(ctx.Tkn_right_paren()!=null){
                System.out.println(")");
            }
        }
        else if(ctx.Tkn_colon()!=null){
            System.out.println("#No existe etiquetas en python");
        }
        else if(ctx.Tkn_equals()!=null){
            System.out.print("=");
        }
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
        if(ctx.Tkn_div()!=null){
            System.out.print("/");
        }

        if(ctx.Tkn_minus()!=null){
            System.out.print("-");
        }

        if(ctx.Tkn_plus()!=null){
            System.out.print("+");
        }

        if(ctx.Tkn_times()!=null){
            System.out.print("*");
        }

        if(ctx.Or()!=null){
            System.out.print("Or");
        }

        if(ctx.And()!=null){
            System.out.print("And");
        }


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
    public void enterSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx) {
        if(ctx.ElseIf()!=null){
            System.out.print(idmult(identacion) + "elif ");
            if(ctx.Tkn_left_paren()!=null){
                System.out.print("(");
                if(ctx.Tkn_right_paren()!=null){
                    System.out.print(")");
                }
                if(ctx.Then()!=null){
                    System.out.println(":");
                }
            }
        }
        if(ctx.Else()!=null){
            System.out.println(idmult(identacion) + "else: ");
        }
    }

    @Override
    public void exitSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx) {

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
