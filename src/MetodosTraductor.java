import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
//revisar for y listas en for y booleanos
//revisar for y listas en for
//revisar stack y array
public class MetodosTraductor implements MiLenguajeListener {
    int identacion =0;
    boolean isString = false;
    boolean subs=false;
    boolean esta_sub=false;
    /*int time=0;
    int sys=0;*/

    List<String> elementIds = new ArrayList<>();
    List<String> definidos = new ArrayList<>();
    public String idmult(int n){
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += "\t";
        }
        return s;
    }

    @Override
    public void enterP(MiLenguajeParser.PContext ctx) {
        System.out.println("import sys");
        System.out.println("import time");
        // Obtener el nodo hijo correspondiente al contexto deseado
        ParseTree subtree = ctx;

        // Crear un Visitor
        Visitors visitor = new Visitors();

        // Visitar el subárbol con el Visitor
        visitor.visit(subtree);
        subs = true;

    }

    @Override
    public void exitP(MiLenguajeParser.PContext ctx) {

    }

    @Override
    public void enterInicio(MiLenguajeParser.InicioContext ctx) {
        /*if(ctx.sentenciaElse()!=null){
            if(ctx.sentenciaElse().funcionContinuidad()!=null){
                if(ctx.sentenciaElse().funcionContinuidad().Id()!=null){
                    if(ctx.sentenciaElse().funcionContinuidad().Id().getText().equals("Delay")){
                        if(time==0){
                            System.out.print("\n");
                            System.out.print("import time");
                            time+=1;
                        }
                    }
                    if(ctx.sentenciaElse().funcionContinuidad().Id().getText().equals("End")){
                        if(sys==0){
                            System.out.print("\n");
                            System.out.print("import sys");
                            sys+=1;
                        }
                    }
                    if(ctx.sentenciaElse().funcionContinuidad().Id().getText().equals("Write")){
                        if(sys==0){
                            System.out.print("\n");
                            System.out.print("import sys");
                            sys+=1;
                        }
                    }

                }
            }


        }*/
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
        if((subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Goto()!=null){
                System.out.print("\n");
                System.out.print(idmult(identacion)+"#No existe etiquetas en python");
            }
            else if(ctx.Program()!=null){
                System.out.print("\n");
            }
            else if(ctx.Stack()!=null){
                System.out.print("\n");
                System.out.print(idmult(identacion)+"#No existe stack en python");
            }
            else if(ctx.TextWindow()!=null){
                System.out.print("\n");
            }
            else if(ctx.Id()!=null){
                if(!elementIds.contains(ctx.Id().getText())){
                    if(ctx.identSentencia()!=null && ctx.identSentencia().Tkn_left_paren()!=null | ctx.identSentencia().Tkn_colon()!=null){
                        elementIds.add(ctx.Id().getText());
                    }

                }
                System.out.print("\n");
                if(ctx.identSentencia()!=null && ctx.identSentencia().Tkn_colon()==null){
                    System.out.print(idmult(identacion)+ ctx.Id().getText() + "_TRA");
                }
            }
            else if(ctx.COMMENT()!=null){
                System.out.println(idmult(identacion)+ "#"+ctx.COMMENT().getText().substring(1));
            }
        }

    }

    @Override
    public void exitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx) {

    }

    @Override
    public void enterStepF(MiLenguajeParser.StepFContext ctx) {
        if(ctx.Step()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(',');
        }

    }

    @Override
    public void exitStepF(MiLenguajeParser.StepFContext ctx) {

    }

    @Override
    public void enterSub(MiLenguajeParser.SubContext ctx) {
        if (!ctx.isEmpty()){
            esta_sub=true;
            if (ctx.Sub()!=null && ((subs==false |(subs==true && esta_sub == false) ))) {
                System.out.print("\n");
                System.out.print("def ");
                if (ctx.Id()!=null) {
                    String value = ctx.Id().getText();
                    System.out.print(value+ "_TRA" +"():");
                    identacion +=1;
                }
            }
        }
    }

    @Override
    public void exitSub(MiLenguajeParser.SubContext ctx) {
        if (ctx.EndSub()!=null && (subs==false |(subs==true && esta_sub == false) )) {
            identacion -=1;

        }
        esta_sub=false;
    }

    @Override
    public void enterIfCondicion(MiLenguajeParser.IfCondicionContext ctx) {
        if (ctx.If() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print("\n");
            System.out.print(idmult(identacion)+"if ");
            if (ctx.Tkn_left_paren() != null) {
                System.out.print("(");
            }
        }
    }

    @Override
    public void exitIfCondicion(MiLenguajeParser.IfCondicionContext ctx) {
        if (ctx.Tkn_right_paren() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print(")");
            if (ctx.Then() != null) {
                System.out.print(":");
                identacion +=1;
            }
        }
    }

    @Override
    public void enterIf(MiLenguajeParser.IfContext ctx) {

    }

    @Override
    public void exitIf(MiLenguajeParser.IfContext ctx) {
        if (ctx.EndIf()!=null && (subs==false |(subs==true && esta_sub == false) )) {
            identacion -=1;
        }
    }

    @Override
    public void enterWhileCondicion(MiLenguajeParser.WhileCondicionContext ctx) {
        if (ctx.While() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print("\n");
            System.out.print(idmult(identacion)+"while  ");
            if (ctx.Tkn_left_paren() != null) {
                System.out.print("(");
            }
        }

    }

    @Override
    public void exitWhileCondicion(MiLenguajeParser.WhileCondicionContext ctx) {
        if (ctx.Tkn_right_paren() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print(")");
            System.out.print(":");
            identacion +=1;

        }
    }

    @Override
    public void enterWhile(MiLenguajeParser.WhileContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            // Obtener el nodo hijo correspondiente al contexto deseado
            ParseTree subtree = ctx;

            // Crear un Visitor
            Visitors visitor = new Visitors();

            // Visitar el subárbol con el Visitor
            visitor.visit(subtree);
            // Obtener la lista de identificadores
            List<String> idsDic = visitor.getDicDefinido();
            if(identacion<=0 ){
                for (String idDic : idsDic) {
                    if(!elementIds.contains(idDic)){
                        System.out.print("\n");
                        System.out.print(idDic +"_TRA"+ "={}");
                    }
                }
            }
            List<String> idsVar = visitor.getIdDefinido();
            if(identacion<=0 ){
                for (String idVar : idsVar) {
                    if(!elementIds.contains(idVar)){
                        System.out.print("\n");
                        System.out.print(idmult(identacion) + "global " + idVar + "_TRA");
                        System.out.print("\n");
                        System.out.print(idVar +"_TRA"+ "=0");
                    }
                }
            }
        }

    }

    @Override
    public void exitWhile(MiLenguajeParser.WhileContext ctx) {
        if (ctx.EndWhile()!=null && (subs==false |(subs==true && esta_sub == false) )) {
            identacion -= 1;
        }
    }

    @Override
    public void enterForCondicion(MiLenguajeParser.ForCondicionContext ctx) {
        if (ctx.For() != null && (subs==false |(subs==true && esta_sub == false) )) {
            if(!elementIds.contains(ctx.Id().getText())){
                elementIds.add(ctx.Id().getText());
                System.out.print("\n");
                System.out.print(idmult(identacion) + "global " + ctx.Id().getText()+ "_TRA");
            }
            System.out.print("\n");
            System.out.print(idmult(identacion)+"for  ");
            if (ctx.Id() != null) {
                System.out.print(ctx.Id().getText()+ "_TRA");
                if (ctx.Tkn_equals() != null) {
                    System.out.print(" in range (");
                }
            }
        }
    }

    @Override
    public void exitForCondicion(MiLenguajeParser.ForCondicionContext ctx) {
        if(ctx.stepF()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("):");
        }

    }

    @Override
    public void enterToCondicion(MiLenguajeParser.ToCondicionContext ctx) {
        if (ctx.To() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print(",");
            identacion +=1;
        }

    }

    @Override
    public void exitToCondicion(MiLenguajeParser.ToCondicionContext ctx) {
        if (ctx.To() != null && (subs==false |(subs==true && esta_sub == false) )) {
            System.out.print("+1");
        }
    }

    @Override
    public void enterFor(MiLenguajeParser.ForContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            // Obtener el nodo hijo correspondiente al contexto deseado
            ParseTree subtree = ctx;

            // Crear un Visitor
            Visitors visitor = new Visitors();

            // Visitar el subárbol con el Visitor
            visitor.visit(subtree);
            // Obtener la lista de identificadores
            List<String> idsDic = visitor.getDicDefinido();
            if(identacion<=0 ){
                for (String idDic : idsDic) {
                    if(!elementIds.contains(idDic)){
                        System.out.print("\n");
                        System.out.print(idDic +"_TRA"+ "={}");
                    }
                }
            }
            List<String> idsVar = visitor.getIdDefinido();
            if(identacion<=0 ){
                for (String idVar : idsVar) {
                    if(!elementIds.contains(idVar)){
                        System.out.print("\n");
                        System.out.print(idmult(identacion) + "global " + idVar + "_TRA");
                        System.out.print("\n");
                        System.out.print(idVar +"_TRA"+ "=0");
                    }
                }
            }
        }

    }

    @Override
    public void exitFor(MiLenguajeParser.ForContext ctx) {
        if (ctx.EndFor()!=null && (subs==false |(subs==true && esta_sub == false) )) {
            identacion -= 1;
        }
    }

    @Override
    public void enterIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            // Obtener el nodo hijo correspondiente al contexto deseado
            ParseTree subtree_string = ctx;
            //System.out.print("Contexto(" + ctx.getText() +")");
            // Crear un Visitor
            Visitors visitor = new Visitors();


            visitor.visit(subtree_string);


            List<String> variables = visitor.getVariables_string();

            if (!variables.isEmpty()){

                String texto = variables.get(0);
                for (int i = 0; i < texto.length(); i++) {
                    char c = texto.charAt(i);
                    if (c == '"') {
                        isString = true;
                    }

                }

            }

            String id=ctx.getParent().getChild(0).getText();

            if (ctx.Tkn_left_paren() != null) {
                System.out.print("(");
                if (ctx.Tkn_right_paren() != null) {
                    System.out.print(")");
                }
            } else if (ctx.Tkn_colon() != null) {
                System.out.print(idmult(identacion) + "#No existe etiquetas en python");
            } else if (ctx.Tkn_equals() != null) {
                System.out.print("=");
                if(!definidos.contains(id)){
                    definidos.add(id);
                }
            }else if(ctx.arrayAsignaciones()!=null){
                if(!definidos.contains(id)){
                    System.out.print("=");
                }
                else{System.out.print(".update(");}
            }
        }


    }
    @Override
    public void exitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx) {
        String id=ctx.getParent().getChild(0).getText();
        if(ctx.arrayAsignaciones()!=null && (subs==false |(subs==true && esta_sub == false) )){
            if(!definidos.contains(id)){
                definidos.add(id);
            }
            else{System.out.print(")");}
        }

        isString = false;
    }

    @Override
    public void enterIdentFor(MiLenguajeParser.IdentForContext ctx) {

    }

    @Override
    public void exitIdentFor(MiLenguajeParser.IdentForContext ctx) {

    }

    @Override
    public void enterArrayAsignacionesCondicion(MiLenguajeParser.ArrayAsignacionesCondicionContext ctx) {
        if(ctx.Tkn_left_brac()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("{");
        }
    }

    @Override
    public void exitArrayAsignacionesCondicion(MiLenguajeParser.ArrayAsignacionesCondicionContext ctx) {
        if(ctx.getParent().getChild(1).getText().charAt(0)!='=' && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(":");
        }
    }

    @Override
    public void enterArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx) {

        if (ctx.Tkn_equals() != null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(":");
        }
    }

    @Override
    public void exitArrayAsignaciones(MiLenguajeParser.ArrayAsignacionesContext ctx) {
        if(ctx.arrayAsignaciones()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("}");
        }
    }

    @Override
    public void enterValor(MiLenguajeParser.ValorContext ctx) {

        if(isString == true && (subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Tkn_left_paren()!=null) {
                System.out.print('(');
            }
            else if(ctx.True()!=null) {
                System.out.print("true");
            }
            else if(ctx.False()!=null){
                System.out.print("false");
            }
            else if(ctx.Id()!=null){
                System.out.print("str("+ctx.Id().getText()+ "_TRA"+")");
            }
            else if(ctx.Tkn_number()!=null){
                System.out.print("str(" + ctx.Tkn_number().getText() +")");
            }
            else if(ctx.Tkn_text()!=null){
                System.out.print(ctx.Tkn_text().getText());
            }
        } else if (isString == false && (subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Tkn_left_paren()!=null) {
                System.out.print('(');
            }
            else if(ctx.True()!=null) {
                System.out.print("true");
            }
            else if(ctx.False()!=null){
                System.out.print("false");
            }
            else if(ctx.Id()!=null){
                System.out.print(ctx.Id().getText()+ "_TRA");
            }
            else if(ctx.Tkn_number()!=null){
                System.out.print(ctx.Tkn_number().getText());
            }
            else if(ctx.Tkn_text()!=null){
                System.out.print(ctx.Tkn_text().getText());
            }
        }



    }

    @Override
    public void exitValor(MiLenguajeParser.ValorContext ctx) {
        if(ctx.Tkn_right_paren()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(')');
        }
    }

    @Override
    public void enterVariable(MiLenguajeParser.VariableContext ctx) {
        if( (subs==false |(subs==true && esta_sub == false) )){

            if(ctx.Tkn_minus()!=null) {
                System.out.print("-");
            }
            // Obtener el nodo hijo correspondiente al contexto deseado
            ParseTree subtree_array = ctx;
            //System.out.print("Contexto(" + ctx.getText() +")");
            // Crear un Visitor
            Visitors visitor = new Visitors();


            visitor.visit(subtree_array);


            List<String> variables_array = visitor.getVariables_array();
            if (!variables_array.isEmpty()){

                String var_arreglo = variables_array.get(0);
                for (int i = 0; i < var_arreglo.length(); i++) {
                    char c = var_arreglo.charAt(i);
                    if (c == '['){
                        return;
                    }
                    if (c == '"') {
                        isString = true;
                    }

                }

            }
        }

    }

    @Override
    public void exitVariable(MiLenguajeParser.VariableContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            isString = false;
        }
    }

    @Override
    public void enterArrayOperacionCondicion(MiLenguajeParser.ArrayOperacionCondicionContext ctx) {

        if(ctx.Tkn_left_brac()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("[");
        }
    }

    @Override
    public void exitArrayOperacionCondicion(MiLenguajeParser.ArrayOperacionCondicionContext ctx) {
        if(ctx.Tkn_right_brac()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("]");
        }
    }

    @Override
    public void enterArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx) {

    }

    @Override
    public void exitArrayOperacion(MiLenguajeParser.ArrayOperacionContext ctx) {

    }

    @Override
    public void enterOperaciones(MiLenguajeParser.OperacionesContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Tkn_div()!=null){
                System.out.print("/");
            }

            else if(ctx.Tkn_minus()!=null){
                System.out.print("-");
            }


            else if(ctx.Tkn_plus()!=null){
                System.out.print("+");
            }

            else if(ctx.Tkn_times()!=null){
                System.out.print("*");
            }

            else if(ctx.Or()!=null){
                System.out.print(" or ");
            }

            else if(ctx.And()!=null){
                System.out.print(" and ");
            }

            else if(ctx.Tkn_equals()!=null){
                System.out.print("==");
            }

            else if(ctx.Tkn_leq()!=null){
                System.out.print("<=");
            }

            else if(ctx.Tkn_diff()!=null){
                System.out.print("!=");
            }


            else if(ctx.Tkn_geq()!=null){
                System.out.print(">=");
            }

            else if(ctx.Tkn_less()!=null){
                System.out.print("<");
            }

            else if(ctx.Tkn_greater()!=null){
                System.out.print(">");
            }
        }



    }

    @Override
    public void exitOperaciones(MiLenguajeParser.OperacionesContext ctx) {

    }

    @Override
    public void enterOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Tkn_div()!=null){
                System.out.print("/");
            }

            else if(ctx.Tkn_minus()!=null){
                System.out.print("-");
            }


            else if(ctx.Tkn_plus()!=null){
                System.out.print("+");
            }

            else if(ctx.Tkn_times()!=null){
                System.out.print("*");
            }

            else if(ctx.Or()!=null){
                System.out.print(" or ");
            }

            else if(ctx.And()!=null){
                System.out.print(" and ");
            }



            else if(ctx.Tkn_plus()!=null){
                System.out.print("+");
            }

            else if(ctx.Tkn_times()!=null){
                System.out.print("*");
            }
        }

    }

    @Override
    public void exitOperacionesLog(MiLenguajeParser.OperacionesLogContext ctx) {

    }

    @Override
    public void enterOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx) {
        if(ctx.Tkn_div()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("/");
        }

        else if(ctx.Tkn_minus()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("-");
        }

    }

    @Override
    public void exitOperacionesStep(MiLenguajeParser.OperacionesStepContext ctx) {

    }

    @Override
    public void enterVariableLog(MiLenguajeParser.VariableLogContext ctx) {
        if(ctx.Tkn_minus()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("-");
        }
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
        if(ctx.Else()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("\n");
            System.out.print(idmult(identacion-1) + "else: ");

        }
    }

    @Override
    public void exitSentenciaElseIf(MiLenguajeParser.SentenciaElseIfContext ctx) {
        if(ctx.Else()!=null && (subs==false |(subs==true && esta_sub == false) )){

        }
    }

    @Override
    public void enterElseifCondicion(MiLenguajeParser.ElseifCondicionContext ctx) {
        if(ctx.ElseIf()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print("\n");
            System.out.print(idmult(identacion-1) + "elif ");
            if(ctx.Tkn_left_paren()!=null){
                System.out.print("(");
            }
        }
    }

    @Override
    public void exitElseifCondicion(MiLenguajeParser.ElseifCondicionContext ctx) {
        if(ctx.Tkn_right_paren()!=null &&(subs==false |(subs==true && esta_sub == false) )){
            System.out.print(")");
            if(ctx.Then()!=null){
                System.out.print(":");
            }
        }
    }

    @Override
    public void enterElseif(MiLenguajeParser.ElseifContext ctx) {
    }

    @Override
    public void exitElseif(MiLenguajeParser.ElseifContext ctx) {
    }

    @Override
    public void enterFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx) {
        if((subs==false |(subs==true && esta_sub == false) )){
            if(ctx.Id().getText().equals("Delay")){
                System.out.print(idmult(identacion) + "time.sleep");
            }
            if(ctx.Id().getText().equals("End")){
                System.out.print(idmult(identacion) + "sys.exit");
            }
            if(ctx.Id().getText().equals("Read")){
                System.out.print(idmult(identacion) + "input");
            }
            if(ctx.Id().getText().equals("Write")){
                System.out.print(idmult(identacion) + "sys.stdout.write(str");
            }
            if(ctx.Id().getText().equals("WriteLine")){
                System.out.print(idmult(identacion) + "print");
            }

            if(ctx.Tkn_left_paren()!=null){
                System.out.print("(");
            }
        }
    }

    @Override
    public void exitFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx) {
        if(ctx.Tkn_right_paren()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(")");
            if(ctx.Id()!=null && ctx.Id().getText().equals("Write") ){
                System.out.print(")");
            }
        }
    }

    @Override
    public void enterFuncionVar(MiLenguajeParser.FuncionVarContext ctx){
        if(ctx.Tkn_comma()!=null && (subs==false |(subs==true && esta_sub == false) )){
            System.out.print(",");
        }
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