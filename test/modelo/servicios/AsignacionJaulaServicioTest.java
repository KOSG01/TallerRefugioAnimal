package modelo.servicios;

import modelo.DatosIniciales;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class AsignacionJaulaServicioTest {

    @Test
    public void buscarUbicacionEncuentraFilaYColumna() {
        assertEquals("Fila 3, columna 2", new AsignacionJaulaServicio().buscarUbicacion(DatosIniciales.crearMapaJaulas(), 108));
    }

    @Test
    public void existeJaulaRetornaFalsoParaNumeroAusente() {
        assertFalse(new AsignacionJaulaServicio().existeJaula(DatosIniciales.crearMapaJaulas(), 999));
    }

}
