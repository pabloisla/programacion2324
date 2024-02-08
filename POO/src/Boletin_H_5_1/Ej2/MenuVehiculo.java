package Boletin_H_5_1.Ej2;

import MiEntradaSalida.Lectora;

import java.util.Scanner;

public class MenuVehiculo {

   /* private static final int MAX_VEHICULOS = 200;

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


                    break;

                case 3:


                    break;

                case 4:


                    break;


            }

        } while (opcion != 3);
    }

    private static void imprimirMenu() {
        System.out.println("""
                1. Alta de Vehiculo
                2. Cáculo de precio de alquiler
                3. Listar todos los vehículos
                       
                                
                """);
    }

    private static void darAltaVehiculo() {
        int seleccionUsuario;
        System.out.println("Estos son los vehículos disponibles:");

        int opcion = 0;
        for (TipoVehiculo t : TipoVehiculo.values()) {
            System.out.println(" " + ++opcion + ". " + String.valueOf(t).toLowerCase());
        }
        seleccionUsuario = Lectora.leerEnteroDeRango("Selección: ", TipoVehiculo.values().length, 1);

        switch (seleccionUsuario) {
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;

        }
    }

    private static void calculoPrecio() {
        int posVehiculo;

        String matricula = Lectora.solicitarCadenaMayus("Introduce la matricula del vehiculo");
        int dias = Lectora.leerEnteroDeRango("Introduce el número de días alquilados: ", 365, 1);

        for (posVehiculo = 0; posVehiculo <= vehiculoAlta++; posVehiculo++) {
            if (listaVehiculos[posVehiculo].getMatricula().equals(matricula)) break;

        }
        if (posVehiculo != vehiculoAlta) {
            System.out.println("""
                                        
                    El vehiculo seleccionado con matricula: %s
                    y tras ser usado por %d dias;
                    conlleva un precio total de %.2f€
                                        
                                        
                    """, listaVehiculos[posVehiculo].getPrecioAlquiler(dias));
        } else {
            System.out.println("Su matricula no ha sido detectada");
        }
    }*/
}