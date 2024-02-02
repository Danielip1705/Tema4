package array3;

public class Ej8 {

	public static void main(String[] args) {
		int[][] matrizSiSimet = new int[4][4];

		int[][] matrizNoSimet = new int[4][5];

		boolean simetrico = esSimetrico(matrizNoSimet);

		if (simetrico == true) {
			System.out.println("La matriz es simetrica");
		} else {
			System.out.println("La matriz no es simetrica");
		}
	}

	public static boolean esSimetrico(int[][] matriz) {

		boolean simetrico = true;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] != matriz[j][i]) {

					simetrico = false;
					break;
				}
			}
		}

		return simetrico;
	}
}
