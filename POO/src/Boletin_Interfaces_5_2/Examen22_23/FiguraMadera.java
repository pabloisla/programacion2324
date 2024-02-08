package Boletin_Interfaces_5_2.Examen22_23;

import Boletin_Interfaces_5_2.Examen22_23.Clases.JugueteMadera;

public class FiguraMadera extends JugueteMadera implements Apilable {
    private String color;
    private int numeroLados;

    // Constructor
    public FiguraMadera(String nombre, String marca, double precio, String origenMadera, int añoTalaMadera, String color, int numeroLados) {
        super(nombre, marca, precio, origenMadera, añoTalaMadera);
        this.color = color;
        this.numeroLados = numeroLados;
    }

    // Método para apilar una figura de madera sobre otro juguete
    public void apilar(Juguete juguete) throws Exception {
        if (!(juguete instanceof FiguraMadera)) {
            throw new Exception("No se puede apilar un juguete no apilable sobre esta figura de madera.");
        }
        System.out.println("Se ha apilado " + juguete.getNombre() + " sobre " + this.getNombre());
    }

    // Método para mostrar información de la figura de madera
    public String toString() {
        return super.toString() + ", Color: " + color + ", Número de lados: " + numeroLados;
    }
}