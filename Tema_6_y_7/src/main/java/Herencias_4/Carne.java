package Herencias_4;

public class Carne extends Plato {
	
	private int gradoCoccion;

	public Carne(String nombre, float precio, int gradoCoccion) {
		super(nombre, precio);
		this.gradoCoccion = gradoCoccion;
	}

	public int getGradoCoccion() {
		return gradoCoccion;
	}

	public void setGradoCoccion(int gradoCoccion) {
		this.gradoCoccion = gradoCoccion;
	}

	@Override
	public String toString() {
		String coccion = "";
		if(gradoCoccion == 1) {
			coccion = "Poco hecho";
		} else if(gradoCoccion == 2) {
			coccion = "Al punto";
		} else if(gradoCoccion == 3) {
			coccion = "Muy hecho";
		} else if(gradoCoccion == 4) {
			coccion = "Carbonizado";
		}
		return super.toString() + "Carne. " + coccion + "\n";
	}
	
	

}
