package strings;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		//Creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos con String titulo e inicializamos a cadena vacia
		String titulo="";
		
		//Creamos con String cuerpo e inicializamos a cadena vacia
		String cuerpo="";
		
		//Creamos con String resultado e inicializamos a cadena vacia
		String resultado="";
		
		//Imprimimos en consola que escriba el titulo
		System.out.println("Escriba el titulo");
		
		//Escribimos codigo
		titulo = sc.nextLine();
		
		//Imprimimos en consola que escriba el cuerpo
		System.out.println("Escribe el cuerpo");
		
		//Escribimos cuerpo
		cuerpo = sc.nextLine();
		
		//Inicializamos resultado al resultado de la funcion generarHtml
		resultado = generarHtml(titulo, cuerpo);
		
		//Imprimimos resultado
		System.out.println(resultado);
		
	}
	
	/***
	 * Funcion que pasa cadenas a titulo y cuerpo en formato HTML
	 * @param titulo cadena que sera el titulo del html
	 * @param cuerpo cadena que sera el cuerpo del html
	 * @return cadena en formato html
	 */
	public static String generarHtml(String titulo, String cuerpo) {
		
		//Creamos con String html e inicializamos al formato html con el titulo y el cuerpo
		String html="<!DOCTYPE html>\n"+
	"<html>\n"+
	"<head>\n"+
	"<meta charset=\"utf-8\">\n"+
	"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"+
	"<title>"+titulo+"</title>\n"+
	"</head>\n"+
	"<body>\n"+
	"<p>"+cuerpo+"<p>\n"+
	"</body>\n"+
	"</html>\n";
		
		//Devolvemos html
		return html;
	}

}
