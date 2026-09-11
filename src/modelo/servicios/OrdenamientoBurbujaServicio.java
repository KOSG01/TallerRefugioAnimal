package modelo.servicios;

import modelo.Mascota;

/**
 * Servicio para ordenar mascotas usando el algoritmo Bubble Sort.
 *
 * ¿Qué es Bubble Sort?
 * Un algoritmo de ordenamiento que compara pares de elementos consecutivos
 * e intercambia sus posiciones si están en orden incorrecto. Los elementos
 * más grandes "burbujean" hacia el final del array.
 *
 * Complejidad: O(n²)
 * Para 100 elementos: ~10,000 comparaciones
 * Para 1,000 elementos: ~1,000,000 comparaciones
 * Para arrays grandes, considerar Quick Sort o Merge Sort.
 *
 * Ventajas:
 * - Muy simple de entender
 * - Fácil de implementar
 * - Bueno para arrays pequeños (< 50 elementos)
 * - Estable (mantiene orden relativo de iguales)
 *
 * Desventajas:
 * - Lento para arrays grandes
 * - O(n²) comparaciones y movimientos
 *
 * @author franc
 * @see OrdenamientoSeleccionServicio para alternativa
 */
public class OrdenamientoBurbujaServicio {

    /**
     * Ordena las mascotas por edad de mayor a menor (descendente).
     *
     * Algoritmo Bubble Sort:
     * 1. Dos bucles anidados recorren el array
     * 2. Para cada par de elementos consecutivos:
     *    - Si están en orden incorrecto, intercambiar
     *    - En cada pasada, el elemento mayor "burbujea" al final
     * 3. Repetir hasta que todo esté ordenado
     *
     * Visualización:
     *   Inicial: [4, 2, 7, 1, 9]  (edades en años)
     *
     *   Pasada 1: Bubble el 9 al final
     *     [4, 2, 7, 1, 9]  → [2, 4, 7, 1, 9]  (intercambiar 4 y 2)
     *     [2, 4, 7, 1, 9]  → [2, 4, 1, 7, 9]  (intercambiar 7 y 1)
     *
     *   Pasada 2: Bubble el 7 a su posición
     *     [2, 4, 1, 7, 9]  → [2, 1, 4, 7, 9]  (intercambiar 4 y 1)
     *
     *   Pasada 3: Bubble el 4 a su posición
     *     [2, 1, 4, 7, 9]  → [1, 2, 4, 7, 9]  (intercambiar 2 y 1)
     *
     *   Resultado: [1, 2, 4, 7, 9]  Ordenado (mayor a menor)
     *
     * Pseudocódigo:
     *   PARA i desde 0 hasta n-1:
     *       PARA j desde 0 hasta n-1-i:
     *           SI debeIntercambiar(mascotas[j], mascotas[j+1]):
     *               intercambiar mascotas[j] con mascotas[j+1]
     *   RETORNAR mascotas
     *
     * Ejemplo de uso:
     *   OrdenamientoBurbujaServicio ordenamiento = new OrdenamientoBurbujaServicio();
     *   Mascota[] copia = mascotas.clone();  // NO modificar original
     *   Mascota[] ordenadas = ordenamiento.ordenarPorEdadDescendente(copia);
     *
     *   System.out.println("Mascotas ordenadas por edad (Mayor a Menor):");
     *   for (Mascota m : ordenadas) {
     *       if (m != null) {
     *           System.out.println(m.getNombre() + ": " + m.getEdad() + " años");
     *       }
     *   }
     *
     * @param mascotas array de mascotas a ordenar (se modifica in-place)
     * @return el mismo array pero ordenado por edad descendente
     */
    public Mascota[] ordenarPorEdadDescendente(Mascota[] mascotas) {
        // TODO ESTUDIANTE 06: implementar Bubble Sort por edad descendente.
        // Pasos:
        // 1. Dos bucles anidados:
        //    - Bucle externo i: desde 0 hasta mascotas.length-1
        //    - Bucle interno j: desde 0 hasta mascotas.length-1-i
        // 2. En cada iteración j:
        //    - SI debeIntercambiar(mascotas[j], mascotas[j+1]) es true:
        //      * temp = mascotas[j]
        //      * mascotas[j] = mascotas[j+1]
        //      * mascotas[j+1] = temp
        // 3. RETORNAR mascotas
        return mascotas;
    }

    /**
     * Verifica si el array está ordenado por edad en forma descendente.
     *
     * Útil para validar que el ordenamiento fue correcto.
     *
     * @param mascotas array a verificar
     * @return true si está ordenado descendente, false si no
     */
    public boolean estaOrdenadoPorEdadDescendente(Mascota[] mascotas) {
        if (mascotas == null) {
            return false;
        }
        
        // Verificar que cada elemento sea >= al siguiente (descendente)
        for (int i = 0; i < mascotas.length - 1; i++) {
            // Si hay null seguido de no-null, no está bien ordenado
            if (mascotas[i] == null && mascotas[i + 1] != null) {
                return false;
            }
            
            // Si ambos existen, verificar que el primero >= segundo (descendente)
            if (mascotas[i] != null && mascotas[i + 1] != null
                    && mascotas[i].getEdad() > mascotas[i + 1].getEdad()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determina si dos mascotas deben intercambiar posiciones.
     *
     * Este método decide la lógica de ordenamiento.
     * Para descendente (mayor a menor), intercambiamos si el primero es MENOR.
     *
     * Lógica:
     * - Si el primero es null y el segundo no, intercambiar (nulls al final)
     * - Si ambos existen y el primero es menor edad que el segundo, intercambiar
     * - En caso contrario, no intercambiar
     *
     * @param actual primera mascota a comparar
     * @param siguiente segunda mascota a comparar
     * @return true si deben intercambiar, false si no
     */
    private boolean debeIntercambiar(Mascota actual, Mascota siguiente) {
        // Nulls van al final
        if (actual == null && siguiente != null) {
            return true;
        }
        
        // Si ambos existen y actual es menor edad (para descendente), intercambiar
        return actual != null && siguiente != null && actual.getEdad() < siguiente.getEdad();
    }
}