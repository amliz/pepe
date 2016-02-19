package JerarquiaClases;

public class Moto extends Vehiculo {

	private static int ruedas = 2;
	private float ciclindrada;

	public Moto(String marca, String modelo, float ciclindrada) {
		super(marca, modelo);
		this.ciclindrada = ciclindrada;
	}

	public float getCiclindrada() {
		return ciclindrada;
	}

	public void setCiclindrada(float ciclindrada) {
		this.ciclindrada = ciclindrada;
	}

	public float indiceCompeticion() {

		float indice = 0;

		indice = (getCiclindrada() + 100) / 2;

		return indice;

	}

	public String toString() {
		return "Moto [ciclindrada=" + ciclindrada + ", getCiclindrada()=" + getCiclindrada() + ", indiceCompeticion()="
				+ indiceCompeticion() + ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", toString()="
				+ super.toString() + " ]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Moto))
			return false;
		Moto other = (Moto) obj;
		if (Float.floatToIntBits(ciclindrada) != Float.floatToIntBits(other.ciclindrada))
			return false;
		return true;
	}

}
