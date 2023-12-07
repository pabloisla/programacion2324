package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float nota, nota2, nota3, suma;

        System.out.println("Digite 3 calificaciones: ");
        nota = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        suma = nota + nota2 + nota3;

        System.out.println("\n La suma es: " + suma);
    }
}
