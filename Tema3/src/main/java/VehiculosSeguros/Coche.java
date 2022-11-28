package VehiculosSeguros;

import java.time.LocalDate;

public class Coche extends Vehiculo {
	private int cv;
	public Coche () {
		super();
	}
	public Coche(String color, String matricula, int cv) {
		this.color = color;
		this.matricula = matricula;
		this.fechCompra = LocalDate.now();
		this.cv = cv;
	}
	@Override
	public String toString() {
		return "Color: " + color + "\nMatricula: " + matricula + "\nFecha de compra: " + fechCompra + "\nSeguro: " + seguro + "\nCV: " + cv;
	}
}
