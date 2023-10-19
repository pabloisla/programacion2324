package boletin1_7;


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número romano (por ejemplo, IV): ");
        String romanNumber = input.nextLine();
        input.close();

        int decimalNumber = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            char romanDigit = romanNumber.charAt(i);
            int value = romanToDecimal(romanDigit);
            decimalNumber += value;
        }

        System.out.println("El número en base decimal es: " + decimalNumber);
    }

    public static int romanToDecimal(char romanDigit) {
        switch (romanDigit) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
}