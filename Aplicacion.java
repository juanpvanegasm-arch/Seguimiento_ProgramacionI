import java.time.LocalDate;

public class Aplicacion {

    public static void main(String[] args) {

        // Instancia de la clase Empresa con nombre y ciudad
        Empresa empresa = new Empresa("AutoRent", "Armenia, Quindío");

        // Clientes
        Cliente cliente1 = new Turista("Emma Johnson", "emma@correo.com", "P1234567", "VISA-US-889");
        Cliente cliente2 = new Residente("Carlos Gómez", "carlos@correo.com", "1094567890", "Carrera 14 # 20-10, Armenia");

        // Vehículos
        Vehiculo vehiculo1 = new Automovil("ABC123", "Mazda", "3", 2022, EstadoVehiculo.BUENO, 4);
        Vehiculo vehiculo2 = new Motocicleta("XYZ45A", "Yamaha", "FZ 150", 2021, EstadoVehiculo.BUENO, 150);
        Vehiculo vehiculo3 = new Camioneta("JKL789", "Toyota", "Hilux", 2020, EstadoVehiculo.MALO, 1000);

        // Registro de alquileres en la empresa
        empresa.agregarAlquiler(new Alquiler("A001", LocalDate.of(2026, 10, 5), cliente1, vehiculo1, 3));
        empresa.agregarAlquiler(new Alquiler("A002", LocalDate.of(2026, 10, 8), cliente2, vehiculo2, 5));
        empresa.agregarAlquiler(new Alquiler("A003", LocalDate.of(2026, 10, 12), cliente1, vehiculo3, 2));

        // Mostrar reporte general
        empresa.mostrarReporte();
    }
}
