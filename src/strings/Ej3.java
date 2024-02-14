package strings;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		// Creamos con la clase String frase donde tendra una frase inicializado
		String frase = "";
		
		//Imprimimos en consola que es escriba una frase
		System.out.println("Escriba una frase");
		
		//Escribimos la frase
		frase= sc.nextLine();

		// Creamos con la variable int espacios que estara inicializado al resultado de
		// la funcion contarEspacios
		int espacios = contarEspacios(frase);

		// Imprimimos en el numero de caracteres
		System.out.println("Numero de espacios en la frase: " + espacios);
		
		//Cerramos scanner
		sc.close();
	}

	/**
	 * Funcion que recorre una cadena y cuenta los espacios que contiene
	 * @param frase Cadena escrita por el usuario
	 * @return Numero entero que contiene cuantos espacios tiene la frase
	 */
	public static int contarEspacios(String frase) {

		// Creamos con la variable int espacios e inicializamos a 0
		int espacios = 0;

		// Creamos bucle for para que recorra la frase
		for (int i = 0; i < frase.length(); i++) {

			// Declaramos con if que si comprobacion es igual a espacio
			if (frase.charAt(i) == ' ') {

				// Espacios se incrementa
				espacios++;
			}

		}

		// Devolvemos espacios
		return espacios;
	}
}
