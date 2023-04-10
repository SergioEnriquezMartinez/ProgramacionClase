package Hipodromo;

import java.util.Arrays;
import java.util.Objects;

public class Carrera {
	
	private String tipoCarrera;
	private int numParticipantes;
	private int premio;
	private Jinete [] listaParticipantes;
	
	
	/**
	 * @param tipoCarrera
	 * @param premio
	 * creamos la carrera, si la carrera es plana tendremos 6 participantes y si es de obstaculos tendremos 4
	 */
	public Carrera(String tipoCarrera, int premio) {
		this.tipoCarrera = tipoCarrera;
		this.premio = premio;
		if (this.tipoCarrera.equalsIgnoreCase("plana")) {
			this.numParticipantes = 6;
		} else if (this.tipoCarrera.equalsIgnoreCase("obstaculo")) {
			this.numParticipantes = 4;
		} 
		
		this.listaParticipantes = new Jinete [numParticipantes];
		for (int i = 0; i < numParticipantes; i++) {
			listaParticipantes[i] = new Jinete(25 + i, "Jinete" + i);
		}
	}
	
	/**
	 * mostramos la lista de participantes
	 */
	public void mostrarParticipantes() {
		for (Jinete j : listaParticipantes) {
			System.out.println(j);
		}
	}
	
	/**
	 * @param j
	 * añade victorias al jinete ganador que le pasemos por parámetro
	 * @return true en caso afirmativo y return false en caso de no añadirlo
	 */
	public boolean addVictoria(Jinete j) {
		for (int i = 0; i < listaParticipantes.length; i++) {
			if (listaParticipantes[i].getIdentificador() == j.getIdentificador()) {
				listaParticipantes[i].setVictorias();
				return true;
			}
		}
		return false;
	}
	public Jinete getJinete(int index) {
		for (int i = 0; i < listaParticipantes.length; i++) {
			if (listaParticipantes[i].getIdentificador() == index) {
				return listaParticipantes[i];
			}
		}
		return null;
	}

	public String getTipoCarrera() {
		return tipoCarrera;
	}

	public void setTipoCarrera(String tipoCarrera) {
		this.tipoCarrera = tipoCarrera;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	public Jinete[] getListaParticipantes() {
		return listaParticipantes;
	}

	public void setListaParticipantes(Jinete[] listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(listaParticipantes);
		result = prime * result + Objects.hash(numParticipantes, premio, tipoCarrera);
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
		Carrera other = (Carrera) obj;
		return Arrays.equals(listaParticipantes, other.listaParticipantes) && numParticipantes == other.numParticipantes
				&& premio == other.premio && Objects.equals(tipoCarrera, other.tipoCarrera);
	}

	@Override
	public String toString() {
		return "CARRERA\nTipo de carrera: " + tipoCarrera + "\nNúmero de participantes: " + numParticipantes + "\nPremio: " + premio
				+ "\n";
	}
	
	
}
