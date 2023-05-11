package Pdf2_Ej3_Coches;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {
	private final int DESCUENTO = 15;
	
	private String matricula;
	private String modelo;
	private double precio;
	private LocalDateTime entradaEnExposicion;
	
	
	public Vehiculo(String matricula, String modelo, double precio, LocalDateTime entradaEnExposicion) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.precio = precio;
		this.entradaEnExposicion = LocalDateTime.now();
	}


	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public LocalDateTime getEntradaEnExposicion() {
		return entradaEnExposicion;
	}
	public void setEntradaEnExposicion(LocalDateTime entradaEnExposicion) {
		this.entradaEnExposicion = entradaEnExposicion;
	}
	
	public int getDESCUENTO() {
		return DESCUENTO;
	}


	@Override
	public int hashCode() {
		return Objects.hash(entradaEnExposicion, matricula, modelo, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(entradaEnExposicion, other.entradaEnExposicion)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", precio=" + precio
				+ ", entradaEnExposicion=" + entradaEnExposicion + "]";
	}
	
	
	
}
