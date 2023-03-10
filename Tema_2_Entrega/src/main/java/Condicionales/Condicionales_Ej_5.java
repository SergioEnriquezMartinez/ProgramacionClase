package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de a: ");
		float a = sc.nextFloat();
		System.out.print("Introduce el valor de b: ");
		float b = sc.nextFloat();
		System.out.print("Introduce el valor de c: ");
		float c = sc.nextFloat();
		float discriminante = ((b * b) - (4 * a * c));
		sc.close();
		double x, x1, x2;
		
		
		if (discriminante < 0) {
			System.out.print("Esta ecuación no tiene soluciones reales");
		} else if (discriminante == 0) {
			x = (-b) / (2 * a);
			System.out.print("La solución es " + x);
		} else if (discriminante > 0) {
			x1 = ((-b) + Math.sqrt(discriminante)) / (2 * a);
			x2 = ((-b) - Math.sqrt(discriminante)) / (2 * a);
			System.out.print("Las soluciones a esta ecuación son: " + x1 + " y " + x2);
		}
	}
}
