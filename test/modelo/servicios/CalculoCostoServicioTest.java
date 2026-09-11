package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class CalculoCostoServicioTest {

    @Test
    public void costoTotalUsaPolimorfismoYExcluyeAdoptadas() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertEquals(153400.0, new CalculoCostoServicio().calcularCostoTotal(datos), 0.001);
    }

    @Test
    public void costoPromedioDivideEntreDisponibles() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertEquals(15340.0, new CalculoCostoServicio().calcularCostoPromedio(datos), 0.001);
    }

}
