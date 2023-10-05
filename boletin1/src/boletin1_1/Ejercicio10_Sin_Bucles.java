package boletin1_1;

import java.util.Scanner;

public class Ejercicio10_Sin_Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calcularFactorial(5));
    }

    public static int calcularFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calcularFactorial(num - 1);
        }
    }
}
