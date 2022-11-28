package VehiculosSeguros;

public class Coche extends Vehiculo {
	private int cv;
	public Coche(String color, String matricula, int cv) {
		super(color, matricula, cv);
		this.cv = cv;
	}
	@Override
	public String toString() {
		return "Color: " + color + "\nMatricula: " + matricula + "\nFecha de compra: " + fechCompra + "\nSeguro: " + seguro + "\nCV: " + cv;
	}
}
