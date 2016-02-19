package JerarquiaClases;

public class Camion extends Vehiculo {

	private int ruedas;
	private float potencia;

	public Camion(String marca, String modelo, float potencia, int ruedas) {
		super(marca, modelo);
		this.ruedas = ruedas;
		this.potencia = potencia;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float indiceCompeticion() {
		float indice = 0;

		indice = (float) ((potencia * 1.25) / ruedas);

		return indice;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Camion))
			return false;
		Camion other = (Camion) obj;
		if (Float.floatToIntBits(potencia) != Float.floatToIntBits(other.potencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Camion [ruedas=" + ruedas + ", potencia=" + potencia + ", getRuedas()=" + getRuedas()
				+ ", getPotencia()=" + getPotencia() + ", indiceCompeticion()=" + indiceCompeticion() + ", getModelo()="
				+ getModelo() + ", getMarca()=" + getMarca() + ", toString()=" + super.toString() + "]";
	}

}
