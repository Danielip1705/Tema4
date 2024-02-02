package array3;

import java.util.Arrays;

public class Ej6 {

	public static void main(String[] args) {
		// Creamos con la variable int un array bidi de longitud de fila 6 y de columna
		// 10
		int[][] matriz = new int[6][10];

		// Creamos un array con la variable int y sin longitud definida
		int[] resultado;

		// Creamos bucle for para recorrer las filas del array bidi
		for (int i = 0; i < matriz.length; i++) {

			// Creamos otro bucle for para recorrer las columnas del array bidi
			for (int j = 0; j < matriz[i].length; j++) {

				// Indicamos que cada dato es un valor aletorio entre el 0 y 1000 incluido
				matriz[i][j] = (int) (Math.random() * 1001);
			}

		}

		// Inicializamos resultado con el resultado de la fucion minMaxArray
		resultado = minMaxArray(matriz);

		// Imprimimos en pantalla utilizando la funcion arrays.deepToString para
		// imprimir la matriz
		System.out.println(Arrays.deepToString(matriz));

		// Imprimimos en consola utilizando la funcion toString para imprimir resultado
		System.out.println(Arrays.toString(resultado));
	}

	// Creamos funcion que devuleva un array unidimensional entero y que sus
	// parametros de entreada sea un array bidimensional
	public static int[] minMaxArray(int[][] matriz) {
		
		//Creamos con la variable int un array de longitud 2
		int[] lista = new int[2];

		//Creamos con la variable int min (inicializado al maximo valor) y max (inicializamos al minimo valor)
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		//Creamos bucle for para recorrer las filas del array bidi
		for (int i = 0; i < matriz.length; i++) {
			
			//Creamos otro bucle for para recorrer las columnas del array bidi
			for (int j = 0; j < matriz[i].length; j++) {

				//Declaramos con if que si el dato de la matriz es menor que la variable min
				if (matriz[i][j] < min) {
					
					//Entonces min sera el resultado del dato del array bidi
					min = matriz[i][j];
				}
				
				//Declaramos con if que si el dato de la matriz es mayor que la variable max
				if (matriz[i][j] > max) {
					
					//Entonces max sera el resultado del dato de la array bidi
					max = matriz[i][j];
				}
			}
		}
		
		//Inicializamos el array unidimensinal indicando que el 1º dato (indice 0) es min
		lista[0] = min;
		
		//Inicializamos el array unidemsional indicado que el 2º dato (indice 1) es max
		lista[1] = max;

		//Devolvemos el valor del array unidimensional (lista)
		return lista;

	}

}
