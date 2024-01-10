package array;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//Creamos un array con la varible int y con longitud 8
		int lista[] = new int [8];
		
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos bucle for para insertar los datos en cada indice del array
		for (int i=0;i<lista.length;i++) {
			//Imprimimos en pantalla que inserte un numero
			System.out.println("Inserte un numero");
			//Escribimos el dato
			lista[i]= sc.nextInt();
		}
		//Creamos bucle for para que lea el array
		for (int i =0; i<lista.length;i++) {
			//si el dato dividido entre 2 da de resto 0, que imprima par
			if (lista[i]%2==0) {
				System.out.println(lista[i]+" es par");
			} else {
				//si el dato dividido entre 2 no da de resto 0, que imprima impar
				System.out.println(lista[i]+" es impar");

			}
		}
		
		
		
	}

}
