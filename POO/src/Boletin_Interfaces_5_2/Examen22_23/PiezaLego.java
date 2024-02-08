package Boletin_Interfaces_5_2.Examen22_23;

public class PiezaLego extends JuguetePlastico implements Apilable {
    private int longitud;
    private String color;

    // Constructor
    public PiezaLego(String nombre, String marca, double precio, String tipoPlastico, int longitud, String color) {
        super(nombre, marca, precio, tipoPlastico);
        this.longitud = longitud;
        this.color = color;
    }

    // Método para apilar una pieza de lego sobre otro juguete
    public void apilar(Juguete juguete) throws Exception {
        if (!(juguete instanceof PiezaLego)) {
            throw new Exception("No se puede apilar un juguete no apilable sobre esta pieza de lego.");
        }
        System.out.println("Se ha apilado " + juguete.getNombre() + " sobre " + this.getNombre());
    }

    // Método para mostrar información de la pieza de lego
    public String toString() {
        return super.toString() + ", Longitud: " + longitud + ", Color: " + color;
    }
}