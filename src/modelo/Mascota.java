package modelo;

/**
 *
 * @author franc
 */
public class Mascota implements Cobrable {

    protected int identificacion;
    protected String nombre;
    protected int edad;
    protected double peso;
    protected int numeroJaula;
    protected boolean adoptada;
    protected boolean vacunada;
    public static final double COSTO_BASE = 12000.0;

    public Mascota() {
        this(0, "", 0, 0.0, 0, false, false);
    }

    public Mascota(int identificacion, String nombre, int edad, double peso,
            int numeroJaula, boolean adoptada, boolean vacunada) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.numeroJaula = numeroJaula;
        this.adoptada = adoptada;
        this.vacunada = vacunada;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroJaula() {
        return numeroJaula;
    }

    public void setNumeroJaula(int numeroJaula) {
        this.numeroJaula = numeroJaula;
    }

    public boolean isAdoptada() {
        return adoptada;
    }

    public void setAdoptada(boolean adoptada) {
        this.adoptada = adoptada;
    }

    public boolean isVacunada() {
        return vacunada;
    }

    public void setVacunada(boolean vacunada) {
        this.vacunada = vacunada;
    }

    public String getTipo() {
        return "Mascota";
    }

    @Override
    public double calcularCostoMensual() {
        return COSTO_BASE;
    }

    @Override
    public String toString() {
        return getTipo() + "{id=" + identificacion + ", nombre='" + nombre
                + "', edad=" + edad + ", peso=" + peso + ", jaula="
                + numeroJaula + ", adoptada=" + adoptada + ", vacunada="
                + vacunada + "}";
    }
}
