package entity;

public class Celular {

	private String imei;
	private String marca;
	private String modelo;
	private String numero;
	private int costo;

	// Constructor específico
	public Celular(String imei, String marca, String modelo, String numero, int costo) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.numero = numero;
		this.costo = costo;
	}

	// Métodos set y get
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

}
