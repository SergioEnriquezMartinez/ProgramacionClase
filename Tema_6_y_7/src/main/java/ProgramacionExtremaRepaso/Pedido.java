package ProgramacionExtremaRepaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pedido {
	
	private int numReferencia;
	private String nombreDestinatario;
	private String primerApellidoDestinatario;
	private String segundoApellidoDestinatario;
	private String direccionDestinatario;
	private LocalDate fechaPedido;
	private LocalDateTime horaPedido;
	
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
	}
	
	
	
	
	/*public double precioTotal(double precioUnidad, int numeroUnidades) {
		
		return this.precioUnidad * this.numeroUnidades;
	}*/


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

	
	@Override
	public int hashCode() {
		return Objects.hash(direccionDestinatario, fechaPedido, horaPedido, nombreDestinatario, numReferencia,
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
		return Objects.equals(direccionDestinatario, other.direccionDestinatario)
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
				+ fechaPedido + ", horaPedido=" + horaPedido + "]";
	}
	
	

}
