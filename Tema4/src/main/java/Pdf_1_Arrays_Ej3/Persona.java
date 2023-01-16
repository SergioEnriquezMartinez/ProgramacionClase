package Pdf_1_Arrays_Ej3;

import java.util.Objects;

public class Persona {
	
	public String nombre;
	public String direccion;
	
	
	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}


	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(direccion, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre);
	}




	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + "]";
	}


	
	

}
