package array;

public class Ej4 {

	public static void main(String[] args) {
		//Creamos array de longitud 12 con la variable int
		int lista [] = new int [12];
		
		//Asignamos los valores a cada longitud
		lista[0] =39;
		lista[1]=-2;
		lista[4]= 0;
		lista[6]=14;
		lista[8]=5;
		lista[9]=120;
		//Con bucle for imprimimos en consola el array
		for (int i=0;i<lista.length;i++) {
			
			//imprimimos array
			System.out.print(" "+lista[i]+" ");
		}
	}

}
