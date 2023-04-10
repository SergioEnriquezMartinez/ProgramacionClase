package Hipodromo;

import java.util.Objects;

public class Caballo {
	
	
	private String nombre;
	private String raza;
	private int edad;
	private int victorias;
	
	
	/**
	 * @param nombre
	 * @param raza
	 * @param edad
	 * creamos el objeto caballo
	 */
	public Caballo(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.victorias = 0;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getVictorias() {
		return victorias;
	}
	public void setVictorias() {
		this.victorias++;
	}


	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, raza, victorias);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caballo other = (Caballo) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre) && Objects.equals(raza, other.raza)
				&& victorias == other.victorias;
	}


	@Override
	public String toString() {
		return "CABALLO\nNombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nVictorias: " + victorias;
	}
	
	
}
