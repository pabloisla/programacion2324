package EjercicioAvion;

public class Deposito {

    private double capacidadMaxima;
    private double cantidadActual;

    public Deposito(double capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        setCantidadActual(cantidadActual);

    }

    public void setCantidadActual(double cantidadActual) {
        if (cantidadActual < capacidadMaxima && cantidadActual > 0) {
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public String toString() {
        return String.format("%.2f%% de un deposito de %.2f", (cantidadActual / capacidadMaxima) * 100, capacidadMaxima);

    }
}
