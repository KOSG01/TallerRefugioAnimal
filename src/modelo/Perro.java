package modelo;

/**
 *
 * @author franc
 */
public class Perro extends Mascota {

    private String raza;

    public Perro(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, String raza) {
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String getTipo() {
        return "Perro";
    }

    @Override
    public double calcularCostoMensual() {
        return COSTO_BASE + peso * 500;
    }
}
