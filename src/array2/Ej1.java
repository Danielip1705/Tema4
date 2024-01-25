package array2;

import java.util.Arrays;

public class Ej1 {

	public static void main(String[] args) {
		// creamos un array con la variable int y con datos ya inicializados
		int lista[] = { 10, 25, 5, 10 };

		// creamos con la varible int resultado, donde su inicializacion sera el return
		// de la funcion sumaArray
		int resultado = Ej1.sumaArray(lista);
		
		//Imprimimos en consola el array
		System.out.println(Arrays.toString(lista));
		
		//Imprimimos en consola la suma de todos los datos del array
		System.out.println("La suma de todos los datos del array son: "+resultado);
	}

	// creamos una funcion con la variable int y de parametro de entrada un array
	public static int sumaArray(int[] lista) {

		// con la variable int creamos suma e inicializamos a 0
		int suma = 0;

		// creamos for-each para que recorra la tabla
		for (int valor : lista) {

			// sumamos todos los datos en la variable suma
			suma += valor;
		}
		// devolvemos suma
		return suma;

	}
}
