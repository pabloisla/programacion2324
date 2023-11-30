package EjercicioAvion;

public class Avion {
    private String nombre;

    private String modelo;

    private double

    private final Deposito deposito;

    private final Revision revision;

    public Avion(String nombre, Deposito deposito, Revision revision) {
        this.nombre = nombre;
        this.deposito = deposito;
        this.revision = revision;

    }

    public void mostrarDatos() {
        System.out.println("Datos del avion");
        System.out.println("Nombre " + nombre);
        System.out.println("Gasolina " + deposito.getCantidadLitros() + " litros");
        System.out.println("Meses restantes para revisión : " + revision.getMesesRestanates() + " meses");


    }

    public static void main(String[] args) {
        Deposito depositoAvion1 = new Deposito(45);
        Revision revision1 = new Revision (5);

        Avion avion1 = new Avion ("1", gasolinaAvion1, revision1);

        avion1.mostrarDatos();

    }

}
