package Pdf_Recursividad;

import java.util.Scanner;

/*Calcula el factorial de un número, de forma recursiva*/

public class Ej_2_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
