package array3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos array bidi con la variable int y con la longitud de la fila a 4 y la
		// columna a 5
		int[][] matriz = new int[4][5];

		// Con la variable int creamos maximo,minimo
		int maximo = 0, minimo = 10;

		// Con la variable double creamos media
		double media = 0;

		// Creamos scanner
		Scanner sc = new Scanner(System.in);

		// Creamos un for para que recorra las filas
		for (int i = 0; i < matriz.length; i++) {

			System.out.println("Alumno " + (i + 1) + "º inserte su nota");

			// Creamos un for poara que recorra las columnas
			for (int j = 0; j < matriz[i].length; j++) {

				// Imprimimos en consola que inserte la nota el alumno indicado
				System.out.println("Inserte su nota: " + (j + 1) + "/5");

				// Escribimos la nota
				matriz[i][j] = sc.nextInt();

				// Acumulamos la nota del alumno indicado para realizar mas tarde la media
				media += matriz[i][j];

				// Declaramos con if que si la nota es menor que el minimo (10)
				if (matriz[i][j] < minimo) {
					// Minimo es igual que el dato
					minimo = matriz[i][j];
				}
				// Declaramos con if que si la nota es mayor que maximo (0)
				if (matriz[i][j] > maximo) {

					// Maximo es igual que el dato
					maximo = matriz[i][j];
				}
			}
			// Indicamos salto de linea
			System.out.println();

			// Realizamos la media
			media /= 5;

			// Imprimimos en consola la media(realizamos un cast para pasar la variable
			// media a int)
			System.out.println("Alumno " + (i + 1) + "º su nota media es de: " + (int) (media));

			// Imprimimos en consola la nota maxima del alumno indicado
			System.out.println("Alumno " + (i + 1) + "º su nota maxima es " + maximo);

			// Imprimimos en consola la nota minima del alumno indicado
			System.out.println("Alumno " + (i + 1) + "º su nota minima es " + minimo);

			// Inicializamos los valores a como estaban anteriormente
			maximo = 0;
			minimo = 10;
			media = 0;
		}
		//Cerramos scanner
		sc.close();
	}

}
