package excepcion;

/**
 * Excepción personalizada que se lanza cuando se intenta realizar una operación
 * en una mascota que ya fue adoptada.
 *
 * Casos de uso:
 * - Intentar adoptar una mascota que ya fue adoptada
 * - Intentar vacunar una mascota que ya fue adoptada (si aplica)
 * - Cualquier operación que no sea válida en mascotas adoptadas
 *
 * Ejemplo de uso:
 *   try {
 *       adopcion.adoptar(mascotas, 101);  // Max ya está adoptado
 *   } catch (MascotaYaAdoptadaException e) {
 *       System.out.println("Error: " + e.getMessage());
 *       // Output: Error: La mascota Max ya fue adoptada
 *   }
 *
 * @author franc
 * @see DatoInvalidoException
 * @see MascotaNoEncontradaException
 */
public class MascotaYaAdoptadaException extends Exception {

    /**
     * Constructor que crea la excepción con un mensaje descriptivo.
     *
     * @param mensaje descripción del error (qué mascota ya fue adoptada)
     */
    public MascotaYaAdoptadaException(String mensaje) {
        super(mensaje);
    }
}
