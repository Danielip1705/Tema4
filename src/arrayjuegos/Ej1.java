package arrayjuegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		//Creamos un array con la variable int y de longitud 10
		char vector[] = new char [10];
		
		int posicion[]=new int [10];
		
		//Con la variable string creamos mosca y lo inicializamos a "X"
		String mosca = "X";
		
		int golpear;
		
		Random rand = new Random(); 
		
		Scanner sc = new Scanner(System.in);
		
		golpear = rand.nextInt(vector.length);
		
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Indica");
		
		
	}

}
