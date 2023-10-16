package boletin1_3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la edad
        System.out.print("Ingrese la edad (menor a 100 años): ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente.");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Es un joven.");
        } else if (edad >= 30 && edad < 100) {
            System.out.println("Es un adulto.");
        } else {
            System.out.println("Edad no válida.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}

