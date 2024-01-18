package Clases_Objetos.POO;


public class Uso_Coche {

    public static void main(String[] args) {

        Coche Audi = new Coche(); // Instanciar una clase. Ejemplar de clase

        System.out.println(Audi.dime_Datos());

        Audi.colorCoche("verde");

        System.out.println(Audi.dime_Color());

        Audi.conf_asiento("si");

        System.out.println(Audi.dime_asientos());

        Audi.conf_climatizador("no");

        System.out.println(Audi.dime_climatizador());

        System.out.println(Audi.dime_peso_coche());

        System.out.println("El precio del coche es: " + Audi.precio_coche());

    }

}
