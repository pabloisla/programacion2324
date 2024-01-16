package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float horas;
        float salario_hora;

        System.out.println("Introduce las horas semanales y tu salario por horas; ");
        horas = entrada.nextFloat();
        salario_hora = entrada.nextFloat();

        float salario_semanal;

        salario_semanal = horas * salario_hora;

        System.out.println("El salario semanal del empleado: " + salario_semanal + "€");

    }
}
