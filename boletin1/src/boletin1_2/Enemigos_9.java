package boletin1_2;

import java.util.Scanner;

public class Enemigos_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de enemigos derrotados
        System.out.print("Ingrese el número de enemigos derrotados: ");
        int numEnemigos = scanner.nextInt();

        // Verificar si el número de enemigos derrotados es mayor que 50
        int puntos;
        if (numEnemigos > 50) {
            // Si es mayor que 50, multiplica los puntos por 2
            puntos = numEnemigos * 2;
        } else {
            // Si no, los puntos son iguales al número de enemigos derrotados
            puntos = numEnemigos;
        }

        // Imprimir los puntos totales
        System.out.println("Puntos totales: " + puntos);

        // Cerrar el escáner
        scanner.close();
    }
}