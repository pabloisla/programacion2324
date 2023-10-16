package boletin1_3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario 4 numeros
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        double num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número");
        double num3 = scanner.nextInt();
        System.out.println("Ingrese el cuarto número");
        double num4 = scanner.nextInt();

        // Calcular la media
        double media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("La media de los números es: " + media);

        // Comprobar y mostrar los números mayores que la media
        System.out.println("Números mayores que la media: ");
        if (num1 > media) {
            System.out.println(num1);
        }
        if (num2 > media) {
            System.out.println(num2);
        }
        if (num3 > media) {
            System.out.println(num3);
        }
        if (num4 > media) {
            System.out.println(num4);
        }

        // Cerrar el escáner
        scanner.close();
    }
}