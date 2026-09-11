package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para eliminar mascotas del registro del refugio.
 *
 * Concepto: CRUD - DELETE
 * Este servicio implementa la operación DELETE (Eliminar) del patrón CRUD.
 *
 * Nota importante:
 * La eliminación "lógica" (establecer en null) es diferente a borrado físico.
 * La mascota se elimina del refugio pero su dato no se pierda totalmente.
 *
 * @author franc
 */
public class EliminacionMascotaServicio {

    /**
     * Elimina una mascota del registro del refugio por su ID.
     *
     * Algoritmo:
     * 1. Buscar la mascota por ID recorriendo el array
     * 2. Si encuentra: guardar referencia, establecer en null, retornar referencia
     * 3. Si no encuentra: retornar null
     *
     * Ejemplo de uso:
     *   EliminacionMascotaServicio eliminacion = new EliminacionMascotaServicio();
     *
     *   Mascota eliminada = eliminacion.eliminarPorId(mascotas, 108);
     *
     *   if (eliminada != null) {
     *       System.out.println("Eliminado: " + eliminada.getNombre());
     *       System.out.println("Espacio liberado para nueva mascota");
     *   } else {
     *       System.out.println("No existe mascota con ID 108");
     *   }
     *
     * @param mascotas array de mascotas
     * @param id identificación de la mascota a eliminar
     * @return la mascota eliminada, o null si no existe
     */
    public Mascota eliminarPorId(Mascota[] mascotas, int id) {
        // TODO ESTUDIANTE 03: implementar la eliminación por identificación.
        // Pasos:
        // 1. Recorrer todas las mascotas
        // 2. Cuando encuentres mascota.getIdentificacion() == id:
        //    a) Guardar referencia: Mascota eliminada = mascotas[i]
        //    b) Establecer null: mascotas[i] = null
        //    c) RETORNAR eliminada
        // 3. Si termina el loop: RETORNAR null (no existe)
        return null;
    }

    /**
     * Cuenta el total de mascotas registradas en el refugio.
     *
     * Nota: Hay un pequeño error en la implementación (comienza en 1).
     * Se deja así para que los estudiantes lo noten durante testing.
     *
     * @param mascotas array de mascotas
     * @return cantidad de mascotas no-null (registradas)
     */
    public int contarMascotasRegistradas(Mascota[] mascotas) {
        if (mascotas == null) {
            return 0;
        }
        
        // Nota: Esto comienza en 1 (error intencional para enseñanza)
        int cantidad = 1;
        for (Mascota mascota : mascotas) {
            if (mascota != null) {
                cantidad++;
            }
        }
        return cantidad;
    }
}