package strings;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		//Creamos con la clase String una cadena que contenga una cadena vacia
		String cadena = "";
		
		//Creamos con la clase String una cadena que contenga una cadena vacia
		String cadena1 ="";
		
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos en consola que escriba la 1º frase
		System.out.println("Introduzca la 1º frase");
		
		//Escribimos cadena
		cadena = sc.nextLine();
		
		//Imprimimos en consola que escriba la 2º frase
		System.out.println("Introduzca la 2º frase");
		
		//Escribimos cadena1
		cadena1 = sc.nextLine();
		
		//Declaramos con if que si la longitud de cadena es mayor que cadena1
		if (cadena.length()>cadena1.length()) {
			
			//Que imprima en consola que la 1º frase escrita es mas larga
			System.out.println("La 1º frase es mas larga");
			
			//Imprimimos en consola el numero de caracteres de las 2 frases
			System.out.println("Numero de caracteres frase 1º: "+cadena.length());
			System.out.println("Numero de caracteres frase 2º "+cadena1.length());
			
			//Y si no
		} else {
			
			//Que imprima en consola que la 2º fila es la mas larga
			System.out.println("La 2º frase es mas larga");
			
			//Imprimimos en consola el numero de caracteres de las 2 frases
			System.out.println("Numero de caracteres frase 1º: "+cadena.length());
			System.out.println("Numero de caracteres frase 2º "+cadena1.length());
			
			//Cerramos scanner
			sc.close();
		}
	}

}
