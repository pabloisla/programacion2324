package Boletin_Interfaces_5_2.Examen22_23.Clases;

public class InstrumentoMadera extends JugueteMadera{
    private int edadMin;


    public InstrumentoMadera(String nombre, String marca, double precio, String origenMadera, int annoTalaMadera) {
        super(nombre, marca, precio, origenMadera, annoTalaMadera);
    }
    public int getEdadMinima() {
        return edadMin;
    }

    private void setEdadMinima(int edadMinima) throws JugueteException{
        if(edadMinima < 1){
            throw new JugueteException("Valor incorrecto, para la edad");
        }
        this.edadMin = edadMin;
    }
}
