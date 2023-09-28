package boletin1_2;

import java.util.Scanner;

public class Comida_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la comida rápida favorita al usuario
        System.out.println("¿Cuál es tu comida rápida favorita?");
        System.out.println("Opciones: 'Hamburguesa', 'Pizza', 'Tacos' y 'Ensalada'");
        String comidaFavorita = scanner.nextLine();

        // Utilizar un switch para imprimir un mensaje según la elección
        switch (comidaFavorita.toLowerCase()) {
            case "hamburguesa":
                System.out.println("¡Amante de las hamburguesas!");
                break;
            case "pizza":
                System.out.println("¡Amante de la masa y el queso!");
                break;
            case "tacos":
                System.out.println("¡Amante de los tacos!");
                break;
            case "ensalada":
                System.out.println("¡Amante de la comida saludable!");
                break;
            default:
                System.out.println("Elección no válida. Por favor, elige entre las opciones proporcionadas.");
        }

        scanner.close();
    }
}

