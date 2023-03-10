package Herencias_1;

public class Circulo extends Figuras {
	
	private double radio;
	
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}


	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}


	@Override
	public String toString() {
		return "Circulo => radio " + radio + ", área " + getArea() + ", " + super.toString();
	}
	
	
}
