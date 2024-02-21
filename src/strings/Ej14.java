package strings;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		//Creamos scanner
		Scanner sc = new Scanner(System.in);

		//Creamos con String frase e inicializamos a cadena vacia
		String frase = "";

		//Creamos array con la variable char 
		char[] caracteres;

		//Creamos con la variable int num e inicializamos a 0
		int num = 0;

		//Creamos con la variable char letra
		char letra;

		//Imprimimos en consola que escriba la frase
		System.out.println("Escribe la frase");

		//Escribimos frase y lo pasamos todo en minusculas
		frase = sc.nextLine().toLowerCase();

		//
		frase = frase.replace(" ", "");

		caracteres = frase.toCharArray();

		for (int i = 0; i < caracteres.length; i++) {

			letra = caracteres[i];

			for (int j = 0; j < caracteres.length; j++) {

				if (letra == caracteres[j]) {

					num++;
				}

			}

			frase = frase.replace(letra, ' ');

			caracteres = frase.toCharArray();

			if (letra != ' ') {

				System.out.println(letra + ": " + num);

			}

			num = 0;
		}

		/*Optimizado
		 * 
		 * for(int i =0;i<caracteres.lengh;i+=contador){ 
		 * contador=1;
		 * 
		 * for(int j=i+1;j<caracteres.lengh;j++){ 
		 * if(caracteres[i]==caracteres[j]){
		 * contador++ } 
		 * } 
		 * System.out.println(caracteres[i]+":"+ contador) 
		 * }
		 * 
		 * 
		 * 
		 */

		sc.close();

	}

}
