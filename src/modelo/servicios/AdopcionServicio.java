package modelo.servicios;

import excepcion.MascotaNoEncontradaException;
import excepcion.MascotaYaAdoptadaException;
import modelo.Mascota;

/**
 * Servicio para procesar adopciones de mascotas.
 *
 * Cuando una mascota es adoptada, cambia de estado para que no pueda
 * ser adoptada nuevamente. Este servicio maneja todo el proceso con
 * validaciones y excepciones apropiadas.
 *
 * Concepto: Manejo de Excepciones
 * Este servicio muestra cómo usar excepciones para indicar errores específicos:
 * - MascotaNoEncontradaException: cuando no existe la mascota
 * - MascotaYaAdoptadaException: cuando ya fue adoptada
 *
 * @author franc
 */
public class AdopcionServicio {

    /**
     * Procesa la adopción de una mascota.
     *
     * Validaciones realizadas:
     * - La mascota debe existir en el refugio
     * - La mascota no debe estar ya adoptada
     *
     * Excepciones lanzadas:
     * - MascotaNoEncontradaException: si el ID no existe
     * - MascotaYaAdoptadaException: si ya fue adoptada
     *
     * Algoritmo:
     * 1. Buscar la mascota por ID
     * 2. SI no existe: LANZAR MascotaNoEncontradaException
     * 3. SI está adoptada: LANZAR MascotaYaAdoptadaException
     * 4. SI todo está bien: Marcar como adoptada (setAdoptada(true))
     *
     * Ejemplo de uso:
     *   AdopcionServicio adopcion = new AdopcionServicio();
     *   VacunacionServicio vacunacion = new VacunacionServicio();
     *
     *   try {
     *       // Primero verificar que está vacunada
     *       vacunacion.vacunar(mascotas, 108);
     *       System.out.println("Mascota vacunada");
     *
     *       // Procesar adopción
     *       adopcion.adoptar(mascotas, 108);
     *       System.out.println("Mascota adoptada exitosamente");
     *
     *   } catch (MascotaNoEncontradaException e) {
     *       System.out.println("Error: " + e.getMessage());
     *   } catch (MascotaYaAdoptadaException e) {
     *       System.out.println("Error: " + e.getMessage());
     *   }
     *
     * @param mascotas array de mascotas del refugio
     * @param id identificación de la mascota a adoptar
     * @throws MascotaNoEncontradaException si no existe mascota con ese ID
     * @throws MascotaYaAdoptadaException si la mascota ya fue adoptada
     */
    public void adoptar(Mascota[] mascotas, int id)
            throws MascotaNoEncontradaException, MascotaYaAdoptadaException {
        // TODO ESTUDIANTE 10: implementar el proceso de adopción.
        // Pasos:
        // 1. Buscar la mascota con buscar(mascotas, id)
        // 2. SI mascota == null:
        //    - LANZAR new MascotaNoEncontradaException("Mascota no encontrada")
        // 3. SI mascota.isAdoptada() == true:
        //    - LANZAR new MascotaYaAdoptadaException("Ya fue adoptada")
        // 4. SINO:
        //    - mascota.setAdoptada(true)
    }

    /**
     * Cuenta cuántas mascotas han sido adoptadas (y ya no están en el refugio).
     *
     * Importante: Cuenta solo mascotas ADOPTADAS.
     * Para contar NO adoptadas, usar lógica inversa.
     *
     * @param mascotas array de mascotas
     * @return cantidad de mascotas que fueron adoptadas
     */
    public int contarDisponibles(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        
        int cantidad = 0;
        for (Mascota mascota : mascotas) {
            // Contar solo si existe Y está adoptada
            if (mascota != null && mascota.isAdoptada()) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
    /**
     * Busca una mascota por ID (método privado para uso interno).
     *
     * @param mascotas array donde buscar
     * @param id identificación
     * @return la mascota encontrada, o null si no existe
     */
    private Mascota buscar(Mascota[] mascotas, int id) {
        if (mascotas == null) {
            return null;
        }
        for (Mascota mascota : mascotas) {
            if (mascota != null && mascota.getIdentificacion() == id) {
                return mascota;
            }
        }
        return null;
    }
}