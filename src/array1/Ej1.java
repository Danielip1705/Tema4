package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		//creamos con la variable int el tamaño y el relleno
		int relleno,tamaño;
		
		//creamos array con la variable int
		int lista[];
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//indicamos en la consola que indique el tamaño del array
		System.out.println("Indique de que tamaño sera su array");
		
		//Escribe el tamaño
		tamaño =sc.nextInt();
		
		//declaramos que la longitud del array es el tamaño insertado
		lista = new int[tamaño];
		
		//imprimimos en pantalla que escriba el numero que quiere que aparezca en consola
		System.out.println("Indique que numero quieres que contenga el array");
	
		//escribimos el relleno
		relleno = sc.nextInt();
		
		//creamos bucle for para que inserte con el fill el numero escrito en el array
		for(int i =0; i<=lista.length;i++) {
		
		//creamos .fill para que rellene el array con el numero guardado en relleno
		Arrays.fill(lista, relleno);	
		}
		
		//imprimimos en consola la tabla
		System.out.println(Arrays.toString(lista));
	//cerramos scanner
	sc.close();
	}

}
