package Clases_Objetos.POO;

public class Uso_Empleado {
    public static void main(String[] args) {

       /* Empleado1 empleado1 = new Empleado1("Pablo Gey", 85000, 2000, 10, 23);

        empleado1.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.dameFecha());
       */

        Empleado1[] misEmpleados = new Empleado1[1];

        misEmpleados[0] = new Empleado1("Pablo Gey", 50000, 1995, 12, 23);

        /* for (int i = 0; i < 1; i++) {

            misEmpleados[i].subeSueldo(5);

        }*/

        for (Empleado1 e : misEmpleados) { // for mejorado (for each)

            e.subeSueldo(5);
        }

        /*for (int i = 0; i < 1; i++) {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre()
            + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de Alta: " + misEmpleados[i].dameFecha());
        }*/

        for (Empleado1 e : misEmpleados) {
            System.out.println("Nombre: " + e.dameNombre()
                    + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + e.dameFecha());
        }
    }
}