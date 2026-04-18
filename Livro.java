public class Livro {
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

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + ano + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Livro))
            return false;
        Livro livro = (Livro) o;
        return titulo.equals(livro.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode();
    }
}