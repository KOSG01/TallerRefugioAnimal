package modelo;

/**
 * Clase especializada que representa un Conejo, subclase de Mascota.
 *
 * Un Conejo hereda todas las propiedades de Mascota y añade un atributo
 * adicional: su color. El costo mensual de un conejo es más económico que
 * el de otras mascotas (75% del costo base).
 *
 * Fórmula de costo mensual:
 *   Costo = COSTO_BASE * 0.75 = 12000 * 0.75 = 9000 pesos
 *
 * @author franc
 * @see Mascota
 */
public class Conejo extends Mascota {

    // Atributo específico de Conejo
    private String color;  // Ej: "Blanco", "Café", "Gris", "Negro"

    /**
     * Constructor de Conejo. Inicializa todos los atributos heredados de Mascota
     * más el atributo específico 'color'.
     *
     * @param id identificador único del conejo
     * @param nombre nombre del conejo
     * @param edad edad en años
     * @param peso peso en kilogramos
     * @param jaula número de jaula
     * @param adoptada true si fue adoptado
     * @param vacunada true si fue vacunado
     * @param color color del conejo (Blanco, Café, Gris, Negro, etc.)
     */
    public Conejo(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, String color) {
        // Llamar al constructor de la clase padre (Mascota)
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.color = color;
    }

    /**
     * Obtiene el color del conejo.
     * @return color del conejo
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del conejo.
     * @param color nuevo color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Retorna el tipo de mascota. Redefinición polimórfica de getTipo().
     * @return siempre retorna "Conejo"
     */
    @Override
    public String getTipo() {
        return "Conejo";
    }

    /**
     * Calcula el costo mensual de un conejo.
     *
     * Polimorfismo en acción: Este método redefinido calcula el costo
     * diferente a la clase base Mascota.
     *
     * Los conejos son las mascotas más económicas:
     *   Costo = COSTO_BASE * 0.75 = 9000 pesos
     *
     * @return costo mensual en pesos (9000)
     */
    @Override
    public double calcularCostoMensual() {
        // Costo de 75% del base (más económico que otras mascotas)
        return COSTO_BASE * 0.75;
    }
}