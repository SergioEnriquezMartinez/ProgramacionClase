package Herencias_4;

public class Postre extends Plato{

	private boolean diabeticos;
	
	public Postre(String nombre, float precio, boolean diabeticos) {
		super(nombre, precio);
		this.diabeticos = diabeticos;
	}

	public boolean isDiabeticos() {
		return diabeticos;
	}

	public void setDiabeticos(boolean diabeticos) {
		this.diabeticos = diabeticos;
	}

	@Override
	public String toString() {
		return super.toString() + "Postre. Es para diabeticos? " + diabeticos + "\n";
	}
	
	

}
