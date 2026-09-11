package modelo.servicios;

import excepcion.MascotaNoEncontradaException;
import excepcion.MascotaYaAdoptadaException;
import modelo.Mascota;

/**
 *
 * @author franc
 */
public class AdopcionServicio {

    public void adoptar(Mascota[] mascotas, int id)
            throws MascotaNoEncontradaException, MascotaYaAdoptadaException {
        // TODO ESTUDIANTE 10: implementar el proceso de adopción.
    }

    public int contarDisponibles(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.isAdoptada()) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
