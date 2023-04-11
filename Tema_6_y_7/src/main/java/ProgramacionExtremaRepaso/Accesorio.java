package ProgramacionExtremaRepaso;

import java.util.Objects;

public class Accesorio extends Producto {
	
	
	private boolean pilas;
	private int numeroAccesorios;
	
	
	public Accesorio(double precioUnidad, int numeroUnidades, double tamanio, double peso, String nombreProducto,
			boolean pilas, int numeroAccesorios) {
		super(precioUnidad, numeroUnidades, tamanio, peso, nombreProducto);
		this.pilas = pilas;
		this.numeroAccesorios = numeroAccesorios;
	}


	public boolean isPilas() {
		return pilas;
	}
	public void setPilas(boolean pilas) {
		this.pilas = pilas;
	}


	public int getNumeroAccesorios() {
		return numeroAccesorios;
	}
	public void setNumeroAccesorios(int numeroAccesorios) {
		this.numeroAccesorios = numeroAccesorios;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroAccesorios, pilas);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accesorio other = (Accesorio) obj;
		return numeroAccesorios == other.numeroAccesorios && pilas == other.pilas;
	}


	@Override
	public String toString() {
		return "Accesorio [pilas=" + pilas + ", numeroAccesorios=" + numeroAccesorios + "]";
	}
	
	
}
