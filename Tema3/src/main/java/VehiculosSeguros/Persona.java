package VehiculosSeguros;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Coche coche1;
	private Coche coche2;
	
	//Constructor
	public Persona (String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	public Persona (String nombre, String apellido1, String apellido2, String dni, Coche coche1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.coche1 = coche1;
	}
	public Persona (String nombre, String apellido1, String apellido2, String dni, Coche coche1, Coche coche2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.coche1 = coche1;
		this.coche2 = coche2;
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido1() {
		return this.apellido1;
	}
	public String getApellido2() {
		return this.apellido2;
	}
	public String getDni() {
		return this.dni;
	}
	public Coche getCoche1() {
		return this.coche1;
	}
	public Coche getCoche2() {
		return this.coche2;
	}
	
	//Setters
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public void setApellido1 (String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setApellido2 (String apellido2) {
		this.apellido2 = apellido2;
	}
	public void setDni (String dni) {
		this.dni = dni;
	}
	public void setCoche1(Coche coche1) {
		this.coche1 = coche1;
	}
	public void setCoche2(Coche coche2) {
		this.coche2 = coche2;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrimer Apellido: " + apellido1 + "\nSegundo Apellido: " + apellido2 + "\nDNI: " + dni + "\nCoche semana: " + coche1
				+ "\nCoche fin de semana: " + coche2;
	}
}
