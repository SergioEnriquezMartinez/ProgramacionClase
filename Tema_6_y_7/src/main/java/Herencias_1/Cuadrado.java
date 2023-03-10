package Herencias_1;

public class Cuadrado extends Figuras {
	
	private double lado;
	

	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return 4 * lado;
	}

	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
	@Override
	public String toString() {
		return "Cuadrado => Perimetro " + getPerimetro() + ", área " + getArea() + ", " + super.toString();
	}
	
	

}
