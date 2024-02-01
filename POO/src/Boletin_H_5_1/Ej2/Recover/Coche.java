package Boletin_H_5_1.Ej2.Recover;

public class Coche extends Vehiculo {
    private String tipoCombustible;

    public Coche(String matricula, String tipoGama, String tipoCombustible) {
        super(matricula, tipoGama);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    @Override
    public double calcularPrecioAlquiler(int diasAlquilados) {
        double precioBase = switch (getTipoGama()) {
            case "baja" -> 30;
            case "media" -> 40;
            case "alta" -> 50;
            default -> 0;
        };

        if (getTipoCombustible().equalsIgnoreCase("gasolina")) {
            return precioBase + 3.5 * diasAlquilados;
        } else if (getTipoCombustible().equalsIgnoreCase("diesel")) {
            return precioBase + 2 * diasAlquilados;
        } else {
            return precioBase;
        }
    }
}