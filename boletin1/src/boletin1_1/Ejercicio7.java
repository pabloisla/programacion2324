package boletin1_1;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros;

        do {
            System.out.print("Ingrese la cantidad de números: ");
            cantidadNumeros = scanner.nextInt();
        } while (cantidadNumeros <= 0);

        double suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        double media = suma / cantidadNumeros;

        System.out.println("La media de los números ingresados es: " + media);

        // Cerrar el escáner
        scanner.close();
    }
}