package strings;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		//Creacion de scanner
		Scanner sc = new Scanner(System.in);

		//Cremaos con la clase String frase e inicializamos a cadena vacia
		String frase = "";

		//Cremaos con la clase String anagrama e inicializamos a cadena vacia
		String anagrama = "";
		
		//Cremaos con la clase String intento e inicializamos a cadena vacia
		String intento = "";

		
		System.out.println("Jugador 1: Escribe una palabra:");

		frase = sc.nextLine();

		anagrama = desordenar(frase);

		System.out.println("Anagrama: " + anagrama);

		System.out.println("Jugador 2: ¿Cuál es el texto original?");

		intento = sc.nextLine();

		// Verificar si el intento coincide con el texto original
		if (intento.equalsIgnoreCase(frase)) {

			System.out.println("Correcto");

		} else {

			System.out.println("Incorrecto");
		}
		
		sc.close();
	}
	


	public static String desordenar(String texto) {

		char[] caracteres = texto.toCharArray();

		String resultado;

		Random rand = new Random();

		int aleatorio;

		char cambio;

		// Desordenar los caracteres del texto
		for (int i = 0; i < caracteres.length; i++) {

			aleatorio = rand.nextInt(caracteres.length);

			cambio = caracteres[i];

			caracteres[i] = caracteres[aleatorio];

			caracteres[aleatorio] = cambio;
		}

		resultado = String.valueOf(caracteres);

		return resultado;
	}

}
