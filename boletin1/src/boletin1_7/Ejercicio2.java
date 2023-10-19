package boletin1_7;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int numero = input.nextInt();
        input.close();

        int numeroOriginal = numero;
        int numeroInverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInverso = numeroInverso * 10 + digito;
            numero = numero / 10;
        }

        if (numeroOriginal == numeroInverso) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
    }
}