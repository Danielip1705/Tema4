package strings;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Creamos con String frase e inicializamos a cadena vacia
		String frase = "";

		// Imprimimos en consola que escriba una frase para pasarlo a camel
		System.out.println("Escribe una frase para pasarlo a camel");

		// Escribimos frase
		frase = sc.nextLine();

		// Inicializamos frase al resultado de la funcion pasarCamel
		frase = pasarCamel(frase);

		// Imprimimos en consola que se esta pasando a nomenclatura camel
		System.out.println("Pasando a nomenclatura Camel...");

		// Imprimimos en consola frase
		System.out.println(frase);

		// Cerramos scanner
		sc.close();

	}

	/***
	 * Funcion que convierte una cadena con minusculas y mayusculas a nomenclatura
	 * camel (estoEsCamel)
	 * 
	 * @param frase Cadena escrita por el usuario que contiene mayusculas y
	 *              minusculas
	 * @return Cadena sin espacio y con la nomenclatura camel
	 */
	public static String pasarCamel(String frase) {
		
		// Cremaos Array de string e inicializamos a frase sin los espacios utilizando
		// .split
		String[] pasar = frase.trim().split(" ");

		// Creamos con String camel e inicializamos a cadena vacia
		String camel = "";

		// Creamos bucle for y leemos el array para modificarlo
		for (int i = 0; i < pasar.length; i++) {

			// si estamos en el primer bucle(i=0)
			if (i < 1) {

				// pasamos camel a minusculas
				camel = pasar[i].toLowerCase();
			}

			// Declaramos con if que si estamos en el 1 o mayor bucle
			if (i >= 1 ) {

				// camel se inicializa la palabra con el 1º caracter en mayusculas
				camel += pasar[i].substring(0, 1).toUpperCase();

				// Sumamos camel con el resto de caracteres a minusculas
				camel += pasar[i].substring(1, pasar[i].length()).toLowerCase();
			}
		}
		// Devolvemos camel
		return camel;
	}

}
