package VehiculosSeguros;

import java.time.LocalDate;

public class Seguro {
	private LocalDate fechRenovacion;
	private float precio;
	
	public Seguro(int cv) {
		this.fechRenovacion = LocalDate.now().plusYears(1);
		if(cv >= 50 && cv < 100) {
			this.precio = 400;
		} else if(cv >= 100 && cv <= 115) {
			this.precio = 500;
		} else if(cv > 115) {
			this.precio = 700;
		}
	}
	public LocalDate getFechRenovacion() {
		return fechRenovacion;
	}
	public void setFechRenovacion(LocalDate fechRenovacion) {
		this.fechRenovacion = fechRenovacion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Fecha de renovacion: " + fechRenovacion + "\nPrecio: " + precio;
	}
}
