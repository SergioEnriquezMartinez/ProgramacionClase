package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_4_Seleccion_Multiple {
	public static void main(String[] args) {
		System.out.print("Introduzca una capital de provincia de CyL: ");
		Scanner sc = new Scanner(System.in);
		String ciudad = sc.nextLine();
		
		switch (ciudad) {
		case "Ávila":
			System.out.println("Abulense");
			break;
		case "Burgos":
			System.out.println("Burgales/a");
			break;
		case "León":
			System.out.println("Leonés/a o cazurro/a");
			break;
		case "Palencia":
			System.out.println("Palentino/a");
			break;
		case "Salamanca":
			System.out.println("Salmantino/a o charro/a");
			break;
		case "Segovia":
			System.out.println("Segoviano/a");
			break;
		case "Soria":
			System.out.println("Soriano/a");
			break;
		case "Valladolid":
			System.out.println("Valisoletano/a, vallisoletano/a, pucelano/a o pinciano/a");
			break;
		case "Zamora":
			System.out.println("Zamorano/a");
			break;
		default:
			System.out.println("No ha introducido una capital de provincia de CyL, por favor introduzca una correcta.");
		}
		sc.close();
	}
}
