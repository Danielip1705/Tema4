package array;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		double tabla[] = new double [5];
		
		Scanner sc = new Scanner(System.in);

		
		for (int i=0;i<tabla.length;i++) {
			
			System.out.println("Inserte un numero");
			tabla[i] =sc.nextDouble();  
			
		}
		for(double num : tabla) {
			System.out.println(num);
		}
		sc.close();
	}

}
