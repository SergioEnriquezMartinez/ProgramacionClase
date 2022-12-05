package Empresa;

public class Empleados {
	protected String nombre;
	protected String dni;
	protected int edad;
	protected int sueldo;
	
	public Empleados(String nombre, String dni, int edad, int sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + edad + "\nSueldo: " + sueldo;
	}
	
}
