package Condicionales;

import java.util.Scanner;

public class Condicionales_multiples {

    public static void main(String[] args) {
        int dato;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite un numero entre 1 y 5: ");

        dato = scanner.nextInt();

        switch (dato) {
            case 1:
                System.out.println("Es el numero 1");
                break;
            case 2:
                System.out.println("Es el numero 2");
                break;
            case 3:
                System.out.println("Es el numero 3");
                break;
            case 4:
                System.out.println("Es el numero 4");
                break;
            case 5:
                System.out.println("Es el numero 5");
                break;

            default:
                System.out.println("El numero no esta en el rango 1-5");
                break;
        }
    }
}
