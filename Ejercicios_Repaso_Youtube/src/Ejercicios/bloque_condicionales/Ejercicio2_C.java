package Ejercicios.bloque_condicionales;

import java.util.Scanner;

public class Ejercicio2_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite dos numeros: ");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("El primer numero es mayor que el segundo");

        }
        else if (num1 < num2){
            System.out.println("El segundo numero es mayor que el primer numero");
        }
        else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
