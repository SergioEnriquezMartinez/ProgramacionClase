package Bucles;

import java.util.Scanner;

public class Bucles_Ej_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, contador = 0, tres = 0, cinco = 0, nomultiplos = 0;
		
		do {
			System.out.print("Introduzca un número: ");
			num = sc.nextInt();
			contador++;
			if (num % 3 == 0) {
				tres++;
			} if (num % 5 == 0) {
				cinco++;
			} else {
				nomultiplos++;
			}
			
		} while (contador < 5);
		sc.close();
		System.out.println(tres + " multiplos de 3\n" + cinco + " multiplos de 5\n" + nomultiplos + " no son multiplos ni de 3 ni de 5");
	}
}
