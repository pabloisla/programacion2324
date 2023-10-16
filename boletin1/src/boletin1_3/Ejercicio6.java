package boletin1_3;


import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Comprobar si el carácter es una vocal
        char caracterEnMayuscula = Character.toUpperCase(caracter);
        String mensaje = "";
        switch (caracterEnMayuscula) {
            case 'A':
                mensaje = "Es la primera vocal (A)";
                break;
            case 'E':
                mensaje = "Es la segunda vocal (E)";
                break;
            case 'I':
                mensaje = "Es la tercera vocal (I)";
                break;
            case 'O':
                mensaje = "Es la cuarta vocal (O)";
                break;
            case 'U':
                mensaje = "Es la quinta vocal (U)";
                break;
            default:
                mensaje = "No es una vocal";
        }

        // Mostrar el mensaje
        System.out.println(mensaje);

        // Cerrar el escáner
        scanner.close();
    }
}