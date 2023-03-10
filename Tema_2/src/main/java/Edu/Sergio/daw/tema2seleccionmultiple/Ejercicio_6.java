package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
		System.out.print("Introduzca una letra: ");
		Scanner sc = new Scanner(System.in);
		String letra = sc.nextLine();
		switch (letra) {
		case "a":
			System.out.println("Vocal");
			break;
		case "A":
			System.out.println("Vocal");
			break;
		case "e":
			System.out.println("Vocal");
			break;
		case "E":
			System.out.println("Vocal");
			break;
		case "i":
			System.out.println("Vocal");
			break;
		case "I":
			System.out.println("Vocal");
			break;
		case "o":
			System.out.println("Vocal");
			break;
		case "O":
			System.out.println("Vocal");
			break;
		case "u":
			System.out.println("Vocal");
			break;
		case "U":
			System.out.println("Vocal");
			break;
		default:
			System.out.println("Consonante");
		sc.close();
			
		}
		
	}

}
