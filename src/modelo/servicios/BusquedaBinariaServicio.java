package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para buscar mascotas utilizando búsqueda binaria.
 *
 * ¿Qué es búsqueda binaria?
 * Un algoritmo eficiente que divide el array por la mitad repetidamente,
 * descartando la mitad que no contiene lo buscado. También se conoce como
 * "búsqueda de divide y vencerás".
 *
 * Complejidad: O(log n) - Logarítmica
 * Para 1,000,000 de elementos, máximo 20 comparaciones (log₂(1000000) ≈ 20).
 * Mucho más rápido que búsqueda lineal.
 *
 * REQUISITO IMPORTANTE:
 * El array DEBE estar ordenado por ID para que funcione.
 * Si no está ordenado, los resultados serán impredecibles.
 *
 * Ventajas:
 * - MUY rápido para arrays grandes
 * - Logarítmica: O(log n)
 * - Para 1,000,000 elementos: máximo 20 comparaciones
 *
 * Desventajas:
 * - Array DEBE estar ordenado
 * - Un poco más complejo de entender
 *
 * Comparación:
 * - 100 elementos: Lineal=100 vs Binaria=7
 * - 1,000 elementos: Lineal=1,000 vs Binaria=10
 * - 1,000,000 elementos: Lineal=1,000,000 vs Binaria=20
 *
 * @author franc
 * @see BusquedaLinealServicio para búsqueda simple (sin requerir orden)
 */
public class BusquedaBinariaServicio {

    /**
     * Busca una mascota por su ID usando búsqueda binaria.
     *
     * IMPORTANTE: El array DEBE estar ORDENADO por ID
     *
     * Algoritmo - Divide y Vencerás:
     * 1. Definir izquierda = 0, derecha = último índice
     * 2. Mientras izquierda <= derecha:
     *    a) Calcular medio = (izquierda + derecha) / 2
     *    b) Verificar el elemento en el medio
     *    c) Si coincide, RETORNAR (encontrado)
     *    d) Si es menor, buscar en la derecha (izquierda = medio + 1)
     *    e) Si es mayor, buscar en la izquierda (derecha = medio - 1)
     * 3. Si termina el loop, RETORNAR null (no encontrado)
     *
     * Visualización:
     *   Array ORDENADO: [101, 102, 103, 104, 105, 106, 107, 108]
     *   Buscar: 106
     *
     *   Paso 1: Revisar índice medio = 3 (valor 104)
     *           106 > 104 → Buscar en la derecha
     *
     *   Paso 2: Revisar nuevo índice medio = 6 (valor 107)
     *           106 < 107 → Buscar en la izquierda
     *
     *   Paso 3: Revisar nuevo índice medio = 5 (valor 106)
     *           106 == 106 → ENCONTRADO
     *
     *   Total de comparaciones: 3 (en lugar de 6 con búsqueda lineal)
     *
     * Ejemplo de uso:
     *   // Primero, ordenar el array
     *   OrdenamientoSeleccionServicio orden = new OrdenamientoSeleccionServicio();
     *   Mascota[] copia = mascotas.clone();
     *   Mascota[] ordenado = orden.ordenarPorIdAscendente(copia);
     *
     *   // Luego, buscar usando búsqueda binaria
     *   BusquedaBinariaServicio servicio = new BusquedaBinariaServicio();
     *   Mascota encontrada = servicio.buscarPorId(ordenado, 108);
     *
     *   if (encontrada != null) {
     *       System.out.println("Encontrado: " + encontrada.getNombre());
     *   }
     *
     * @param mascotasOrdenadas array de mascotas ORDENADO por ID en forma ascendente
     * @param id identificación a buscar
     * @return la mascota encontrada, o null si no existe
     */
    public Mascota buscarPorId(Mascota[] mascotasOrdenadas, int id) {
        // TODO ESTUDIANTE 05: implementar la búsqueda binaria.
        // Pasos:
        // 1. Inicializar izquierda = 0
        // 2. Inicializar derecha = ultimaPosicionConMascota(mascotasOrdenadas)
        // 3. MIENTRAS izquierda <= derecha:
        //    a) Calcular medio = (izquierda + derecha) / 2
        //    b) Obtener mascota en mascotasOrdenadas[medio]
        //    c) SI mascota == null:
        //       - derecha = medio - 1 (ignorar nulls a la derecha)
        //    d) SINO SI mascota.id == id:
        //       - RETORNAR mascota (ENCONTRADA)
        //    e) SINO SI mascota.id < id:
        //       - izquierda = medio + 1 (buscar a la derecha)
        //    f) SINO:
        //       - derecha = medio - 1 (buscar a la izquierda)
        // 4. RETORNAR null (NO ENCONTRADA)
        return null;
    }

    /**
     * Encuentra la última posición con una mascota en el array.
     *
     * Útil para búsqueda binaria, determina el límite derecho inicial.
     *
     * @param mascotas array de mascotas
     * @return índice de la última posición, o -1 si array es null
     */
    public int ultimaPosicionConMascota(Mascota[] mascotas) {
        if (mascotas == null) {
            return -1;
        }
        return mascotas.length - 1;
    }
}