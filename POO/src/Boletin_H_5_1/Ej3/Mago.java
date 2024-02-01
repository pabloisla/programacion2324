package Boletin_H_5_1.Ej3;

import java.util.Arrays;

public class Mago extends Personaje {

    public static final int NUM_HECHIZOS = 4;
    public static final int INT_MIN_MAGO = 17;
    public static final int FUERZA_MAX_MAGO = 15;
    private String[] hechizos;

    // Constructor
    public Mago(String nombre, TRaza razas, int fuerza, int inteligencia, int puntosVidaMaximos, String[] hechizos) throws PersonajeException {
        super(nombre, razas, fuerza, inteligencia, puntosVidaMaximos);
        this.hechizos = new String[NUM_HECHIZOS];
    }

    //SETTERS
    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > FUERZA_MAX_MAGO) {
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < INT_MIN_MAGO) {
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        super.setInteligencia(inteligencia);
    }

    // Método para aprender hechizo - 2
    public void aprendeHechizo(String hechizo) throws PersonajeException {
        boolean loTengo = false;
        int posVacia = -1;

        for (int i = 0; i < hechizos.length && !loTengo; i++) {
            if (hechizo.equals(hechizos[i])) {
                loTengo = true;
            }
            if (hechizos[1] == null && posVacia == -1) {
                posVacia = i;
            }
            if (loTengo) {
                throw new PersonajeException("Ya el mago no puede aprender dos veces el mismo hechizo");
            }
            if (posVacia == -1) {
                throw new PersonajeException("No hay más espacio para aprender mas hechizos");
            }
            hechizos[posVacia] = hechizo;
        }
    }

    // Método para aprender hechizo
    /*public void aprendeHechizo(String hechizo) {
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] == null) {
                hechizos[i] = hechizo;
                return; // Salir del método después de añadir el hechizo
            }
        }
        // Si no hay hueco libre en el array
        System.out.println("No se pueden aprender más hechizos.");
    }*/

    // Método para lanzar hechizo
    public void lanzaHechizo(Personaje objetivo, String hechizo) throws PersonajeException {

        int posHechizo = -1;

        for (int i = 0; i < hechizos.length && posHechizo == -1; i++) {
            if (hechizo.equals(hechizos[i])) {
                posHechizo = i;
            }
        }
        if (posHechizo == -1) {
            throw new PersonajeException("El mago no conoce el hechizo");
        }

        if (this == objetivo){
            throw new PersonajeException("No puedes mandarte un hechizo a ti mismo");
        }
        if (objetivo.getPuntosVidaActuales()==0){
            throw new PersonajeException("El personaje esta muerto");

        }
        /*
        // Restar 10 de puntos de vida al objetivo
        objetivo.puntosVidaActuales -= 10;

        // Olvidar el hechizo (eliminarlo del array)
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] != null && hechizos[i].equals(hechizo)) {
                hechizos[i] = null;
                return; // Salir del método después de olvidar el hechizo
            }
        }*/
    }

    // Reescribir el método toString para mostrar la lista de hechizos
    @Override
    public String toString() {
        return super.toString() + ", Hechizos: " + Arrays.toString(hechizos);
    }
}