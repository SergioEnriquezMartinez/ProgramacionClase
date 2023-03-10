package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_11_Seleccion_Simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int a = sc.nextInt();
		System.out.print("Introduzca un segundo número: ");
		int b = sc.nextInt();
		System.out.print("Introduzca un tercer número: ");
		int c = sc.nextInt();
		
		
		
		if (a > b && a > c && b > c) {
			System.out.println(a + " > " + b + " > " + c);
		} else if (a < b && a < c && b < c) {
			System.out.println(c + " > " + b + " > " + a);
		} else if (a == b && a < c && b < c) {
			System.out.println(c + "> que " + a + " y " + b);
		} else if (a > b && a < c && b < c) {
			System.out.println(c + " > " + a + " > " + b);
		} else if (a > b && a == c && b < c) {
			System.out.println(a + " y " + c + " > " + b);
		} else if (a > b && a > c && b < c) {
			System.out.println(a + " > " + c + " > " + b );
		} else if (a < b && a < c && b == c) {
			System.out.println(b + " y " + c + " > " + a);
		} else if (a == b && a == c && b == c) {
			System.out.println("Son iguales");
		} else if (a > b && a > c && b == c) {
			System.out.println(a + " > " + b + " y " + c);
		} else if (a < b && a < c && b > c) {
			System.out.println(b + " > " + c + " > " + a);
		} else if (a == b && a < c && b < c) {
			System.out.println(c + " > " + a + " y " + b);
		} else if (a < b && a == c && b > c) {
			System.out.println(b + " > " + a + " y " + c);
		} else if (a < b && a > c && b > c) {
			System.out.println(b + " > " + a + " > " + c);
		} else if (a == b && a > c && b > c) {
			System.out.println(a + " y " + b + " > " + c);
		}
		sc.close();
}
}