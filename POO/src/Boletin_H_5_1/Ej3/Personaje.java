package Boletin_H_5_1.Ej3;

public class Personaje {

    public static final int MAX_STATS = 20;
    public static final int MIN_STATS = 0;
    public static final int MAX_PUNTOS_VIDA = 100;
    public static final int MIN_PUNTOS_VIDA = 0;
    private static final int MIN_INTELIGENCIA = 0;
    private static final int MAX_INTELIGENCIA = 20;

    private TRaza razas;
    private String nombre;
    private String raza;
    private int fuerza;
    private int inteligencia;
    private int puntosVidaMaximos;
    public int puntosVidaActuales;

    // Constructor
    public Personaje(String nombre, TRaza razas, int fuerza, int inteligencia, int puntosVidaMaximos) throws PersonajeException {
        this.nombre = nombre;
        this.razas = razas;
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setPuntosVidaMaximos(puntosVidaMaximos);
        setPuntosVidaActuales(puntosVidaMaximos);
    }

    // Métodos get y set para todos los atributos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        // Comparamos si la fuerza
        if (fuerza < MIN_STATS == fuerza > MAX_STATS) {
            throw new PersonajeException("Valor de fuerza no permitido");
        }
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < MIN_INTELIGENCIA == inteligencia > MAX_INTELIGENCIA) {
            throw new PersonajeException("Valor de inteligencia no permitido");
        }
        this.inteligencia = inteligencia;
    }

    public int getPuntosVidaMaximos() {
        return puntosVidaMaximos;
    }

    public void setPuntosVidaMaximos(int puntosVidaMaximos) throws PersonajeException {
        if (puntosVidaMaximos < MIN_PUNTOS_VIDA == puntosVidaMaximos > MAX_PUNTOS_VIDA) {
            throw new PersonajeException("Valor de vidaMaxima no permitido");
        }
        this.puntosVidaMaximos = puntosVidaMaximos;
    }

    public int getPuntosVidaActuales() {
        return puntosVidaActuales;
    }

    public void setPuntosVidaActuales(int puntosVidaActuales) throws PersonajeException {
        if (puntosVidaActuales < MIN_PUNTOS_VIDA == puntosVidaActuales > puntosVidaMaximos) {
            throw new PersonajeException("Valor de vida actual no permitido");
        }
        this.puntosVidaActuales = puntosVidaActuales;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Fuerza: " + fuerza +
                ", Inteligencia: " + inteligencia + ", Puntos de Vida: " + puntosVidaActuales + "/" + puntosVidaMaximos;
    }
}