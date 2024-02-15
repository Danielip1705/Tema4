package strings;

public class Ej9 {

	public static void main(String[] args) {

		String frase = "Javalín, javalón\t hola a todos chicos y chicas";
		String frase1 = "Hola a todos chicos y chicas \tjavalén, len, len";
		
		boolean esJavalandia = esJavalandia(frase1);
		
		String resultado = traducido(frase);
		System.out.println(resultado);
		
		

		if (esJavalandia) {

		}

	}

	public static boolean esJavalandia(String frase) {
		boolean esJavalandia = true;

		if (frase.startsWith("Javalín, javalón\t") | frase.endsWith("\tjavalén, len, len")) {

			esJavalandia = true;

		} else {

			esJavalandia = false;
		}

		return esJavalandia;
	}

	//Start Javalín, javalón\t
	//End \tjavalén, len, len
	public static String traducido(String frase) {

		String traducido = "";
		
		if(frase.startsWith("Javalín, javalón\t")) {
			
			traducido = frase.substring(frase.indexOf("\t")+2);
			
		} else if(frase.endsWith("\tjavalén, len, len")) {
			
			traducido = frase.substring(0,frase.indexOf("\t"));
		}
		
		
		
		return traducido;
	}
}
