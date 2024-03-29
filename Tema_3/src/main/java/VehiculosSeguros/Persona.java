package VehiculosSeguros;

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Vehiculo vehiculo1;
	private Vehiculo vehiculo2;
	
	//Constructor
	public Persona (String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	public Persona (String nombre, String apellido1, String apellido2, String dni, Vehiculo coche1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.vehiculo1 = coche1;
	}
	public Persona (String nombre, String apellido1, String apellido2, String dni, Vehiculo coche1, Vehiculo coche2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.vehiculo1 = coche1;
		this.vehiculo2 = coche2;
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
	public Vehiculo getCoche1() {
		return this.vehiculo1;
	}
	public Vehiculo getCoche2() {
		return this.vehiculo2;
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
	public void setCoche1(Vehiculo coche1) {
		this.vehiculo1 = coche1;
	}
	public void setCoche2(Vehiculo coche2) {
		this.vehiculo2 = coche2;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrimer Apellido: " + apellido1 + "\nSegundo Apellido: " + apellido2 + "\nDNI: " + dni + "\nPrimer vehículo: " + vehiculo1
				+ "\nSegundo vehículo: " + vehiculo2;
	}
}
