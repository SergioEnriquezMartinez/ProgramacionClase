package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		
		System.out.print("Introduce un número del 0 al 9999: ");
		num = sc.next();
		sc.close();
		
		
		
		if (num.length() == 1) {
			System.out.print("Es capicúa");
		} else if (num.length() == 2) {
			 if (num.charAt(0) == num.charAt(1)) {
				System.out.print("Es capicúa");
			} else {
				System.out.print("No es capicúa");
			}
		} else if (num.length() == 3) {
			if (num.charAt(2) == num.charAt(0)) {
			System.out.print("Es capicúa");
			} else {
				System.out.print("No es capicúa");
			}
		} else if (num.length() == 4) {
			if (num.charAt(3) == num.charAt(0) && num.charAt(1) == num.charAt(2)) {
				System.out.print("Es capicúa");
			} else {
				System.out.print("No es capicúa");
			}
		} else {
			System.out.print("Introduzca una cifra correcta");
		}
		
	}
}
