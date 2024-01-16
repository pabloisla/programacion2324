package Clases_Objetos.paq2;

public class Persona {
    //Atributos
    private int edad;

    //Constante
    private final String nombre;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0){
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }
}