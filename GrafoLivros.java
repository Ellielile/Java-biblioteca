import java.util.*;

public class GrafoLivros {

    private final Map<Livro, Set<Livro>> grafo = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        grafo.putIfAbsent(livro, new HashSet<>());
    }

    public void adicionarRecomendacao(Livro origem, Livro recomendado) {
        grafo.putIfAbsent(origem, new HashSet<>());
        grafo.get(origem).add(recomendado);
    }

    public void recomendar(Livro livro) {
        System.out.println("\nRecomendações para " + livro.titulo + ":");

        if (!grafo.containsKey(livro)) {
            System.out.println("Nenhuma recomendação.");
            return;
        }

        for (Livro l : grafo.get(livro)) {
            System.out.println("- " + l.titulo);
        }
    }
}