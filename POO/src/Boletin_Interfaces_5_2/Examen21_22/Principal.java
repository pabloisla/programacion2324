package Boletin_Interfaces_5_2.Examen21_22;

import java.util.Random;

public class Principal {
    public static String[] main(String[] args) {

        Random r = new Random();

        Fichero fBinario = new FicheroBinario("Fichero Binario", generarArrayBytesRandom(r.nextInt(1, 30)));
        Fichero fAudio = new FicheroAudio("Fichero Audio", generarArrayBytesRandom(r.nextInt(1, 30)), r.nextInt());
        Fichero fVideo = new FicheroVideo("Fichero Video", generarArrayBytesRandom(r.nextInt(1, 30)), r.nextInt());
        Fichero fImagen = new FicheroImagen("Fichero Imagen", generarArrayBytesRandom(r.nextInt(1, 30)), TFormato.JPEG);
        Fichero fEjecutable = new FicheroEjecutable("Fichero Ejecutable", generarArrayBytesRandom(r.nextInt(1, 30)), r.nextInt());
        Fichero fTextoPlano = new FicheroTextoPlano("Fichero Texto Plano", generateRandomStringArray(r.nextInt(1, 30)));
        Fichero fTextoFormateado = new FicheroTextoFormateado("Fichero texto formateado", generateRandomStringArray(r.nextInt(1, 30)), "arial", 12, "rojo");

        Fichero[] ficheros = {fBinario, fAudio, fEjecutable, fImagen, fVideo, fTextoFormateado, fTextoPlano};

        for (int i = 0; i < ficheros.length; i++) {
            if (ficheros[i] instanceof Analizable) {
                ((Analizable) ficheros[i]).analizar();
            }
            if (ficheros[i] instanceof Convertible) {
                System.out.println(((Convertible) ficheros[i]).convertir());
            }
            if (ficheros[i] instanceof Representable) {
                ((Representable) ficheros[i]).representar();
            }
            if (ficheros[i] instanceof Reproducible) {
                ((Reproducible) ficheros[i]).reproducir();
            }
        }

        public static String[] generateRandomStringArray ( int size){
            String[] randomStrings = new String[size];
            Random random = new Random();
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            for (int i = 0; i < size; i++) {
                StringBuilder sb = new StringBuilder();
                int length = random.nextInt(10) + 1;
                for (int j = 0; j < length; j++) {
                    int index = random.nextInt(chars.length());
                    sb.append(chars.charAt(index));
                }
                randomStrings[i] = sb.toString();
            }
            return randomStrings;
        }
    }

    public static byte[] generarArrayBytesRandom(int size) {

        Random r = new Random();

        byte[] datos = new byte[size];

        r.nextBytes(datos);

        return datos;

    }
}