package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduzca un número del 0 al 9999: ");
			num = sc.nextInt();
		} while (num < 0 || num > 9999);
		sc.close();
		
		if (num == 0) {
			System.out.print("El número es 0, la nada no puede tener una cifra.");
		} else if (num > 0 && num <= 9) {
			System.out.print("El número tiene 1 cifra");
		} else if (num >= 10 && num <= 99) {
			System.out.print("El número tiene 2 cifras");
		} else if (num >= 100 && num <= 999) {
			System.out.print("El número tiene 3 cifras");
		} else if (num >= 1000 && num <= 9999) {
			System.out.print("El número tiene 4 cifras");
		}
			
	}
}
