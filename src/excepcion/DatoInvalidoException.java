package excepcion;

/**
 * Excepción personalizada que se lanza cuando un dato no cumple con los requisitos.
 *
 * Casos de uso:
 * - Peso negativo o cero cuando debe ser positivo
 * - Nombre vacío o null cuando es obligatorio
 * - Edad negativa cuando debe ser >= 0
 * - Identificación duplicada
 * - Cualquier otra validación que falle
 *
 * Ejemplo de uso:
 *   try {
 *       actualizacion.actualizarPeso(mascotas, 108, -5.0);
 *   } catch (DatoInvalidoException e) {
 *       System.out.println("Error: " + e.getMessage());
 *       // Output: Error: El peso debe ser positivo
 *   }
 *
 * @author franc
 * @see MascotaNoEncontradaException
 * @see MascotaYaAdoptadaException
 */
public class DatoInvalidoException extends Exception {

    /**
     * Constructor que crea la excepción con un mensaje descriptivo.
     *
     * @param mensaje descripción del error (qué dato es inválido y por qué)
     */
    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
