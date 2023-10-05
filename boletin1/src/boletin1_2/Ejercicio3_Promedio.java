package boletin1_2;

import java.util.Scanner;

public class Ejercicio3_Promedio {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa las tres calificaciones");
        double exCal1 = sc.nextDouble();
        double exCal2 = sc.nextDouble();
        double exCal3 = sc.nextDouble();

        double promedio = (exCal1 + exCal2 + exCal3) / 3;

        System.out.println("Tu promedio es " + promedio);
    }
}
