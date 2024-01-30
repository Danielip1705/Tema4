package array3;

public class Ej4 {

	public static void main(String[] args) {
		
		LeerMatriz.leerMatriz(Ej4.tabla10x10());
	}

	public static int[][] tabla10x10() {

		int[][] tablamult = new int[10][10];

		for (int i = 0; i < tablamult.length; i++) {

			for (int j = 0; j < tablamult[i].length; j++) {
				tablamult[i ][j] = i*j;
			}
		}
		return tablamult;
	}
}
