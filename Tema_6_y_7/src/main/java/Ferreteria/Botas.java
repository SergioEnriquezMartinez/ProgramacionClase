package Ferreteria;

public class Botas extends Producto{

	private int talla;
	private boolean isSeguridad;
	
	
	public Botas(int idProducto, String marca, double precio, int talla, boolean isSeguridad) {
		super(idProducto, marca, precio);
		this.talla = talla;
		this.isSeguridad = isSeguridad;
	}


	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}


	public boolean isSeguridad() {
		return isSeguridad;
	}

	public void setSeguridad(boolean isSeguridad) {
		this.isSeguridad = isSeguridad;
	}


	@Override
	public String toString() {
		return "Botas [talla=" + talla + ", isSeguridad=" + isSeguridad + "]" + super.toString();
	}
	
	
	
}
