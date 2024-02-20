package strings;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		String frase = "";

		char[] caracteres;

		int num = 0;

		char letra;

		System.out.println("Escribe la frase");

		frase = sc.nextLine().toLowerCase();

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
		
		sc.close();		

	}

}
