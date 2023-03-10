package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

		/* Crea un programa que permmita la entrada de varios numeros 
		 * y calcule su media*/
public class For_Ej_1 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de números de los que quiere hacer la media: ");
		
		float cantidad = sc.nextInt();
		float acumulador = 0;
		float numeros;
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduzca un número " + (i + 1));
			numeros = sc.nextFloat();
			acumulador += numeros;
		}
		sc.close();
		float media = acumulador / cantidad;
		System.out.println("La media es: " +  media);
	}
}
