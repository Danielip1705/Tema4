package array1;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {
		// creamos un array con la varible int y con longiyud 30
		int lista[] = new int[30];

		// Creamos bucle for para que recorra el array
		for (int i = 0; i < lista.length; i++) {
			// Hacemos que cada dato tenga un valor aleatorio entre el 1 y el 9
			lista[i] = (int) (Math.random() * 10);
		}
		// ordenamos el array (lista)
		Arrays.sort(lista);

		// Imprimimos todos los datos del array en la consola
		System.out.println(Arrays.toString(lista));
	}

}
