package array3;

public class Ej10 {

	public static void main(String[] args) {
		// Creamos un array bidimensional con valores predefinidos
		int[][] tabla = { { 1, 2, 3 }, { 6, 7, 8 }, { 9, 10, 11 } };

		// Utilizamos la funcion leer escaner para que lea el resultado de la funcion
		// gira90
		LeerMatriz.leerMatriz(gira90(tabla));
	}

	// Creamos una funcion que devuelva un array bidi y que reciba como parametro de
	// entrada otro array bidi
	public static int[][] gira90(int tablaInicio[][]) {

		// Creamos con la variable int n donde tendra incializado la longitud del array
		// (el parametro de entrada)
		int n = tablaInicio.length;

		// Creamos un array bidi que su tamaño sera n
		int[][] tabla90 = new int[n][n];

		// Creamos for para modificar el array bidi
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				// hacemos que la posicion de la tabla90 sea los valores finales del array
				// original
				tabla90[j][n - 1 - i] = tablaInicio[i][j];
			}
		}

		// Devolvemos tabla90
		return tabla90;
	}
}
