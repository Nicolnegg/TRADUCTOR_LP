import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();

    @Override
    public Void visitFor(MiLenguajeParser.ForContext ctx){
        String id = ctx.sentenciaElse().Id().getText();
        dicDefinido.add(id);
        System.out.println(id);
        return super.visitFor(ctx);

    }
    public List<String> getDicDefinido() {
        return dicDefinido;
    }


}
