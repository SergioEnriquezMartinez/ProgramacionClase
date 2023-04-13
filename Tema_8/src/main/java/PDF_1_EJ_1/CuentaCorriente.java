package PDF_1_EJ_1;

import java.util.Objects;

public class CuentaCorriente {
	
	private String iban;
	private Cliente titular;
	private double saldo;
	
	
	
	public CuentaCorriente(String iban, Cliente titular) {
		this.iban = iban;
		this.titular = titular;
	}
	
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void reintegro(double cantidad) throws SaldoInsuficienteException {
		if (this.saldo >= cantidad) {
			this.saldo -= cantidad;
		} else {
			throw new SaldoInsuficienteException("No puedes sacar más dinero del qe tienes");
		}
	}
	
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(iban, saldo, titular);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		return Objects.equals(iban, other.iban)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Objects.equals(titular, other.titular);
	}
	@Override
	public String toString() {
		return "CuentaCorriente [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
}
