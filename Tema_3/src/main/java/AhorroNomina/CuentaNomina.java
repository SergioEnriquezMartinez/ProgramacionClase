package AhorroNomina;

public class CuentaNomina extends Cuenta {
	private String nombreEmpresa;
	private String direccionEmpresa;
	
	public CuentaNomina(String nombre, String ap1, String ap2, String dni, String iban, String nombreEmpresa, String direccionEmpresa) {
		super(nombre, ap1, ap2, dni, iban);
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	
	@Override
	public String toString() {
		return "Nombre: " +  nombre + "\nPrimer apellido: " + ap1 + "\nSegundo apellido: " + ap2 + "\nDNI: " + dni + "\nIBAN: " + iban
				+ "\nNombre de la empresa: " + nombreEmpresa + "\nDirección de la empresa: " + direccionEmpresa;
	}
}
