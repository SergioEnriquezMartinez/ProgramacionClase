package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_5b {
	public static void main(String[] args) {
		System.out.print("Introduzca la primera letra de su estado civil (s, c, d, v): ");
		Scanner sc = new Scanner(System.in);
		char letra = sc.next().toLowerCase().charAt(0);
		sc.close();
		
		if (letra == 's') {
			System.out.println("Soltero/a");
		} else if (letra == 'c') {
			System.out.println("Casado/a");
		} else if (letra == 'd') {
			System.out.println("Divorciado/a");
		} else if (letra == 'v') {
			System.out.println("Viudo/a");
		} else {
			System.out.println("No ha introducido un valor correcto");
		}
	}
}
