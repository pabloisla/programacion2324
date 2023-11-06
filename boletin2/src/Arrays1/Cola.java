package Arrays1;

import java.util.Arrays;

public class Cola {

    private int[] cola;
    private int frente;
    private int fin;

    public Cola() {
        cola = new int[10];
        frente = 0;
        fin = -1;
    }

    public void encolar(int elemento) {
        if (fin < 9) {
            fin++;
            cola[fin] = elemento;
        } else {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        }
    }

    public void desencolar() {
        if (frente <= fin) {
            frente++;
        } else {
            System.out.println("No hay elementos en la cola");
        }
    }

    public void mostrarCola() {
        System.out.println("Cola: " + Arrays.toString(Arrays.copyOfRange(cola, frente, fin + 1)));
    }

    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.mostrarCola();
        cola.encolar(3);
        cola.mostrarCola();
        cola.encolar(12);
        cola.mostrarCola();
        cola.desencolar();
        cola.mostrarCola();
        cola.desencolar();
        cola.mostrarCola();
        cola.desencolar();
        cola.mostrarCola();
    }
}