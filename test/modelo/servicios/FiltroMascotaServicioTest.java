package modelo.servicios;

import modelo.DatosIniciales;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class FiltroMascotaServicioTest {

    @Test
    public void filtrarPorTipoRetornaCuatroPerros() {
        assertEquals(4, new FiltroMascotaServicio().filtrarPorTipo(DatosIniciales.crearMascotas(), "perro").size());
    }

    @Test
    public void filtrarPorEdadMinimaRetornaCuatroMascotas() {
        assertEquals(4, new FiltroMascotaServicio().filtrarPorEdadMinima(DatosIniciales.crearMascotas(), 5).size());
    }

}
