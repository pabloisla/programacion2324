package boletin1_7;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la hora base: ");
        int horaBase = input.nextInt();
        System.out.print("Introduce los minutos base: ");
        int minutosBase = input.nextInt();
        System.out.print("Introduce los segundos base: ");
        int segundosBase = input.nextInt();

        System.out.print("¿Cuántas horas quieres sumar?: ");
        int horasASumar = input.nextInt();
        System.out.print("¿Cuántos minutos quieres sumar?: ");
        int minutosASumar = input.nextInt();
        System.out.print("¿Cuántos segundos quieres sumar?: ");
        int segundosASumar = input.nextInt();

        input.close();

        segundosBase += segundosASumar;
        minutosBase += minutosASumar + segundosBase / 60;
        horaBase += horasASumar + minutosBase / 60;

        segundosBase %= 60;
        minutosBase %= 60;
        horaBase %= 24;

        System.out.println("La hora resultante es: " + String.format("%02d:%02d:%02d", horaBase, minutosBase, segundosBase));
    }
}
