package strings;

public class Ej5 {

	public static void main(String[] args) {
		//Creamos con la clase String frase e inicializamos una cadena de texto
		String frase = "Probando frase";
		
		//Creamos con la clase String invertido que tendra inicializado el resultado de la funcion invertido
		String resultado = invertido(frase);
		
		//Imprimimos la variable resultado
		System.out.println(resultado);
		
	}
	
	//Creamos una funcion que tenga como parametro de entrada una cadena y que devuelva otra cadena invertida
	public static String invertido(String frase) {
		
		//Creamos con la clase String cadenaInvertida y que tenga inicializado una cadena vacia
		String cadenaInvertida="";
		
		//Creamos bucle for que lea la cadena frase invertida (de fin a principio)
		for(int i=frase.length()-1;i>=0;i--) {
			
			//Suma
			cadenaInvertida+=frase.charAt(i);
		}
		return cadenaInvertida;
	}

}
