import java.util.Stack;

public class HistoricoNavegacao {
    private Stack<String> historico = new Stack<>();

    public void visualizarLivro(String titulo) {
        historico.push(titulo);
    }

    public String voltar() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return "Histórico vazio";
    }

    public void mostrarHistorico() {
        System.out.println("Histórico: " + historico);
    }
}