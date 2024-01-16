package Clases_Objetos.paq1;

public class Clase2 {
    public static void main(String[] args) {

        Clase1 objeto1 = new Clase1();

        objeto1.SetEdad(10);
        System.out.println("La edad es: " + objeto1.GetEdad());
        objeto1.setNombre("Pablo");
        System.out.println("El nombre del programador es: " + objeto1.getNombre());

    }
}
