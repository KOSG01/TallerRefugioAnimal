package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class BusquedaLinealServicio {

    public Mascota buscarPorId(Mascota[] mascotas, int id) {
        // TODO ESTUDIANTE 04: implementar la búsqueda lineal por ID.
        return null;
    }

    public Mascota buscarPorNombre(Mascota[] mascotas, String nombre) {
        if (mascotas == null || nombre == null) {
            return null;
        }
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }
        return null;
    }
}
