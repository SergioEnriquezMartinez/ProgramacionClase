package Condicionales;

// Dados los 3 vértices de un triángulo, identificar qué tipo de triángulo es
// @author Serj

import java.util.Scanner;

public class Condicioinales_Ej_1b {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el lado a: ");
		double a = sc.nextDouble();
		System.out.println("Introduce el lado b: ");
		double b = sc.nextDouble();
		System.out.println("Introduce el lado c: ");
		double c = sc.nextDouble();
		sc.close();
		
		if ( a >= (b + c)) {
			System.out.println("No es un triángulo");
		}
		
		a = Math.pow(a,2);
		b = Math.pow(b, 2);
		c = Math.pow(c, 2);
		
		if (a == (b + c)) {
			System.out.println("Rectángulo");
		} else if (a > (b + c)) {
			System.out.println("Obtusángulo");
		} else if (a < (b + c)) {
			System.out.println("Acutángulo");
		}
	}
}
