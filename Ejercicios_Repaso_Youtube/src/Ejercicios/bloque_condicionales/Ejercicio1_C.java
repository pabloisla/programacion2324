package Ejercicios.bloque_condicionales;

import java.util.Scanner;

public class Ejercicio1_C {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero: ");

        numero = scanner.nextInt();


        if(numero % 10 == 0){
            System.out.println("El numero " + numero + " es múltiplo de 10");
        }
        else {
            System.out.println("El numero no es múltiplo de 10");
        }
    }
}
