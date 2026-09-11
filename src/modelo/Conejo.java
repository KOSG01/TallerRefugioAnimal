package modelo;

/**
 *
 * @author franc
 */
public class Conejo extends Mascota {

    private String color;

    public Conejo(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, String color) {
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getTipo() {
        return "Conejo";
    }

    @Override
    public double calcularCostoMensual() {
        return COSTO_BASE * 0.75;
    }
}
