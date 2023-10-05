package boletin1_2;

import java.util.Scanner;

public class Ejercicio5_Videojuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int monedasDeOro = 100;
        String nombreArma = "ISO 9mm";
        int nivelPersonaje = 10;
        double saludActual = 1000;

        // Imprimir estado inicial del inventario
        System.out.println("Estado inicial del inventario:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);

        // Solicitar al usuario ingresar el daño recibido
        System.out.print("Ingrese el daño recibido: ");
        double danoRecibido = sc.nextDouble();

        // Restar el daño recibido de la salud actual
        saludActual -= danoRecibido;

        // Imprimir estado actualizado del inventario
        System.out.println("\nEstado actualizado del inventario:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);

        // Cerrar el escáner
        sc.close();
    }
}
