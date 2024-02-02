package array3;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		// Creamos array bidimensional con la variable int y con valores iniciados del 1
		// al 16
		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// Creamos array bidimensional con la variable int
		int[][] resultado = ordenarBidi(matriz);

		// Imprimimos en consola el titulo tabla original
		System.out.println("Tabla Original");

		// Utilizamos la funcion leerMatriz para que nos imprima la matriz
		LeerMatriz.leerMatriz(matriz);

		// Imprimimos en consola el titulo tabla transpocisionada
		System.out.println("Tabla transpocisionada");

		// Imprimimos en consola con la funcion leerMatriz imprimimos resultado
		LeerMatriz.leerMatriz(resultado);
	}

	// Creamos funcion que devuelva un array bidimensional y que tenga como
	// parematro de entrada un array bidimensional
	public static int[][] ordenarBidi(int[][] matriz) {

		// Creamos un array bidimensional
		int[][] matrizOrdenada = new int[4][4];

		// Creamos bucle for para recorrer las filas del array bidi
		for (int i = 0; i < matriz.length; i++) {

			// Creamos bucle for para recorrer las columnas
			for (int j = 0; j < matriz[i].length; j++) {

				// Hacemos que cada dato del arrayOrdenada sea la transpocision de la tabla
				matrizOrdenada[i][j] = matriz[j][i];
			}
		}

		// Devolvemos el array ordenada
		return matrizOrdenada;
	}

}
