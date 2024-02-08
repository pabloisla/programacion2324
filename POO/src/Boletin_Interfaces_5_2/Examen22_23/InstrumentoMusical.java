package Boletin_Interfaces_5_2.Examen22_23;

import Boletin_Interfaces_5_2.Examen22_23.Clases.JugueteException;
import Boletin_Interfaces_5_2.Examen22_23.Clases.JugueteMadera;

public class InstrumentoMusical extends JugueteMadera {
    private int edadMinima;

    // Constructor
    public InstrumentoMusical(String nombre, String marca, double precio, String origenMadera, int añoTalaMadera, int edadMinima) {
        super(nombre, marca, precio, origenMadera, añoTalaMadera);
        this.edadMinima = edadMinima;
    }

    // Getters y setters
    public int getEdadMinima() {
        return edadMinima;
    }

    private void setEdadMinima(int edadMinima) throws JugueteException{
        if(edadMinima < 1){
            throw new JugueteException("");
        }
        this.edadMinima = edadMinima;
    }

    // Método para mostrar información del instrumento musical
    public String toString() {
        return super.toString() + ", Edad mínima: " + edadMinima;
    }
}