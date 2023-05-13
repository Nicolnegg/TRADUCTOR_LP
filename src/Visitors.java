import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();

    public Void visitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx){
        if(ctx.Id()!=null){
            String id = ctx.Id().getText();
            dicDefinido.add(id);
        }
        return super.visitSentenciaElse(ctx);
    }
    public List<String> getDicDefinido() {
        return dicDefinido;
    }


}
