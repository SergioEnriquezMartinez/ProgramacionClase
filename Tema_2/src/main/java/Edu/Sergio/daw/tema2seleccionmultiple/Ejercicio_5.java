package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		System.out.print("Introduzca la primera letra de su estado civil: ");
		Scanner sc = new Scanner(System.in);
		String letra = sc.nextLine();
		switch (letra) {
		case "c":
			System.out.println("Casado/a");
			break;
		case "d":
			System.out.println("Divorciado/a");
			break;
		case "s":
			System.out.println("Soltero/a");
			break;
		case "v":
			System.out.println("Viudo/a");
			break;
		case "C":
			System.out.println("Casado/a");
			break;
		case "D":
			System.out.println("Divorciado/a");
			break;
		case "S":
			System.out.println("Soltero/a");
			break;
		case "V":
			System.out.println("Viudo/a");
			break;
		default:
			System.out.println("No ha introducido una letra válida");
		sc.close();
			
		}
		
	}

}
