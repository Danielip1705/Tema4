package strings;

import java.util.Arrays;

public class Ej4 {

	public static void main(String[] args) {

		//Creamos con la clase String frase e inicializamos con uan palabra
		String frase = "Esto es un ejemplo";
		
		//Creamos un array utilizando la clase String
		String[] ordenado;
		
		//Inicializamos ordenado cada palabra sin contar el espacio
		ordenado = frase.split(" ");
		
		//Ordenamos las palabras del array
		Arrays.sort(ordenado);
		
		//Imprimimos el array ordenado
		System.out.println(Arrays.toString(ordenado));
		
		

	}

}
