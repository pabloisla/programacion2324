package Boletin_Interfaces_5_2.Examen21_22;

import java.time.LocalDateTime;

public abstract class Fichero {
    private String name;

    private LocalDateTime deteCreation;

    public Fichero(String name) {
        this.name = name;
        this.deteCreation = LocalDateTime.now();
    }
    public abstract long getSize();
}
