package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		
		do {
			System.out.print("Introduzca el ángulo A: ");
			a = sc.nextFloat();
			System.out.print("Introduzca el ángulo B: ");
			b = sc.nextFloat();
			System.out.print("Introduzca el ángulo C: ");
			c = sc.nextFloat();
		} while (a + b + c != 180);
		sc.close();
		
		
		if (a == 90 || b == 90 || c == 90) {
			System.out.print("Se trata de un triángulo rectángulo");
		} else if (a > 90 || b > 90 || c > 90) {
			System.out.print("Se trata de un triángulo obtusángulo");
		} else {
			System.out.print("Se trata de un triángulo acutángulo");
		}
	}
}
