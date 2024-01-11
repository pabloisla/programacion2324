package Boletin4_4;

public class Ej7_2 {
    public static void main(String[] args) {
        System.out.println(desordenarCadena2("curso de programacion"));
    }

        public static String desordenarCadena2(String cadena) {
            StringBuilder frase = new StringBuilder(cadena.toLowerCase().replaceAll("\\s+", ""));
            int cont = 0;
            for (int i = 0; cont < frase.length(); i++) {
                switch (frase.charAt(i)) {
                    case 'a':
                    case 'i':
                    case 'e':
                    case 'o':
                    case 'u':
                        frase.append(frase.charAt(i));
                        frase.deleteCharAt(i);
                        i--;
                }
                cont++;
            }
            return frase.toString();
        }
}