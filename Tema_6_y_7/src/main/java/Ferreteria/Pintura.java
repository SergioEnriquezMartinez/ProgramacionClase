package Ferreteria;

public class Pintura extends Producto {
	
	private String color;
	private boolean intExt;
	
	public Pintura(int idProducto, String marca, double precio, String color, boolean intExt) {
		super(idProducto, marca, precio);
		this.color = color;
		this.intExt = intExt;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isIntExt() {
		return intExt;
	}
	public void setIntExt(boolean intExt) {
		this.intExt = intExt;
	}

	@Override
	public String toString() {
		return "Pintura [color=" + color + ", intExt=" + intExt + "]" + super.toString();
	}
	
	
}
