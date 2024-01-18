package array2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// creamos con la variable int un array con longitud 50
		int t[] = new int[50];
		
		//creamos con la variable int la clave
		int clave;
		
		//creamos con la variable int el resultado
		int resultado;
		
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//creamos for que recorra el array
		for(int i =0;i<t.length;i++) {
			
			//le damos a un numero aleatorio entre el 1 y 49 a cada dato
			t[i]=(int) (Math.random()*50);
		}
		
		//Imprimimos en pantalla que nos indique el numero que esta buscando
		System.out.println("Inserte que numero quieres encontrar en el array");
		
		//Escribimos clave
		clave = sc.nextInt();
		
		//Inicializamos resultado con el resultado que nos de la funcion buscar
		resultado = Ej4.buscar(t, clave);
		
		//Imprimimos en pantalla la posicion en la que se encuentra la clave
		System.out.println("Su numero se encuentra en la posicion "+resultado);
	
	
	}

	// Creamos la funcion que devuelva un numero entero y que recoja 2 parametros de
	// entrada
	public static int buscar(int t[], int clave) {

		// creamos con la variable int el indice
		int indice = 0;

		// creamos bucle while y que indice vaya aumentado tal y como recorra la tabla y
		// que pare si indice ha encontrado la clave
		while (indice <= t.length && clave != t[indice]) {
			
			//indice se incrementa
			indice++;
			
			//declaramos con if que si indice ha recorrido toda la tabla
			if (indice == t.length) {
				
				//que inicialize indice a -1
				indice = -1;
			}
		}
		//devolvemos indice
		return indice;
	}
}
