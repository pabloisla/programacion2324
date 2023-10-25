package Arrays1;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de elementos en el array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double media = (double) sum / n;

        System.out.println("El mayor número introducido es " + max);
        System.out.println("El menor número introducido es " + min);
        System.out.println("La media de los números introducidos es: " + media);

        scanner.close();
    }
}