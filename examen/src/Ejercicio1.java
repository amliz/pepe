import JerarquiaClases.*;
import LecturaTeclado.Teclado;

public class Ejercicio1 {
	public static int menu() {
		int opcion = 0;

		do {
			System.out.println("\n");
			System.out.println("1 - Introducir Vehiculos");
			System.out.println("2 - Mostrar vehiculo con indice de competicion mayor");
			System.out.println("0 - Salir");
			opcion = Teclado.pedirEntero("Introduce una opcion: ");
		} while ((opcion < 0) || (opcion > 2));

		return opcion;
	}

	public static Formula1 crearFormula1() {
		String marca, modelo, cadena = "";
		float potencia = 0;
		boolean kers = false;

		System.out.println("-- FORMULA 1 --");
		marca = Teclado.pedirCadena("Introduce la marca: ");
		modelo = Teclado.pedirCadena("Introduce el modelo: ");
		potencia = Teclado.pedirFloat("Introduce la potencia del motor: ");

		do {
			cadena = Teclado.pedirCadena("Tiene KERS (S/N): ").substring(0, 1).toUpperCase();
		} while ((cadena.compareTo("S") != 0) && (cadena.compareTo("N") != 0));
		if (cadena.compareTo("S") == 0)
			kers = true;
		else
			kers = false;

		return new Formula1(marca, modelo, potencia, kers);
	}

	public static Moto crearMoto() {
		String marca, modelo;
		float cilindrada = 0;

		System.out.println("-- MOTO --");
		marca = Teclado.pedirCadena("Introduce la marca: ");
		modelo = Teclado.pedirCadena("Introduce el modelo: ");
		cilindrada = Teclado.pedirFloat("Introduce la cilindrada: ");

		return new Moto(marca, modelo, cilindrada);
	}

	public static Camion crearCamion() {
		int ruedas = 0;
		String marca, modelo;
		float potencia = 0;

		System.out.println("-- CAMION --");
		marca = Teclado.pedirCadena("Introduce la marca: ");
		modelo = Teclado.pedirCadena("Introduce el modelo: ");
		potencia = Teclado.pedirFloat("Introduce la potencia del motor: ");
		ruedas = Teclado.pedirEntero("Introduce el numero de ruedas: ");

		return new Camion(marca, modelo, potencia, ruedas);
	}

	public static void main(String[] args) {
		Formula1 veh1 = null;
		Moto veh2 = null;
		Camion veh3 = null;
		int opcion = 0;

		do {
			opcion = menu();
			if (opcion == 1) {
				veh1 = crearFormula1();
				veh2 = crearMoto();
				veh3 = crearCamion();
			} else if (opcion == 2) {

			}
		} while (opcion != 0);
	}
}