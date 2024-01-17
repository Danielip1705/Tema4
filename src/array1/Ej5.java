
package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos con la variable int puntuaciones
		int puntuaciones;

		// creamos lista con la variable int y con longitud 8
		int lista[] = new int[8];

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// creamos bucle for para que lea el lista
		for (int i = 0; i < lista.length; i++) {

			// Imprimimos en consola que inserte las calificaciones
			System.out.println("Inserte las puntuaciones");

			// escribimos el dato en el lista
			lista[i] = sc.nextInt();
		}
		//imprimimos el array en consola
		System.out.println(Arrays.toString(lista));
		
		//Cerramos el scanner
		sc.close();
	}

}

