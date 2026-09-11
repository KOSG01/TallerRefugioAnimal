package modelo.servicios;

/**
 *
 * @author franc
 */
public class ProcesamientoTextoServicio {

    public String normalizarNombre(String nombre) {
        // TODO ESTUDIANTE 14: implementar la normalización del nombre.
        return "";
    }

    public String obtenerIniciales(String nombreCompleto) {
        if (nombreCompleto == null || nombreCompleto.trim().equals("")) {
            return "";
        }
        String[] partes = nombreCompleto.trim().split(" ");
        String iniciales = "";
        for (String parte : partes) {
            if (!parte.equals("")) {
                iniciales += parte.substring(0, 1).toLowerCase();
            }
        }
        return iniciales;
    }
}
