package array3;

public class Ej8 {

	public static void main(String[] args) {
		// Creamos con la variable int un array bidimensional simetrico ([i][j]=[j][i])
		int[][] matrizSiSimet = { { 1, 2, 3 }, { 2, 4, 5 }, { 3, 5, 6 } };
		// Creamos con la variable int un array bidimensional no simetrico
		// ([i][j]!=[j][i])
		int[][] matrizNoSimet = { { 1, 2, 3 }, { 5, 4, 5 }, { 12, 5, 6 } };

		// Creamos con la variable boolean simetrico y lo inicializamos con el resultado
		// de la funcion esSimetrico dandole como parametro de entrada matrizSiSimet
		boolean simetrico = esSimetrico(matrizSiSimet);

		// Creamos con la variable boolean noSimetrico y lo inicializamos con el
		// resultado de la funcion esSimetrico dandole como parametro de entrada
		// matrizNoSimet
		boolean noSimetrico = esSimetrico(matrizNoSimet);

		// Declaramos con if que si simetrico es true
		if (simetrico) {

			// Que imprima en consola que la matriz es simetrica
			System.out.println("La matriz es simetrica");

			// y si no
		} else {

			// Que imprima en consola que la matriz no es simetrica
			System.out.println("La matriz no es simetrica");
		}

		// Declaramos con if que si simetrico es true
		if (noSimetrico) {

			// Que imprima en consola que la matriz es simetrica
			System.out.println("La matriz es simetrica");

			// y si no
		} else {

			// Que imprima en consola que la matriz no es simetrica
			System.out.println("La matriz no es simetrica");
		}
	}

	//Creamos funcion que devuleva un booleano y que tenga como parametro de entrada un array bidi
	public static boolean esSimetrico(int[][] matriz) {

		//Creamos con la variable boolean simetrico e inicializamos a true
		boolean simetrico = true;

		//Leemos el array bidimensional
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				//Declaramos con if que si [i][j] !=[j][i]
				if (matriz[i][j] != matriz[j][i]) {

					//simetrico es false
					simetrico = false;
					
					//nos salimos
					break;
				}
			}
		}

		return simetrico;
	}
}
