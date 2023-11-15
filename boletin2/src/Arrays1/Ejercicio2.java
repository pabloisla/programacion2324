package Arrays1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6};
        int contador = 0;

        for (int num : array) {
            if (num < 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de números negativos: " + contador);
    }
}