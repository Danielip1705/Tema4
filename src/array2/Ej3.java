package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos con la variable int fin
		int fin;

		// Creamos con la variable int longitud
		int longitud;

		// Creamos array con la variable int
		int lista[];
		
		int resultado[];

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos en consola que nos indique la longitud
		System.out.println("Indica la longitud");

		// Insertamos la longitud
		longitud = sc.nextInt();

		// Indicamos que la longitud de lista es el valor de longitud
		lista = new int[longitud];

		// imprimimos en consola que nos indique el fin del relleno
		System.out.println("Indica que numero del relleno es el limite");
		
		fin = sc.nextInt();
		
		System.out.println(Arrays.toString(Ej3.rellenaPares(longitud, fin)));
	}

	public static int[] rellenaPares(int longitud, int fin) {
		
		int j[] = new int[longitud];

		for (int i = 0; i < j.length; i++) {

			while (j[i] % 2 != 0) {
				j[i] = (int) (Math.random() * fin + 2);
			}
		}

		return j;
	}

}
