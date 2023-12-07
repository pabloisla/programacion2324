package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario = 1000;
        double comision, porcentajeVentaxCarro, cantCarros,sumCarros, salarioFinal;


        System.out.println("Ingrese cantidad de carros vendidos: ");
        cantCarros = entrada.nextDouble();
        System.out.println("Ingrese suma total del dinero de carros que haya vendido");
        sumCarros = entrada.nextDouble();

        comision = cantCarros*150;
        porcentajeVentaxCarro = (sumCarros*0.05);
        salarioFinal = salario + comision + porcentajeVentaxCarro;

        System.out.println("El salario Final es : " + salarioFinal);

    }
}
