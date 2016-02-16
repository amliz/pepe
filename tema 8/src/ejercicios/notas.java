package ejercicios;

import java.util.*;




public class notas {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		int [] notas =new int[10];
		int i=0;
		int suma=0;
		float media;
		
		while (i<10){
			System.out.println("introduzca " + (i+1) + "ª nota: ");
			notas[i]=teclado.nextInt();
			suma+=notas[i];
			i++;
		}
		media=suma/notas.length;
		
		System.out.println(media);
		
		teclado.close();

	}

}
