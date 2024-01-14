package EjercicioAvion;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Deposito d = new Deposito(200000, 180000);
        Avion a = new Avion("Airbus", "A230", 13, d);

        a.addRevision(new Revision(LocalDateTime.of(2023, 10, 12, 22, 37), true, 6));


        System.out.println(a.puedeVolar(1500) ? "Puede recorrer esa distancia " : "No puede volar");

    }
}