package ProgramacionExtremaRepaso;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class RamoFlores extends Producto{
	
	public static final String ROSA = "Rosa";
	public static final String LIRIO = "Lirio";
	public static final String CLAVEL = "Clavel";
	public static final String TULIPAN = "Tulipán";
	public static final String ORQUIDEA = "Orquídea";
	
	private String [] floresPosibles = {"Rosa", "Lirio", "Clavel", "Tulipán", "Orquídea"};
	
	private int numeroFlores;
	private String [] flor;
	
	public RamoFlores(double precioUnidad, int numeroUnidades, double tamanio, double peso, String nombreProducto, int numeroFlores) {
		super(precioUnidad, numeroUnidades, tamanio, peso, nombreProducto);
		this.numeroFlores = numeroFlores;
		this.flor = new String[numeroFlores];
		
		Random r = new Random();
		
		for (int i = 0; i < flor.length; i++) {
			flor[i] = floresPosibles[r.nextInt(5)];
		}
	}

	
	
	
	
	public String[] getFloresPosibles() {
		return floresPosibles;
	}
	public void setFloresPosibles(String[] floresPosibles) {
		this.floresPosibles = floresPosibles;
	}

	
	public int getNumeroFlores() {
		return numeroFlores;
	}
	public void setNumeroFlores(int numeroFlores) {
		this.numeroFlores = numeroFlores;
	}

	
	public String[] getFlor() {
		return flor;
	}
	public void setFlor(String[] flor) {
		this.flor = flor;
	}



	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(flor);
		result = prime * result + Arrays.hashCode(floresPosibles);
		result = prime * result + Objects.hash(numeroFlores);
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
		RamoFlores other = (RamoFlores) obj;
		return Arrays.equals(flor, other.flor) && Arrays.equals(floresPosibles, other.floresPosibles)
				&& numeroFlores == other.numeroFlores;
	}





	@Override
	public String toString() {
		return "RamoFlores [ROSA=" + ROSA + ", LIRIO=" + LIRIO + ", CLAVEL=" + CLAVEL + ", TULIPAN=" + TULIPAN
				+ ", ORQUIDEA=" + ORQUIDEA + ", floresPosibles=" + Arrays.toString(floresPosibles) + ", numeroFlores="
				+ numeroFlores + ", flor=" + Arrays.toString(flor) + "]";
	}
	
	

}
