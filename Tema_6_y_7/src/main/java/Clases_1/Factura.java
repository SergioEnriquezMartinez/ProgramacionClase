package Clases_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author sergi
 * Representa la factura que entregamos al cliente
 */
public class Factura {
	
	private LocalDate fecha;
	private int numeroFactura;
	private ArrayList<LineaFactura> lineasFactura;
	private boolean pagada;
	
	public Factura(LocalDate fecha, int numeroFactura, boolean pagada) {
		this.fecha = fecha;
		this.numeroFactura = numeroFactura;
		this.lineasFactura = new ArrayList<LineaFactura>();
		this.pagada = pagada;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
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

	@Override
	public int hashCode() {
		return Objects.hash(fecha, lineasFactura, numeroFactura, pagada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(lineasFactura, other.lineasFactura)
				&& numeroFactura == other.numeroFactura && pagada == other.pagada;
	}

	@Override
	public String toString() {
		return "Factura => fecha '" + fecha + "', numeroFactura '" + numeroFactura + "', lineasFactura '" + lineasFactura
				+ "', pagada '" + pagada + "'\n";
	}
	
	
	
}
