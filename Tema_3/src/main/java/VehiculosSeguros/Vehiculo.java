package VehiculosSeguros;

import java.time.LocalDate;

public class Vehiculo {
	protected String color;
	protected String matricula;
	protected LocalDate fechCompra;
	protected Seguro seguro;
	
	//Constructor
	public Vehiculo () {
		
	}
	public Vehiculo (String color, String matricula, int potencia) {
		this.color = color;
		this.matricula = matricula;
		this.fechCompra = LocalDate.now();
		this.seguro = new Seguro(potencia);
	}
	
	//Getters
	public String getColor() {
		return this.color;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public LocalDate getFechCommpra() {
		return this.fechCompra;
	}
	
	public Seguro seguro() {
		return this.seguro;
	}
	
	//Setters
	public void setColor(String color) {
		this.color = color;
	}
	public void setMatricula(String Matricula) {
		this.matricula = Matricula;
	}
	public void setFechCompra(LocalDate fechCompra) {
		this.fechCompra = fechCompra;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	@Override
	public String toString() {
		return "Color: " + color + "\nMatricula: " + matricula + "\nFecha de compra: " + fechCompra + "\nSeguro: " + seguro;
	}
}
