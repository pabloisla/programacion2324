package Boletin_Interfaces_5_2.Examen22_23;

public abstract class JugueteMadera extends Juguete {
    private String origenMadera;
    private int añoTalaMadera;

    // Constructor
    public JugueteMadera(String nombre, String marca, double precio, String origenMadera, int añoTalaMadera) {
        super(nombre, marca, precio);
        this.origenMadera = origenMadera;
        this.añoTalaMadera = añoTalaMadera;
    }

    // Getters y setters
    public String getOrigenMadera() {
        return origenMadera;
    }

    public int getAñoTalaMadera() {
        return añoTalaMadera;
    }

    // Método para mostrar información del juguete de madera
    public String toString() {
        return super.toString() + ", Origen de la madera: " + origenMadera + ", Año de tala: " + añoTalaMadera;
    }
}