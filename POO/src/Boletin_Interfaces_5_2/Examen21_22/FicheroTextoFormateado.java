package Boletin_Interfaces_5_2.Examen21_22;

public class FicheroTextoFormateado extends FicheroTexto implements Analizable {

    private String tipoFuente;

    private int tamanno;

    private String colorFuente;

    public FicheroTextoFormateado(String name, String[] parrafos, String tipoFuente, int tamanno, String colorFuente) {
        super(name, parrafos);
        this.tipoFuente = tipoFuente;
        this.tamanno = tamanno;
        this.colorFuente = colorFuente;
    }

    public String getTipoFuente() {
        return tipoFuente;
    }

    public int getTamanno() {
        return tamanno;
    }

    public String getColorFuente() {
        return colorFuente;
    }

    @Override
    public String analizar() {
        return "Analizable ";
    }
}
