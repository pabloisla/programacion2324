package boletin1_3;

import java.util.Scanner;

public class Ejercicio8 {
    private static final Scanner teclado;
    public static void main(String[] args) {
        System.out.println("Introduce la hora");
        int hora1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los minutos");
        int min1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los segundos");
        int seg1 = Integer.parseInt(teclado.nextLine());
        if (hora1 >= 0 && hora1 < 24 && min1 >= 0 && min1 < 60 && seg1 >= 0 && seg1 < 60) {
            System.out.println("Introduce la segunda marcación (hora, minutos y segundos");
        } else {
            System.out.println("Primera marcación incorrecta");
        }

        System.out.println("Introduce la hora2");
        int hora2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los minutos");
        int min2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los segundos");
        int seg2 = Integer.parseInt(teclado.nextLine());
        if (hora2 >= 0 && hora2 < 24 && min2 >= 0 && min2 < 60 && seg2 >= 0 && seg2 < 60) {
            int totalS = seg1 + 60 * min1 + 3600 * hora1;
            int totalS2 = seg2 + 60 * min2 + 3600 * hora2;
            if (totalS > totalS2) {
                System.out.println("Hora 1 es mayor que Hora 2");
            } else if (totalS < totalS2) {
                System.out.println("Hora 2 es mayor que Hora 1");
            } else {
                System.out.println("Hora 1 es igual que la Hora 2");
            }
        } else {
            System.out.println("Segunda marcación incorrecta");
        }

    }

    static {
        teclado = new Scanner(System.in);
    }
}
