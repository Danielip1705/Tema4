package array2;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		// creamos un array con la variable int y con los datos ya inicializados
		int t[] = { 4, 3, 5, 12, 65, 0 };

		// creamos con la variable int maximo, donde su inicializacion sera el retorno
		// de la funcion maximo
		int maximo = Ej2.maximo(t);

		// Imprimimos el array
		System.out.println(Arrays.toString(t));

		// Imprimimos el numero maximo
		System.out.println("El numero máximo del array es " + maximo);

	}

	// creamos la maximo donde se devolvera un numero entero maximo del array
	public static int maximo(int[] t) {

		// creamos con la variable int maximo
		int maximo = 0;

		// creamos un for-each que recorra el array
		for (int num : t) {

			// creamos un for para recorre el array, donde empezara una posicion mas
			// adelante y terminara 1 posicion antes
			for (int j = 1; j < t.length - 1; j++) {
				
				//declaramos con if que si num es mayor que la segunda posicion del array
				if (num > t[j]) {
					
					//maximo sera igual que num
					maximo = num;
				}
			}
		}
		//devolvemos maximo
		return maximo;
	}

}
