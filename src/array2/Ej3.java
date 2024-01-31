package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos con la variable int fin
		int fin;

		// Creamos con la variable int longitud
		int longitud;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos en consola que nos indique la longitud
		System.out.println("Indica la longitud");

		// Insertamos la longitud
		longitud = sc.nextInt();

		// imprimimos en consola que nos indique el fin del relleno
		System.out.println("Indica que numero del relleno es el limite");

		// escribimos fin
		fin = sc.nextInt();

		// imprimimos en pantalla con la clase array.toString el resultado de la funcion
		// rellenaPares
		System.out.println(Arrays.toString(Ej3.rellenaPares(longitud, fin)));

		// Cerramos scanner
		sc.close();
	}

	// creamos funcion que devuelva un array entero y con 2 parametros de entrada
	public static int[] rellenaPares(int longitud, int fin) {

		// creamos array con la variable int y su longitud sera el resultado del
		// parametro longitud
		int j[] = new int[longitud];

		// creamos bucle for que recorra todo el array para añadirle los datos
		for (int i = 0; i < j.length; i++) {

			// rellenamos cada dato con un numero aleatorio entre el 2 y fin
			j[i] = (int) (Math.random() * (fin - 1) + 2);

			// creamos bucle while haciendo que si el dato no es par, que le de otro numero
			// aleatorio entre el 2 y el fin. Hasta que sea par
			while (j[i] % 2 != 0) {

				// rellenamos cada dato con un numero aleatorio entre el 2 y fin
				j[i] = (int) (Math.random() * fin + 2);
			}
		}
		// devolvemos el array j
		return j;
	}

}
