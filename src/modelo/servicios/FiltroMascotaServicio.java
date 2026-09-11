package modelo.servicios;

import java.util.ArrayList;
import modelo.Mascota;

/**
 *
 * @author franc
 */
public class FiltroMascotaServicio {

    public ArrayList<Mascota> filtrarPorTipo(Mascota[] mascotas, String tipo) {
        ArrayList<Mascota> resultado = new ArrayList<Mascota>();
        // TODO ESTUDIANTE 08: implementar el filtro por tipo.
        return resultado;
    }

    public ArrayList<Mascota> filtrarPorEdadMinima(Mascota[] mascotas, int edadMinima) {
        ArrayList<Mascota> resultado = new ArrayList<Mascota>();
        if (mascotas == null) {
            return resultado;
        }
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.getEdad() > edadMinima) {
                resultado.add(mascota);
            }
        }
        return resultado;
    }
}
