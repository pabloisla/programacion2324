package boletin1_6;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero mayor que 0: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero mayor que 0: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El máximo común divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}