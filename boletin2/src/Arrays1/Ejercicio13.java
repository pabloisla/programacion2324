package Arrays1;

import java.util.Scanner;

public class Ejercicio13 {
    public static int tamPila = 0;
    public static int[] pila = new int[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Menú de Operaciones:");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int numeroApilar = MiEntradaSalida.leerEntero("Ingrese el número a apilar: ");
                    apilar(numeroApilar);
                    break;
                case 2:
                    desapilar();
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void apilar(int numero) {
        if (tamPila < pila.length) {
            pila[tamPila++] = numero;
            System.out.println("Apilo el número " + numero);
        } else {
            System.out.println("La pila está llena. No se puede apilar el elemento");
        }

        imprimeArray(pila);
    }

    public static void desapilar() {
        System.out.println("Desapilar");

        if (tamPila > 0) {
            tamPila--;
        } else {
            System.out.println("No hay elementos en la pila");
        }

        imprimeArray(pila);
    }

    public static void imprimeArray(int[] array) {
        System.out.print("Contenido de la pila: ");
        for (int i = 0; i < tamPila; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }
}