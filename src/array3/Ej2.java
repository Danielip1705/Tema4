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

				System.out.println("Inserte su nota: " + (j + 1) + "/5");

				matriz[i][j] = sc.nextInt();

				media += matriz[i][j];

				if (matriz[i][j] < minimo) {
					minimo = matriz[i][j];
				}
				if (matriz[i][j] > maximo) {
					maximo = matriz[i][j];
				}
			}
			// Indicamos salto de linea
			System.out.println();

			media /= 4;

			System.out.println("Alumno " + (i + 1) + "º su nota media es de: " + (int) (media));
			System.out.println("Alumno " + (i + 1) + "º su nota maxima es " + maximo);
			System.out.println("Alumno " + (i + 1) + "º su nota minima es " + minimo);
			maximo=0;
			minimo=10;
			media = 0;
		}
	}

}
