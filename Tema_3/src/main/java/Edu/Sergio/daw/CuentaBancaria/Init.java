package Edu.Sergio.daw.CuentaBancaria;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Primer apellido: ");
		String apellido1 = sc.nextLine();
		
		System.out.print("Segundo apellido: ");
		String apellido2 = sc.nextLine();
		
		System.out.print("DNI: ");
		String dni = sc.nextLine();
		
		System.out.print("IBAN: ");
		String iban = sc.nextLine();
		
		System.out.print("¿Vas a hacer un ingreso incial?(Y/N)");
		String ingreso = sc.nextLine();
		Cuenta cuenta = null;
		//Cuenta cuenta = new Cuenta("1234133654634634");
		
		if (ingreso.equalsIgnoreCase("Y")) {
			System.out.print("Saldo inicial: ");
			double saldoInicial = Double.valueOf(sc.nextLine());
			cuenta = new Cuenta(iban, saldoInicial);
		} else {
			cuenta = new Cuenta(iban);
		}
				
		Cliente cli1 = new Cliente(nombre, apellido1, apellido2, dni, cuenta);
		sc.close();
		
		System.out.println(cli1.toString());
		
		
		//El cliente se equivoca con su dni
		cli1.setdni("12345434T");
		System.out.println(cli1.toString());
		
		//El cliente ingresa dinero
		cuenta = cli1.getcuenta();
		cuenta.setsaldo(80);
	}
}
