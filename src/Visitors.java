import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
public class Visitors<T> extends MiLenguajeBaseVisitor<T> {

    @Override
    public T visitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx){
        return (T) ctx;
    }


}
