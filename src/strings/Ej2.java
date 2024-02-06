package strings;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//Creamos con la clase String adivinar e inicializamos con una cadena vacia
		String adivinar="";
		
		//Creamos con la clase String palabra e inicializamso con una cadena vacia
		String palabra="";
		
		//Creamos con la variable int resultado e inicializamos con el resultado de la funcion compareTo
		int resultado = adivinar.compareTo(palabra);
		
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Imprimimos en consola que escriba la contraseña a adivinar
		System.out.println("Escriba la constraseña ha adivinar");
		
		//Escribimos adivinar
		adivinar = sc.nextLine();
		
		//Creamos bucle while que para que salga palabra debe de ser igual que adivinar
		while(!palabra.equals(adivinar)) {
			
			//Imprimimos en consola que escriba la constraseña 
			System.out.println("Escriba cual crees que es la contraseña");
		
			//Escribimos palabra
			palabra=sc.nextLine();
			
			//Declaramos con if que si resultado es igual que 0
			if(resultado==0) {
				
				//Imprimimos en pantalla que las ca denas son alfabeticamente iguales 
				System.out.println("Las cadenas son alfabeticamente iguales");
				
				//Declaramos con if else que si resultado es menor que 0
			} else if(resultado<0) {
				
				//Imprimimos en consola que la cadena es menor alfabeticamente
				System.out.println("La cadena es menor alfaneticamente");
				
				//Y si no
			} else {
				
				//Imprimimos en consola que la cadena es mayor alfabeticamente
				System.out.println("La cadena es mayor alfaneticamente");
			}
		}
		
		//Imprimimos en consola que hemos acertado
		System.out.println("Has acertado");
		
		//Cerramos scanner
		sc.close();

	}

}
