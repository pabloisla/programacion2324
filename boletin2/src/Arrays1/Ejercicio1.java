package Arrays1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < array.length; i += 2) {
            suma += array[i];
        }

        System.out.println("La suma de las posiciones pares es: " + suma);
    }
}