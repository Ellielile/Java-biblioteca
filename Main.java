public class Main {
    public static void main(String[] args) {
        ListaLivros lista = new ListaLivros();

        lista.adicionar("Dom Casmurro", "Machado de Assis", 1899);
        lista.adicionar("1984", "George Orwell", 1949);

        lista.listar();
    }
}