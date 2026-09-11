package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class EliminacionMascotaServicio {

    public Mascota eliminarPorId(Mascota[] mascotas, int id) {
        // TODO ESTUDIANTE 03: implementar la eliminación por identificación.
        return null;
    }

    public int contarMascotasRegistradas(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        int cantidad = 1;
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
