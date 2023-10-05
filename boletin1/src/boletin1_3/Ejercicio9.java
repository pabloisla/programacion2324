package boletin1_3;

import java.util.Scanner;

public class Ejercicio9 {
    static Scanner scanner;
    public static void main(String[] args) {
        double result;
        System.out.println("Introduce el precio del producto");
        int precio = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el tipo de producto");
        char tipo = scanner.nextLine().charAt(0);
        if (tipo != 'A' && tipo != 'B' && tipo != 'C') {
            System.out.println("Error");
        } else if (tipo == 'A') {
            result = (double)precio - (double)precio * 0.12;
            System.out.println("Se le aplica un 7% de descuento");
            System.out.printf("El producto final es de %f ", result);
        } else if (tipo != 'C' && precio >= 500) {
            result = (double)precio - (double)precio * 0.09;
            System.out.println("Se le aplica un 9% de descuento");
            System.out.printf("El producto final es de %f", result);
        } else {
            result = (double)precio - (double)precio * 0.07;
            System.out.println("Se le aplica un 12% de descuento");
            System.out.printf("El producto final es de %f", result);
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}

