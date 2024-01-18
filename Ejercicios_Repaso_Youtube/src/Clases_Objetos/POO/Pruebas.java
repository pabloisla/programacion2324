package Clases_Objetos.POO;

public class Pruebas {
    public static void main(String[] args) {

        Empleado2 tr1 = new Empleado2("Pablo");

        Empleado2 tr2 = new Empleado2("Luis");

        tr1.cambiarSeccion("RRHH");

        System.out.println(tr1.devuelveDatos());
        System.out.println(tr2.devuelveDatos());


    }
}