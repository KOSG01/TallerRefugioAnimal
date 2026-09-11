package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class OrdenamientoBurbujaServicio {

    public Mascota[] ordenarPorEdadDescendente(Mascota[] mascotas) {
        // TODO ESTUDIANTE 06: implementar Bubble Sort por edad descendente.
        return mascotas;
    }

    public boolean estaOrdenadoPorEdadDescendente(Mascota[] mascotas) {
        if (mascotas == null) {
            return false;
        }
        for (int i = 0; i < mascotas.length - 1; i++) {
            if (mascotas[i] == null && mascotas[i + 1] != null) {
                return false;
            }
            if (mascotas[i] != null && mascotas[i + 1] != null
                    && mascotas[i].getEdad() > mascotas[i + 1].getEdad()) {
                return false;
            }
        }
        return true;
    }

    private boolean debeIntercambiar(Mascota actual, Mascota siguiente) {
        if (actual == null && siguiente != null) {
            return true;
        }
        return actual != null && siguiente != null && actual.getEdad() < siguiente.getEdad();
    }
}
