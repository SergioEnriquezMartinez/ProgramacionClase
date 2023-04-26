package Pdf1_Ej3_Amigos;

import java.util.Objects;

public class Amigo {
	
	private String nombre;
	private String apodo;
	
	
	public Amigo(String nombre, String apodo) {
		this.nombre = nombre;
		this.apodo = apodo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apodo, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amigo other = (Amigo) obj;
		return Objects.equals(apodo, other.apodo) && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", apodo=" + apodo + "]";
	}
	
	
}
