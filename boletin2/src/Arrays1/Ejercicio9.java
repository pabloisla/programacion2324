package Arrays1;

import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int valor = 9;

        System.out.print("Array Original: ");
        imprimirArray(array);

        int posicion = posicionEnArray2(array, valor, false);
        if (posicion != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + posicion + " del array.");
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el array.");
        }
    }

    public static int posicionEnArray2(int[] array, int valor, boolean reverse) {
        if (reverse) {
            Arrays.sort(array);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; // Valor no encontrado
    }

    private static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}