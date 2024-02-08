package Boletin_Interfaces_5_2.Examen22_23.Clases;

import Boletin_Interfaces_5_2.Examen22_23.FiguraMadera;
import Boletin_Interfaces_5_2.Examen22_23.Juguete;
import org.w3c.dom.ls.LSOutput;

public class FiguraMadera extends JugueteMadera implements Apilable {
    private String color;
    private int numeroLados;

    // Constructor
    public FiguraMadera(String nombre, String marca, double precio, String origenMadera, int annoTalaMadera, String color, int numeroLados) {
        super(nombre, marca, precio, origenMadera, annoTalaMadera);
        this.color = color;
        setNumeroLados(numeroLados);
    }

    public void setNumeroLados(int numeroLados) throws JugueteException {

        if (numeroLados <2) {
            throw new JugueteException("El numero de lados es demasiado bajo");

        }
        this.numeroLados = numeroLados;
    }

    // Método para apilar una figura de madera sobre otro juguete
    public void apilar(Juguete juguete) throws Exception {
        if (!(juguete instanceof FiguraMadera)) {
            throw new Exception("No se puede apilar un juguete no apilable sobre esta figura de madera.");
        }
        System.out.println("Se ha apilado " + juguete.getNombre() + " sobre " + this.getNombre());
    }

    @Override
    public void apilar(Juguete juguete) throws JugueteException {
        Apilable.super.apilar(juguete);
        System.out.println("Se han apilado el juguete " + juguete.getNombre() + " sobre el juguete " + this.getNombre());
    }
}