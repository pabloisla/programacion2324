package boletin1_3;

import java.util.Scanner;

public class Ejercicio10 {
    public static Scanner teclado;

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        char operador;
        do {
            System.out.println("Introduce operador(+,-,/,*) ");
            operador = teclado.nextLine().charAt(0);
            if (operador != '-' && operador != '+' && operador != '/' && operador != '*') {
                System.out.println("El caracter es incorrecto");
            } else {
                System.out.println("Introduce el primer número:");
                num1 = Integer.parseInt(teclado.nextLine());
                System.out.println("Introduce el segundo número:");
                num2 = Integer.parseInt(teclado.nextLine());
            }
        } while (operador != '-' && operador != '+' && operador != '/' && operador != '*');

        teclado.close();
        int resultado;
        switch (operador) {
            case '*':
                resultado = num1 * num2;
                System.out.printf("El resultado de multiplicar d% y d% es:", num1, num2, resultado);
                break;
            case '+':
                resultado = num1 + num2;
                System.out.printf("El resultado de sumar d% y d% es:", num1, num2, resultado);
                break;
            case ',':
            case '.':
            default:
                System.out.println("Error");
                break;
            case '-':
                resultado = num1 - num2;
                System.out.printf("El resultado de restar d% y d% es:", num1, num2, resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.printf("El resultado de dividir d% y d% es:", num1, num2, resultado);
        }

    }

    static {
        teclado = new Scanner(System.in);
    }
}

