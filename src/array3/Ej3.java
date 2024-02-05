package array3;

import java.util.Arrays;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };

		// Creamos bucle for para recorrer las filas
		for (int i = 0; i < matriz.length; i++) {
			// Creamos bucle for para recorrer las columnas
			for (int j = 0; j < matriz[i].length; j++) {

				// Asignamos a cada dato un valor aleatorio del 0 al 49
				matriz[i][j] = (int) (Math.random() * 50);
			}
		}
		// Llamamos a la funcion rellenarbidi para que nos de el resultado del array
		// modificado
		Ej3.rellenarBidi(matriz);

		// Utilizamos la funcion leer matriz
		LeerMatriz.leerMatriz(matriz);

	}

	public static void rellenarBidi(int[][] matriz) {

		// Creamos bucle for para recorrer las filas
		for (int i = 0; i < matriz.length; i++) {

			// Creamos bucle for para recorrer las columnas
			for (int j = 0; j < matriz[i].length; j++) {

				// Hacemos que cada dato se multiplique por la fila y la columna
				matriz[i][j] *= (10*i) * j;

			}
		}
	}

}
