package Pdf1_Ej1_CuentaCorriente;

import java.util.Objects;

public class Cliente {
	
	private String nombre;
	private String dni;
	private long telefono;
	
	
	public Cliente(String nombre, String dni, long telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, telefono);
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
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + "]";
	}
	
	
}
