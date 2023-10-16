package boletin1_3;

import java.util.Scanner;

public class Ejercicio10 {

    public static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        char operador;
        do {
            System.out.println("Introduce operador (+, -, /, *) ");
            operador = teclado.nextLine().charAt(0);
            if (operador != '-' && operador != '+' && operador != '/' && operador != '*') {
                System.out.println("El operador es incorrecto");
            } else {
                System.out.println("Introduce el primer número:");
                num1 = Integer.parseInt(teclado.nextLine());
                System.out.println("Introduce el segundo número:");
                num2 = Integer.parseInt(teclado.nextLine());
            }
        } while (operador != '-' && operador != '+' && operador != '/' && operador != '*');

        double resultado = 0;
        switch (operador) {
            case '*':
                resultado = num1 * num2;
                System.out.printf("El resultado de multiplicar %d y %d es: %f%n", num1, num2, resultado);
                break;
            case '+':
                resultado = num1 + num2;
                System.out.printf("El resultado de sumar %d y %d es: %f%n", num1, num2, resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("El resultado de restar %d y %d es: %f%n", num1, num2, resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = ((double) num1 / num2);
                    System.out.printf("El resultado de dividir %d y %d es: %f%n", num1, num2, resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido");
        }

        teclado.close();
    }
}

