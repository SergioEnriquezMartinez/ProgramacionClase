package Clases1_1;

import java.util.Scanner;


public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte su nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("1º Apellido: ");
		String ap1 = sc.nextLine();
		
		System.out.println("2º Apellido: ");
		String ap2 = sc.nextLine();
		double cantidad = 0;
		
		System.out.println("Ingresar dinero: ");
		double ingreso = sc.nextDouble();
		
		System.out.println("Retirar dinero: ");
		double retiro = sc.nextDouble();
		sc.close();
		
		
		//Quiero hacer un ingreso de 723,56€
		cantidad += ingreso;
		
		//Quiero hacer un retiro de 500€
		cantidad -= retiro;
		
		Cuenta c1 = new Cuenta(nombre, ap1, ap2, cantidad);
		System.out.println(c1);
	}
}
