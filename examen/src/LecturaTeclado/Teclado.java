package LecturaTeclado;

import java.util.*;

public class Teclado {

	public static Scanner teclado;

	static {
		Scanner teclado = new Scanner(System.in);
	}

	public static int pedirEntero(String a) {
		int num=0;
		
		num=teclado.nextInt();
		return num;
	}

	public static String pedirCadena(String string) {
		String cad;
		cad = teclado.nextLine();
		return cad;
	}

	public static float pedirFloat(String string) {
		float num;
		num=teclado.nextFloat();		
		return num;
	}

}
