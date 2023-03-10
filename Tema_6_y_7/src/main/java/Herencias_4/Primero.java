package Herencias_4;

public class Primero extends Plato{
	
	/**
	 * Si es para compartir el valor es true y sino es false
	 */
	private boolean compartir;
	

	public Primero(String nombre, float precio, boolean compartir) {
		super(nombre, precio);	
		this.compartir = compartir;
	}

	public boolean isCompartir() {
		return compartir;
	}

	public void setCompartir(boolean compartir) {
		this.compartir = compartir;
	}

	@Override
	public String toString() {
		return super.toString() + "Primero. Es para compartir?" + compartir + "\n";
	}
	
	

}
