public class Camioneta extends Vehiculo {
    private double capacidadCarga;
    private final double recargo = 50000; // Recargo encapsulado directamente en la clase

    public Camioneta(String placa, String marca, String modelo, int anio, EstadoVehiculo estado, double capacidadCarga) {
        super(placa, marca, modelo, anio, estado);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularTarifaDiaria() {
        return super.calcularTarifaDiaria() + recargo; // Tarifabase + 50000
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de la camioneta----");
        super.mostrarDatos();
        System.out.println("Capacidad de carga (kg): " + capacidadCarga);
    }
}