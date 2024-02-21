package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		// Creamos Scanner
		Scanner sc = new Scanner(System.in);

		// Cremos con String frase e inicializamos a cadena vacia
		String frase = "";

		// Creamos array de Strings
		String[] resultado;

		// Cremos con la la variable int divisor
		int divisor;

		// Imprimimos en consola que escriba una palabra
		System.out.println("Escriba la palabra");

		// Escribimos frase
		frase = sc.nextLine();

		// Imprimimos en consola que escriba cuantas palabras se van a dividir
		System.out.println("¿En cuantas palabras quieres dividiar la frase?");

		// Escribimos divisor
		divisor = sc.nextInt();

		// Inicializamos resultado al resultado de dividirPalabra
		resultado = dividirPalabra(frase, divisor);

		// Imprimimos resultado
		System.out.println(Arrays.toString(resultado));

		// Cerramos scanner
		sc.close();
	}

	/***
	 * Funcion que divide las palabras en un array
	 * 
	 * @param frase   Cadena escrita por el usuario
	 * @param divisor Numero de caracteres que se van a dividir
	 * @return Array con la palabra dividida
	 */
	public static String[] dividirPalabra(String frase, int divisor) {

		// Cremamos Array de string e inicializamos con la longitud de divisor
		String[] palabras = new String[(int)Math.ceil((double)frase.length()/divisor)];
		

		// Creamos con la variable int n e incializamos a divisor
		int n = divisor;

		// Creamos con la variable int n e incializamos a 0
		int comienzo = 0;

		// Creamos bucle for para recorrer el array
		for (int i = 0; i < palabras.length; i++) {
			
			if(divisor*(i+1)>frase.length()){
				palabras[i]= frase.substring(divisor*i);
			} else {
				palabras[i]= frase.substring(divisor*i,divisor*(i+1));
			}
			
			// El 1º dato del array sera frase desde comienzo hasta n
			//palabras[i] = frase.substring(comienzo, n);

			// comiezo se suma divisor
			//comienzo += divisor;

			// n se suma a divisor
			//n += divisor;
		}
		// Devolmemos palabras
		return palabras;
	}
}
