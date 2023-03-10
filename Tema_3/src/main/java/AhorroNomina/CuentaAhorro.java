package AhorroNomina;

public class CuentaAhorro extends Cuenta {
	private double saldo;
	private double interes;
	
	public void intereses(double saldo) {
		if(saldo <= 1000) {
			this.saldo *= 0.99;
			this.interes = 0.01;
		} else if(saldo > 1000 && saldo <= 5000) {
			this.saldo *= 0.98;
			this.interes = 0.02;
		} else if (saldo > 5000) {
			this.saldo *= 0.97;
			this.interes = 0.03;
		}
	}
	
	public CuentaAhorro(String nombre, String ap1, String ap2, String dni, String iban, double saldo, double interes) {
		super(nombre, ap1, ap2, dni, iban);
		this.saldo = saldo;
		this.interes = interes;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	@Override
	public String toString() {
		return "Nombre: " +  nombre + "\nPrimer apellido: " + ap1 + "\nSegundo apellido: " + ap2 + "\nDNI: " + dni + "\nIBAN: " + iban +
				"\nSaldo: " +  saldo + "\nIntereses: " + interes;
	}
}
