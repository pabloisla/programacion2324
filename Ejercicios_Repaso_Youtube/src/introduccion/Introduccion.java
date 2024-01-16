package introduccion;

import javax.swing.*;
import java.util.Scanner;

public class Introduccion {

    public static void main(String[] args) {

        // Las constantes sirven para guardar un valor en memoria, pero no se puede cambiar su valor a lo largo del código.
        // Como sucede en las variables que si se pueden cambiar su valor

        final int numero = 10;
        int num = 20;
        num = 34;

        // Entrada de datos

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int entero;
        float num1;
        String cadena;
        //String cadena1;
        //char letra;
        //double decimal;

        //Entrada por teclado del usuario

        System.out.println("Digite dos numeros y una cadena: ");
        numero1 = entrada.nextInt();
        num1 = entrada.nextFloat();
        cadena = entrada.next(); // Next te guarda la cadena hasta que introduces un espacio
        // cadena1 = entrada.nextLine(); // NextLine te guarda una cadena extensa
        // letra = entrada.next().charAt(0); // CharAt guarda solo un caracter, ya que pones 0 dentro del parentesis. Por ejemplo de hola solo guarda (h)

        // JOptionPane sirve para crear ventanas emergentes para escribir en ellas.

//        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
//        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
//        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
//        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite una decimal: "));
//
//        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
//        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
//        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);
//        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);


    }

}
