package modelo;

/**
 *
 * @author franc
 */
public class DatosIniciales {

    public static Mascota[] crearMascotas() {
        Mascota[] mascotas = new Mascota[18];
        mascotas[0] = new Perro(108, "Luna", 4, 18.5, 101, false, true, "Mestizo");
        mascotas[1] = new Gato(103, "Milo", 2, 4.2, 102, false, false, true);
        mascotas[2] = new Conejo(115, "Nube", 1, 2.1, 103, false, true, "Blanco");
        mascotas[3] = new Perro(101, "Max", 7, 26.0, 104, true, true, "Labrador");
        mascotas[4] = new Gato(112, "Simba", 5, 5.0, 105, false, true, false);
        mascotas[5] = new Conejo(106, "Canela", 3, 2.8, 106, false, false, "Café");
        mascotas[6] = new Perro(119, "Rocky", 6, 21.3, 107, false, false, "Beagle");
        mascotas[7] = new Gato(104, "Kiara", 4, 3.9, 108, true, true, true);
        mascotas[8] = new Conejo(110, "Copito", 2, 2.4, 109, false, true, "Gris");
        mascotas[9] = new Perro(102, "Toby", 9, 30.0, 110, false, true, "Pastor");
        mascotas[10] = new Gato(117, "Olivia", 1, 3.2, 111, false, false, true);
        mascotas[11] = new Conejo(109, "Moka", 4, 3.0, 112, false, true, "Negro");
        return mascotas;
    }

    public static int[][] crearMapaJaulas() {
        return new int[][]{
            {-1, -1, -1, -1, -1},
            {101, 102, 103, 104, 105},
            {-1, -1, -1, -1, -1},
            {106, 107, 108, 109, 110},
            {111, 112, 113, 114, 115}
        };
    }
}
