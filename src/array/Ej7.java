package array;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		//Creamos un array con la variable int y con logitud
		int temperatura[]=new int[12];
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//creamos bucle for para quue insertemos los datos en el array
		for(int i=0;i<temperatura.length;i++) {
			//imprimos en pantalla que nos inserte la tempertura
			System.out.println("Inserte la temperatura del mes de "+meses[i]);
			
			//Insertamos el dato en el array
			temperatura[i]=sc.nextInt();
			
		}
		//creamos bucle for para que lea el array en su totalidad
		for(int i=0;i<temperatura.length;i++) {
			System.out.println(meses[i]);
			System.out.println(temperatura[i]+"º");
			//creamos for anidado para que nos imprima una bara doble
			for(int j=1;j<=2;j++) {
				//creamos otro for anidado para que nos imprima "*" segun el numero que tenga
				for(int n=1;n<=temperatura[i];n++) {
					//imprimimos en consola *
					System.out.print("*");
				}
				//espacio de separacion para las dobles barras
				System.out.println();
				
			}
			//Separacion para clasificar el mes (dependiendo del tamaño de cada barra)
			System.out.println();
		}
		//cerramos scanner
		sc.close();
	}

}
