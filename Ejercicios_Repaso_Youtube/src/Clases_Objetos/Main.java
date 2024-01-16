package Clases_Objetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        int num2 = entrada.nextInt();

        Operacion op = new Operacion();

        System.out.println("La suma es: " + op.sumar(num1, num2));

    }
}