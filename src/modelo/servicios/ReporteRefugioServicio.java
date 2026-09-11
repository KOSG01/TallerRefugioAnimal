package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class ReporteRefugioServicio {

    public String generarResumen(Mascota[] mascotas) {
        // TODO ESTUDIANTE 15: implementar el resumen general.
        return "";
    }

    public String generarDetalle(Mascota mascota) {
        if (mascota == null) {
            return "Mascota no disponible";
        }
        return "ID: " + mascota.getIdentificacion() + " | Nombre: "
                + mascota.getNombre();
    }
}
