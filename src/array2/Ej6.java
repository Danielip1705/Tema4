package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// creamos un array con la variable int y con valores ya inicializados
		int lista[] = { 10, 5, 3, 5, 4 }; // longitud 5

		// creamos con la variable int numElementos
		int numElementos;

		// creamos scanner
		Scanner sc = new Scanner(System.in);

		// imprimimos en consola el array con la clase arrays.toString
		System.out.println(Arrays.toString(lista));

		// Imprimimios en consola cuantos numero se deben de sumar entre si
		System.out.println("Inserte cuantos numeros se tienes que sumar entre si(2 en 2, 3 en 3)");

		// Escribimos numElementos
		numElementos = sc.nextInt();

		// Imprimimos en consola con la clase arrays.toString el resultado de la tabla
		// de la funcion
		System.out.println(Arrays.toString(Ej6.suma(lista, numElementos)));
	}

	// Creamos funcion que devuelva un array y que tenga de parametro de entrada un
	// array y numElementos
	public static int[] suma(int t[], int numElementos) {

		// Creamos array con la variable int y que su longitud sea la agrupacion de los
		// numeros del array t
		int j[] = new int[t.length - numElementos + 1];

		// Recorremos el array
		for (int i = 0; i < j.length; i++) {

			// Recorremos el array hasta que se haya sumando todos los numeros
			for (int a = i; a < numElementos + i; a++) {

				// Asignamos al array j que cada dato es la suma del primer indice con el
				// siguiente
				j[i] += t[a];

			}

		}
		//retornamos j
		return j;

	}

}
