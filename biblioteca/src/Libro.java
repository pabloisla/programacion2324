import java.util.Objects;

public class Libro {
    private String nombre;
    private String autor;
    private String sinopsis;
    public int ejemplaresTotales;
    public int ejemplaresDisponibles;

    public Libro(String nombre, String autor, String sinopsis, int ejemplaresTotales) {
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.ejemplaresTotales = ejemplaresTotales;
        this.ejemplaresDisponibles = ejemplaresTotales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(nombre, libro.nombre) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public void prestar() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--;
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo.");
        }
    }

    public void devolver() {
        if (ejemplaresDisponibles < ejemplaresTotales) {
            ejemplaresDisponibles++;
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("Todos los ejemplares están disponibles. No se puede devolver más.");
        }
    }

    public int getEjemplaresTotales() {
        return ejemplaresTotales;
    }

    public void setEjemplaresTotales(int ejemplaresTotales) {
        this.ejemplaresTotales = ejemplaresTotales;
    }
}
