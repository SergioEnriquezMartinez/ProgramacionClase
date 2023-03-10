package Pdf_1;

import java.time.LocalDate;
import java.util.Objects;

public class Prestamo {
	
private final int DIAS_DEV_DEFECTO = 2;
	
	private Cliente cliente;
	private Pelicula pelicula;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	public Prestamo(Cliente cliente, Pelicula pelicula) {
		this.cliente = cliente;
		this.pelicula = pelicula;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = this.fechaPrestamo.plusDays(DIAS_DEV_DEFECTO);
	}
	
	public Prestamo(Cliente cliente, Pelicula pelicula, int diasDevolucion) {
		this.cliente = cliente;
		this.pelicula = pelicula;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = this.fechaPrestamo.plusDays(diasDevolucion);
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	@Override
	public String toString() {
		return "Prestamo [cliente=" + cliente + ", pelicula=" + pelicula + ", fechaPrestamo=" + fechaPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, fechaDevolucion, fechaPrestamo, pelicula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(fechaDevolucion, other.fechaDevolucion)
				&& Objects.equals(fechaPrestamo, other.fechaPrestamo) && Objects.equals(pelicula, other.pelicula);
	}
}
