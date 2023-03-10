package Herencias_4;

public class Pescado extends Plato {

	
	public Pescado(String nombre, float precio) {
		super(nombre, precio);
	}

	@Override
	public String toString() {
		return super.toString() + "Pescado. \n";
	}
	
	

}
