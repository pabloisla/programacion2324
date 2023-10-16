package boletin1_2;

import java.util.Scanner;

public class Ejercicio4_Km {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        // Solicitar al usuario la distancia en kilómetros
        System.out.print("Ingrese la distancia a su destino en kilómetros: ");
        double distancia = sc.nextDouble();

        // Solicitar al usuario la velocidad en km/h
        System.out.print("Ingrese la velocidad a la que viajará en km/h: ");
        double velocidad = sc.nextDouble();

        // Calcular el tiempo en horas
        double tiempoEnHoras = distancia / velocidad;

        // Convertir el tiempo en horas a horas y minutos
        int horas = (int) tiempoEnHoras;
        int minutos = (int) ((tiempoEnHoras - horas) * 60);
        int segundos = (int) ((tiempoEnHoras - horas - (minutos / 60)) * 3600);

        // Imprimir el tiempo en horas y minutos
        System.out.println("El tiempo de viaje es de " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

        // Cerrar el escáner
        sc.close();
    }
}


