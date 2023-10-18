package boletin1_6;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinar el número secreto entre 1 y 100.");
        System.out.println("Tienes 5 intentos para adivinarlo.");

        while (intentos < 5) {
            System.out.print("Introduce un número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.println("El número debe estar entre 1 y 100. Este intento no cuenta.");
            } else if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número secreto (" + numeroSecreto + "). Ganaste el juego.");
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + numeroUsuario);
                intentos++;
            } else {
                System.out.println("El número secreto es menor que " + numeroUsuario);
                intentos++;
            }

            int intentosRestantes = 5 - intentos;
            if (intentosRestantes > 0) {
                System.out.println("Te quedan " + intentosRestantes + " intentos.");
            } else {
                System.out.println("Agotaste tus intentos. El número secreto era " + numeroSecreto + ". Perdiste.");
            }
        }

        scanner.close();
    }
}