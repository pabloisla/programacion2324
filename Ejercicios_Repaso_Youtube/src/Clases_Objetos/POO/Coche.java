package Clases_Objetos.POO;

public class Coche {

    //Atributos
    //Encapsular
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private String color;

    private int peso_plataforma;

    private int peso_total;

    private boolean asientos_cuero, climatizador;

    // Método constructor

    public Coche() {

        ruedas = 4;

        largo = 2000;

        ancho = 300;

        motor = 1600;

        peso_plataforma = 500;


    }

    public String dime_Datos() { // Getters: Devolver el valor de las propiedades de los objetos
        return "La plataforma del vehiculo tiene: " + ruedas + " ruedas" +
                ". Mide " + largo / 1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + peso_plataforma + " kg";

    }

    public void colorCoche(String color_coche) { // Setters: Modificar el valor de las propiedades de los objetos

        color = color_coche;
    }

    public String dime_Color() { // GETTER
        return "El color del coche es " + color;
    }

    public void conf_asiento(String asientos_cuero) { // SETTER
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;

        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() { // GETTER
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";

        } else {
            return "El coche tiene asientos de serie";
        }

    }

    public void conf_climatizador(String climatizador) { // SETTER
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String dime_climatizador() { //GETTER
        if (climatizador == true) {
            return "El coche tiene climatizador";
        } else {
            return "El coche lleva aire acondicionado";
        }
    }

    public String dime_peso_coche() { // Setter + Getter

        int peso_carroceria = 500;

        peso_total = peso_plataforma + peso_carroceria;

        if (asientos_cuero == true) {
            peso_total = peso_total + 50;

        }
        if (climatizador == true) {

            peso_total = peso_total + 20;
        }

        return "El peso total de mi coche es igual " + peso_total + " kg";
    }

    public int precio_coche() { // Getter
        int precio_final = 10000;

        if (asientos_cuero == true) {
            precio_final += 2000;
        }
        if (climatizador == true) {
            precio_final += 1500;
        }
        return precio_final;
    }

}
