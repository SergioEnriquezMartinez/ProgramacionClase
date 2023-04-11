package ProgramacionExtremaRepaso;

public class RamoFlores extends Producto{
	
	public final String ROSA = "Rosa";
	public final String LIRIO = "Lirio";
	public final String CLAVEL = "Clavel";
	public final String TULIPAN = "Tulipán";
	public final String ORQUIDEA = "Orquídea";
	
	private String [] floresPosibles = {"Rosa", "Lirio", "Clavel", "Tulipán", "Orquídea"};
	
	private int numeroFlores;
	private String [] flor;
	
	public RamoFlores(double precioUnidad, int numeroUnidades, double tamanio, double peso, String nombreProducto, int numeroFlores) {
		super(precioUnidad, numeroUnidades, tamanio, peso, nombreProducto);
		this.numeroFlores = numeroFlores;
		this.flor = new String[numeroFlores];
	}
	
	

}
