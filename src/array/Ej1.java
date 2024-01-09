package array;

import java.util.Random;

public class Ej1 {

	public static void main(String[] args) {

		// creamos la varibale aleatorio con int
		int aleatorio;

		// creamos la clase random
		Random rand = new Random();

		// creamos bucle for y que llegue hasta 10
		for (int i = 1; i <= 10; i++) {

			// hacemos que aleatorio tenga un numero aleatorio del 1 al 100
			aleatorio = rand.nextInt(100) + 1;

			// imprimimos la variable aleatorio en cada bucle
			System.out.println(aleatorio);
		}

	}
}
