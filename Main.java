public class Main {
    public static void main(String[] args) {

        // FILA
        FilaEspera fila = new FilaEspera();
        fila.entrarNaFila("Ellen");
        fila.entrarNaFila("João");

        System.out.println("Atendido: " + fila.atender());
        fila.mostrarFila();


        // PILHA
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.visualizarLivro("Dom Casmurro");
        historico.visualizarLivro("1984");

        historico.mostrarHistorico();

        System.out.println("Voltando: " + historico.voltar());
        historico.mostrarHistorico();
    }
}