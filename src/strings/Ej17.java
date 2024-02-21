package strings;

import java.util.Scanner;

public class Ej17 {

	public static final String FINAL = "*/";
	public static final String INICIO = "/*";

	public static void main(String[] args) {
		// Cramos scanner
		Scanner sc = new Scanner(System.in);

		// Creamos con String frase e inicializamos a cadena vacia
		String frase = "";

		// Creamos con String resultado e inicializamos a cadena vacia
		String resultado = "";

		// Imprimimos en consola que escriba el codigo
		System.out.println("Escriba el codigo");

		// Escribimos frase
		frase = sc.nextLine();

		// Inicializamos resultado al resultado de la funcion quitarLenguajeC
		resultado = quitarLenguajeC(frase);

		// Imprimimos en consola resultado
		System.out.println(resultado);
		
		//Cerramos scanner
		sc.close();

	}

	/***
	 * Funcion que quita comentarios de C
	 * 
	 * @param codigo Cadena que contiene comentarios de C
	 * @return codigo sin los comenarios
	 */
	public static String quitarLenguajeC(String codigo) {

		// Creamos con la variable int inicioComentario e incializamos al indice donde
		// esta el primer comentario
		int inicio = codigo.indexOf(INICIO);

		// Creamos con la variable int finComentario e incializamos al indice donde esta
		// el comentario cerrado
		int fin = 0;

		// Creamos bucle while para buscar si hay mas comentarios en la cadena
		while (inicio != -1) {

			fin = codigo.indexOf(FINAL, inicio);

			// Declaramos con if que si hay comenarios
			if (fin != -1) {

				// Le quitaremos a codigo los comentarios
				codigo = codigo.substring(0, inicio) + codigo.substring(fin + 2);
				// Si no hay cierre del comentario
			} else {
				 //Se elimina desde el inicio del comentario hasta el final de la cadena
				codigo = codigo.substring(0, inicio);
			}
			// Busca el siguiente inicio de comentario
			inicio = codigo.indexOf(INICIO);
		}
		//Devolvemos codigo
		return codigo;

	}

}
