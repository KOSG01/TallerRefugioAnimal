package modelo.servicios;

import excepcion.DatoInvalidoException;
import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class ActualizacionMascotaServicioTest {

    @Test
    public void actualizarPesoModificaMascotaExistente() throws Exception {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertTrue(new ActualizacionMascotaServicio().actualizarPeso(datos, 108, 20.0));
        assertEquals(20.0, datos[0].getPeso(), 0.001);
    }

    @Test(expected = DatoInvalidoException.class)
    public void actualizarNombreRechazaTextoVacio() throws Exception {
        new ActualizacionMascotaServicio().actualizarNombre(DatosIniciales.crearMascotas(), 108, "  ");
    }

}
