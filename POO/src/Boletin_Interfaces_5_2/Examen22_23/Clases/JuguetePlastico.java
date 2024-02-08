package Boletin_Interfaces_5_2.Examen22_23.Clases;

import Boletin_Interfaces_5_2.Examen22_23.Juguete;

public abstract class JuguetePlastico extends Juguete {
    private TPlastico tipoPlastico;

    // Constructor


    public JuguetePlastico(String nombre, String marca, double precio, TPlastico tipoPlastico) {
        super(nombre, marca, precio);
        this.tipoPlastico = tipoPlastico;
    }

    // Getters y setters


    public TPlastico getTipoPlastico() {
        return tipoPlastico;
    }

    // Método para mostrar información del juguete de plástico
    public String toString() {
        return super.toString() + ", Tipo de plástico: " + tipoPlastico;
    }
}