package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class While_Ej_5 {
	public static void main(String[] args) {
		System.out.print("Introduzca un número: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int i = (int)numero / 2;
		int resto;
		boolean esPrimo = false;
		sc.close();
		
		if (numero == 1) {
			System.out.print("No es primo");
		} else {
			while (i >= 2) {
				resto = numero % i;
				if (resto == 0) {
					esPrimo = true;
					
				}
				
				i--;
			}
		}
		
		if (esPrimo == false) {
			System.out.print("Es primo");
		} else if(esPrimo == true) {
			System.out.print("No es primo");
		}
	}
}
