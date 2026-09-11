package modelo.servicios;

import modelo.Mascota;

/**
 *
 * @author franc
 */
public class CalculoCostoServicio {

    public double calcularCostoTotal(Mascota[] mascotas) {
        // TODO ESTUDIANTE 12: implementar el cálculo del costo total.
        return 0;
    }

    public double calcularCostoPromedio(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        int cantidad = 0;
        double total = 0;
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                cantidad++;
            }
            if (mascota != null && !mascota.isAdoptada()) {
                total += mascota.calcularCostoMensual();
            }
        }
        if (cantidad == 0) {
            return 0;
        }
        return total / cantidad;
    }
}
