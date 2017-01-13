package equipo.model.entities;

public class RaspberryPi {

	private String modelo;
	private double precio;

	public RaspberryPi(String modelo, double precio) {
		super();
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
