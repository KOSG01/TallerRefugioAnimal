package modelo.servicios;

import excepcion.MascotaYaAdoptadaException;
import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class AdopcionServicioTest {

    @Test
    public void adoptarCambiaEstadoDeMascotaDisponible() throws Exception {
        Mascota[] datos = DatosIniciales.crearMascotas();
        new AdopcionServicio().adoptar(datos, 108);
        assertTrue(datos[0].isAdoptada());
    }

    @Test(expected = MascotaYaAdoptadaException.class)
    public void adoptarRechazaMascotaAdoptada() throws Exception {
        new AdopcionServicio().adoptar(DatosIniciales.crearMascotas(), 101);
    }

}
