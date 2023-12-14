public class Biblioteca {

    public static final int NUM_MAX_USUARIOS = 2;

    public static final int NUM_MAX_LIBROS = 2;

    private String nombre;

    private Libro[] libros;

    private Usuario[] usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.usuarios = new Usuario[NUM_MAX_USUARIOS];
        this.libros = new Libro[NUM_MAX_LIBROS];
    }

    public void altaSocio(String nombre, String apellidos, String dni) throws BibliotecaExep {

        Usuario u = new Usuario(nombre, apellidos, dni);
        if(existeUsuario(u)){
            throw new BibliotecaExep("Este usuario ya existe con ese DNI");
        }
    }

    public boolean existeUsuario(Usuario u) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < usuarios.length && !usuarioEncontrado; i++) {
            if (u.equals(usuarios[i])) {
                usuarioEncontrado = true;
            }
        }
        return usuarioEncontrado;
    }
}