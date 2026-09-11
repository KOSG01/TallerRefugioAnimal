package controlador;

import modelo.Mascota;
import modelo.RefugioModelo;
import modelo.servicios.AdopcionServicio;
import modelo.servicios.AsignacionJaulaServicio;
import modelo.servicios.BusquedaLinealServicio;
import modelo.servicios.CalculoCostoServicio;
import modelo.servicios.EstadisticaMascotaServicio;
import modelo.servicios.FiltroMascotaServicio;
import modelo.servicios.OrdenamientoBurbujaServicio;
import modelo.servicios.OrdenamientoSeleccionServicio;
import modelo.servicios.ProcesamientoTextoServicio;
import modelo.servicios.ReporteRefugioServicio;
import modelo.servicios.VacunacionServicio;
import vista.RefugioVista;

/**
 *
 * @author franc
 */
public class RefugioControlador {

    private RefugioModelo modelo;
    private RefugioVista vista;

    public RefugioControlador(RefugioModelo modelo, RefugioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ejecutarDemostracion() {
        Mascota[] mascotas = modelo.getMascotas();
        ReporteRefugioServicio reporte = new ReporteRefugioServicio();
        BusquedaLinealServicio busqueda = new BusquedaLinealServicio();

        vista.mostrarTitulo("ESTADO INICIAL DEL REFUGIO");
        vista.mostrarMensaje(reporte.generarResumen(mascotas));

        Mascota encontrada = busqueda.buscarPorId(mascotas, 108);
        vista.mostrarTitulo("BÚSQUEDA LINEAL");
        vista.mostrarMensaje(encontrada == null ? "No encontrada" : encontrada.toString());

        FiltroMascotaServicio filtro = new FiltroMascotaServicio();
        vista.mostrarTitulo("FILTRO POR TIPO");
        vista.mostrarMensaje("Perros encontrados: " + filtro.filtrarPorTipo(mascotas, "Perro").size());

        AsignacionJaulaServicio jaulas = new AsignacionJaulaServicio();
        vista.mostrarTitulo("UBICACIÓN DE JAULA");
        vista.mostrarMensaje(jaulas.buscarUbicacion(modelo.getMapaJaulas(), 108));

        CalculoCostoServicio costos = new CalculoCostoServicio();
        vista.mostrarTitulo("COSTOS");
        vista.mostrarMensaje("Costo mensual total: ₡" + costos.calcularCostoTotal(mascotas));

        EstadisticaMascotaServicio estadisticas = new EstadisticaMascotaServicio();
        vista.mostrarTitulo("ESTADÍSTICAS");
        vista.mostrarMensaje("Promedio de edad: " + estadisticas.calcularPromedioEdad(mascotas));

        ProcesamientoTextoServicio texto = new ProcesamientoTextoServicio();
        vista.mostrarTitulo("PROCESAMIENTO DE TEXTO");
        vista.mostrarMensaje(texto.normalizarNombre("  CANELA  "));

        try {
            new VacunacionServicio().vacunar(mascotas, 103);
            new AdopcionServicio().adoptar(mascotas, 103);
            vista.mostrarMensaje("Vacunación y adopción registradas para Milo.");
        } catch (Exception excepcion) {
            vista.mostrarError(excepcion.getMessage());
        }

        new OrdenamientoBurbujaServicio().ordenarPorEdadDescendente(mascotas);
        vista.mostrarTitulo("ORDENAMIENTO BURBUJA");
        vista.mostrarMensaje("Mascota de mayor edad: " + mascotas[0].getNombre());

        new OrdenamientoSeleccionServicio().ordenarPorIdAscendente(mascotas);
        vista.mostrarTitulo("ORDENAMIENTO POR SELECCIÓN");
        vista.mostrarMensaje("Primera identificación: " + mascotas[0].getIdentificacion());

        vista.mostrarTitulo("ESTADO FINAL");
        vista.mostrarMensaje(reporte.generarResumen(mascotas));
    }
}
