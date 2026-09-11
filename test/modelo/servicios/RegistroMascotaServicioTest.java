package modelo.servicios;

import modelo.DatosIniciales;
import modelo.Gato;
import modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class RegistroMascotaServicioTest {

    @Test
    public void agregarColocaMascotaEnPrimerEspacioLibre() {
        Mascota[] datos = DatosIniciales.crearMascotas();
        Mascota nueva = new Gato(200, "Nina", 2, 3.5, 113, false, false, true);
        boolean resultado = new RegistroMascotaServicio().agregar(datos, nueva);
        assertTrue(resultado);
        assertSame(nueva, datos[12]);
    }

    @Test
    public void contarEspaciosDisponiblesRetornaSeis() {
        assertEquals(6, new RegistroMascotaServicio().contarEspaciosDisponibles(DatosIniciales.crearMascotas()));
    }

}
