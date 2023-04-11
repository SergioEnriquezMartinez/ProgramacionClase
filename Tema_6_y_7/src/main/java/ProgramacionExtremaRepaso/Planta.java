package ProgramacionExtremaRepaso;

import java.util.Objects;

public class Planta extends Producto {

	private static final String INVIERNO = "Invierno";
	private static final String OTONIO = "Otoño";
	private static final String VERANO = "Verano";
	private static final String PRIMAVERA = "Primavera";
	private static final String NAVIDAD = "Navidad";
	
	private static final String POCO_RIEGO = "Poco riego";
	private static final String NORMAL_RIEGO = "Riego normal";
	private static final String MUCHO_RIEGO = "Mucho riego";
	
	private boolean interior;
	private String temporada;
	private String riego;
	
	
	public Planta(double precioUnidad, int numeroUnidades, double tamanio, double peso, String nombreProducto,
			boolean interior, String temporada) {
		super(precioUnidad, numeroUnidades, tamanio, peso, nombreProducto);
		this.interior = interior;
		this.temporada = temporada;
	}


	public boolean isInterior() {
		return interior;
	}
	public void setInterior(boolean interior) {
		this.interior = interior;
	}


	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public String getRiego() {
		return riego;
	}
	public void setRiego(String riego) {
		this.riego = riego;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(interior, riego, temporada);
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
		Planta other = (Planta) obj;
		return interior == other.interior && Objects.equals(riego, other.riego)
				&& Objects.equals(temporada, other.temporada);
	}


	@Override
	public String toString() {
		return "Planta [interior=" + interior + ", temporada=" + temporada + ", riego=" + riego + "]";
	}



	
	
}
