package Clases_Objetos.POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado1 {

    public Empleado1(String nom, double sue, int agno, int mes, int dia) {

        nombre = nom;

        sueldo = sue;

        GregorianCalendar calendar = new GregorianCalendar(agno, mes - 1, dia);

        altaContrato = calendar.getTime();


    }

    public String dameNombre() { //getter
        return nombre;
    }

    public double dameSueldo() { //getter
        return sueldo;
    }

    public Date dameFecha() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) { //setter

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }

    private String nombre;

    private double sueldo;

    private Date altaContrato;

}
