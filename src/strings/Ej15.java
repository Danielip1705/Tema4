package strings;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Declaración e inicialización de Strings
		String frase = "";
		String anagrama = "";
		String intento = "";

		// Solicitamos al jugador 1 que escriba una palabra
		System.out.println("Jugador 1: Escribe una palabra:");
		
		// Leemos la palabra ingresada por el jugador 1 y la almacenamos en la variable
		// frase
		frase = sc.nextLine();

		// Generamos un anagrama desordenando la palabra original utilizando el método
		// desordenar
		anagrama = desordenar(frase);
		
		// Imprimimos el anagrama generado
		System.out.println("Anagrama: " + anagrama);

		// Solicitamos al jugador 2 que ingrese el texto original
		System.out.println("Jugador 2: ¿Cuál es el texto original?");
		
		// Leemos el intento del jugador 2 y lo almacenamos en la variable intento
		intento = sc.nextLine();

		// Verificamos si el intento del jugador 2 coincide con la palabra original
		if (intento.equalsIgnoreCase(frase)) {
			
			// Imprimimos "Correcto" si coincide
			System.out.println("Correcto"); 
		} else {
			// Imprimimos "Incorrecto" si no coincide
			System.out.println("Incorrecto"); 
		}

		// Cerramos Scanner
		sc.close();
	}

	/***
	 * Funcion para desordenar una cadena
	 * 
	 * @param texto Cadena escrita por el usuario
	 * @return Cadena desordenada
	 */
	public static String desordenar(String texto) {
		// Convertimos la cadena de caracteres en un arreglo de caracteres
		char[] caracteres = texto.toCharArray();
		String resultado;
		Random rand = new Random();
		int aleatorio;
		char cambio;

		// Desordenamos los caracteres del texto
		for (int i = 0; i < caracteres.length; i++) {
			aleatorio = rand.nextInt(caracteres.length);
			cambio = caracteres[i];
			caracteres[i] = caracteres[aleatorio];
			caracteres[aleatorio] = cambio;
		}

		// Convertimos el arreglo de caracteres de nuevo a una cadena de caracteres
		resultado = String.valueOf(caracteres);
		// Devolvemos el texto desordenado
		return resultado;
	}
}
