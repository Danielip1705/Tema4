package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// creamos un array con la variable int y con valores ya inicializados
		int lista[] = { 10, 5, 3, 5, 4 }; // longitud 5

		// creamos con la variable int numElementos
		int numElementos;

		// creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en consola el array con la clase arrays.toString
		System.out.println(Arrays.toString(lista));
		
		//Imprimimios en consola cuantos numero se deben de sumar entre si
		System.out.println("Inserte cuantos numeros se tienes que sumar entre si(2 en 2, 3 en 3)");

		//Escribimos numElementos
		numElementos = sc.nextInt();

		//Imprimimos en consola con la clase arrays.toString el resultado de la tabla de la funcion 
		System.out.println(Arrays.toString(Ej6.suma(lista, numElementos)));
	}

	//Creamos funcion que devuelva un array y que tenga de parametro de entrada un array y numElementos
	public static int[] suma(int t[], int numElementos) {

		int j[] = new int[t.length - numElementos + 1];
		
		
		for (int i = 0; i < j.length; i++) {
			
		
			
			for (int a = i; a < numElementos+i; a++) {

				j[i]+= t[a];

			}

		}
		return j;

	}

}
