package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int lista[] = new int[1000];
		Scanner sc = new Scanner(System.in);

		int contador = 0, busqueda = 0, numero;
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random() * 100);
		}
		System.out.println("Inserte el numero que quieras buscar[1 a 99]");

		numero = sc.nextInt();

		while (busqueda < lista.length && numero != lista[busqueda]) {
			busqueda++;
		}
		if (busqueda < lista.length) {
			System.out.println("El numero " + numero + " se encuentra en la posicion " + busqueda);
		} else {
			System.out.println("El numero no existe en esta tabla");
		}
		for (int n = 0; n < lista.length; n++) {
			if (numero == lista[n]) {
				contador++;

			}
		}
		System.out.println("El numero se repite en el array " + contador);
	}

}