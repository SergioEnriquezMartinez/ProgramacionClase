package Clases1_2;

import java.util.Scanner;

/* Desarrolla una clase Circunferencia que permita calcular su radio y longitud. Se 
debe hacer uso de la clase Scanner*/

public class Circunferencia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		sc.close();
		
		System.out.println("El área del círculo que delimita la circunferencia es: " + area(radio));
		System.out.println("La longitud de la circunferencia es: " + longitud(radio));
	}
	
	public static double area(double radio) {
		double area = Math.pow(radio, 2) * 3.1416;
		return area;
	}
	
	public static double longitud(double radio) {
		double longitud = (radio * 2) * 3.1416;
		return longitud;
	}
}
