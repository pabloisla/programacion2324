package boletin1_6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente;
        long resultado = 1;

        do {
            System.out.print("Ingrese la base (entero positivo o 0): ");
            base = scanner.nextInt();
        } while (base < 0);

        do {
            System.out.print("Ingrese el exponente (entero positivo o 0): ");
            exponente = scanner.nextInt();
        } while (exponente < 0);


        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        scanner.close();
    }
}