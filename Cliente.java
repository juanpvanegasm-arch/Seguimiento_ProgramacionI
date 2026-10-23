public abstract class Cliente {
    private String nombre;
    private String correo;
    private String documento;

    public Cliente(String nombre, String correo, String documento) {
        this.nombre = nombre;
        this.correo = correo;
        this.documento = documento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Documento: " + documento);
    }
}
