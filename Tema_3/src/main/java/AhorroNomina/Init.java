package AhorroNomina;

import java.util.Scanner;

/* somos un banco y tenemos que gestionar cuentas ahorro y
 * cuentas nominas (las cuentas tienen iban y saldo)  si la cuenta es nomina que sea 0,
 * y si es ahorro, cuanto mas saldo mas interes
 * clase nomina con direccion y nombre de la empresa
 * 10.000€ 3%
 * 5.000 2%
 * 1.000 1%*/
public class Init {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca su primer apellido: ");
		String ap1 = sc.nextLine();
		
		System.out.println("Introduzca su segundo apellido: ");
		String ap2 = sc.nextLine();
		
		System.out.println("Introduzca su DNI: ");
		String dni = sc.nextLine();
		
		System.out.println("Introduzca el IBAN de su cuenta: ");
		String iban = sc.nextLine();
		
		//Cuenta de ahorros
		Cuenta cli1 = new Cuenta(nombre, ap1, ap2, dni, iban);
		
		//Cuenta nomina
		Cuenta cli2 = new Cuenta(nombre, ap1, ap2, dni, iban);
		sc.close();
		
		
		System.out.println(cli1);
		System.out.println(cli2);
	}
}
