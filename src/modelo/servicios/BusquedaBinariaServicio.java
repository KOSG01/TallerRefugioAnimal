package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class BusquedaBinariaServicio {

    public Mascota buscarPorId(Mascota[] mascotasOrdenadas, int id) {
        // TODO ESTUDIANTE 05: implementar la búsqueda binaria.
        return null;
    }

    public int ultimaPosicionConMascota(Mascota[] mascotas) {
        if (mascotas == null) {
            return -1;
        }
        return mascotas.length - 1;
    }
}
