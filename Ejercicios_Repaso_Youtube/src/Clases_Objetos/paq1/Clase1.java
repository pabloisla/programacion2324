package Clases_Objetos.paq1;

public class Clase1 {
    //Modificadores de acceso

    // private: El método o atributo es privado. Solo es visible desde dentro de la propia clase
    // private int atributo1;

    // public: accesible a todas las clases desde cualquier parte del código
    //public int num1;

    // Encapsulamiento sirve para ocultar los datos para no puedan ser modificados por otros

    // Getter y Setter

    private int edad;
    private String nombre;

    // Setter: Sirve para establecer un valor a una variable
    public void SetEdad(int edad){
        this.edad = edad;
    }
    //Getter: Sirve para mostrar el valor de la variable
    public int GetEdad(){
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
