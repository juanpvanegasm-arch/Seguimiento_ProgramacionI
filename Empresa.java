import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ciudad;
    private List <Alquiler> alquileres;

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.alquileres = new ArrayList<>();
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public double calcularIngresosTotales() {
        double ingresosTotales = 0;
        for (Alquiler alquiler : alquileres) {
            ingresosTotales += alquiler.calcularCostoTotal();
        }
        return ingresosTotales;
    }

    public void mostrarReporte() {
        System.out.println("===== " + nombre + " - " + ciudad + " =====");
        System.out.println();
        for (Alquiler alquiler : alquileres) {
            alquiler.mostrarDatos();
            System.out.println();
        }
        System.out.println("Ingresos totales: " + calcularIngresosTotales());
    }

}