 
package JerarquiaClases;
/**
 * Esta clase es hija de Automóvil y crea un objeto fórmula 1
 * @author amliz
 *
 */
public class Formula1 extends Automovil {

	
	private boolean kers;
/**
 *  Esto es el constructor de la clase y tiene como parámetros los siguientes:
 * @param marca (es la marca del vehículo)
 * @param modelo (el modelo del vehículo)
 * @param potencia (mide la potencia del vehículo)
 * @param kers (o lo tiene o no y se usa para cambiar la potencia)
 */
	public Formula1(String marca, String modelo, float potencia, boolean kers) {
		super(modelo, marca, potencia);
		this.kers = kers;
	}
/**
 * Es un método que devuelve buleano para saber si tiene o no kers
 * @return
 */
	public boolean isKers() {
		return kers;
	}
/**
 * Es un seter para cambiar el el valor de kers
 * @param kers
 */
	public void setKers(boolean kers) {
		this.kers = kers;
	}

/**
 * metodo que mide el índice de competición del vehículo dependiendo de si tiene o no kers 
 * @return
 */
	public float indiceCompeticion() {
		float indice = 0;

		if (kers == false) {
			indice = super.getPotencia() / 4;
		} else {
			indice = super.getPotencia() / 2;
		}
		return indice;
	}

	
	
	/**
	 * Es un toString que devuelve una cadena con todos los datos del vehículo creado
	 */
	public String toString() {
		return "Formula1 [modelo=" + super.getModelo() + ", marca=" + super.getMarca() + ",ruedas= 4, potencia_motor="
				+ getPotencia() + "kers=" + kers + ", isKers()=" + isKers() + ", indiceCompeticion()="
				+ indiceCompeticion() + "]";
	}

}
