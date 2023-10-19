package boletin1_6;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo de las soluciones de una ecuación de segundo grado (ax^2 + bx + c = 0)");
        System.out.print("Ingrese el coeficiente A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente B: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente C: ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            if (discriminante > 0) {
                double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales: " + solucion1 + " y " + solucion2);
            } else if (discriminante == 0) {
                double solucion = -b / (2 * a);
                System.out.println("La ecuación tiene una única solución real: " + solucion);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }

        scanner.close();
    }
}