package boletin1_1;

public class Ejercicio9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println("El número es perfecto: " + i);
            }
        }
    }

    public static boolean esNumeroPerfecto(int a) {
        int sumaDivisores = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == a;
    }
}