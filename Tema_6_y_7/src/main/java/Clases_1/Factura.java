package Clases_1;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author sergi
 * Representa la factura que entregamos al cliente
 */
public class Factura {
	
	private Date fecha;
	private int numeroFactura;
	private ArrayList<LineaFactura> lineasFactura;
	private boolean pagada;
	
	public Factura(Date fecha, int numeroFactura, ArrayList<?> lineasFactura, boolean pagada) {
		this.fecha = fecha;
		this.numeroFactura = numeroFactura;
		this.lineasFactura = (ArrayList<LineaFactura>) lineasFactura;
		this.pagada = pagada;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public ArrayList<?> getLineasFactura() {
		return lineasFactura;
	}

	public void setLineasFactura(ArrayList<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	
	
	
}
