package boletin1_2;

import java.util.Scanner;

public class Ejercicio2_Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Realizar la conversión a grados Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Imprimir ambas temperaturas
        System.out.println("Temperatura en grados Celsius: " + celsius);
        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);

        // Cerrar el escáner
        scanner.close();
    }
}