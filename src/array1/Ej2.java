package array1;

import java.util.Arrays;

public class Ej2 {

	public static void main(String[] args) {
		
		//creamos 
		int lista[]= new int[55];
		
		int inicio=0,fin=0;
		
		for(int i =1;i<=10;i++) {
			
			fin+=i;
			
			Arrays.fill(lista, inicio,fin,i);
			
			inicio+=i;
			
		}
		
		//Arrays.fill(lista, 0,1,1);
		//Arrays.fill(lista, 1,3,2);
		//Arrays.fill(lista, 3,6,3);
		//Arrays.fill(lista,6,10,4);
		
		
		
		System.out.println(Arrays.toString(lista));
	}

}
