package array;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//creamos un array utilizando la variable double y que tenga de longitud 5
		double tabla[] = new double [5];
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);

		//Con for haremos que se almacene los 5 numeros en el array
		for (int i=0;i<tabla.length;i++) {
			
			//imprimos en consola que se inserte un numero
			System.out.println("Inserte un numero");
			
			//con el array, haremos que se rellene cada indice con los numeros
			//que solicite el usuario
			tabla[i] =sc.nextDouble();  
			
		}
		//
		for(double num : tabla) {
			System.out.println(num);
		}
		sc.close();
	}

}
