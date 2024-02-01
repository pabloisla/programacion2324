package Boletin_H_5_1.Ej3;

public class Clerigo extends Personaje {
    private String dios;

    public static final int INT_MIN_CLE = 12;
    public static final int FUERZA_MAX_CLE = 18;
    // Constructor

    public Clerigo(String nombre, TRaza razas, int fuerza, int inteligencia, int puntosVidaMaximos, String dios) throws PersonajeException {
        super(nombre, razas, fuerza, inteligencia, puntosVidaMaximos);
        this.dios = dios;
    }

    // Método para curar
    public void curar(Personaje objetivo) {
        objetivo.puntosVidaActuales += 10;
    }

    // Reescribir el método toString para mostrar el nombre del dios
    @Override
    public String toString() {
        return super.toString() + ", Dios: " + dios;
    }
}