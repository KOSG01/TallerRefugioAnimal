package modelo;

/**
 * Clase base que representa una mascota en el refugio.
 *
 * Esta es la clase padre de Perro, Gato y Conejo. Define los atributos comunes
 * y métodos básicos que toda mascota debe tener. Implementa la interfaz Cobrable
 * para permitir calcular el costo mensual de mantenimiento.
 *
 * Conceptos de POO aplicados:
 * - Encapsulación: Atributos protected para acceso controlado
 * - Polimorfismo: calcularCostoMensual() se redefinirá en subclases
 * - Interfaz: Implementa Cobrable para garantizar comportamiento
 *
 * @author franc
 * @see Perro
 * @see Gato
 * @see Conejo
 * @see Cobrable
 */
public class Mascota implements Cobrable {

    // Atributos comunes a todas las mascotas
    protected int identificacion;      // ID único de la mascota
    protected String nombre;           // Nombre de la mascota
    protected int edad;                // Edad en años
    protected double peso;             // Peso en kilogramos
    protected int numeroJaula;         // Número de jaula donde está alojada
    protected boolean adoptada;        // true si ya fue adoptada
    protected boolean vacunada;        // true si ha sido vacunada
    
    // Costo base de mantenimiento mensual (en pesos)
    public static final double COSTO_BASE = 12000.0;

    /**
     * Constructor sin parámetros. Inicializa todos los atributos con valores por defecto.
     */
    public Mascota() {
        this(0, "", 0, 0.0, 0, false, false);
    }

    /**
     * Constructor con parámetros. Inicializa todas las propiedades de la mascota.
     *
     * @param identificacion ID único de la mascota (debe ser positivo)
     * @param nombre Nombre de la mascota
     * @param edad Edad en años (debe ser >= 0)
     * @param peso Peso en kilogramos (debe ser > 0)
     * @param numeroJaula Número de jaula (referencia para ubicación)
     * @param adoptada true si ya fue adoptada, false si está disponible
     * @param vacunada true si ha recibido vacuna, false si no
     */
    public Mascota(int identificacion, String nombre, int edad, double peso,
            int numeroJaula, boolean adoptada, boolean vacunada) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.numeroJaula = numeroJaula;
        this.adoptada = adoptada;
        this.vacunada = vacunada;
    }

    // ==================== GETTERS Y SETTERS ====================
    
    /**
     * Obtiene el identificador único de la mascota.
     * @return ID de la mascota
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece el identificador de la mascota.
     * @param identificacion nuevo ID
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el nombre de la mascota.
     * @return nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre de la mascota.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la mascota en años.
     * @return edad en años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la mascota.
     * @param edad nueva edad en años
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el peso actual de la mascota.
     * @return peso en kilogramos
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Cambia el peso de la mascota.
     * @param peso nuevo peso en kilogramos
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Obtiene el número de jaula donde está alojada.
     * @return número de jaula
     */
    public int getNumeroJaula() {
        return numeroJaula;
    }

    /**
     * Asigna una nueva jaula a la mascota.
     * @param numeroJaula número de la nueva jaula
     */
    public void setNumeroJaula(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    /**
     * Verifica si la mascota ha sido adoptada.
     * @return true si fue adoptada, false si está disponible
     */
    public boolean isAdoptada() {
        return adoptada;
    }

    /**
     * Marca la mascota como adoptada o disponible.
     * @param adoptada true para marcar como adoptada, false para disponible
     */
    public void setAdoptada(boolean adoptada) {
        this.adoptada = adoptada;
    }

    /**
     * Verifica si la mascota ha sido vacunada.
     * @return true si está vacunada, false si no
     */
    public boolean isVacunada() {
        return vacunada;
    }

    /**
     * Marca la mascota como vacunada o no.
     * @param vacunada true si está vacunada, false si no
     */
    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    // ==================== MÉTODOS DE NEGOCIO ====================
    
    /**
     * Retorna el tipo de mascota. Este método será redefinido en las subclases.
     * 
     * Ejemplo de polimorfismo: la misma llamada getTipo() retorna diferentes
     * valores según la subclase (Perro retorna "Perro", Gato retorna "Gato", etc.)
     * 
     * @return tipo de mascota ("Mascota" en esta clase base)
     */
    public String getTipo() {
        return "Mascota";
    }

    /**
     * Calcula el costo mensual de mantenimiento de la mascota.
     * 
     * Polimorfismo en acción: Este método será redefinido en las subclases
     * Perro, Gato y Conejo para calcular costos diferentes:
     * - Mascota base: retorna COSTO_BASE (12000)
     * - Perro: retorna COSTO_BASE + peso * 500 (varían con peso)
     * - Gato: retorna COSTO_BASE + 3500 (fijo adicional)
     * - Conejo: retorna COSTO_BASE * 0.75 (más económico)
     * 
     * @return costo mensual en pesos
     */
    @Override
    public double calcularCostoMensual() {
        return COSTO_BASE;
    }

    /**
     * Retorna una representación en texto de la mascota con todos sus datos.
     * 
     * @return String con formato: Mascota{id=X, nombre='Y', edad=Z, peso=W, jaula=J, adoptada=A, vacunada=V}
     */
    @Override
    public String toString() {
        return getTipo() + "{id=" + identificacion + ", nombre='" + nombre
                + "', edad=" + edad + ", peso=" + peso + ", jaula="
                + numeroJaula + ", adoptada=" + adoptada + ", vacunada="
                + vacunada + "}";
    }
}