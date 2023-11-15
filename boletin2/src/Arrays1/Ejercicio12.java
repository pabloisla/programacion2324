package Arrays1;

public class Ejercicio12 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.print("Array Original: ");
        imprimirArray(array);

        ordenarBurbuja(array);
        System.out.print("Array Ordenado: ");
        imprimirArray(array);
    }

    public static void ordenarBurbuja(int[] array) {
        int n = array.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    intercambiar(array, i - 1, i);
                    intercambio = true;
                }
            }
        } while (intercambio);
    }

    private static void intercambiar(int[] array, int indiceA, int indiceB) {
        int temp = array[indiceA];
        array[indiceA] = array[indiceB];
        array[indiceB] = temp;
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