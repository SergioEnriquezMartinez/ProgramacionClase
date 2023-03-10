package Pdf_1;

import java.util.Objects;

public class Cliente {
	
	
	private int numCarnet;
	private String nombre;
	
	public Cliente(int numCarnet, String nombre) {
		this.numCarnet = numCarnet;
		this.nombre = nombre;
	}
	
	public int getNumCarnet() {
		return numCarnet;
	}
	public void setNumCarnet(int numCarnet) {
		this.numCarnet = numCarnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [numCarnet=" + numCarnet + ", nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numCarnet);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nombre, other.nombre) && numCarnet == other.numCarnet;
	}
}
