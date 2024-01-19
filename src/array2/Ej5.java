package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// creamos con la variable int un array con valores ya inicializados
		int tabla[] = { 3, 2, 6, 4, 2, 7, 12, 3, 6, 3, 12, 2, 54 };

		// creamos con la variable int valor
		int valor;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// Imprimimos la tabla en la consola
		System.out.println(Arrays.toString(tabla));

		// imprimimos en consola que nos inserte el valor
		System.out.println("Inserte el valor a buscar");

		// escribimos el valor
		valor = sc.nextInt();

		// Imprimimos la posicion del numero buscado
		System.out.println(Arrays.toString(Ej5.buscarTodos(tabla, valor)));

	}

	// Entrada: Una tabla con numeros enteros y un numero entero que sea el
	// valor a buscar en la tabla

	// Salida: Devuelve tabla creada con las posiciones de donde se encuentra en el
	// numero dado en el parametro
	public static int[] buscarTodos(int t[], int valor) {

		// creamos con la variable int el array tablaBuscar con la longitud de la tabla
		// t
		int tablaBuscar[] = new int[t.length];

		// con la variable int un array
		int tablaCopiada[];

		// creamos con la variable int indice e inicializamos a 0
		int indice = 0;

		// creamos bucle for para recorrer el array
		for (int i = 0; i < t.length; i++) {

			// declaramos con if que si el indice del array es igual al valor
			if (t[i] == valor) {

				// que segun el numero que contanga indice en el array [en este caso seria 0]
				// escriba la posicion del array
				tablaBuscar[indice] = i;
				
				//indice incrementa
				indice++;
			}

		}
		//con la 
		tablaCopiada = Arrays.copyOf(tablaBuscar, indice);
		return tablaCopiada;

	}

}
