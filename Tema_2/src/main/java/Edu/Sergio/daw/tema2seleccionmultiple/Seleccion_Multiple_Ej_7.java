package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Seleccion_Multiple_Ej_7 {
	public static void main(String[] args) {
		System.out.print("Introduce un número: ");
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		System.out.println("Introduzca otro número: ");
		int num2 = num.nextInt();
		if (num1 > num2) {
			System.out.println("El primer número es mayor");
		} else if (num1 < num2) {
			System.out.println("El segundo número es mayor");
		} else {
			System.out.println("Son iguales");
		}
		num.close();
	}
}
