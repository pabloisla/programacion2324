package Boletin_Interfaces_5_2.Examen21_22;

public abstract class FicheroTexto extends Fichero implements Convertible {

    private String[] parrafos;

    public FicheroTexto(String name, String[] parrafos) {
        super(name);
        this.parrafos = parrafos;
    }

    public String[] getParrafos() {
        return parrafos;
    }

    // Cada caracter ocupa un byte
    @Override
    public long getSize() {
        long acumulador = 0;
        for (int i = 0; i < parrafos.length; i++) {
            acumulador += parrafos[i] == null ? 0 : parrafos[i].length();
        }
        return acumulador;
    }

    @Override
    public String convertir() {

        StringBuilder guardar = new StringBuilder();

        for (int i = 0; i < parrafos.length; i++) {
            if (parrafos[i] != null) {
                guardar.append(parrafos[i]);
            }
        }
        return guardar.toString();
    }

    public abstract void representar();
}