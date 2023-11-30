package MiEntradaSalida;

import java.util.Scanner;

public class MiEntradaSalida {
    private static final Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.next();
    }

    public static void imprimir(String mensaje) {
        System.out.println(mensaje);
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}
