package Clases;

public class habitaciones {
	private int id;
	private int id_hotel;
	private String numero;
	private String descripcion;
	private double precio;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_hotel() {
		return id_hotel;
	}
	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public habitaciones(int id, int id_hotel, String numero, String descripcion, double precio) {
		this.id = id;
		this.id_hotel = id_hotel;
		this.numero = numero;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public habitaciones() {
	}
	@Override
	public String toString() {
		return id + ", " + id_hotel + ", " + numero + ", " + descripcion + ", " + precio;
	}
	
	
}
