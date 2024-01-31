package array3;

public class Ej4 {

	public static void main(String[] args) {

		// Llamamos a la funcion leermatriz y dentro de esa funcion llamamos a la
		// funcion de la tabla 10x10
		LeerMatriz.leerMatriz(Ej4.tabla10x10());
	}

	// Creamos funcion que devuelva una matriz
	public static int[][] tabla10x10() {

		// Creamos una matriz con una longitud de fila de 10 y de columna tambien de 10
		int[][] tablamult = new int[10][10];

		// Creamos bucle for para recorrer las filas
		for (int i = 0; i < tablamult.length; i++) {

			// Creamos bucle for para recorrer las columnas
			for (int j = 0; j < tablamult[i].length; j++) {

				// Hacemos que cada dato de la matriz se multiplique por la columna y fila
				// +1(para que no se multiplique por 0)
				tablamult[i][j] = (i + 1) * (j + 1);
			}
		}
		// Retornamos la tabla
		return tablamult;
	}
}
