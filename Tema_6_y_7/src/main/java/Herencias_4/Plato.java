package Herencias_4;

public class Plato {
	
	protected String nombre;
	protected float precio;
	
	
	public Plato(String nombre, float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plato " + nombre + " => " + precio + " €\n";
	}
	
	
	
}
