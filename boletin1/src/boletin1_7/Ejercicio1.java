package boletin1_7;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int numero = input.nextInt();
        input.close();

        int numeroInverso = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInverso = numeroInverso * 10 + digito;
            numero = numero / 10;
        }

        System.out.println("El número inverso es: " + numeroInverso);
    }
}