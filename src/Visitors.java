import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
public class Visitors<T> extends MiLenguajeBaseVisitor<T> {

    @Override
    public T visitSentenciaElse(MiLenguajeParser.SentenciaElseContext ctx){
        return (T) ctx;
    }

    @Override
    public T visitFuncionContinuidad(MiLenguajeParser.FuncionContinuidadContext ctx){
        System.out.println("Sub " + ctx.Id().getText() + "()");
        return (T) ctx;
    }


}
