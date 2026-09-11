package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class EliminacionMascotaServicioTest {

    @Test
    public void eliminarPorIdLiberaPosicion() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        Mascota eliminada = new EliminacionMascotaServicio().eliminarPorId(datos, 103);
        assertEquals("Milo", eliminada.getNombre());
        assertNull(datos[1]);
    }

    @Test
    public void contarMascotasRegistradasIgnoraNulos() {
        assertEquals(12, new EliminacionMascotaServicio().contarMascotasRegistradas(DatosIniciales.crearMascotas()));
    }

}
