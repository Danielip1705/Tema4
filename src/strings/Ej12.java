package strings;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);
		// Creamos con String frase con una frase inicializada
		String frase = "";

		String[] separador;
		// Creamos con la clase String una cadena vacia
		String palabra = "";

		// Creamos con la variable int comprobar e incializamos a 0
		int comprobar = 0;

		// Cremaos con la variable int maximo e inizializamos
		int maximo = 0;

		System.out.println("Escriba una frase");

		frase = sc.nextLine();

		separador = frase.split(" ");

		for (int i = 0; i < separador.length; i++) {


			if (comprobar < separador[i].length()) {

				palabra = separador[i];
				
			}
			
			
		}
		System.out.println("Palabra mas larga: " + palabra);

		System.out.println("Numero caracteres: " + maximo);

	}

}
