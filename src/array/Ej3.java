package array;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// Creamos un array con la varible int y con longitud 10
		int lista[] = new int[10];
		// Creamos scanner
		Scanner sc = new Scanner(System.in);
		//con bucle for hacemos que recorra la lista cada vez que le insertemos un dato
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Inserte un numero");
			//Insertamos datos por consola
			lista[i] = sc.nextInt();
		}
		//Con bucle for hacemos que se imprima en consola desde el indice 9 (long 10)
		//hasta el indice 0 (long 1)
		for (int i = lista.length - 1; i >= 0; i--) {
			//imprimimos array
			System.out.println(lista[i]);
		}
		//cerramos scanner
		sc.close();
	}

}
