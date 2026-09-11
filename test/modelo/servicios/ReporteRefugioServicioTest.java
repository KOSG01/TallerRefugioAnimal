package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class ReporteRefugioServicioTest {

    @Test
    public void resumenIncluyeTotalesCorrectos() {
        assertEquals("Total: 12 | Adoptadas: 2 | Disponibles: 10",
                new ReporteRefugioServicio().generarResumen(DatosIniciales.crearMascotas()));
    }

    @Test
    public void detalleIncluyeIdNombreYTipo() {
        Mascota mascota = DatosIniciales.crearMascotas()[0];
        assertEquals("ID: 108 | Nombre: Luna | Tipo: Perro",
                new ReporteRefugioServicio().generarDetalle(mascota));
    }

}
