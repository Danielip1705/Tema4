package array3;

import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos una matriz cuyos datos y longitud sean el resultado de la funcion
		// rellenoAleatorios
		int[][] matriz = rellenoAleatorios();
		int sumaColumnas = 0, sumaFilas = 0, total = 0;

		for (int[] filas : matriz) {

			sumaFilas = 0;

			for (int valor : filas) {

				System.out.print(valor + "\t");

				sumaFilas += valor;
			}
			System.out.print(sumaFilas);
			System.out.println();
		}
		for(int j=0;j<matriz.length;j++) {
			sumaColumnas=0;
			for(int i=0;i<matriz[j].length;i++) {
				sumaColumnas+=matriz[j][i];
				System.out.print(sumaFilas+"\t");
			}
		}

	}

	// Creamos funcion que devuelva una matriz(array bidimensional) sin parametros
	// de entrada
	public static int[][] rellenoAleatorios() {

		// Creamos una matriz de longitud de fila 4 y columna 5
		int[][] matriz = new int[4][5];

		// Creamos Random
		Random rand = new Random();

		// Creamos bucle for para recorrer la filas de la matriz
		for (int i = 0; i < matriz.length; i++) {

			// Creamos bucle for para recorrer las columnas de la matriz
			for (int j = 0; j < matriz[i].length; j++) {

				// Le asigamos a cada dato de la matriz un numero aleatorio del 100 al 999
				matriz[i][j] = rand.nextInt(100, 1000);
			}
		}
		// Devolvemos matriz
		return matriz;
	}

}
