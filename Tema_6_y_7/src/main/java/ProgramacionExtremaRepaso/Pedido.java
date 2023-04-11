package ProgramacionExtremaRepaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
	
	private int numReferencia;
	private String nombreDestinatario;
	private String primerApellidoDestinatario;
	private String segundoApellidoDestinatario;
	private String direccionDestinatario;
	private LocalDate fechaPedido;
	private LocalDateTime horaPedido;
	private List<Producto> cesta;
	
	public Pedido(int numReferencia, String nombreDestinatario, String primerApellidoDestinatario,
			String segundoApellidoDestinatario, String direccionDestinatario, LocalDate fechaPedido,
			LocalDateTime horaPedido) {
		super();
		this.numReferencia = numReferencia;
		this.nombreDestinatario = nombreDestinatario;
		this.primerApellidoDestinatario = primerApellidoDestinatario;
		this.segundoApellidoDestinatario = segundoApellidoDestinatario;
		this.direccionDestinatario = direccionDestinatario;
		this.fechaPedido = fechaPedido;
		this.horaPedido = horaPedido;
		this.cesta = new ArrayList<>();
	}
	
	public void addProducto(Producto p) {
		this.cesta.add(p);
	}
	
	public boolean remove(String nombreProducto) {
		for (Producto p : cesta) {
			if (p.getNombreProducto().equals(nombreProducto)) {
				cesta.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public double precioTotal(double precioUnidad, int numeroUnidades) {
		double costeTotal = 0;
		
		for (Producto p : cesta) {
			double costeCesta = p.getPrecioUnidad() * p.getNumeroUnidades();
			if (p instanceof RamoFlores) {
				if (((RamoFlores)p).getNumeroFlores() >= 5 && ((RamoFlores)p).getNumeroFlores() <= 10) {
					costeCesta *= 1.1;
				} else if (((RamoFlores)p).getNumeroFlores() > 10) {
					costeCesta *= 1.25;
				}
			}
			costeTotal += costeCesta;
		}
		return costeTotal;
	}


	public int getNumReferencia() {
		return numReferencia;
	}
	public void setNumReferencia(int numReferencia) {
		this.numReferencia = numReferencia;
	}
	

	public String getNombreDestinatario() {
		return nombreDestinatario;
	}
	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}
	

	public String getPrimerApellidoDestinatario() {
		return primerApellidoDestinatario;
	}
	public void setPrimerApellidoDestinatario(String primerApellidoDestinatario) {
		this.primerApellidoDestinatario = primerApellidoDestinatario;
	}
	

	public String getSegundoApellidoDestinatario() {
		return segundoApellidoDestinatario;
	}
	public void setSegundoApellidoDestinatario(String segundoApellidoDestinatario) {
		this.segundoApellidoDestinatario = segundoApellidoDestinatario;
	}
	

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}
	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	
	public LocalDateTime getHoraPedido() {
		return horaPedido;
	}
	public void setHoraPedido(LocalDateTime horaPedido) {
		this.horaPedido = horaPedido;
	}


	public List<Producto> getCesta() {
		return cesta;
	}
	public void setCesta(List<Producto> cesta) {
		this.cesta = cesta;
	}




	@Override
	public int hashCode() {
		return Objects.hash(cesta, direccionDestinatario, fechaPedido, horaPedido, nombreDestinatario, numReferencia,
				primerApellidoDestinatario, segundoApellidoDestinatario);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cesta, other.cesta) && Objects.equals(direccionDestinatario, other.direccionDestinatario)
				&& Objects.equals(fechaPedido, other.fechaPedido) && Objects.equals(horaPedido, other.horaPedido)
				&& Objects.equals(nombreDestinatario, other.nombreDestinatario) && numReferencia == other.numReferencia
				&& Objects.equals(primerApellidoDestinatario, other.primerApellidoDestinatario)
				&& Objects.equals(segundoApellidoDestinatario, other.segundoApellidoDestinatario);
	}




	@Override
	public String toString() {
		return "Pedido [numReferencia=" + numReferencia + ", nombreDestinatario=" + nombreDestinatario
				+ ", primerApellidoDestinatario=" + primerApellidoDestinatario + ", segundoApellidoDestinatario="
				+ segundoApellidoDestinatario + ", direccionDestinatario=" + direccionDestinatario + ", fechaPedido="
				+ fechaPedido + ", horaPedido=" + horaPedido + ", cesta=" + cesta + "]";
	}

	

	
	

}
