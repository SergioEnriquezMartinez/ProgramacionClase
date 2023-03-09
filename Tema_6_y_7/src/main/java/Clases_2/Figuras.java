package Clases_2;

public abstract class Figuras {
	
	private String color;
	
	public Figuras(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color " + color;
	}
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
	
}
