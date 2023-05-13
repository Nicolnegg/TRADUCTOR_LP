import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();
    public  List<String> variables_string = new ArrayList<>();

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

    public Void visitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx){
        String variable = ctx.variable().getText();

        variables_string.add(variable);
        return super.visitIdentSentencia(ctx);

    }


    public List<String> getVariables_string() {
        return variables_string;
    }



}
