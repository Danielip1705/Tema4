package array3;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tabla = { { 3, 5, 5 }, { 5, 3, 5 }, { 5, 5, 3 } };

		// Creamos con la variable boolean comprobacion e lo inicializamos al valor
		// devuelto de la funcion esMagica
		boolean comprobacion = esMagica(tabla);

		//Declaramos con if que si comprobacion es true
		if (comprobacion) {
			
			//Que imprima que la tabla es magica
			System.out.println("La tabla es magica");
			
			//y si no
		} else {
			
			//que imprima que no es magica
			System.out.println("La tabla no es magica");
		}
	}

	// Creamos una funcion que devuleva un booleano y que reciba como parametro de
	// entrada un array bidimensional
	public static boolean esMagica(int tabla[][]) {

		// Creamos con la variable boolean magico e inicializamos a true
		boolean magico = true;

		// Creamos con la variable int sumaColumnas, Referencia y sumaFila donde todo
		// esta inicializado a 0
		int sumaColumna = 0, comprobacion = 0, sumaFila = 0;
		// Calcular la suma de la primera fila (o primera columna)
		for (int j = 0; j < tabla.length; j++) {
			comprobacion += tabla[0][j];
		}

		// Verificar la suma de las filas
		for (int i = 0; i < tabla.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < tabla.length; j++) {
				sumaFila += tabla[i][j];
			}
			if (sumaFila != comprobacion) {
				magico = false;
			}
		}

		// Verificar la suma de las columnas
		for (int j = 0; j < tabla.length; j++) {
			sumaColumna = 0;
			for (int i = 0; i < tabla.length; i++) {
				sumaColumna += tabla[i][j];
			}

			// Comprobamos si las columnas
			if (sumaColumna != comprobacion) {
				magico = false;
			}
		}
		// Devolvemos magico
		return magico;
	}

}
