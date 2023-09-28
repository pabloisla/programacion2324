package boletin1_2;

import java.util.Scanner;

public class Nivel_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nivel: ");
        int nivel = Integer.parseInt(sc.nextLine());
        System.out.println("Dime la misiones completadas: ");
        int misiones = sc.nextInt();
        if (nivel > 10 && misiones > 25) {
            System.out.println("Tienes el nivel y las misiones necesarias");
        } else {
            System.out.println("No tienes el nivel y las misiones necesarias");
        }
        sc.close();
    }
}
