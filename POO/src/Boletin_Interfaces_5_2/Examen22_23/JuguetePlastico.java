package Boletin_Interfaces_5_2.Examen22_23;

public class JuguetePlastico extends Juguete {
    private String tipoPlastico;

    // Constructor
    public JuguetePlastico(String nombre, String marca, double precio, String tipoPlastico) {
        super(nombre, marca, precio);
        this.tipoPlastico = tipoPlastico;
    }

    // Getters y setters
    public String getTipoPlastico() {
        return tipoPlastico;
    }

    // Método para mostrar información del juguete de plástico
    public String toString() {
        return super.toString() + ", Tipo de plástico: " + tipoPlastico;
    }
}