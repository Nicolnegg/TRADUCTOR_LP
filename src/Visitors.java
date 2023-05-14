import java.util.ArrayList;
import java.util.List;
public class Visitors extends MiLenguajeBaseVisitor<Void> {

    public  List<String> dicDefinido = new ArrayList<>();
    public  List<String> variables_string = new ArrayList<>();

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

    public Void visitIdentSentencia(MiLenguajeParser.IdentSentenciaContext ctx){
        String variable = ctx.variable().getText();

          variables_string.add(variable);
          return super.visitIdentSentencia(ctx);

    }


    public List<String> getVariables_string() {
        return variables_string;
    }



}
