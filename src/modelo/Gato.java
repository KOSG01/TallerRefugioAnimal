package modelo;

/**
 *
 * @author franc
 */
public class Gato extends Mascota {

    private boolean viveEnInterior;

    public Gato(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, boolean viveEnInterior) {
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.viveEnInterior = viveEnInterior;
    }

    public boolean isViveEnInterior() {
        return viveEnInterior;
    }

    public void setViveEnInterior(boolean viveEnInterior) {
        this.viveEnInterior = viveEnInterior;
    }

    @Override
    public String getTipo() {
        return "Gato";
    }

    @Override
    public double calcularCostoMensual() {
        return COSTO_BASE + 3500;
    }
}
