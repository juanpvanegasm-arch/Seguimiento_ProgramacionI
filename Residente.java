public class Residente extends Cliente {
    private String direccion;

    public Residente(String nombre, String correo, String documento, String direccion) {
        super(nombre, correo, documento);
        this.direccion = direccion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del residente----");
        super.mostrarDatos();
        System.out.println("Dirección: " + direccion);
    }
}
