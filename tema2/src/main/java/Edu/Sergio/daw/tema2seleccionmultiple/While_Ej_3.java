package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class While_Ej_3 {
	public static void main(String[] args) {
		double num;
		double i = 0;
		double suma = 0;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un entero: ");
		
		do {
			num = sc.nextDouble();
			if (num != 0) {
				System.out.print("Introduce un número entero: ");
				suma += num;
				i++;
			}
		} while (num != 0);
		
		sc.close();
		
		if (suma == 0) {
			media = 0;
		} else {
			media = suma / (i - 1);
			System.out.println("La media de todos los intentos es " + media);
		}
	}
}