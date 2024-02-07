package strings;

public class Ej3 {

	public static void main(String[] args) {
	//Creamos con la clase String frase donde tendra una frase inicializado
	String frase = "Hola a todos";
	
	//Creamos con la variable int espacios que estara inicializado al resultado de la funcion contarEspacios
	int espacios =contarEspacios(frase);
	
	//Imprimimos en el numero de caracteres
	System.out.println("Numero de espacios en la frase: "+espacios);
	}

	//Creamos una funcion que devuelva un numero entero y que tenga como parametro de entrada un String
	public static int contarEspacios(String frase) {
		
		//Creamos con la variable char comprobacion
		char comprobacion;
		
		//Creamos con la variable int espacios e inicializamos a 0
		int espacios=0;
		
		//Creamos bucle for para que recorra la frase
		for(int i =0;i<frase.length();i++) {
		
			//Hacemos que comprobacion sea la posicion i de la frase (si i=0, comprobacion=H)
			comprobacion= frase.charAt(i);
		//Declaramos con if que si comprobacion es igual a espacio
		if (comprobacion == ' ') {
			
			//Espacios se incrementa
			espacios++;
		}
		
		}
		
		//Devolvemos espacios
		return espacios;
	}
}
