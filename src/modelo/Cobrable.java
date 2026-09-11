package modelo;

/**
 * Interface que define el comportamiento para calcular costos en el refugio.
 *
 * Una interfaz es un contrato que especifica qué métodos DEBEN implementar
 * las clases que la implementan. En este caso, cualquier clase que sea "Cobrable"
 * debe poder calcular su costo mensual.
 *
 * ¿Por qué usar una interfaz en lugar de una clase abstracta?
 * - Define un contrato claro: "Soy cobrable, puedo calcular mi costo"
 * - Permite flexibilidad: Otras clases (no solo Mascota) pueden implementarlo
 * - Facilita el polimorfismo: Puedes trabajar con cualquier Cobrable
 *
 * Ejemplo de polimorfismo con interfaz:
 *   Cobrable mascota = new Perro(...);
 *   double costo = mascota.calcularCostoMensual();  // Llama método del Perro
 *
 *   mascota = new Gato(...);
 *   costo = mascota.calcularCostoMensual();  // Llama método del Gato
 *
 * @author franc
 * @see Mascota implementa esta interfaz
 */
public interface Cobrable {

    /**
     * Calcula el costo mensual de mantenimiento.
     *
     * Cada clase implementadora debe definir su propia lógica para calcular
     * el costo. Ejemplo:
     * - Perro: COSTO_BASE + peso * 500 (varían con peso)
     * - Gato: COSTO_BASE + 3500 (fijo)
     * - Conejo: COSTO_BASE * 0.75 (más económico)
     *
     * @return costo mensual en pesos
     */
    double calcularCostoMensual();
}
