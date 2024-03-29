package Edu.Sergio.daw.CuentaBancaria;

public class Cliente {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int telefono;
	private Cuenta cuenta;
	
	//Constructor
	public Cliente(String nombre, String apellido1, String apellido2, String dni, Cuenta cuenta) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.cuenta = cuenta;
	}
	
	//Getters
	public String getnombre() {
		return this.nombre;
	}
	public String getapellido1() {
		return this.apellido1;
	}
	public String getapellido2() {
		return this.apellido2;
	}
	public String getdni() {
		return this.dni;
	}
	public int gettelefono() {
		return this.telefono;
	}
	public Cuenta getcuenta() {
		return this.cuenta;
	}
	
	//Setters
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public void setapellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setapellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public void setdni(String dni) {
		this.dni = dni;
	}
	public void settelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setcuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPrimer Apellido: " + apellido1 + "\nSegundo Apellido: " + apellido2 + "\nDNI: " + dni + "\nTeléfono: " + telefono + "\nCuenta: " + cuenta;
	}
}
