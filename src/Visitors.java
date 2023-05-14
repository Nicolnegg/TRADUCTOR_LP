import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();
    public  List<String> idDefinido = new ArrayList<>();
    public  List<String> variables_string = new ArrayList<>();

    public  List<String> variables_array = new ArrayList<>();


    public Void visitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx){
        if(ctx.Id()!=null){
            String id = ctx.Id().getText();
            if(ctx.identSentencia()!=null && ctx.identSentencia().arrayAsignaciones()!=null){
                if(!dicDefinido.contains(id)){
                    dicDefinido.add(id);
                }
            }
            else if(ctx.identSentencia()!=null && ctx.identSentencia().Tkn_equals()!=null){
                if(!idDefinido.contains(id)){
                    idDefinido.add(id);
                }
            }
        }
        return super.visitSentenciaElse(ctx);
    }
    public List<String> getDicDefinido() {
        return dicDefinido;
    }
    public List<String> getIdDefinido() {
        return idDefinido;
    }

    public Void visitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx){
        if (ctx.variable() != null) {
            String variable = ctx.variable().getText();
            variables_string.add(variable);
        }
        return super.visitIdentSentencia(ctx);

    }

    public Void visitVariable(MiLenguajeParser.VariableContext ctx){
        if (ctx.valor() != null) {
            String variable = ctx.valor().getText();
            variables_array.add(variable);
        }
        return super.visitVariable(ctx);

    }

    public List<String> getVariables_string() {
        return variables_string;
    }

    public List<String> getVariables_array() {
        return variables_array;
    }
    public Void visitSub(MiLenguajeParser.SubContext ctx){
        if (ctx.Sub() != null) {
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new MetodosTraductor(), ctx);
        }
        return super.visitSub(ctx);
    }

}
