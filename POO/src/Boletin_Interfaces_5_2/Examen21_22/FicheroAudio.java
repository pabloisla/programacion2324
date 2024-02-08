package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroAudio extends Fichero implements Reproducible {

    private byte[] contenido;

    private int duracion;

    public FicheroAudio(String name, byte[] contenido, int duracion) {
        super(name);
        this.contenido = contenido;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public String reproducir() {
        return "Reproducible ";
    }
}
