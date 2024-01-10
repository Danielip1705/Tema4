package array;

import java.util.Random;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		//Creamos un array con la variable int y de longitud 100
		int lista[] = new int [100];
		
		//Creamos num con la variable int
		int num;
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//creamos random
		Random rand = new Random();
		
		for(int i=0;i<lista.length;i++) {
			lista[i]= rand.nextInt(11);
		}
		System.out.println("Inserte un valor del 1 al 100 para saber su resultado obtenido");
		
		num = sc.nextInt();
		
		System.out.println(lista[num]);
		
		
		
		
		
		sc.close();
	}

}
