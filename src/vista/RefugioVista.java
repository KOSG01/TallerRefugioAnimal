package vista;

/**
 *
 * @author franc
 */
public class RefugioVista {

    public void mostrarTitulo(String titulo) {
        System.out.println("\n=== " + titulo + " ===");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarError(String mensaje) {
        System.err.println("Error: " + mensaje);
    }
}
