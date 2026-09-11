package modelo.servicios;

import excepcion.DatoInvalidoException;
import modelo.Mascota;

/**
 *
 * @author franc
 */
public class ActualizacionMascotaServicio {

    public boolean actualizarPeso(Mascota[] mascotas, int id, double nuevoPeso)
            throws DatoInvalidoException {
        // TODO ESTUDIANTE 02: implementar la actualización de peso.
        return false;
    }

    public boolean actualizarNombre(Mascota[] mascotas, int id, String nuevoNombre)
            throws DatoInvalidoException {
        if (nuevoNombre == null) {
            throw new DatoInvalidoException("El nombre es obligatorio");
        }
        Mascota mascota = buscar(mascotas, id);
        if (mascota == null) {
            return false;
        }
        mascota.setNombre(nuevoNombre);
        return true;
    }

    private Mascota buscar(Mascota[] mascotas, int id) {
        if (mascotas == null) {
            return null;
        }
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.getIdentificacion() == id) {
                return mascota;
            }
        }
        return null;
    }
}
