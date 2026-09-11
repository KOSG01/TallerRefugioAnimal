package excepcion;

/**
 * Excepción personalizada que se lanza cuando se intenta operar sobre una mascota
 * que no existe en el refugio.
 *
 * Casos de uso:
 * - Buscar una mascota con un ID que no existe
 * - Intentar vacunar una mascota inexistente
 * - Intentar adoptar una mascota inexistente
 * - Intentar actualizar datos de una mascota no registrada
 *
 * Ejemplo de uso:
 *   try {
 *       vacunacion.vacunar(mascotas, 999);  // ID que no existe
 *   } catch (MascotaNoEncontradaException e) {
 *       System.out.println("Error: " + e.getMessage());
 *       // Output: Error: Mascota con ID 999 no existe
 *   }
 *
 * @author franc
 * @see DatoInvalidoException
 * @see MascotaYaAdoptadaException
 */
public class MascotaNoEncontradaException extends Exception {

    /**
     * Constructor que crea la excepción con un mensaje descriptivo.
     *
     * @param mensaje descripción del error (qué mascota no se encontró)
     */
    public MascotaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
