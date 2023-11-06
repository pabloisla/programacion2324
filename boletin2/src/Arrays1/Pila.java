package Arrays1;

import java.util.Arrays;

public class Pila {

    private int[] pila;
    private int tope;

    public Pila() {
        pila = new int[10];
        tope = -1;
    }

    public void apilar(int elemento) {
        if (tope < 9) {
            tope++;
            pila[tope] = elemento;
        } else {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        }
    }

    public void desapilar() {
        if (tope >= 0) {
            tope--;
        } else {
            System.out.println("No hay elementos en la pila");
        }
    }

    public void mostrarPila() {
        System.out.println("Pila: " + Arrays.toString(Arrays.copyOfRange(pila, 0, tope + 1)));
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.mostrarPila();
        pila.apilar(3);
        pila.mostrarPila();
        pila.apilar(12);
        pila.mostrarPila();
        pila.desapilar();
        pila.mostrarPila();
        pila.desapilar();
        pila.mostrarPila();
        pila.desapilar();
        pila.mostrarPila();
    }
}