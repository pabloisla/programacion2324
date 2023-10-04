package boletin1_3;

import java.util.Scanner;

public class Estado_Civil_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado): ");
        char estadoCivil = scanner.next().charAt(0);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        double porcentajeRetencion = 10.5;

        switch (estadoCivil) {
            case 'S':
            case 'D':
                if (edad < 35) {
                    porcentajeRetencion = 12.0;
                }
                break;
            case 'V':
            case 'C':
                if (edad < 35) {
                    porcentajeRetencion = 11.3;
                }
                break;
            default:
                if (edad > 50) {
                    porcentajeRetencion = 8.5;
                }
                break;
        }

        System.out.println("El porcentaje de retención de impuestos es: " + porcentajeRetencion + "%");

        scanner.close();
    }
}