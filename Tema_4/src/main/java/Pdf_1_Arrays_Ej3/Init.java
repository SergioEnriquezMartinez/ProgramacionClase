package Pdf_1_Arrays_Ej3;

import java.util.Scanner;

/*Crea una agenda para almacenar nombres y direcciones de N personas. 
Después haz un programa que permita ir consultando el nombre y la dirección 
de las personas almacenadas*/

public class Init {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántas personas quieres introducir?: ");
		int numPer = sc.nextInt();
		
		Persona [] agenda = new Persona [numPer];
		
		for (int i = 0; i < numPer; i++) {
			System.out.println("¿Cuál es tu nombre?: ");
			String nombre = sc.next();
			System.out.println("¿Cuál es tu dirección?: ");
			String direccion = sc.next();
			agenda[i] = new Persona(nombre, direccion);
		}
		
		System.out.println("Quieres ver las personas que tienes guardadas?: Y/N");
		String guardadas = sc.next().toLowerCase();
		if (guardadas.charAt(0) == 'y') {
			personasAlmacenadas(agenda, numPer);
		} else if(guardadas.charAt(0) == 'n') {
		}
		sc.close();
	}
	
	public static void personasAlmacenadas(Persona[] agenda, int numPer) {
		for (int i = 0; i < numPer; i++) {
			System.out.println(agenda[i]);
		}
	}
}
