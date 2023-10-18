package boletin1_6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos en la clase: ");
        int numAlumnos = scanner.nextInt();

        int aprobados = 0;
        int suspensos = 0;

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = scanner.nextInt();
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);

        double porcentajeAprobados = (double) aprobados / numAlumnos * 100;
        double porcentajeSuspensos = (double) suspensos / numAlumnos * 100;

        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de suspensos: " + porcentajeSuspensos + "%");

        scanner.close();
    }
}