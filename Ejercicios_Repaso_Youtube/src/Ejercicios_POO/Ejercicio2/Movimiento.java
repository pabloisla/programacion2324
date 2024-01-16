package Ejercicios_POO.Ejercicio2;

public class Movimiento {
    //Atributos
    private int x;
    private int y;

    //Métodos
    //Constructor
    public Movimiento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Movimiento
    public void arriba() {
        if (y != 0) {
            y -= 1;
        }
    }

    public void abajo() {
        if (y != 10) {
            y += 1;
        }
    }

    public void derecha() {
        if (x != 0) {
            x -= 1;
        }
    }

    public void izquierda() {
        if (x != 10) {
            x += 1;
        }
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
