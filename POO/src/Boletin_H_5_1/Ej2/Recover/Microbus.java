package Boletin_H_5_1.Ej2.Recover;

public class Microbus extends Vehiculo {
    private int numeroPlazas;

    public Microbus(String matricula, String tipoGama, int numeroPlazas) {
        super(matricula, tipoGama);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    @Override
    public double calcularPrecioAlquiler(int diasAlquilados) {
        return switch (getTipoGama()) {
            case "baja" -> 30 + 5 * numeroPlazas * diasAlquilados;
            case "media" -> 40 + 5 * numeroPlazas * diasAlquilados;
            case "alta" -> 50 + 5 * numeroPlazas * diasAlquilados;
            default -> 0;
        };
    }
}