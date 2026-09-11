package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class OrdenamientoBurbujaServicioTest {

    @Test
    public void ordenarPorEdadColocaMayorPrimero() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        new OrdenamientoBurbujaServicio().ordenarPorEdadDescendente(datos);
        assertEquals(9, datos[0].getEdad());
    }

    @Test
    public void verificacionConfirmaOrdenCorrecto() {
        Mascota[] datos = {
            new Mascota(1, "Mayor", 9, 10, 101, false, true),
            new Mascota(2, "Menor", 4, 10, 102, false, true),
            null
        };
        OrdenamientoBurbujaServicio servicio = new OrdenamientoBurbujaServicio();
        assertTrue(servicio.estaOrdenadoPorEdadDescendente(datos));
    }

}
