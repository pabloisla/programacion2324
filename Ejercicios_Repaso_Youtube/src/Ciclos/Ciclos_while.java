package Ciclos;

import java.util.Scanner;

public class Ciclos_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, contador;

        System.out.println("Digite cuantos numeros quiere en pantalla: ");
        contador = sc.nextInt();

// Mientras se cumpla condicion el bucle seguirá hasta que la condicion sea falsa y se detendrá
        while (i <= contador) {
            System.out.println(i);
            i+= 2;
        }
    }
}