package Arrays1;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Solicitar al usuario el tamaño del array
        int tamArray = MiEntradaSalida.leerEntero("Ingrese el tamaño del array: ");
        // Generar un array aleatorio
        int[] array = generarArrayAleatorio(tamArray);

        // Imprimir el array generado
        System.out.println("Array generado aleatoriamente:");
        imprimirArray(array);

        // Pedir al usuario el elemento a buscar
        int elementoABuscar = MiEntradaSalida.leerEntero("Ingrese el elemento a buscar: ");

        // Verificar si el elemento se encuentra en el array
        boolean encontrado = contieneElemento(array, elementoABuscar);

        if (encontrado) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el array.");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el array.");
        }
    }

        public static int[] generarArrayAleatorio(int tamArray) {
            int[] array = new int[tamArray];
            Random random = new Random();

            for (int i = 0; i < tamArray; i++) {
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
    }