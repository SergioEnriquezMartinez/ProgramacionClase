package Hipodromo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Hipodromo {

	private Carrera[][] carrerasSemana;
	private String nombre;
	private String localizacion;

	/**
	 * @param nombre
	 * @param localizacion creamos un hipodromo y le asignamos el tipo de carrera
	 *                     segun el dia de la semana
	 */
	public Hipodromo(String nombre, String localizacion) {
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.carrerasSemana = new Carrera[3][7];

		for (int i = 0; i < carrerasSemana.length; i++) {
			for (int j = 1; j <= carrerasSemana[i].length - 1; j++) {
				if (j % 2 == 0) {
					carrerasSemana[i][j] = new Carrera("Plana", 5000);
				} else {
					carrerasSemana[i][j] = new Carrera("Obstaculo", 10000);
				}
			}
		}
	}

	/**
	 * muestra todas las carreras de la semana
	 */
	public void mostrarCarrerasSemana() {
		for (int i = 0; i < carrerasSemana.length; i++) {
			System.out.print("Carrera número: " + i + "\n");
			for (int j = 0; j < carrerasSemana[i].length; j++) {
				System.out.print("Día semana: " + j + "\n");
				System.out.print(carrerasSemana[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * @param dia tras pasarle un dia en concreto nos muestra todas las carreras de
	 *            ese dia
	 */
	public void mostrarCarrerasDia(int dia) {
		/*
		 * for (int i = 0; i < carrerasSemana.length; i++) { for (int j = dia; j <= dia;
		 * j++) { System.out.print(carrerasSemana[i][j]); } System.out.println(); }
		 */
		for (int i = 0; i < carrerasSemana.length; i++) {
			System.out.println(carrerasSemana[i][dia]);
		}
	}

	/**
	 * @param indexI
	 * @param indexJ le pasamos unas coordenadas de la carrera y nos muestra cual es
	 *               la carrera
	 */
	public void mostrarUnaCarrera(int indexI, int indexJ) {
		System.out.println(carrerasSemana[indexI][indexJ]);
	}

	public void generarGanadores() {
		for (int i = 0; i < carrerasSemana.length; i++) {
			for (int j = 0; j < carrerasSemana[i].length; j++) {
				Random r = new Random();
				int numParticipantes = carrerasSemana[i][j].getNumParticipantes();
				if (numParticipantes > 0) {
					int ganador = r.nextInt(carrerasSemana[i][j].getNumParticipantes() + 1);
					carrerasSemana[i][j].addVictoria(carrerasSemana[i][j].getJinete(ganador));
				}
			}
		}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(carrerasSemana);
		result = prime * result + Objects.hash(localizacion, nombre);
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
		Hipodromo other = (Hipodromo) obj;
		return Arrays.deepEquals(carrerasSemana, other.carrerasSemana)
				&& Objects.equals(localizacion, other.localizacion) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "HIPÓDROMO:\nNombre: " + nombre + "\nLocalizacion: "
				+ localizacion;
	}

}
