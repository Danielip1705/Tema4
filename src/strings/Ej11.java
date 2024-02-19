package strings;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		//Creamos scanner
		Scanner sc= new Scanner(System.in);
		
		// Creamos array con la variable char y asignamos los datos para la codificar
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Creamos con la variable char comprobar y caracter para utilizarlo en la
		// codificacion
		char comprobar = ' ';
		char caracter = ' ';

		//Creamos con la clase String codificada y comprobacion e inicializamos con cadena vacia
		String codificada = "";
		String comprobacion = "";

		//Imprimios en consola que escriba la frase decodificada
		System.out.println("Escriba la frase que quieras decodificar");
		
		//Escribimos la frase codificada
		codificada = sc.nextLine();
		
		//Creamos array para leer la frase
		for (int i = 0; i < codificada.length(); i++) {
			
			// Sacamos el caracter de frase dependiendo de la posicion de i
			comprobar = codificada.charAt(i);

			// Caracter se inicializa al resultado de la funcion codifica
			caracter = decodificar(conjunto1, conjunto2, comprobar);

			// Sumamos en comprobacion el caracter codificado
			comprobacion += caracter;
		}

		// Imprimimos la palabra codificada
		System.out.println("Palabra codificada: " + comprobacion);

	}

	/***
	 * Funcion que decodifica una palabra siguiendo los caracteres de conjunto1 y
	 * conjunto2
	 * @param conjunto1 Array que contiene una lista de caracteres para comparar con
	 *              los caracteres de la frase
	 * @param conjunto2 Array que contiene una lista de caracteres para codificar
	 * @param c Caracter de la frase
	 * @return Caracter descodificado
	 */
	public static char decodificar(char conjunto1[], char conjunto2[], char c) {

		// Creamos con la variable char caracter e inicializamos a c
		char caracter = c;

		// Creamos for para recorrer el conjunto1
		for (int i = 0; i < conjunto1.length; i++) {

			// Declaramos con if que si el dato de conjunto2 es igual que c
			if (conjunto2[i] == c) {

				// caracter es igual que a la posicion del dato de conjunto1
				caracter = conjunto1[i];

				// nos salidmos del if
				break;
			}

		}
		// Devolvemos caracter
		return caracter;
	}
}
