import java.util.Scanner;

public class Primer_Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int num1 = scanner.nextInt();

        int i = 2; // Comenzamos desde 2, ya que 1 es un divisor de todos los números
        boolean encontrado = false; // Si no se ha encontrado un divisor, entonces no es un número primo

        while (i <= num1 / 2) {
            if (num1 % i == 0) {
                encontrado = true;
                break; // Se ha encontrado un divisor, salimos del bucle
            }
            i++;
        }

        if (encontrado) {
            System.out.println("El primer divisor de " + num1 + " es " + i);
        } else {
            System.out.println(num1 + " es un número primo o no válido.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}