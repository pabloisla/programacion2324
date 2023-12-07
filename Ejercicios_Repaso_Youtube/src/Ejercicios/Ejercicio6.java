package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        double a, b, resultado;

        //Capturo datos
        System.out.println("Digite el valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Digite el valor de b: ");
        b = teclado.nextDouble();

        //Calculo el resultado

        resultado = Math.pow(a, 2) + Math.pow(b, 2) + (2*a*b);

        //Imprimo el valor
        System.out.println("El resultado del cuadrado de la suma es: "+ resultado);
    }
}
