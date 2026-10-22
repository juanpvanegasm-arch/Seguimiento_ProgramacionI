public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int anio, EstadoVehiculo estado, int cilindraje) {
        super(placa, marca, modelo, anio, estado);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularTarifaDiaria() {
        double tarifa = super.calcularTarifaDiaria();
        return tarifa - tarifa * 0.10;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de la motocicleta----");
        super.mostrarDatos();
        System.out.println("Cilindraje: " + cilindraje);
    }
}
