package array3;

public class Ej6 {

	public static void main(String[] args) {
		int[][][] lista = new int[5][5][5];

		for (int i = 0; i < lista.length; i++) {
			
			for (int j = 0; j < lista[i].length; j++) {
				
				for (int z = 0; z < lista[i][j].length; z++) {
					
					System.out.print(lista[i][j][z]);
				}
				System.out.println();

			}
			System.out.println();
		}

	}

}
