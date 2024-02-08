package Boletin_Interfaces_5_2.Examen22_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainJuego {
    private static List<Juguete> juguetes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Método para crear una figura de madera
    public static void crearFiguraMadera() {
        // Aquí puedes solicitar al usuario los datos necesarios o asignar valores por defecto
        FiguraMadera figura = new FiguraMadera("Figura de madera", "Marca1", 10.0, "España", 2020, "Rojo", 4);
        juguetes.add(figura);
    }

    // Método para crear un instrumento musical
    public static void crearInstrumentoMusical() {
        // Aquí puedes solicitar al usuario los datos necesarios o asignar valores por defecto
        InstrumentoMusical instrumento = new InstrumentoMusical("Xilófono", "Marca2", 20.0, "Brasil", 2010, 10);
        juguetes.add(instrumento);
    }

    // Método para crear un vehículo de plástico
    public static void crearVehiculoPlastico() {
        // Aquí puedes solicitar al usuario los datos necesarios o asignar valores por defecto
        VehiculoPlastico vehiculo = new VehiculoPlastico("Coche", "Marca3", 15.0, "PVC", 4);
        juguetes.add(vehiculo);
    }

    // Método para crear una pieza de lego
    public static void crearPiezaLego() {
        // Aquí puedes solicitar al usuario los datos necesarios o asignar valores por defecto
        PiezaLego pieza = new PiezaLego("Pieza Lego", "Marca4", 5.0, "ABS", 4, "Azul");
        juguetes.add(pieza);
    }

    // Método para apilar un juguete sobre otro
    public static void apilarJuguetes() {
        System.out.println("Seleccione el juguete base sobre el cual apilar:");
        mostrarJuguetes();
        int indiceBase = scanner.nextInt() - 1;
        Juguete jugueteBase = juguetes.get(indiceBase);

        if (jugueteBase instanceof Apilable) {
            System.out.println("Seleccione el juguete a apilar sobre " + jugueteBase.getNombre() + ":");
            mostrarJuguetes();
            int indiceApilable = scanner.nextInt() - 1;
            Juguete jugueteApilable = juguetes.get(indiceApilable);

            try {
                ((Apilable) jugueteBase).apilar(jugueteApilable);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("El juguete seleccionado no es apilable.");
        }
    }

    // Método para mostrar todos los juguetes y su información
    public static void mostrarJuguetes() {
        System.out.println("Juguetes disponibles:");
        for (int i = 0; i < juguetes.size(); i++) {
            System.out.println((i + 1) + ". " + juguetes.get(i).toString());
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Creación de algunos juguetes de base
        juguetes.add(new FiguraMadera("Cubo", "Marca5", 8.0, "España", 2019, "Rojo", 6));
        juguetes.add(new FiguraMadera("Dodecaedro", "Marca6", 12.0, "Brasil", 2018, "Amarillo", 12));
        juguetes.add(new InstrumentoMusical("Xilófono", "Marca7", 25.0, "España", 2015, 12));
        juguetes.add(new VehiculoPlastico("Coche de carreras", "Marca8", 18.0, "PVC", 4));
        juguetes.add(new VehiculoPlastico("Camión", "Marca9", 30.0, "PVC", 8));
        juguetes.add(new PiezaLego("Pieza Lego", "Marca10", 5.0, "ABS", 4, "Azul"));
        juguetes.add(new PiezaLego("Pieza Lego", "Marca11", 5.0, "ABS", 2, "Verde"));

        // Menú de acciones
        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear figura de madera");
            System.out.println("2. Crear instrumento musical");
            System.out.println("3. Crear vehículo de plástico");
            System.out.println("4. Crear pieza de lego");
            System.out.println("5. Apilar juguetes");
            System.out.println("6. Mostrar todos los juguetes");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearFiguraMadera();
                    break;
                case 2:
                    crearInstrumentoMusical();
                    break;
                case 3:
                    crearVehiculoPlastico();
                    break;
                case 4:
                    crearPiezaLego();
                    break;
                case 5:
                    apilarJuguetes();
                    break;
                case 6:
                    mostrarJuguetes();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 0);
    }
}