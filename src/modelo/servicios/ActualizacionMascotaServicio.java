package modelo.servicios;

import excepcion.DatoInvalidoException;
import modelo.Mascota;

/**
 * Servicio para actualizar información de mascotas en el refugio.
 *
 * Este servicio proporciona métodos para modificar los datos de una mascota
 * ya registrada. Incluye validaciones para garantizar que los datos sean válidos.
 *
 * Métodos disponibles:
 * - actualizarPeso(): Cambia el peso de una mascota (ESTUDIANTE 02)
 * - actualizarNombre(): Cambia el nombre de una mascota (ya implementado)
 *
 * @author franc
 */
public class ActualizacionMascotaServicio {

    /**
     * Actualiza el peso de una mascota identificada por su ID.
     *
     * Validaciones:
     * - El peso debe ser mayor a 0
     * - Se lanza DatoInvalidoException si el peso es inválido
     *
     * Ejemplo de uso:
     *   ActualizacionMascotaServicio servicio = new ActualizacionMascotaServicio();
     *   try {
     *       boolean actualizado = servicio.actualizarPeso(mascotas, 108, 20.0);
     *       if (actualizado) {
     *           System.out.println("Peso actualizado correctamente");
     *       } else {
     *           System.out.println("Mascota no encontrada");
     *       }
     *   } catch (DatoInvalidoException e) {
     *       System.out.println("Error: " + e.getMessage());
     *   }
     *
     * @param mascotas array de mascotas donde buscar
     * @param id identificación de la mascota a actualizar
     * @param nuevoPeso nuevo peso en kilogramos (debe ser > 0)
     * @return true si se actualizó correctamente, false si no existe la mascota
     * @throws DatoInvalidoException si el peso es inválido (<=0)
     */
    public boolean actualizarPeso(Mascota[] mascotas, int id, double nuevoPeso)
            throws DatoInvalidoException {
        Hice un cambio aquí :D
        // TODO ESTUDIANTE 02: implementar la actualización de peso.
        // Pasos:
        // 1. Validar que el peso sea > 0, sino lanzar DatoInvalidoException
        // 2. Buscar la mascota por ID usando buscar()
        // 3. Si no existe, retornar false
        // 4. Si existe, actualizar el peso con setPeso() y retornar true
        return false;
    }

    /**
     * Actualiza el nombre de una mascota identificada por su ID.
     *
     * Validaciones:
     * - El nombre no puede ser null
     * - El nombre no puede estar vacío (solo espacios)
     * - Se lanza DatoInvalidoException si el nombre es inválido
     *
     * Ejemplo de uso:
     *   ActualizacionMascotaServicio servicio = new ActualizacionMascotaServicio();
     *   try {
     *       boolean actualizado = servicio.actualizarNombre(mascotas, 108, "Luna Bella");
     *       if (actualizado) {
     *           System.out.println("Nombre actualizado a: Luna Bella");
     *       }
     *   } catch (DatoInvalidoException e) {
     *       System.out.println("Nombre inválido: " + e.getMessage());
     *   }
     *
     * @param mascotas array de mascotas donde buscar
     * @param id identificación de la mascota a actualizar
     * @param nuevoNombre nuevo nombre (no puede ser null ni vacío)
     * @return true si se actualizó correctamente, false si no existe la mascota
     * @throws DatoInvalidoException si el nombre es null o está vacío
     */
    public boolean actualizarNombre(Mascota[] mascotas, int id, String nuevoNombre)
            throws DatoInvalidoException {
        // Validación 1: El nombre no puede ser null
        if (nuevoNombre == null) {
            throw new DatoInvalidoException("El nombre es obligatorio");
        }
        
        // Validación 2: El nombre no puede estar vacío (trim elimina espacios)
        if (nuevoNombre.trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre no puede estar vacío");
        }
        
        // Buscar la mascota por su ID
        Mascota mascota = buscar(mascotas, id);
        
        // Si no existe, retornar false
        if (mascota == null) {
            return false;
        }
        
        // Actualizar el nombre y retornar true
        mascota.setNombre(nuevoNombre);
        return true;
    }

    /**
     * Busca una mascota en el array por su identificación.
     *
     * Este es un método privado (solo uso interno) que implementa búsqueda lineal.
     * Recorre el array hasta encontrar una mascota con el ID especificado.
     *
     * @param mascotas array donde buscar
     * @param id identificación a buscar
     * @return la mascota encontrada, o null si no existe
     */
    private Mascota buscar(Mascota[] mascotas, int id) {
        // Validación: si el array es null, no hay nada que buscar
        if (mascotas == null) {
            return null;
        }
        
        // Búsqueda lineal: recorrer cada mascota
        for (Mascota mascota : mascotas) {
            // Verificar que no sea null y que el ID coincida
            if (mascota != null && mascota.getIdentificacion() == id) {
                return mascota;  // Encontrada
            }
        }
        
        // No encontrada
        return null;
    }
}