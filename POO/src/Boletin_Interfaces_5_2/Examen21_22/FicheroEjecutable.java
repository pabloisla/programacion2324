package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroEjecutable extends Fichero {

    private byte[] contenido;

    private int permisos;

    public FicheroEjecutable(String name, byte[] contenido, int permisos) {
        super(name);
        this.contenido = contenido;
        this.permisos = permisos;
    }

    public int getPermisos() {
        return permisos;
    }

    @Override
    public long getSize() {
        return contenido.length;
    }
}

