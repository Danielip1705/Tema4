package array1;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		//creamos array con la variable int y de longitud 6
		int lista[] = new int[6];
		
		//creamos array con la variable int, longitud 6 y con valores entre el 1 y el 49
		int ganador[] = {17,21,5,36,3,7};
		
		//creamos aciertos con la variable int
		int aciertos=0;
		
		//imprimimos en pantalla el titulo del numero ganador
		System.out.println("Numero Ganador");
		
		//imprimimos en pantalla la lista de los numeros ganadores
		System.out.println(Arrays.toString(ganador));
		
		//imprimimos en pantalla el titulo de mi numero
		System.out.println("Mi numero");
		
		//creamos bucle for para que lea el array
		for(int i=0;i<lista.length;i++) {
			
			//insertamos en cada dado un numero entre el 1 y el 49
			lista[i]=(int) (Math.random()*50);
		}
		
		//imprimimos en pantalla el array elegido aleatoriamente
		System.out.println(Arrays.toString(lista));
		
		//creamos bucle for para leer el array ganador
		for(int i=0;i<lista.length;i++) {
			
			//Creamos otro for para que lea el array lista
			for(int j=0;j<lista.length;j++) {
				
				//declaramos con if que si algun numero concuerda con el numero ganador
				if(lista[j]==ganador[i]) {
					
					//que incremente los aciertos
					aciertos++;
				}
			}
		}
		//imprimimos en pantalla el numero de aciertos
		System.out.println("Numero de aciertos: "+aciertos);
			
	}

}
