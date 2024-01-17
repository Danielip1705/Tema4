package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		//creamos array con la variable int y de longitud 1000
		int lista[] = new int[1000];
		
		//creamos con la variable int contador,busqueda,numero
		int contador = 0, busqueda = 0, numero;

		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//creamos bucle for para leer el array
		for (int i = 0; i < lista.length; i++) {
			
			//insertamos en cada dato del array un numero entre el 1 al 99
			lista[i] = (int) (Math.random() * 100);
		}
		//imprimios en pantalla que inserte un numero entre el 1 y el 99
		System.out.println("Inserte el numero que quieras buscar[1 a 99]");

		//insertamos numero
		numero = sc.nextInt();

		//creamos bucle while para que busque el numero que hemos insertado
		while (busqueda < lista.length && numero != lista[busqueda]) {
			busqueda++;
		}
		//declaramos con if que si la busqueda es menor que la longitud del array
		if (busqueda < lista.length) {
			
			//que imprima la posicion del numero que hemos insertado
			System.out.println("El numero " + numero + " se encuentra en la posicion " + busqueda);
			
			//si no
		} else {
			
			//que imprima que el numero no existe en la tabla
			System.out.println("El numero no existe en esta tabla");
		}
		//cramos bucle for para leer el array
		for (int n = 0; n < lista.length; n++) {
			
			//declaramos con if que si numero conincide con todos los datos del array
			if (numero == lista[n]) {
				
				//que incremente el contador
				contador++;

			}
		}
		//imprimimos en consola el numero de veces que se ha repetido el numero en el array
		System.out.println("El numero se repite en el array " + contador);
		
		//cerramos el scanner
		sc.close();

	}

}
