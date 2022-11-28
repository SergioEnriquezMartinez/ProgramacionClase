package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();
		sc.close();
		
		if (nota < 5) {
			System.out.print("Insuficiente");
		} else if (nota >= 5 && nota < 6) {
			System.out.print("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.print("Bien");
		} else if (nota >= 7 && nota <9) {
			System.out.print("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.print("Sobresaliente");
		} else {
			System.out.print("Nota no reconocida");
		}
	}
}
