public class Turista extends Cliente {
    private String visa;

    public Turista(String nombre, String correo, String documento, String visa) {
        super(nombre, correo, documento);
        this.visa = visa;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del turista----");
        super.mostrarDatos();
        System.out.println("Visa: " + visa);
    }
}
