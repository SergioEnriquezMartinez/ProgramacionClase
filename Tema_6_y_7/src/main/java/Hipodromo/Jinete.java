package Hipodromo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Jinete {
	
	
	private int identificador;
	private String nombre;
	private int numCaballos;
	private int victorias;
	private Caballo [] caballos;
	private Caballo caballoUsado;
	private Random r = new Random();
	
	/**
	 * @param identificador
	 * @param nombre
	 * Creamos un objeto Jinete y 3 objetos Caballo
	 */
	public Jinete(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.numCaballos = 3;
		this.victorias = 0;
		this.caballos = new Caballo [numCaballos];
		
		for (int i = 0; i < caballos.length; i++) {
			 caballos[i] = new Caballo("Caballo" + i, "Raza" + i, r.nextInt(25) + 1);
		}
		
		for (int i = 0; i < caballos.length; i++) {
			int posicionCaballo = r.nextInt(3);
			caballoUsado = caballos[posicionCaballo];
		}
		
	}
	
	/**
	 * mostramos los caballos que pertenecen a un jinete
	 */
	public void mostrarCaballos() {
		for (Caballo c : caballos) {
			System.out.println(c);
		}
	}

	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumCaballos() {
		return numCaballos;
	}
	public void setNumCaballos(int numCaballos) {
		this.numCaballos = numCaballos;
	}

	public int getVictorias() {
		return victorias;
	}
	public void setVictorias() {
		this.victorias++;
		caballoUsado.setVictorias();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(caballos);
		result = prime * result + Objects.hash(identificador, nombre, numCaballos, r, victorias);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jinete other = (Jinete) obj;
		return Arrays.equals(caballos, other.caballos) && identificador == other.identificador
				&& Objects.equals(nombre, other.nombre) && numCaballos == other.numCaballos
				&& Objects.equals(r, other.r) && victorias == other.victorias;
	}

	@Override
	public String toString() {
		return "JINETE\nIdentificador: " + identificador + "\nNombre: " + nombre + "\nNúmero de caballos:" + numCaballos
				+ "\nVictorias: " + victorias;
	}
	
	
}
