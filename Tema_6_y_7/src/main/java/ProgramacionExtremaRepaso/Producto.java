package ProgramacionExtremaRepaso;

import java.util.Objects;

public class Producto {
	
	private double precioUnidad;
	private int numeroUnidades;
	private double tamanio;
	private double peso;
	private String nombreProducto;
	
	
	public Producto(double precioUnidad, int numeroUnidades, double tamanio, double peso, String nombreProducto) {
		super();
		this.precioUnidad = precioUnidad;
		this.numeroUnidades = numeroUnidades;
		this.tamanio = tamanio;
		this.peso = peso;
		this.nombreProducto = nombreProducto;
	}


	public double getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}


	public int getNumeroUnidades() {
		return numeroUnidades;
	}
	public void setNumeroUnidades(int numeroUnidades) {
		this.numeroUnidades = numeroUnidades;
	}


	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}


	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nombreProducto, numeroUnidades, peso, precioUnidad, tamanio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombreProducto, other.nombreProducto) && numeroUnidades == other.numeroUnidades
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Double.doubleToLongBits(precioUnidad) == Double.doubleToLongBits(other.precioUnidad)
				&& Double.doubleToLongBits(tamanio) == Double.doubleToLongBits(other.tamanio);
	}


	@Override
	public String toString() {
		return "Producto [precioUnidad=" + precioUnidad + ", numeroUnidades=" + numeroUnidades + ", tamanio=" + tamanio
				+ ", peso=" + peso + ", nombreProducto=" + nombreProducto + "]";
	}
	
	

}
