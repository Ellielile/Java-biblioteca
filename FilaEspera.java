import java.util.LinkedList;
import java.util.Queue;

public class FilaEspera {
    private final Queue<String> fila = new LinkedList<>();

    public void entrarNaFila(String usuario) {
        fila.add(usuario);
    }

    public String atender() {
        return fila.poll();
    }

    public void mostrarFila() {
        System.out.println("Fila de espera: " + fila);
    }
}