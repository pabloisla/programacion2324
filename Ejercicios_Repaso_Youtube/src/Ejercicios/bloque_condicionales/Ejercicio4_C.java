package Ejercicios.bloque_condicionales;

import java.util.Scanner;

public class Ejercicio4_C {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precio, total, precioDescuento;

        System.out.print("Digite el precio de la compra: ");
        precio = entrada.nextFloat();

        if (precio >= 300){
            precioDescuento = precio * 20 / 100;
            total = precio - precioDescuento;
            System.out.println("Como el precio es mayor de 300 se le aplica un 20% de descuento y el precio final es de " + total);
        }
        else {
            System.out.println("El precio final es de " + precio);
        }


    }

}

