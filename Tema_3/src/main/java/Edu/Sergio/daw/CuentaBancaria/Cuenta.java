package Edu.Sergio.daw.CuentaBancaria;

import java.time.LocalDate;

public class Cuenta {
	//Atributos
	private String iban;
	private double saldo;
	private LocalDate fechcrea;
	private double intereses;
	
	//Constructor
	public Cuenta(String iban) {
		this.iban = iban;
		this.saldo = 0;
		this.fechcrea = LocalDate.now();
		this.intereses = Intereses.calculaIntereses(this);
	}
	public Cuenta(String iban, double saldo) {
		this(iban);
		this.saldo = saldo;
	}
	
	//Getters
	public String getiban() {
		return this.iban;
	}
	public double getsaldo() {
		return this.saldo;
	}
	public LocalDate getfechcrea() {
		return this.fechcrea;
	}
	public double getintereses() {
		return this.intereses;
	}
	
	//Setters
	public void setiban(String iban) {
		this.iban = iban;
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setfechcrea(LocalDate fechcrea) {
		this.fechcrea = fechcrea;
	}
	public void setintereses(double intereses) {
		this.intereses = intereses;
	}
	
	@Override
	public String toString() {
		return "IBAN: " + iban + "\nSaldo: " +  saldo + "€" + "\nFecha de Creación: " + fechcrea + "\nIntereses: " + intereses;
	}
}
