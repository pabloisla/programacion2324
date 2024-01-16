package Condicionales;


/* La sentencia if:

    if(condicion)
        Intruccion1;
     }
     else {
       Intruccion2;
     }

 */

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, dato = 5;

        System.out.println("Digite un numero: ");

        numero = entrada.nextInt();
        /*
        == : Igualdad
        != : Diferente
        > : Mayor
        >= : Mayor o igual
        < : Menor
        <= : Menor o igual
        */

        if (numero <= dato) { // == -> operador de igualdad
            System.out.println("El numero es 5 o menor");
        } else {
            System.out.println("El numero es mayor 5");
        }
    }
}