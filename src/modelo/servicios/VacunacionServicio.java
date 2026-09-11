package modelo.servicios;

import excepcion.MascotaNoEncontradaException;
import modelo.Mascota;

/**
 *
 * @author franc
 */
public class VacunacionServicio {

    public boolean vacunar(Mascota[] mascotas, int id) throws MascotaNoEncontradaException {
        // TODO ESTUDIANTE 11: implementar el registro de vacunación.
        return false;
    }

    public int contarVacunadas(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            if (mascota != null && !mascota.isVacunada()) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
