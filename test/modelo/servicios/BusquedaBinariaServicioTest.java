package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class BusquedaBinariaServicioTest {

    @Test
    public void buscarPorIdEncuentraElementoEnArregloOrdenado() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        new OrdenamientoSeleccionServicio().ordenarPorIdAscendente(datos);
        Mascota resultado = new BusquedaBinariaServicio().buscarPorId(datos, 115);
        assertNotNull(resultado);
        assertEquals("Nube", resultado.getNombre());
    }

    @Test
    public void ultimaPosicionConMascotaIgnoraEspaciosLibresFinales() {
        assertEquals(11, new BusquedaBinariaServicio().ultimaPosicionConMascota(DatosIniciales.crearMascotas()));
    }

}
