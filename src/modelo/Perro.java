package modelo;

/**
 * Clase especializada que representa un Perro, subclase de Mascota.
 *
 * Un Perro hereda todas las propiedades de Mascota y añade un atributo
 * adicional: la raza. El costo mensual de un perro depende de su peso,
 * siendo más costosos los perros más grandes.
 *
 * Ejemplo de Herencia:
 *   Mascota (Clase Padre)
 *      ↓
 *   Perro (Clase Hija) - agrega 'raza' y calcula costo diferente
 *
 * Fórmula de costo mensual:
 *   Costo = COSTO_BASE + (peso * 500)
 *   Ejemplo: Perro de 20kg = 12000 + (20 * 500) = 22000 pesos
 *
 * @author franc
 * @see Mascota
 */
public class Perro extends Mascota {

    // Atributo específico de Perro
    private String raza;  // Ej: "Mestizo", "Labrador", "Beagle", "Pastor"

    /**
     * Constructor de Perro. Inicializa todos los atributos heredados de Mascota
     * más el atributo específico 'raza'.
     * 
     * Usa la palabra clave 'super' para llamar al constructor de la clase padre.
     *
     * @param id identificador único del perro
     * @param nombre nombre del perro
     * @param edad edad en años
     * @param peso peso en kilogramos
     * @param jaula número de jaula
     * @param adoptada true si fue adoptado
     * @param vacunada true si fue vacunado
     * @param raza raza del perro (Mestizo, Labrador, Beagle, etc.)
     */
    public Perro(int id, String nombre, int edad, double peso, int jaula,
            boolean adoptada, boolean vacunada, String raza) {
        // Llamar al constructor de la clase padre (Mascota)
        super(id, nombre, edad, peso, jaula, adoptada, vacunada);
        this.raza = raza;
    }

    /**
     * Obtiene la raza del perro.
     * @return raza del perro
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza del perro.
     * @param raza nueva raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Retorna el tipo de mascota. Redefinición polimórfica de getTipo().
     * @return siempre retorna "Perro"
     */
    @Override
    public String getTipo() {
        return "Perro";
    }

    /**
     * Calcula el costo mensual de un perro.
     *
     * Polimorfismo en acción: Este método redefinido calcula el costo
     * diferente a la clase base Mascota.
     *
     * Los perros son más costosos cuanto más pesan:
     *   Costo = COSTO_BASE + (peso * 500)
     *
     * @return costo mensual en pesos (COSTO_BASE + peso * 500)
     */
    @Override
    public double calcularCostoMensual() {
        // Costo base + 500 pesos por cada kilogramo
        return COSTO_BASE + peso * 500;
    }
}