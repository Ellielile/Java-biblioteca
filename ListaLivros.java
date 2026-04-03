class Livro {
    String titulo;
    String autor;
    int ano;
    Livro proximo;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.proximo = null;
    }
}

public class ListaLivros {
    Livro inicio;

    public void adicionar(String titulo, String autor, int ano) {
        Livro novo = new Livro(titulo, autor, ano);

        if (inicio == null) {
            inicio = novo;
        } else {
            Livro atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
    }

    public void listar() {
        Livro atual = inicio;

        while (atual != null) {
            System.out.println(atual.titulo + " - " + atual.autor + " (" + atual.ano + ")");
            atual = atual.proximo;
        }
    }
}