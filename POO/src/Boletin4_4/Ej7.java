package Boletin4_4;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine().toLowerCase();
        sc.close();

        System.out.println(devuelveCadenaConsonantesVocales(frase));
    }

    public static String devuelveCadenaConsonantesVocales(String frase) {
        StringBuilder vocales = new StringBuilder();
        StringBuilder consonantes = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                if (esVocal(frase.charAt(i))) {
                    vocales.append(frase.charAt(i));
                } else {
                    consonantes.append(frase.charAt(i));
                }
            }
        }

        return consonantes.append(vocales.toString()).toString();
    }


    public static boolean esVocal(char c) {
        String vocales = "aeiou";

        return vocales.indexOf(Character.toLowerCase(c)) != -1;
    }
}