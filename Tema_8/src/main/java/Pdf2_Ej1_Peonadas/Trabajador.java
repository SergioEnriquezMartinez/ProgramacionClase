package Pdf2_Ej1_Peonadas;

import java.util.Objects;

public class Trabajador {
	
	
	private String nombre;
	private int peonadas;
	
	
	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
		this.peonadas = 0;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPeonadas() {
		return peonadas;
	}
	public void setPeonadas() {
		this.peonadas++;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nombre, peonadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajador other = (Trabajador) obj;
		return Objects.equals(nombre, other.nombre) && peonadas == other.peonadas;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", peonadas=" + peonadas + "]";
	}
	
	
	
}
