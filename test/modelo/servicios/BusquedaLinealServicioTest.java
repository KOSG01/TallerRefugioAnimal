package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class BusquedaLinealServicioTest {

    @Test
    public void buscarPorIdEncuentraElementoEnArregloDesordenado() {
        Mascota resultado = new BusquedaLinealServicio().buscarPorId(DatosIniciales.crearMascotas(), 101);
        assertNotNull(resultado);
        assertEquals("Max", resultado.getNombre());
    }

    @Test
    public void buscarPorNombreIgnoraMayusculasYEspaciosExternos() {
        Mascota resultado = new BusquedaLinealServicio().buscarPorNombre(DatosIniciales.crearMascotas(), "  luna ");
        assertEquals(108, resultado.getIdentificacion());
    }

}
