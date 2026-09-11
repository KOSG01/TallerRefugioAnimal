package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class RegistroMascotaServicio {

    public boolean agregar(Mascota[] mascotas, Mascota nuevaMascota) {
        // TODO ESTUDIANTE 01: implementar el registro.
        return false;
    }

    public int contarEspaciosDisponibles(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
