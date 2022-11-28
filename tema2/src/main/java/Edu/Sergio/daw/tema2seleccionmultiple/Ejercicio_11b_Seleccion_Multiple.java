package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_11b_Seleccion_Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int a = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int b = sc.nextInt();
		System.out.print("Introduzca otro número: ");
		int c = sc.nextInt();
		int aux;
		sc.close();
		
		if (a > b && a > c && b > c) {
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		} else if (a < b && a < c && b < c) {
			aux = c;
			c = a;
			a = aux;
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		} else if (a > b && a < c && b < c) {
			aux = c;
			c = b;
			b = a;
			a = aux;
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		} else if (a > b && a > c && b < c) {
			aux = b;
			b = c;
			c = aux;
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		} else if (a < b && a < c && b > c) {
			aux = a;
			a = b;
			b = c;
			c = aux;
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		} else if (a < b && a > c && b > c) {
			aux = a;
			a = b;
			b = aux;
			System.out.println("Ordenados: " + a + " > " + b + " > " + c);
		}
	}
}
