package Boletin_H_5_1.Ej2.Recover;

public abstract class Vehiculo {
    private String matricula;
    private String tipoGama;

    public Vehiculo(String matricula, String tipoGama) {
        this.matricula = matricula;
        this.tipoGama = tipoGama;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipoGama() {
        return tipoGama;
    }

    public abstract double calcularPrecioAlquiler(int diasAlquilados);
}

