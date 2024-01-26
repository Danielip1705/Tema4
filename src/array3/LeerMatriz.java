package array3;

public class LeerMatriz {

	public static void leerMatriz(int[][] matriz) {
		// Creamos un for para que recorra las filas
		for (int i = 0; i < matriz.length; i++) {

			// Creamos un for poara que recorra las columnas
			for (int j = 0; j < matriz[i].length; j++) {

				// Imprimimos en consola las filas y las columnas
				System.out.print(matriz[i][j] + "\t");
			}
			// Indicamos salto de linea
			System.out.println();
		}
	}
}
