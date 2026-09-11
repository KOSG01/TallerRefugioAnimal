package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class VacunacionServicioTest {

    @Test
    public void vacunarCambiaEstadoYRetornaVerdadero() throws Exception {
        Mascota[] datos = DatosIniciales.crearMascotas();
        assertTrue(new VacunacionServicio().vacunar(datos, 103));
        assertTrue(datos[1].isVacunada());
    }

    @Test
    public void contarVacunadasRetornaOcho() {
        assertEquals(8, new VacunacionServicio().contarVacunadas(DatosIniciales.crearMascotas()));
    }

}
