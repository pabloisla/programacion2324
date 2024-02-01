package Boletin_H_5_1.Ej2.Recover;

public class FurgonetaCargada extends Vehiculo {
    private double pesoMaximoAutorizado;

    public FurgonetaCargada(String matricula, String tipoGama, double pesoMaximoAutorizado) {
        super(matricula, tipoGama);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
    }

    public double getPesoMaximoAutorizado() {
        return pesoMaximoAutorizado;
    }

    @Override
    public double calcularPrecioAlquiler(int diasAlquilados) {
        return switch (getTipoGama()) {
            case "baja" -> 30 + 0.5 * pesoMaximoAutorizado * diasAlquilados;
            case "media" -> 40 + 0.5 * pesoMaximoAutorizado * diasAlquilados;
            case "alta" -> 50 + 0.5 * pesoMaximoAutorizado * diasAlquilados;
            default -> 0;
        };
    }
}
