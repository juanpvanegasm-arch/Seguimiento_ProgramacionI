public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private EstadoVehiculo estado;
    private final double tarifaBase = 10000;

    public Vehiculo(String placa, String marca, String modelo, int anio, EstadoVehiculo estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.estado = estado;
    }

    public double calcularTarifaDiaria() {
        return tarifaBase;
    }

    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Estado: " + estado);
        System.out.println("Tarifa por día: " + calcularTarifaDiaria());
    }
}
