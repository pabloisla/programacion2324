package Boletin_Interfaces_5_2.Examen22_23.Clases;

public class VehiculoPlastico extends JuguetePlastico {

    private int numRuedas;


    public VehiculoPlastico(String nombre, String marca, double precio, int numRuedas) {
        super(nombre, marca, precio, TPlastico.PVC);
        this.numRuedas = numRuedas;
    }
    public void setNumRuedas(int numRuedas) throws JugueteException{
        if(numRuedas < 1){
            throw new JugueteException("No tiene sentido tan pocas ruedas");
        }
        this.numRuedas = numRuedas;
    }
}
