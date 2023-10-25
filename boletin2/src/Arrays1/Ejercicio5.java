package Arrays1;

import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int tamArray = MiEntradaSalida.leerEntero("Introduce el tamaño del : ");
        int[] array = generarArrayAleatorio(tamArray);

        // Mostrar el array generado por pantalla
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento " + i + ": " + array[i]);
        }
    }

    public static int[] generarArrayAleatorio(int tamArray) {
        int[] array = new int[tamArray];
        Random rand = new Random();

        for (int i = 0; i < tamArray; i++) {
            array[i] = rand.nextInt(1001); // Números aleatorios de 0 a 1000
        }

        return array;
    }
}