package boletin1_3;

import java.util.Scanner;
public class Ejercicio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario un número
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número es múltiplo de 2.");
            }
            if (numero % 3 == 0) {
                System.out.println("El número es múltiplo de 3.");
            }

            // Cerrar el escáner
            scanner.close();
        }
    }
