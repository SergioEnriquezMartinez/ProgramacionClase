package VehiculosSeguros;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Primer apellido: ");
		String apellido1 = sc.nextLine();
		
		System.out.println("Segundo apellido: ");
		String apellido2 = sc.nextLine();
		
		System.out.println("DNI: ");
		String dni = sc.nextLine();
		sc.close();
		
		//Entra una persona y no compra
		Persona per1 = new Persona (nombre, apellido1, apellido2, dni);
		
		//Entra una persona y compra 1 coche
		Persona per2 = new Persona (nombre, apellido1, apellido2, dni);
		Coche coche1 = new Coche ("Rojo", "2343-CDF", 90);
		per2.setCoche1(coche1);
		
		//Entra una persna y compra 2 coches
		Persona per3 = new Persona(nombre, apellido1, apellido2, dni);
		Coche coche2 = new Coche ("Azul", "1234-ABC", 120);
		per3.setCoche2(coche2);
		
		System.out.println(per1);
		System.out.println(per2);
	}
}
