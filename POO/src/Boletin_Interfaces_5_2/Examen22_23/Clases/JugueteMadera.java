package Boletin_Interfaces_5_2.Examen22_23.Clases;

import Boletin_Interfaces_5_2.Examen22_23.Juguete;

public abstract class JugueteMadera extends Juguete {
    private String origenMadera;
    private int annoTalaMadera;

    // Constructor
    public JugueteMadera(String nombre, String marca, double precio, String origenMadera, int añoTalaMadera) {
        super(nombre, marca, precio);
        this.origenMadera = origenMadera;
        this.annoTalaMadera = añoTalaMadera;
    }

    // Getters y setters
    public String getOrigenMadera() {
        return origenMadera;
    }

    public int getAnnoTalaMadera() {
        return annoTalaMadera;
    }

    public void setAnnoTalaMadera(int annoTalaMadera) throws JugueteException {
        if(annoTalaMadera < 1)
            throw new JugueteException("Fecha incorrecta");
        this.annoTalaMadera = annoTalaMadera;
    }

    // Método para mostrar información del juguete de madera
    public String toString() {
        return super.toString() + ", Origen de la madera: " + origenMadera + ", Año de tala: " + annoTalaMadera;
    }
}