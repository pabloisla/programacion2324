package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float part, exam1, exam2, examF, notaFinal;

        System.out.println("Digite la nota de participacion: ");
        part = entrada.nextFloat();
        System.out.println("Digite el primer examen parcial: ");
        exam1 = entrada.nextFloat();
        System.out.println("Digite el segundo examen parcial: ");
        exam2 = entrada.nextFloat();
        System.out.println("Digite la nota final del ultimo examen: ");
        examF = entrada.nextFloat();

        part *= 0.10f;
        exam1 *= 0.25f;
        exam2 *= 0.25f;
        examF *= 0.40f;

        notaFinal = part + exam1 + exam2 +  examF;

        System.out.println("La nota final del alumno es " + notaFinal);

    }
}
