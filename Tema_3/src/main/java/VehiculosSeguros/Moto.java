package VehiculosSeguros;

public class Moto extends Vehiculo {
	private int kw;
	public Moto(String color, String matricula, int kw) {
		super(color, matricula, kw);
		this.kw = kw;
	}
	@Override
	public String toString() {
		return "Color: " + color + "\nMatricula: " + matricula + "\nFecha de compra: " + fechCompra + "\nSeguro: " + seguro + "\nKW: " + kw;
	}
}
