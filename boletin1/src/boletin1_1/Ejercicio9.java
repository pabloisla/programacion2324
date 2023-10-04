package boletin1_1;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        boolean esPerfecto = esNumeroPerfecto(numero);

        if (esPerfecto) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }

        // Cerrar el escáner
        scanner.close();
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 1; // Inicializamos en 1 porque todos los números son divisibles por 1.

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                int otroDivisor = numero / i;
                if (otroDivisor != i) {
                    sumaDivisores += otroDivisor;
                }
            }
        }

        return sumaDivisores == numero;
    }
}