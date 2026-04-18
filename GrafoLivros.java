import java.util.*;

public class GrafoLivros {

    private final Map<Livro, Set<Livro>> grafo = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        grafo.putIfAbsent(livro, new HashSet<>());
    }

    // 🔧 AJUSTE: deixar bidirecional (melhora caminhos)
    public void adicionarRecomendacao(Livro origem, Livro recomendado) {
        grafo.putIfAbsent(origem, new HashSet<>());
        grafo.putIfAbsent(recomendado, new HashSet<>());

        grafo.get(origem).add(recomendado);
        grafo.get(recomendado).add(origem);
    }

    // ✅ NOVO: algoritmo tipo Dijkstra (BFS)
    public Map<Livro, Integer> djikstraSimples(Livro origem) {

        Map<Livro, Integer> distancias = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0);
        fila.add(origem);

        while (!fila.isEmpty()) {

            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafo.getOrDefault(atual, new HashSet<>())) {

                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    fila.add(vizinho);
                }
            }
        }

        return distancias;
    }

    // recomendação baseada em distância
    public void recomendarPorDistancia(Livro origem) {

        System.out.println("\nRecomendações por proximidade para " + origem.titulo + ":");

        Map<Livro, Integer> distancias = djikstraSimples(origem);

        distancias.entrySet().stream()
                .filter(e -> !e.getKey().equals(origem))
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(
                        "- " + e.getKey().titulo + " (Distância: " + e.getValue() + ")"));
    }

    public void recomendar(Livro livro) {
        System.out.println("\nRecomendações diretas para " + livro.titulo + ":");

        if (!grafo.containsKey(livro)) {
            System.out.println("Nenhuma recomendação.");
            return;
        }

        for (Livro l : grafo.get(livro)) {
            System.out.println("- " + l.titulo);
        }
    }
}