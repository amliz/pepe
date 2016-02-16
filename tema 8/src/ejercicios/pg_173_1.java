package ejercicios;
import java.util.*;
public class pg_173_1 {
	
		public static int[] entero(int[] a){
			
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0;i < a.length;i++){
			System.out.println("introduzca el " +(i+1)+ " º entero: ");
			a[i]=teclado.nextInt();
			}
		return a;
		
		/*for (i=0;i < entero.length;i++){
			System.out.println("El "+(i+1)+ "º entero introducido fue: "+entero[i]);
		
			
		}*/
		
		}
	public static void main(String[] args) {
				
		int[] vector = new int[5];
			
		vector = entero(vector);
				
		for (int contador = 0; contador < vector.length; contador++)
		{
			System.out.println("el "+(contador+1)+"º numero es: " +vector[contador]);
		}
		
		
	}

}
