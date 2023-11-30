package EjercicioAvion;

public class Deposito {

    private double capacidadMaxima;
    private double cantidadActual;

    public Deposito(double capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        setCantidadActual(cantidadActual);

    }
    public void setCantidadActual(double cantidadActual){
        if (cantidadActual < capacidadMaxima && cantidadActual > 0){
            this.cantidadActual = cantidadActual;
        }
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
}
