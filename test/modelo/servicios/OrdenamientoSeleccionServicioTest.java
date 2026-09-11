package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class OrdenamientoSeleccionServicioTest {

    @Test
    public void ordenarPorIdColocaMenorPrimero() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        new OrdenamientoSeleccionServicio().ordenarPorIdAscendente(datos);
        assertEquals(101, datos[0].getIdentificacion());
    }

    @Test
    public void verificacionConfirmaOrdenCorrecto() {
        Mascota[] datos = {
            new Mascota(101, "Primera", 3, 10, 101, false, true),
            new Mascota(102, "Segunda", 3, 10, 102, false, true),
            null
        };
        OrdenamientoSeleccionServicio servicio = new OrdenamientoSeleccionServicio();
        assertTrue(servicio.estaOrdenadoPorIdAscendente(datos));
    }

}
