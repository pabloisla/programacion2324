package boletin1_6;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar del 0 al 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 0; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }
    }
}