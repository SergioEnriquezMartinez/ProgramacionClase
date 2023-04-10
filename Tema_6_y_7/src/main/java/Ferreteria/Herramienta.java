package Ferreteria;

public class Herramienta extends Producto {


	private String tipo;

	public Herramienta(int idProducto, String marca, double precio, String tipo) {
		super(idProducto, marca, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Herramienta [tipo=" + tipo + "]" + super.toString();
	}
	
	
}
