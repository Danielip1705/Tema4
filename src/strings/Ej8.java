package strings;

public class Ej8 {

	public static void main(String[] args) {

		// Con la clase String creamos frase e incializamos con una cadena
		String frase = "Dabale arroz a la zorra elabad";
		
		frase= frase.toLowerCase();
		
		frase = frase.replace(" ", "");

		// Creamos con la variable boolean e inicializamos con el resultado con nos a
		// dado la funcion palindroma
		boolean esPalindroma = palindroma(frase);

		// Declaramos con if que si esPalindroma es true
		if (esPalindroma) {

			// Imprimimos en consola que es palindroma
			System.out.println("Es palindroma");

			// y si no
		} else {

			// Imprimimos en pantalla que no es palidroma
			System.out.println("No es palindroma");
		}

	}

	/**
	 * Funcion que indica si la variable frase es palindroma o no
	 * 
	 * @param frase Cadena con una frase
	 * @return Valor booleano
	 */
	public static boolean palindroma(String frase) {

		// Creamos con la variable boolean esPalindroma e inicializamos a true
		boolean esPalindroma = true;

		// Creamos con la clase String palindroma e inicializamos con cadena la cadena
		// invertida
		String palindroma = "";

		// Creamos bucle for que lea la cadena frase invertida (de fin a principio)
		for (int i = frase.length() - 1; i >= 0; i--) {

			// Concatenamos los caracteres en cadenaInvertida
			palindroma += frase.charAt(i);
		}

		// Creamos bucle for que recorra palindroma
		for (int i = 0; i < palindroma.length(); i++) {

			// Declaramos con if que si la primera silaba de frase y palindroma es distinto
			if (frase.charAt(i) != palindroma.charAt(i)) {

				// esPalindroma es falso
				esPalindroma = false;
			}

		}
		// Devolvemos esPalindroma
		return esPalindroma;

	}
}
