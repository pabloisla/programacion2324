package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float guillermo, luis, juan, total;

        System.out.println("Cual es la cantidad de dinero tiene guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;

        juan = (guillermo+luis) / 2;

        total = guillermo + luis + juan;

        System.out.println("La cantidad de dinero entre los tres: " + total + "$");
    }
}
