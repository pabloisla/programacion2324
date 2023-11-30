package EjercicioAvion;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Avion {

    public static final int NUM_MAX_REVISIONES = 10;
    private String marca;

    private String modelo;

    private double consumo;

    private Deposito deposito;

    private Revision[] revisiones;

    public Avion(String marca, String modelo, double consumo, Deposito deposito, Revision revision, Revision[] revisiones, Revision[] revisiones1) {

        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = deposito;
        this.revisiones = new Revision[NUM_MAX_REVISIONES];
    }

    public void addRevision(Revision revision) {
        for (int i = 0; i < NUM_MAX_REVISIONES; i++) {
            if (revisiones[i] == null) {
                this.revisiones[i] = revision;
                break;
            }
        }
    }

    public Revision getUltimaRevision() {
        for (int i = NUM_MAX_REVISIONES - 1; i >= 0; i--) {
            if (revisiones[i] != null) {
                return revisiones[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", deposito=" + deposito +
                ", revisiones=" + Arrays.toString(revisiones) + getUltimaRevision();
    }
}