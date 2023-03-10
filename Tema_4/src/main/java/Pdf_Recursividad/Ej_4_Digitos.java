package Pdf_Recursividad;

import java.util.Scanner;

/*Diseña un algoritmo que permita obtener los dígitos de un número, los muestre 
línea a línea, y posteriormente muestre la suma*/

public class Ej_4_Digitos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("Resultado: " + digitosSuma(n));
	}
	
	public static int digitosSuma(int n) {
		if (n < 10) {
			System.out.println(n);
			return n;
		} else {
			int sum = digitosSuma(n / 10);
			System.out.println((n % 10) + " ");	//Lo hace en el sentido inverso
			return (n % 10) + sum;
		}
	}
}
