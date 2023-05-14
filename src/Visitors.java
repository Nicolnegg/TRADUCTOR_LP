import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();
    public  List<String> idDefinido = new ArrayList<>();
    public  List<String> variables_string = new ArrayList<>();

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

    public List<String> getVariables_string() {
        return variables_string;
    }

}
