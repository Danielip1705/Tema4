package array;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos un array con la variable int y con longitud 10
		int lista[] = new int[10];
		// Creamos con la variable int max y lo inicializamos a la 1º posicion del array
		int max = Integer.MIN_VALUE;
		// Creamos con la variable int min y lo inicializamos a la 1º posicion del array
		int min = Integer.MAX_VALUE;
		// creamos con la varible int suma para almacenar la suma de todos los datos del
		// array
		int suma = 0;
		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// Con for, añadimos a cada indice del array un valor
		for (int i = 0; i < lista.length; i++) {
			// imprimimos en consola que inserte un numero
			System.out.println("Inserte un numero");
			// Insertamos por teclado un dato a cada indice del array
			lista[i] = sc.nextInt();
		}
		// Con for hacemos que lea el array desde la primera posicion hasta la ultima
		for (int i = 0; i < lista.length; i++) {
			// Hacemos que se almacene en suma la suma de todos los datos del array
			suma += lista[i];
			// Con if declaramos que si el el array (todos los datos) es mayor que el max
			// (1º posicion)
			if (lista[i] > max) {
				// Hacemos que se almacene en max el valor mas grande
				max = lista[i];
			} 
			if (lista[i] < min) {
				// Hacemos que se almacene en min el valor mas pequeño
				min = lista[i];
			}
		}
		// Imprimimos en consola la suma de todos los valores del array
		System.out.println("La suma total es: " + suma);

		// Imprimimos en consola el valor maximo del array
		System.out.println("Maximo: " + max);

		// Imprimimos en consola el valor minimo del array
		System.out.println("Minimo: " + min);

	}

}
