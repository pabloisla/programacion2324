package Boletin_Interfaces_5_2.Examen22_23;

public class VehiculoPlastico extends JuguetePlastico {
    private int numeroRuedas;

    // Constructor
    public VehiculoPlastico(String nombre, String marca, double precio, String tipoPlastico, int numeroRuedas) {
        super(nombre, marca, precio, tipoPlastico);
        this.numeroRuedas = numeroRuedas;
    }

    // Getters y setters
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    // Método para mostrar información del vehículo de plástico
    public String toString() {
        return super.toString() + ", Número de ruedas: " + numeroRuedas;
    }
}