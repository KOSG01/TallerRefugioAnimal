package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class EstadisticaMascotaServicio {

    public double calcularPromedioEdad(Mascota[] mascotas) {
        // TODO ESTUDIANTE 13: implementar el promedio de edad.
        return 0;
    }

    public Mascota encontrarMascotaMayor(Mascota[] mascotas) {
        if (mascotas == null) {
            return null;
        }
        Mascota mayor = null;
        for (Mascota mascota : mascotas) {
            if (mascota != null && (mayor == null || mascota.getEdad() < mayor.getEdad())) {
                mayor = mascota;
            }
        }
        return mayor;
    }
}
