package Ejercicios.bloque_condicionales;

import java.util.Scanner;

public class Ejercicio3_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Digite una letra: ");

        letra = scanner.next().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("Es una letra minúscula");
        }
    }
}
