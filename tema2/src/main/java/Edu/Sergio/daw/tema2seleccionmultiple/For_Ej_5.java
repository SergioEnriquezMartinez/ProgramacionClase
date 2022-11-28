package Edu.Sergio.daw.tema2seleccionmultiple;

/*Crea un programa que te pida la altura de un triángulo rectángulo y lo muestre con asteriscos
* @author Serj*/

import java.util.Scanner;

public class For_Ej_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la altura del triángulo: ");
		int altura = sc.nextInt();
		sc.close();
		
		for (int fila = 1; fila <= altura; fila++) {
			for (int col = 1; col <= fila; col++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
