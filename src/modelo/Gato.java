package modelo;

/**
 * Clase especializada que representa un Gato, subclase de Mascota.
 *
 * Un Gato hereda todas las propiedades de Mascota y añade un atributo
 * adicional: si vive en interior o exterior. El costo mensual de un gato
 * es fijo, independientemente de su peso.
 *
 * Fórmula de costo mensual:
 *   Costo = COSTO_BASE + 3500 = 12000 + 3500 = 15500 pesos (siempre)
 *
 * @author franc
 * @see Mascota
 */
public class Gato extends Mascota {

    // Atributo específico de Gato: si vive en interior o exterior
    private boolean viveEnInterior;  // true = interior, false = exterior

    /**
     * Constructor de Gato. Inicializa todos los atributos heredados de Mascota
     * más el atributo específico 'viveEnInterior'.
     *
     * @param id identificador único del gato
     * @param nombre nombre del gato
     * @param edad edad en años
     * @param peso peso en kilogramos
     * @param jaula número de jaula
     * @param adoptada true si fue adoptado
     * @param vacunada true si fue vacunado
     * @param viveEnInterior true si vive en interior, false si vive en exterior
     */
    public Gato(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, boolean viveEnInterior) {
        // Llamar al constructor de la clase padre (Mascota)
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.viveEnInterior = viveEnInterior;
    }

    /**
     * Verifica si el gato vive en interior.
     * @return true si vive en interior, false si vive en exterior
     */
    public boolean isViveEnInterior() {
        return viveEnInterior;
    }

    /**
     * Establece si el gato vive en interior o exterior.
     * @param viveEnInterior true para interior, false para exterior
     */
    public void setViveEnInterior(boolean viveEnInterior) {
        this.viveEnInterior = viveEnInterior;
    }

    /**
     * Retorna el tipo de mascota. Redefinición polimórfica de getTipo().
     * @return siempre retorna "Gato"
     */
    @Override
    public String getTipo() {
        return "Gato";
    }

    /**
     * Calcula el costo mensual de un gato.
     *
     * Polimorfismo en acción: Este método redefinido calcula el costo
     * diferente a la clase base Mascota.
     *
     * Los gatos tienen un costo fijo adicional, independientemente de su peso:
     *   Costo = COSTO_BASE + 3500 = 15500 pesos (siempre)
     *
     * @return costo mensual en pesos (15500)
     */
    @Override
    public double calcularCostoMensual() {
        // Costo base + 3500 pesos fijo
        return COSTO_BASE + 3500;
    }
}