package array1;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		
		//creamos un array con la varible int y con longitud 55
<<<<<<< HEAD
				int lista[]= new int[55];
				
				//con la variable int creamos inicio y fin y lo inicializamos a 0
				int inicio=0,fin=0;
				
				//creamos for que itere las instrucciones 10 veces
				for(int i =1;i<=10;i++) {
					//fin se suma con el valor de i
					fin+=i;
					
					//rellenamos el array en las pocisiones inicio y fin con el relleno i
					Arrays.fill(lista, inicio,fin,i);
					
					//inicio se suma con el valor i
					inicio+=i;
					
				}
				
				//Imprimimos la lista 
				System.out.println(Arrays.toString(lista));
=======
		int lista[]= new int[55];
		
		//con la variable int creamos inicio y fin y lo inicializamos a 0
		int inicio=0,fin=0;
		
		//creamos for que itere las instrucciones 10 veces
		for(int i =1;i<=10;i++) {
			//fin se suma con el valor de i
			fin+=i;
			
			//rellenamos el array en las pocisiones inicio y fin con el relleno i
			Arrays.fill(lista, inicio,fin,i);
			
			//inicio se suma con el valor i
			inicio+=i;
			
		}
		
		//Imprimimos la lista 
		System.out.println(Arrays.toString(lista));
>>>>>>> branch 'master' of https://github.com/Danielip1705/Tema4.git
	}

}
