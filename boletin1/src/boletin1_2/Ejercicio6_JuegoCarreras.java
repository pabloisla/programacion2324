package boletin1_2;

import java.util.Scanner;

public class Ejercicio6_JuegoCarreras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehiculo: ");
        String tipoVehiculo = scanner.nextLine();

        if (tipoVehiculo.equals("coche")) {
            System.out.println("Velocidad: 120 km/h");

        } else if (tipoVehiculo.equals("moto")) {
            System.out.println("Velocidad: 90 km/h");
        } else if (tipoVehiculo.equals("camion")) {
            System.out.println("Velocidad: 80 km/h");
        } else {
            System.out.println("Tipo de vehiculo no valido");

        }
    }
}
