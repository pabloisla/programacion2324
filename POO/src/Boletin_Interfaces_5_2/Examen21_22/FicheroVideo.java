package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroVideo extends Fichero implements Reproducible {

    private byte[] contenido;

    private int duracion;

    public FicheroVideo(String name, byte[] contenido, int duracion) {
        super(name);
        this.contenido = contenido;
        this.duracion = duracion;
    }
    public int getDuracion() {
        return duracion;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    @Override
    public String reproducir() {
        return "Reproduciendo: ";
    }
}
