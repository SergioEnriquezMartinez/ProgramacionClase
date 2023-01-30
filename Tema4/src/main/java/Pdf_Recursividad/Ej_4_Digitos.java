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
		
		System.out.println(digitosSuma(n));
	}
	
	public static int digitosSuma(int n) {
		if (n < 10) {
			System.out.println(n);
			return n;
		} else {
			int aux = n % 10;
			System.out.print(aux + " ");	//Lo hace en el sentido inverso
			return aux + digitosSuma(n / 10);
		}
	}
}
