package Ferreteria;

public class Caja {
	
	
	private Producto [] contenidoCaja;
	private String idCaja;
	
	
	public Caja() {
		this.contenidoCaja = new Producto [3];
	}


	public Producto[] getContenidoCaja() {
		return contenidoCaja;
	}


	public void setContenidoCaja(Producto[] contenidoCaja) {
		this.contenidoCaja = contenidoCaja;
	}


	public String getIdCaja() {
		return idCaja;
	}


	public void setIdCaja(String idCaja) {
		this.idCaja = idCaja;
	}
	
	
	
}
