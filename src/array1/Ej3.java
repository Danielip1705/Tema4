package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		//creamos array con la variable int y con longitud 10
		int listaUsuario[]= new int[10];
		
		//creamos otro array con la variable int y con longitud 10
		int listaOrdenador[] = new int [10];
		
		//creamos con la varible int num
		int num;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<listaUsuario.length;i++) {
			System.out.println("Inserte numeros en la 1º lista");
			
			listaUsuario[i]= sc.nextInt();
		}
		for(int i=0;i<listaOrdenador.length;i++) {
			System.out.println("Inserte numeros en la 2º lista");
			
			listaOrdenador[i]= sc.nextInt();
		}
		if(Arrays.equals(listaUsuario, listaOrdenador)==true) {
			System.out.println("Las listas son iguales");
		} else {
		System.out.println("Las listas no son iguales");
		}
		//cerramos scanner
		sc.close();
		
	}

}
