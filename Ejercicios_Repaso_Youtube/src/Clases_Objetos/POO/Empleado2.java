package Clases_Objetos.POO;

public class Empleado2 {

    //Constructor

    public Empleado2(String nom) {

        nombre = nom;

        seccion = "ADMINISTRACIÓN";

        Id = Id_Siguiente;

        Id_Siguiente++;


    }

    public void cambiarSeccion(String seccion) { // Setter: establece un valor en un campo

        this.seccion = seccion;

    }

    public String devuelveDatos() { // Getter: devuelve los datos de los trabajadores
        return "El nombre es: " + nombre + " y la sección es " + seccion + " y el ID = " + Id;
    }

    private final String nombre;

    private String seccion;

    private int Id;

    private static int Id_Siguiente; //variable que pertenece a la clase

}