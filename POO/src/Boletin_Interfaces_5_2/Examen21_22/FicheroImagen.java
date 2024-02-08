package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroImagen extends Fichero {

    private byte[] contenido;

    private TFormato formato;

    public FicheroImagen(String name, byte[] contenido, TFormato formato) {
        super(name);
        this.contenido = contenido;
        this.formato = formato;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }
}
