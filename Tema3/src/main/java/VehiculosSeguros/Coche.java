package VehiculosSeguros;

import java.time.LocalDate;

public class Coche {
	private String color;
	private String matricula;
	private LocalDate fechCompra;
	private int cv;
	private Seguro seguro;
	
	//Constructor
	public Coche (String color, String matricula, int cv) {
		this.color = color;
		this.matricula = matricula;
		this.fechCompra = LocalDate.now();
		this.cv = cv;
		this.seguro = new Seguro(cv);
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
	public int getCv() {
		return this.cv;
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
	public void setCv(int cv) {
		this.cv = cv;
	}
	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}
	@Override
	public String toString() {
		return "Color: " + color + "\nMatricula: " + matricula + "\nFecha de compra: " + fechCompra + "\nCV: " + cv + "\nSeguro: " + seguro;
	}
}
