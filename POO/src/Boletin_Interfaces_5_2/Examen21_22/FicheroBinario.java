package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroBinario extends Fichero {

    private byte[] contenido;

    public FicheroBinario(String name, byte[] contenido) {
        super(name);
        this.contenido = contenido;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
