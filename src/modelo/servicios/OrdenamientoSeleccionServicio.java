package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class OrdenamientoSeleccionServicio {

    public Mascota[] ordenarPorIdAscendente(Mascota[] mascotas) {
        // TODO ESTUDIANTE 07: implementar Selection Sort por ID ascendente.
        return mascotas;
    }

    public boolean estaOrdenadoPorIdAscendente(Mascota[] mascotas) {
        if (mascotas == null) {
            return false;
        }
        for (int i = 0; i < mascotas.length - 1; i++) {
            if (mascotas[i] == null && mascotas[i + 1] != null) {
                return false;
            }
            if (mascotas[i] != null && mascotas[i + 1] != null
                    && mascotas[i].getIdentificacion() < mascotas[i + 1].getIdentificacion()) {
                return false;
            }
        }
        return true;
    }

    private int contarMascotas(Mascota[] mascotas) {
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private void compactar(Mascota[] mascotas) {
        int destino = 0;
        for (int i = 0; i < mascotas.length; i++) {
            if (mascotas[i] != null) {
                mascotas[destino++] = mascotas[i];
            }
        }
        while (destino < mascotas.length) {
            mascotas[destino++] = null;
        }
    }
}
