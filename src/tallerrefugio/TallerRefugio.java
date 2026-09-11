package tallerrefugio;

import controlador.RefugioControlador;
import modelo.RefugioModelo;
import vista.RefugioVista;

/**
 *
 * @author franc
 */
public class TallerRefugio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RefugioModelo modelo = new RefugioModelo();
        RefugioVista vista = new RefugioVista();
        RefugioControlador controlador = new RefugioControlador(modelo, vista);
        controlador.ejecutarDemostracion();
    }

}
