package Boletin_H_5_1.Ej2.Recover;

import Boletin_H_5_1.Ej2.TipoVehiculo;
import MiEntradaSalida.Lectora;

import java.util.Scanner;

public class MenuVehiculo {

    private static final int MAX_VEHICULOS = 200;
    private static final Vehiculo[] listaVehiculos = new Vehiculo[MAX_VEHICULOS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            imprimirMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    darAltaVehiculo();
                    break;

                case 2:
                    calcularPrecioAlquiler();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);
    }

    private static void imprimirMenu() {
        System.out.println("""
                1. Alta de Vehiculo
                2. Cálculo de precio de alquiler
                3. Salir
                """);
    }

    private static void darAltaVehiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Coche");
        System.out.println("2. Microbús");
        System.out.println("3. Furgoneta de Carga");

        int seleccion = Lectora.leerEnteroDeRango("Selección: ", TipoVehiculo.values().length, 1);

        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.nextLine();

        System.out.print("Ingrese la gama del vehículo (baja, media, alta): ");
        String tipoGama = scanner.nextLine();

        switch (seleccion) {
            case 1:
                System.out.print("Ingrese el tipo de combustible (gasolina o diesel): ");
                String tipoCombustible = scanner.nextLine();
                listaVehiculos[obtenerIndiceDisponible()] = new Coche(matricula, tipoGama, tipoCombustible);
                break;

            case 2:
                System.out.print("Ingrese el número de plazas del microbús: ");
                int numeroPlazas = Lectora.leerEnteroPositivo("Número de plazas: ");
                listaVehiculos[obtenerIndiceDisponible()] = new Microbus(matricula, tipoGama, numeroPlazas);
                break;

            case 3:
                System.out.print("Ingrese el peso máximo autorizado de la furgoneta de carga: ");
                double pesoMaximoAutorizado = Lectora.leerDoublePositivo("Peso máximo autorizado: ");
                listaVehiculos[obtenerIndiceDisponible()] = new FurgonetaCargada(matricula, tipoGama, pesoMaximoAutorizado);
                break;
        }

        System.out.println("Vehículo dado de alta con éxito.");
    }

    private static void calcularPrecioAlquiler() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la matrícula del vehículo: ");
        String matricula = scanner.nextLine();

        Vehiculo vehiculo = buscarVehiculoPorMatricula(matricula);

        if (vehiculo != null) {
            System.out.print("Ingrese el número de días que ha sido alquilado: ");
            int diasAlquilados = Lectora.leerEnteroPositivo("Número de días: ");
            double precioAlquiler = vehiculo.calcularPrecioAlquiler(diasAlquilados);
            System.out.println("El precio de alquiler es: " + precioAlquiler + " euros");
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }

    private static int obtenerIndiceDisponible() {
        for (int i = 0; i < MAX_VEHICULOS; i++) {
            if (listaVehiculos[i] == null) {
                return i;
            }
        }
        return -1; // Si no hay espacio disponible
    }

    private static Vehiculo buscarVehiculoPorMatricula(String matricula) {
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo != null && vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }
        return null;
    }
}