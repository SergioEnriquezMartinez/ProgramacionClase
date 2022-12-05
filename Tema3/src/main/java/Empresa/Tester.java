package Empresa;

public class Tester extends Empleados {
	private int proyectos;
	
	
	public Tester(String nombre, String dni, int edad, int sueldo, int proyectos) {
		super(nombre, dni, edad, sueldo);
		this.proyectos = proyectos;
	}


	public int getProyectos() {
		return proyectos;
	}
	public void setProyectos(int proyectos) {
		this.proyectos = proyectos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nNumero de proyectos: " + proyectos;
	}
}
