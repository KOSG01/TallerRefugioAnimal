package modelo.servicios;

import java.util.ArrayList;
import modelo.Mascota;

/**
 * Servicio para filtrar mascotas según criterios específicos.
 *
 * Proporciona métodos para obtener subconjuntos de mascotas que cumplan
 * ciertas condiciones. Usa ArrayList en lugar de arrays porque no sabemos
 * de antemano cuántos resultados habrá.
 *
 * Concepto: ArrayList para colecciones de tamaño variable
 * Arrays tienen tamaño fijo. ArrayList crece según sea necesario.
 *
 * @author franc
 */
public class FiltroMascotaServicio {

    /**
     * Filtra las mascotas por tipo específico.
     *
     * Retorna un ArrayList (colección dinámica) con todas las mascotas
     * del tipo especificado.
     *
     * Algoritmo:
     * 1. Crear ArrayList vacío
     * 2. Recorrer todas las mascotas
     * 3. Para cada mascota:
     *    - Si no es null y su getTipo() == tipo buscado
     *    - Agregar al ArrayList con .add()
     * 4. Retornar ArrayList con resultados
     *
     * Ejemplo de uso:
     *   FiltroMascotaServicio filtro = new FiltroMascotaServicio();
     *
     *   // Obtener todos los perros
     *   ArrayList<Mascota> perros = filtro.filtrarPorTipo(mascotas, "Perro");
     *   System.out.println("Total de perros: " + perros.size());
     *
     *   for (Mascota perro : perros) {
     *       System.out.println("- " + perro.getNombre() + " (" + perro.getEdad() + " años)");
     *   }
     *
     *   // También puedes filtrar gatos y conejos
     *   ArrayList<Mascota> gatos = filtro.filtrarPorTipo(mascotas, "Gato");
     *   ArrayList<Mascota> conejos = filtro.filtrarPorTipo(mascotas, "Conejo");
     *
     * Tipos válidos:
     * - "Perro" - retorna todos los perros
     * - "Gato" - retorna todos los gatos
     * - "Conejo" - retorna todos los conejos
     * - Cualquier otro tipo - retorna ArrayList vacío
     *
     * @param mascotas array con todas las mascotas
     * @param tipo tipo de mascota a filtrar ("Perro", "Gato", "Conejo")
     * @return ArrayList con mascotas del tipo especificado (vacío si no hay)
     */
    public ArrayList<Mascota> filtrarPorTipo(Mascota[] mascotas, String tipo) {
        // Crear ArrayList para guardar resultados
        ArrayList<Mascota> resultado = new ArrayList<Mascota>();
        
        // TODO ESTUDIANTE 08: implementar el filtro por tipo.
        // Pasos:
        // 1. Validar que mascotas y tipo no sean null
        // 2. Recorrer todas las mascotas
        // 3. Para cada mascota:
        //    - SI mascota != null Y mascota.getTipo().equals(tipo):
        //      * resultado.add(mascota)
        // 4. RETORNAR resultado
        
        return resultado;
    }

    /**
     * Filtra las mascotas que tienen una edad mayor a la edad mínima especificada.
     *
     * Ejemplo de uso:
     *   FiltroMascotaServicio filtro = new FiltroMascotaServicio();
     *
     *   // Obtener mascotas mayores de 3 años
     *   ArrayList<Mascota> mayores = filtro.filtrarPorEdadMinima(mascotas, 3);
     *
     *   System.out.println("Mascotas mayores de 3 años: " + mayores.size());
     *   for (Mascota m : mayores) {
     *       System.out.println("- " + m.getNombre() + ": " + m.getEdad() + " años");
     *   }
     *
     * @param mascotas array con todas las mascotas
     * @param edadMinima edad mínima (retorna mascotas con edad > edadMinima)
     * @return ArrayList con mascotas mayores a la edad especificada
     */
    public ArrayList<Mascota> filtrarPorEdadMinima(Mascota[] mascotas, int edadMinima) {
        ArrayList<Mascota> resultado = new ArrayList<Mascota>();
        
        if (mascotas == null) {
            return resultado;
        }
        
        // Recorrer todas las mascotas
        for (Mascota mascota : mascotas) {
            // Agregar si existe Y tiene edad mayor a edadMinima
            if (mascota != null && mascota.getEdad() > edadMinima) {
                resultado.add(mascota);
            }
        }
        
        return resultado;
    }
}