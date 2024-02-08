package Boletin_Interfaces_5_2.Examen22_23;

public class Juguete {
    private String nombre;
    private String marca;
    private double precio;

    // Constructor
    public Juguete(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar información del juguete
    public String toString() {
        return "Nombre: " + nombre + ", Marca: " + marca + ", Precio: " + precio;
    }
}