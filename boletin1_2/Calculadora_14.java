package boletin1_2;

import java.util.Scanner;

public class Calculadora_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar al usuario el primer número y el segundo número
        System.out.println("Dime el primer número: ");
        double num1 = sc.nextDouble();

        System.out.println("Dime el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Dime la operación que desea realizar: ( + | - | * | / ) ");
        char operacion = sc.next().charAt(0);

        double resultado = 0;
        // Solicitar un switch para escoger que operación es la que desea utilizar
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
