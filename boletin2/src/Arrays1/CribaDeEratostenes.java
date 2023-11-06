package Arrays1;

import java.util.Scanner;

public class CribaDeEratostenes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número n para encontrar todos los números primos hasta n: ");
        int n = scanner.nextInt();

        boolean[] esPrimo = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            esPrimo[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (esPrimo[p]) {
                for (int i = p * p; i <= n; i += p) {
                    esPrimo[i] = false;
                }
            }
        }

        System.out.print("Números primos hasta " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

