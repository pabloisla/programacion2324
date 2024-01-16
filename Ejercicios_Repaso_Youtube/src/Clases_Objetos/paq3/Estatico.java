package Clases_Objetos.paq3;

public class Estatico {

    //Static
    // Es un método que pertenece a la clase y no al objeto.
    // Un método estático solo puede acceder a datos estáticos.
    // Es un método que pertenece a la clase y no al objeto (instancia).
    // Un método estático solo puede acceder a datos estáticos.
    // No puede acceder a datos no estáticos.

    private static String frase = "Primera frase";

    public static int sumar(int n1, int n2){
        int suma = n1 + n2;
        return suma;

    }

    public static void main(String[] args) {

        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(3,4));
    }
}