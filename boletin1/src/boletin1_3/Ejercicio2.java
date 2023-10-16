package boletin1_3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario dos números
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else {
            System.out.println("El primer número es menor que el segundo.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}

