package modelo;

/**
 *
 * @author franc
 */
public class RefugioModelo {

    private Mascota[] mascotas;
    private int[][] mapaJaulas;

    public RefugioModelo() {
        this.mascotas = DatosIniciales.crearMascotas();
        this.mapaJaulas = DatosIniciales.crearMapaJaulas();
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public int[][] getMapaJaulas() {
        return mapaJaulas;
    }

    public void setMapaJaulas(int[][] mapaJaulas) {
        this.mapaJaulas = mapaJaulas;
    }
}
