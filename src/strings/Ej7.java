package strings;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Con la clase String creamos frase e inicializamos con una cadena vacia
		String frase = "";

		// Creamos con la variable int resultado
		int resultado;

		// Con la clase String creamos palabrass e incializamos con una cadena vacia
		String palabra = "";

		// Imprimimos en consola que escriba una frase
		System.out.println("Escriba una frase");

		// Escribimos frase
		frase = sc.nextLine();

		System.out.println("Escriba que palabra quieres buscar de la frase");

		// Escribimos palabra
		palabra = sc.nextLine();

		// A resultado le ponemos de valor el la funcion buscarPalabra
		resultado = buscarPalabra(frase, palabra);

		// Imprimimos el resultado
		System.out.println("En la frase contiene " + resultado + " veces la palabra " + palabra);
	}

	/**
	 * Funcion que busca la el contenido de la variable palabra dentro de la
	 * variable frase
	 * 
	 * @param frase   Cadena que contine una frase extensa
	 * @param palabra Cadena que contiene una palabra a buscar
	 * @return Numero entero de la veces que se ha encontrado la variable palabra en
	 *         la variable frase
	 */
	public static int buscarPalabra(String frase, String palabra) {

		// Creamos con la variable int contador e inicializamos a 0
		int contador = 0;

		// Creamos array con la clase String que se inicializa con la funcino split de
		// la variable frase
		String[] comprobacion = frase.split(" ");

		//Creamos bucle for para recorrer el array comprobacion
		for (int i = 0; i < comprobacion.length; i++) {
			
			//Declaramos con if que si el dato de comprobacion es igual que palabra
			if (comprobacion[i].equals(palabra)) {
				
				//Contador incrementa
				contador++;
			}
		}
		//Devolvemos contador
		return contador;

	}

}
