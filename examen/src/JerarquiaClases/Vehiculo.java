package JerarquiaClases;

public class Vehiculo {

	private String modelo, marca;

	public Vehiculo(String marca, String modelo) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + "]";
	}

}
