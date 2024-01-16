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
		//creamos array para que se inserte un valor aleatorio en cada indice
		for(int i=0;i<lista.length;i++) {
			//inicializamos cada indice a un valor aleatorio entre el 1 y el 10
			lista[i]= rand.nextInt(11);
		}
		//imprimimos en consola que inserte un numero entre el 1 y el 100
		System.out.println("Inserte un valor del 1 al 100 para saber su resultado obtenido");
		//escribimos el numero
		num = sc.nextInt();
		//imprimimos resultado
		System.out.println(lista[num]);
	
		sc.close();
	}

}
