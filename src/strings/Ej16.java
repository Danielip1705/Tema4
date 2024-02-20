package strings;

import java.util.Random;
import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase="";
		
		String anagrama="";
		
		String intento="";
		
		int letrasCoincidentes=0;
		
		System.out.println("Jugador 1: Escribe una palabra o frase:");
		
		 frase = sc.nextLine();

		 anagrama = desordenar(frase);
		
		System.out.println("Anagrama: " + anagrama);

		System.out.println("Jugador 2: ¿Cuál es el texto original?");
		
		intento = sc.nextLine().toLowerCase();
		
		letrasCoincidentes = palabrasAcertadas(frase, intento);
		
		System.out.println("Número de letras coincidentes: " + letrasCoincidentes);

		// Verificar si el intento coincide con el texto original
		if (intento.equalsIgnoreCase(frase)) {
			
			System.out.println("Correcto");
			
		} else {
			System.out.println("Incorrecto");
		}
	}

	public static String desordenar(String texto) {
		
		char[] caracteres = texto.toCharArray();
		
        String resultado;
        
        Random rand = new Random();
        
        int aleatorio;
        
        char cambio;

        // Desordenar los caracteres del texto
        for (int i = 0; i < caracteres.length; i++) {
        	
            aleatorio = rand.nextInt(caracteres.length);
            
            cambio = caracteres[i];
            
            caracteres[i] = caracteres[aleatorio];
            
            caracteres[aleatorio] = cambio;
        }

		resultado = String.valueOf(caracteres);
		
		return resultado;
	}

	public static int palabrasAcertadas(String texto1, String texto2) {
		
		int contador = 0;
		
		for (int i = 0; i < texto1.length(); i++) {
			
			if (texto2.contains(String.valueOf(texto1.charAt(i)))) {
				
				contador++;
			}
		}
		return contador;
	}
}
