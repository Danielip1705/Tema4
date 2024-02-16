package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase1 = "";

		String frase2 = "";
		
		boolean res = false;

		System.out.println("Escribe 2 paabras");
		
		frase1= sc.nextLine();
		
		frase2 = sc.nextLine();
		
		res=anagrama(frase1, frase2);

	}

	public static boolean anagrama(String frase1, String frase2) {
		boolean res = false;

		char[] tabla1 = frase1.toCharArray();
		char[] tabla2 = frase2.toCharArray();
		
		frase1=frase1.replace(" ", "");
		frase2=frase2.replace(" ", "");

		Arrays.sort(tabla1);
		Arrays.sort(tabla2);

		if (Arrays.equals(tabla1, tabla2)) {

			res = true;
		}
		return res;
	}
	

}
