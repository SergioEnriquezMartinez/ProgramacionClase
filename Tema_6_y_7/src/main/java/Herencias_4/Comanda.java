package Herencias_4;

import java.util.ArrayList;

public class Comanda {
	
	private int numeroMesa;
	private int numeroComensales;
	private ArrayList<Plato> platos;
	
	
	public Comanda(int numeroMesa, int numeroComensales) {
		this.numeroMesa = numeroMesa;
		this.numeroComensales = numeroComensales;
		this.platos = new ArrayList<Plato>();
	}
	
	/**
	 * @return devuelve el coste total
	 */
	public float coste() {
		float coste = 0;
		for (Plato plato : platos) {
			coste += plato.getPrecio();
		}
		return coste;
	}
	
	/**
	 * @return devuelve un true si hay diabeticos y un false sino
	 */
	public boolean hayDiabeticosEnLaMesa() {
		for (Plato plato : platos) {
			if((plato instanceof Postre) && ((Postre) plato).isDiabeticos()) {
				return true;
			}
		}
		return false;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getNumeroComensales() {
		return numeroComensales;
	}

	public void setNumeroComensales(int numeroComensales) {
		this.numeroComensales = numeroComensales;
	}
	
	public ArrayList<Plato> getPlatos() {
		return platos;
	}

	public void añadirPlatos(Plato platos) {
		this.platos.add(platos);
	}


	@Override
	public String toString() {
		return "Comanda => numeroMesa:" + numeroMesa + "\nNumeroComensales:" + numeroComensales + "\nPlato" + platos.toString();
	}
	

	
}
