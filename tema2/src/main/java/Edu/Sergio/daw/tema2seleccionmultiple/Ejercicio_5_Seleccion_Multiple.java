package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_5_Seleccion_Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		
		do {
			System.out.print("Introduce tu nota en formato númerico (1-10): ");
			nota = sc.nextInt();
			if (nota < 1 || nota > 10) {
				System.out.println("Por favor, vuelva a introducir la nota de manera correcta: ");
			}
		} while (nota < 1 || nota > 10);
		
		if (nota >= 1 && nota <= 4) {
			System.out.println("Insuficiente.");
		} else if (nota >= 5 || nota <= 6) {
			System.out.println("Suficiente.");
		} else if (nota >= 7 || nota <= 8) {
			System.out.println("Notable.");
		} else if (nota >= 9 || nota <= 10) {
			System.out.println("Sobresaliente.");
		}
		sc.close();
	}
}
