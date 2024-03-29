package AhorroNomina;

public class Cuenta {
	protected String nombre;
	protected String ap1;
	protected String ap2;
	protected String dni;
	protected String iban;
	
	public Cuenta(String nombre, String ap1, String ap2, String dni, String iban) {
		this.nombre = nombre;
		this.ap1 = ap1;
		this.ap2 = ap2;
		this.dni = dni;
		this.iban = iban;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAp1() {
		return ap1;
	}
	public void setAp1(String ap1) {
		this.ap1 = ap1;
	}
	
	public String getAp2() {
		return ap2;
	}
	public void setAp2(String ap2) {
		this.ap2 = ap2;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	@Override
	public String toString() {
		return "Nombre: " +  nombre + "\nPrimer apellido: " + ap1 + "\nSegundo apellido: " + ap2 + "\nDNI: " + dni + "\nIBAN: " + iban;
	}
}
