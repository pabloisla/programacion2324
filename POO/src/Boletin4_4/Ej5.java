package Boletin4_4;

public class Ej5 {

	public static void main(String[] args) {
		String frase = "El lenguaje Java es un lenguaje orientado a objetos";
		String textoABuscar = "lenguaje";
		String textoAReemplazar = "lenguaje de programaci�n";
		// frase = "El lenguaje de programaci�n Java es un lenguaje de programaci�n orientado a objetos";
		
		StringBuilder sb = new StringBuilder(frase);
		
		int pos = sb.indexOf(textoABuscar);
		
		while (pos != -1) {
			sb.replace(pos, pos + textoABuscar.length(), textoAReemplazar);
			// Volver a buscar la subcadena en la nueva cadena
			// Pero no a partir del principio, sino a partir
			// del �ltimo reemplazo
			pos = sb.indexOf(textoABuscar, pos + textoAReemplazar.length());
		}
		
		System.out.println(sb);

	}

}
