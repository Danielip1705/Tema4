package array3;

public class Ej1 {

	public static void main(String[] args) {
		// creamos un array bidimecional con la variable int y le indicamos la longitud
		// de la fila y columna
		int matriz[][] = new int[3][6];

		//Asignamos numeros a los datos que corresponde de la 1º fila
		matriz[0][0] = 0;
		matriz[0][1] = 30;
		matriz[0][2] = 2;
		matriz[0][5] = 5;

		//Asignamos numeros a los datos que corresponde a la 2º fila
		matriz[1][0] = 75;
		matriz[1][4] = 0;
		
		//Asignamos numeros a los datos que corresponde a la 3º fila
		matriz[2][2] = -2;
		matriz[2][3] = 9;
		matriz[2][2] = -2;

		//Utilizamos la funcion leer matriz para que nos imprima el array bidimensional
		LeerMatriz.leerMatriz(matriz);

	}
}
