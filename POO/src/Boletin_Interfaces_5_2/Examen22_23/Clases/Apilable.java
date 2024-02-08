package Boletin_Interfaces_5_2.Examen22_23.Clases;

public interface Apilable {
    public default void apilar(Juguete juguete) throws JugueteException {
        if (!(juguete instanceof Apilable)) {
            throw new JugueteException("El juguete no es apilable");
        }
        if (juguete.getClass() != this.getClass()) {
            throw new JugueteException("No puedo apilar un juguete de tipo " + juguete.getClass().getSimpleName() + " con un tipo de juguete diferente " + juguete.getClass().getSimpleName());
        }
    }
}
