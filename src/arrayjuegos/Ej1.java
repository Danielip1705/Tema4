package arrayjuegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Creamos un array con la variable int y de longitud 10
		char vector[] = new char[10];

		int escondite[] = new int[10];

		// Con la variable string creamos mosca y lo inicializamos a "X"
		int mosca, golpear,ubicacion=0, indice = 0;

		Random rand = new Random();

		Scanner sc = new Scanner(System.in);

		mosca = rand.nextInt(vector.length);

		escondite[mosca]=1;
		
		System.out.println(Arrays.toString(escondite));

		while(indice<escondite.length) {
			indice++;
			if(escondite[indice]==escondite[mosca]) {
				ubicacion = escondite[mosca];
			}
			System.out.println(ubicacion);
		}
			

		
		
	

	}
}
