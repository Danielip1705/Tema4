package strings;

import java.util.Scanner;

public class Ej17 {

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
		int inicioComentario = codigo.indexOf("/*");

		// Creamos con la variable int finComentario e incializamos al indice donde esta
		// el comentario cerrado
		int finComentario = 0;

		// Creamos bucle while para buscar si hay mas comentarios en la cadena
		while (inicioComentario != -1) {

			finComentario = codigo.indexOf("*/", inicioComentario);

			// Declaramos con if que si hay comenarios
			if (finComentario != -1) {

				// Le quitaremos a codigo los comentarios
				codigo = codigo.substring(0, inicioComentario) + codigo.substring(finComentario + 2);
				// Si no hay cierre del comentario
			} else {
				 //Se elimina desde el inicio del comentario hasta el final de la cadena
				codigo = codigo.substring(0, inicioComentario);
			}
			// Busca el siguiente inicio de comentario
			inicioComentario = codigo.indexOf("/*");
		}
		//Devolvemos codigo
		return codigo;

	}

}
