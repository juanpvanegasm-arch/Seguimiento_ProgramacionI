import java.time.LocalDate;

public class Alquiler {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int dias;

    public Alquiler(String codigo, LocalDate fecha, Cliente cliente, Vehiculo vehiculo, int dias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularCostoTotal() {
        return vehiculo.calcularTarifaDiaria() * dias;
    }

    public void mostrarDatos() {
        System.out.println("======= Alquiler " + codigo + " =======");
        System.out.println("Fecha: " + fecha);
        cliente.mostrarDatos();
        vehiculo.mostrarDatos();
        System.out.println("Días contratados: " + dias);
        System.out.println("Costo total: " + calcularCostoTotal());
    }
}
