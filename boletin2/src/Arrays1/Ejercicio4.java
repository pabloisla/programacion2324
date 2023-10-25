package Arrays1;

import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {
        int n = 6000;  // Número de números aleatorios
        int[] randomNumbers = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randomNumbers[i] = rand.nextInt(101); // Números aleatorios de 0 a 100
        }

        // Cálculo de la media
        int sum = 0;
        for (int num : randomNumbers) {
            sum += num;
        }
        double media = (double) sum / n;

        // Conteo de números terminados en cada dígito (0-9)
        int[] digitCounts = new int[10];
        for (int num : randomNumbers) {
            int lastDigit = num % 10;
            digitCounts[lastDigit]++;
        }

        // Cálculo de porcentajes y suma total de porcentajes
        double totalPorcentaje = 0;
        for (int i = 0; i < 10; i++) {
            double porcentaje = (double) digitCounts[i] / n * 100;
            totalPorcentaje += porcentaje;
            System.out.println("El número " + i + " se ha repetido " + digitCounts[i] + " veces. Esto equivale a un " + porcentaje + "%");
        }

        System.out.println("La suma de todos los porcentajes es equivalente al 100.00%");
        double averiguaporcentaje = totalPorcentaje / 6; // 6 valores contados (0-5)
        System.out.println("El % medio para cada contador es de " + averiguaporcentaje + "%");
    }
}