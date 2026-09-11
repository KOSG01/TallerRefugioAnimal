package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class EstadisticaMascotaServicioTest {

    @Test
    public void promedioEdadConsideraSoloMascotasRegistradas() {
        assertEquals(4.0, new EstadisticaMascotaServicio().calcularPromedioEdad(DatosIniciales.crearMascotas()), 0.001);
    }

    @Test
    public void mascotaMayorEsToby() {
        Mascota mayor = new EstadisticaMascotaServicio().encontrarMascotaMayor(DatosIniciales.crearMascotas());
        assertEquals("Toby", mayor.getNombre());
    }

}
