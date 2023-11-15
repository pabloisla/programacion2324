package Arrays1;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int[] arraySinDuplicados = eliminarDuplicados(arrayOriginal);

        System.out.print("Array Original: ");
        imprimirArray(arrayOriginal);
        System.out.print("Array Sin Duplicados: ");
        imprimirArray(arraySinDuplicados);
    }

    public static int[] eliminarDuplicados(int[] array) {
        int elementosUnicos = contarElementosUnicos(array);
        int[] resultado = new int[elementosUnicos];
        int index = 0;

        for (int i : array) {
            if (!contiene(resultado, i)) {
                resultado[index++] = i;
            }
        }

        return resultado;
    }

    private static int contarElementosUnicos(int[] array) {
        int count = 0;
        for (int i : array) {
            if (!contiene(Arrays.copyOfRange(array, 0, count), i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean contiene(int[] array, int elemento) {
        for (int i : array) {
            if (i == elemento) {
                return true;
            }
        }
        return false;
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