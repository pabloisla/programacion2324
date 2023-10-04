package boletin1_1;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número entero no negativo: ");
            numero = scanner.nextInt();
        } while (numero < 0);

        long factorial = calcularFactorial(numero);

        System.out.println("Factorial(" + numero + ") = " + factorial);

        // Cerrar el escáner
        scanner.close();
    }

    public static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}