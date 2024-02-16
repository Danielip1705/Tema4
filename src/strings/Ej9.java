package strings;

import java.util.Scanner;

public class Ej9 {
//Javalín, javalón\t
///tjavalén, len, len
	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Creamos con String frase
		String frase;

		// Creamos con String resultado
		String resultado;

		// Creamos con boolean esJavalandia
		boolean esJavalandia;

		// Imprimimos en consola traductor y que escriba una frase
		System.out.println("Traductor de Javalandia");
		System.out.println("Inserte frase que quiera traducir");

		// Escribimos frase
		frase = sc.nextLine();

		esJavalandia = esJavalandia(frase);

		// Declaramos con if que si esjavalandia es true
		if (esJavalandia) {

			// Imprima en pantalla que el idioma insertado es de javalandia y que lo va a
			// traducir
			System.out.println("El idioma es de javalandia");
			System.out.println("Traduciendo...");

			// Inicializamos reesultado al resultado de la funcion traducido
			resultado = traducido(frase);

			// Imprimimos resultado
			System.out.println(resultado);

			// Y si no
		} else {

			// Imprimimos que el idioma actual no es de javalandia
			System.out.println("El idioma actual no es de javalandia");
		}

		// Cerramos scanner
		sc.close();
	}

	/***
	 * Funcion que devuelve booleano si la frase tiene el dialecto de javalandia
	 * 
	 * @param frase Cadena insertada por el usuario
	 * @return True o false
	 */
	public static boolean esJavalandia(String frase) {

		// Creamos la variable esJavalandia e inicializamos a false
		boolean esJavalandia = false;

		// Declaramos con if que si frase empieza con Javalín, javalón o termina con
		// javalén, len, len(quitando el espacio con .trim)
		if (frase.startsWith("Javalín, javalón".trim()) || frase.endsWith("javalén, len, len".trim())) {

			// Javalandia es true
			esJavalandia = true;

		}
		// Devolvemos javalandia
		return esJavalandia;
	}

	/***
	 * Funcion que devulelve la frase eliminado el dialecto de javalandia
	 * 
	 * @param frase Cadena introduzida por el usuario
	 * @return Cadena sin el dialecto de Javalandia
	 */
	public static String traducido(String frase) {

		// Creamos con String Traducido e inicializamos con cadena vacia
		String traducido = "";

		// Declaramos con if que si la frase empieza con Javalín, javalón
		if (frase.startsWith("Javalín, javalón")) {

			// Que traducido se inicialice a frase quitando Javalín, javalón
			traducido = frase.substring("Javalín, javalón".length()).trim();

			// y si no
		} else {

			// Que traducido se inicialice a frase quitando Javalín, javalén, len, len
			traducido = frase.substring(0, frase.length() - "javalén, len, len".length()).trim();
		}

		// Devolvemos traducido
		return traducido;
	}
}
