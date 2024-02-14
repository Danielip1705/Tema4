package strings;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Con la clase String creamos frase e inicializamos con cadena vacia
		String frase = "";

		// Con la clase String creamos concatenacion e inicializamos con cadena vacia
		String concatenacion = "";

		// Imprimimos en consola que inserte palabras
		System.out.println("Inserte palabras, para salir escribe [fin]");

		// Escribimos frase
		frase = sc.nextLine();

		// Creamos bucle while y para que salga del bucle frase tiene que sesr igual que
		// fin
		while (!frase.equalsIgnoreCase("fin")) {

			// Concatenacion se suma con frase y espacio
			concatenacion += frase + " ";

			// Imprimimos de nuevo en consola que inserte algunas palabras
			System.out.println("Inserte algunas palabras");

			// Escribimos frase
			frase = sc.nextLine();

		}

		// Imprimos concatenacion
		System.out.println(concatenacion);

		// Cerramos scanner
		sc.close();

	}

}
