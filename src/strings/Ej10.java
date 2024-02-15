package strings;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		// Creamos array con la variable char y asignamos los datos para la codificar
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos con la variable char comprobar y caracter para utilizarlo en la
		// codificacion
		char comprobar = ' ';
		char caracter = ' ';

		// Creamos con la clase String frase e inicializamos con cadena vacia
		String frase = "";

		// Creamos con la clase String comprobacion e inicializamos a vacio
		String comprobacion = "";

		// Imprimimos en consola que escriba la palabra a codificar
		System.out.println("Escribe que palabra quiere codificicar");

		// Escribimos frase
		frase = sc.nextLine().toLowerCase();

		// Creamos bucle for para recorrer la frase
		for (int i = 0; i < frase.length(); i++) {

			// Sacamos el caracter de frase dependiendo de la posicion de i
			comprobar = frase.charAt(i);

			// Caracter se inicializa al resultado de la funcion codifica
			caracter = codifica(conjunto1, conjunto2, comprobar);

			// Sumamos en comprobacion el caracter codificado
			comprobacion += caracter;

		}
		// Imprimimos la palabra codificada
		System.out.println("Palabra codificada: " + comprobacion);

	}

	/***
	 * Funcion que pasa una frase escrita por el usuario y la codifica segun
	 * conjunto1 y 2
	 * 
	 * @param conjunto1 Array que contiene una lista de caracteres para comparar con
	 *                  los caracteres de la frase
	 * @param conjunto2 Array que contiene una lista de caracteres para codificar
	 * @param c Caracter de la frase
	 * @return Caracter codificado (si es igual que conjunto1) o no
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		
		//Creamos con la variable char caracter e inicializamos a c
		char caracter = c;

		//Creamos for para recorrer el conjunto1
		for (int i = 0; i < conjunto1.length; i++) {
			
			//Declaramos con if que si el dato de conjunto1 es igual que c
			if (conjunto1[i] == c) {
				
				//caracter es igual que el el dato de conjunto2
				caracter = conjunto2[i];
				
				//nos salidmos del if
				break;
			}

		}
		//Devolvemos caracter
		return caracter;
	}

}
