package Arrays1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ej_8_9_10_11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar un array aleatorio
        int[] array = generarArrayAleatorio(10);

        // Imprimir el array generado
        System.out.println("Array generado aleatoriamente:");
        imprimirArray(array);

        // Pedir al usuario el elemento a buscar
        System.out.print("Ingrese el elemento a buscar: ");
        int elementoABuscar = scanner.nextInt();

        // Verificar si el elemento se encuentra en el array
        boolean encontrado = contieneElemento(array, elementoABuscar);

        if (encontrado) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }

        // Usar los métodos adicionales
        int[] arrayDuplicados = {1, 2, 3, 2, 4, 5, 4, 6, 7};
        int[] arraySinDuplicados = eliminarDuplicados(arrayDuplicados);
        System.out.println("Array sin duplicados:");
        imprimirArray(arraySinDuplicados);

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] elementosComunesArray = elementosComunes(array1, array2);
        System.out.println("Elementos comunes en los dos arrays:");
        imprimirArray(elementosComunesArray);

        int[] arrayDesordenado = {5, 3, 1, 4, 2};
        int[] arrayOrdenado = ordenarBurbuja(arrayDesordenado);
        System.out.println("Array ordenado de menor a mayor:");
        imprimirArray(arrayOrdenado);

        scanner.close();
    }

    public static int[] generarArrayAleatorio(int tamano) {
        int[] array = new int[tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
            array[i] = random.nextInt(100); // Generar números aleatorios entre 0 y 99
        }

        return array;
    }

    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static boolean contieneElemento(int[] array, int elementoABuscar) {
        for (int elemento : array) {
            if (elemento == elementoABuscar) {
                return true;
            }
        }
        return false;
    }

    public static int posicionEnArray(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; // Valor no encontrado
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

    public static int[] eliminarDuplicados(int[] array) {
        Set<Integer> conjunto = new HashSet<>();
        for (int elemento : array) {
            conjunto.add(elemento);
        }
        int[] resultado = new int[conjunto.size()];
        int i = 0;
        for (int elemento : conjunto) {
            resultado[i] = elemento;
            i++;
        }
        return resultado;
    }

    public static int[] elementosComunes(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int elemento : array1) {
            set1.add(elemento);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int elemento : array2) {
            set2.add(elemento);
        }
        set1.retainAll(set2);
        int[] resultado = new int[set1.size()];
        int i = 0;
        for (int elemento : set1) {
            resultado[i] = elemento;
            i++;
        }
        return resultado;
    }

    public static int[] ordenarBurbuja(int[] array) {
        int n = array.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    intercambio = true;
                }
            }
        } while (intercambio);
        return array;
    }
}