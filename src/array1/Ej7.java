package array1;

import java.util.Arrays;

public class Ej7 {

	public static void main(String[] args) {
		//cr
		int lista[] = new int[6];
		
		int ganador[] = {34,27,19,17,1,7};
		
		int aciertos=0;
		System.out.println("Numero Ganador");
		
		System.out.println(Arrays.toString(ganador));
		
		System.out.println("Mi numero");
		
		for(int i=0;i<lista.length;i++) {
			lista[i]=(int) (Math.random()*50);
		}
		System.out.println(Arrays.toString(lista));
		for(int i=0;i<lista.length;i++) {
			for(int j=0;j<lista.length;j++) {
				if(lista[j]==ganador[i]) {
					aciertos++;
				}
			}
		}
		System.out.println("Numero de aciertos: "+aciertos);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
