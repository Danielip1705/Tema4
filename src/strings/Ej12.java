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

		//Imprimimos en consola que escriba una frase
		System.out.println("Escriba una frase");

		//Escribimos frase
		frase = sc.nextLine();

		//Inicializamos el array a frase quitando los espacio
		separador = frase.split(" ");

		//Creamos bucle for para recorrer el array
		for (int i = 0; i < separador.length; i++) {

			//Declaramos con if que si comprobar es menor que el dato del array
			if (comprobar < separador[i].length()) {

				//Palabra se inicializa al dato del array
				palabra = separador[i];

				//Maximo se inicializa a la longitud de palabra
				maximo = separador[i].length();

			}

		}
		//Imprimos en pantalla la palabra mas larga
		System.out.println("Palabra mas larga: " + palabra);

		//Imprimimos el numero de caracteres de la palabra
		System.out.println("Numero caracteres: " + maximo);

		//Cerramos scanner
		sc.close();
	}

}
