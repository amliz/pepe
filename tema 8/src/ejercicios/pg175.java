package ejercicios;
import java.util.*;

public class pg175 {

	static Scanner teclado;
	static{
		teclado = new Scanner(System.in);
	}


	public static void main(String[] args) {

		int[]notas = new int[5];


		for(int cont=0; cont<notas.length; cont++){
			System.out.println("introduzca la " +(cont+1)+ " ª nota: ");
			notas[cont]=teclado.nextInt();
			
		}
		System.out.println("introduzca la nota que desea buscar: ");
		int buscar1 = teclado.nextInt();

		buscador(notas,buscar1);
		if (buscador(notas,buscar1)==-1) {
			System.out.println("El nota buscada no existe");

		}else{
			System.out.println("La nota esta en la posicion "+ (buscador(notas,buscar1)+1) );
		}
		
	}

	public static int buscador(int[]notas,int buscar1){ 
		
		int pos = 0;

		int guardar=-1;


		

		while(pos<notas.length){

			if (buscar1==notas[pos]){
				guardar=pos;
			}

			pos++;

		}

		return guardar;
	}	

}
