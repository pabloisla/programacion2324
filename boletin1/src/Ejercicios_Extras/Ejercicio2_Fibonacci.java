package Ejercicios_Extras;

import java.util.Scanner;

public class Ejercicio2_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nivel X para calcular la sucesión de Fibonacci: ");
        int nivelX = scanner.nextInt();

        if (nivelX < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");

        } else {
            System.out.println("Sucesión de Fibonacci hasta el nivel " + nivelX + ":");
            for (int i = 0; i < nivelX; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }
        }

        scanner.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
