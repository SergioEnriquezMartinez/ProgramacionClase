package Clases_2;

public class Triangulo extends Figuras {
	
	
	public double a;
	public double b;
	public double c;
	public double base;
	public double altura;
	

	public Triangulo(String color, double a, double b, double c, double base, double altura) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
		this.base = base;
		this.altura = altura;
	}
	
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double getPerimetro() {
		return a + b +c;
	}
	
	@Override
	public double getArea() {
		return (base *  altura) / 2;
	}

	@Override
	public String toString() {
		return "Triangulo => Perimetro " + getPerimetro() + ", área " + getArea() + ", " + super.toString();
	}
	
	

}
