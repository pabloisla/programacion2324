package boletin1_6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Convertir el número en una cadena de caracteres y contar la longitud
        String numeroComoCadena = String.valueOf(numero);
        int cifras = numeroComoCadena.length();

        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");

        scanner.close();
    }
}