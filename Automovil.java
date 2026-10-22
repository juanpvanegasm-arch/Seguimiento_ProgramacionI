public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private final double recargo = 20000; // Recargo encapsulado directamente en la clase

    public Automovil(String placa, String marca, String modelo, int anio, EstadoVehiculo estado, int numeroPuertas) {
        super(placa, marca, modelo, anio, estado);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularTarifaDiaria() {
        return super.calcularTarifaDiaria() + recargo; // Tarifabase + 20000
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del automóvil----");
        super.mostrarDatos();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}