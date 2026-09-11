package modelo.servicios;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class ProcesamientoTextoServicioTest {

    @Test
    public void normalizarNombreLimpiaEspaciosYMayusculas() {
        assertEquals("Canela", new ProcesamientoTextoServicio().normalizarNombre("  CANELA  "));
    }

    @Test
    public void obtenerInicialesProcesaNombreCompuesto() {
        assertEquals("LMD", new ProcesamientoTextoServicio().obtenerIniciales("Luna María Díaz"));
    }

}
