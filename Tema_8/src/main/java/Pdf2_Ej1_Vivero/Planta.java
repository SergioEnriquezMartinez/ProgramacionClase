package Pdf2_Ej1_Vivero;

import java.io.Serializable;
import java.util.Objects;

public class Planta implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private int codigo;
	private String nombreVulgar;
	private String nombreCientifico;
	private double precio;
	private int cantidad;
	
	
	public Planta(int codigo, String nombreVulgar, String nombreCientifico, double precio, int cantidad) {
		super();
		this.codigo = codigo;
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, codigo, nombreCientifico, nombreVulgar, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planta other = (Planta) obj;
		return cantidad == other.cantidad && codigo == other.codigo
				&& Objects.equals(nombreCientifico, other.nombreCientifico)
				&& Objects.equals(nombreVulgar, other.nombreVulgar)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
