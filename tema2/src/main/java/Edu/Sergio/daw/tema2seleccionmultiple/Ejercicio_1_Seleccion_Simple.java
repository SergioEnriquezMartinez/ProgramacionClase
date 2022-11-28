package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_1_Seleccion_Simple {
	public static void main(String[] args) {
		System.out.print("Introduce tu edad: ");
		Scanner edad = new Scanner(System.in);
		int mayor = edad.nextInt();
		if (mayor >= 18) {
			System.out.println("Puedes votar");
			} else {
				System.out.println("No puedes votar");
			}
		edad.close();
	}

}
