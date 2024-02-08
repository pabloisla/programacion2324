package Boletin_Interfaces_5_2.Examen22_23.Clases;

public class PiezaLego extends JuguetePlastico{


    private int longitud;
    private String color;

    public PiezaLego(String nombre, String marca, double precio,int longitud, String color) throws JugueteException {
        super(nombre, marca, precio, TPlastico.ABS);
        this.color=color;
        this.longitud=longitud;
    }
}
