package array3;

import java.util.Random;

public class Ej5 {

	public static void main(String[] args) {
		// Creamos una matriz cuyos datos y longitud sean el resultado de la funcion
		// rellenoAleatorios
		int[][] matriz = rellenoAleatorios();
		
		//Creamos con la variable int sumaColumnas, sumaFilas y total donde todo estara inicializado a 0
		int sumaColumnas = 0, sumaFilas = 0, total = 0;

		//Creamos for each para recorrer las filas
		for (int[] filas : matriz) {
			//Inicializamos sumaFilas a 0
			sumaFilas = 0;

			//Creamos for each para recorrer las columnbas
			for (int valor : filas) {

				//Imprimimos las columanas con una tabulacion en consola
				System.out.print(valor + "\t");

				//Hacemos que sumaFilas se suma constantemente con valor
				sumaFilas += valor;
			}
			
			//Imprimimos en consola el resultado de sumaFila
			System.out.print(sumaFilas);
			
			//Imprimimos en consola un salto de linea
			System.out.println();
		}
		
		//Creamos bucle for para recorrer las lineas
		for (int j=0; j<matriz[0].length; j++) {
			
			//Inicializamos sumaColumnas a 0
			sumaColumnas = 0;
			
			//Creamos otro bucle para recorrar las columnas
			for(int i=0; i<matriz.length; i++) {
				
				//Hacemos que sumaColumnas se sume constantemente con cada dato del array bidimensional
				sumaColumnas += matriz[i][j];
			}
			
			//Hacemos que total se sume con sumaColumnas
			total += sumaColumnas;
			
			//Imprimimos sumaColumnas con una tabulacion en la consola
			System.out.print(sumaColumnas + "\t");
		}
		//Imprimimos el resultado total en consola
		System.out.println(total);

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
