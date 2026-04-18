public class Main {
    public static void main(String[] args) {

        // ===== SEMANA 1: LISTA =====
        ListaLivros lista = new ListaLivros();
        lista.adicionar("Assim Falou Zaratustra", "Nietzsche", 1883);
        lista.adicionar("O Mito de Sísifo", "Camus", 1942);
        lista.adicionar("A República", "Platão", -380);

        System.out.println("Lista de livros:");
        lista.listar();

        // ===== SEMANA 2: FILA =====
        FilaEspera fila = new FilaEspera();
        fila.entrarNaFila("Ellen");
        fila.entrarNaFila("João");

        System.out.println("\nAtendido: " + fila.atender());
        fila.mostrarFila();

        // ===== SEMANA 2: PILHA =====
        HistoricoNavegacao historico = new HistoricoNavegacao();
        historico.visualizarLivro("Assim Falou Zaratustra");
        historico.visualizarLivro("O Mito de Sísifo");

        historico.mostrarHistorico();
        System.out.println("Voltando: " + historico.voltar());
        historico.mostrarHistorico();

        // ===== SEMANA 3: GRAFO =====
        GrafoLivros grafo = new GrafoLivros();

        Livro l1 = new Livro("Assim Falou Zaratustra", "Nietzsche", 1883);
        Livro l2 = new Livro("O Mito de Sísifo", "Camus", 1942);
        Livro l3 = new Livro("A República", "Platão", -380);
        Livro l4 = new Livro("Meditações", "Marco Aurélio", 180);
        Livro l5 = new Livro("O Príncipe", "Maquiavel", 1532);
        Livro l6 = new Livro("Além do Bem e do Mal", "Nietzsche", 1886);
        Livro l7 = new Livro("Ser e Nada", "Sartre", 1943);
        Livro l8 = new Livro("A Náusea", "Sartre", 1938);
        Livro l9 = new Livro("Discurso do Método", "Descartes", 1637);
        Livro l10 = new Livro("Crítica da Razão Pura", "Kant", 1781);

        Livro[] livros = { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 };

        for (Livro l : livros) {
            grafo.adicionarLivro(l);
        }

        // cada livro com pelo menos 2 recomendações
        grafo.adicionarRecomendacao(l1, l2);
        grafo.adicionarRecomendacao(l1, l10);

        grafo.adicionarRecomendacao(l2, l8);
        grafo.adicionarRecomendacao(l2, l6);

        grafo.adicionarRecomendacao(l3, l9);
        grafo.adicionarRecomendacao(l3, l4);

        grafo.adicionarRecomendacao(l4, l7);
        grafo.adicionarRecomendacao(l4, l3);

        grafo.adicionarRecomendacao(l5, l2);
        grafo.adicionarRecomendacao(l5, l6);

        grafo.adicionarRecomendacao(l6, l5);
        grafo.adicionarRecomendacao(l6, l2);

        grafo.adicionarRecomendacao(l7, l4);
        grafo.adicionarRecomendacao(l7, l3);

        grafo.adicionarRecomendacao(l8, l2);
        grafo.adicionarRecomendacao(l8, l6);

        grafo.adicionarRecomendacao(l9, l3);
        grafo.adicionarRecomendacao(l9, l4);

        grafo.adicionarRecomendacao(l10, l1);
        grafo.adicionarRecomendacao(l10, l2);
        grafo.adicionarRecomendacao(l3, l2);

        grafo.recomendar(l1);
        grafo.recomendarPorDistancia(l1);
        {
            System.out.println("\nTOTAL: " + grafo.djikstraSimples(l1).size());

        }
    }
}