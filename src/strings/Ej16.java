package strings;

import java.util.Random;
import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1: Escribe una palabra o frase:");
		String textoOriginal = sc.nextLine();

		String anagrama = desordenar(textoOriginal);
		System.out.println("Anagrama: " + anagrama);

		System.out.println("Jugador 2: ¿Cuál es el texto original?");
		String intento = sc.nextLine();
		int letrasCoincidentes = palabrasAcertadas(textoOriginal, intento);
		System.out.println("Número de letras coincidentes: " + letrasCoincidentes);

		// Verificar si el intento coincide con el texto original
		if (intento.equalsIgnoreCase(textoOriginal)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
	}

	public static String desordenar(String texto) {
		char[] caracteres = texto.toCharArray();
		String resultado;
		Random rand = new Random();

		// Desordenar los caracteres del texto
		for (int i = 0; i < caracteres.length; i++) {
			int indiceAleatorio = rand.nextInt(caracteres.length);
			char temp = caracteres[i];
			caracteres[i] = caracteres[indiceAleatorio];
			caracteres[indiceAleatorio] = temp;
		}

		resultado = String.valueOf(caracteres);
		return resultado;
	}

	public static int palabrasAcertadas(String texto1, String texto2) {
		int contador = 0;
		for (int i = 0; i < texto1.length(); i++) {
			if (texto2.toLowerCase().contains(String.valueOf(texto1.charAt(i)))) {
				contador++;
			}
		}
		return contador;
	}
}
