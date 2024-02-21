package strings;

import java.util.Random;
import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		//Creamos Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos variables para almacenar la frase original, el anagrama, el
		// intento del jugador 2
		String frase = "";
		String anagrama = "";
		String intento = "";

		// Creamos con la variable int letrasCoincidentes e inicializamos a 0
		int letrasCoincidentes = 0;

		// Solicitamos al jugador 1 que ingrese una palabra o frase
		System.out.println("Jugador 1: Escribe una palabra o frase:");
		
		// Leemos la entrada del usuario y la almacenamos en la variable frase
		frase = sc.nextLine();

		// Generamos un anagrama desordenando la frase original utilizando el método
		// desordenar
		anagrama = desordenar(frase);
		
		// Imprimimos el anagrama generado
		System.out.println("Anagrama: " + anagrama);

		// Solicitamos al jugador 2 que ingrese el texto original
		System.out.println("Jugador 2: ¿Cuál es el texto original?");
		
		// Leemos la entrada del usuario y la convertimos a minúsculas para evitar
		// problemas de distinción entre mayúsculas y minúsculas
		intento = sc.nextLine().toLowerCase();

		// Contamos el número de letras coincidentes entre la frase original y el
		// intento del jugador 2
		letrasCoincidentes = palabrasAcertadas(frase, intento);
		
		// Imprimimos el número de letras coincidentes
		System.out.println("Número de letras coincidentes: " + letrasCoincidentes);

		// Verificamos si el intento coincide exactamente con la frase original e
		// imprimimos un mensaje correspondiente
		if (intento.equalsIgnoreCase(frase)) {
			
			System.out.println("Correcto");
			
		} else {
			
			System.out.println("Incorrecto");
		}
		
		//Cerramos scanner
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

		// Cremaos con la clase String resultado
		String resultado;

		// Creamos Random
		Random rand = new Random();

		// Creamos con la variable int aleatorio
		int aleatorio;

		// Creamos con char cambio
		char cambio;

		// Desordenamos los caracteres del texto
		for (int i = 0; i < caracteres.length; i++) {
			// Generamos un índice aleatorio para intercambiar caracteres
			aleatorio = rand.nextInt(caracteres.length);

			// Intercambiamos los caracteres en las posiciones i y aleatorio
			cambio = caracteres[i];
			caracteres[i] = caracteres[aleatorio];
			caracteres[aleatorio] = cambio;
		}

		// Convertimos el arreglo de caracteres de nuevo a una cadena de caracteres

		resultado = String.valueOf(caracteres);
		// Devolvemos resultado
		return resultado;
	}

	/***
	 * Funcion que nos indica cuantos caracteres hemos acertado
	 * @param texto1 Cadena a acertar
	 * @param texto2 Cadena a comprobar
	 * @return Numero entero de veces acertados
	 */
	public static int palabrasAcertadas(String texto1, String texto2) {
		// Inicializamos un contador para almacenar el número de letras coincidentes
		int contador = 0;

		// Recorremos cada letra del texto1
		for (int i = 0; i < texto1.length(); i++) {

			// Verificamos si el texto2 contiene la letra actual de texto1
			if (texto2.contains(String.valueOf(texto1.charAt(i)))) {

				// Incrementamos el contador si la letra está presente en texto2
				contador++;
			}
		}
		// Devolvemos contador
		return contador;

	}

}
