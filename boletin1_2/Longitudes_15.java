package boletin1_2;

import java.util.Scanner;

public class Longitudes_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la longitud del primer lado del triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("Dime la longitud del segundo lado del triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("Dime la longitud del tercer lado del triangulo: ");
        double lado3 = sc.nextDouble();

        String tipoTriangulo = switch (determinarTipoTriangulo(lado1, lado2, lado3)) {
            case 1:
                yield "Equilátero";
            case 2:
                yield "Isósceles";
            case 3:
                yield "Escaleno";
            default:
                yield "Desconocido";
        };
        System.out.println("El triángulo es: " + tipoTriangulo);

        // Cerrar el escáner
        sc.close();
    }

    public static int determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return 1;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return 2;
        } else {
            return 3;
        }
    }
}


