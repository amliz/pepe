package JerarquiaClases;

public class Automovil extends Vehiculo{
	
	private static int ruedas = 4;
	private float potencia;
	
	/** esto es un comentario para javadoc sí
	 * 
	 * @param marca
	 * @param modelo
	 * @param potencia
	 */
	public Automovil(String marca, String modelo, float potencia) {
		super(modelo, marca);
		
		this.potencia = potencia;
	}
	
	public float getPotencia() {
		return potencia;
	}
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Automovil [modelo=" + super.getModelo() + ", marca=" + super.getMarca() + ",ruedas=" + ruedas
				+ ", potencia_motor=" + potencia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		if (Float.floatToIntBits(potencia) != Float.floatToIntBits(other.potencia))
			return false;
		return true;
	}
	
	











	
	
	
	
	

	
	
	
}
