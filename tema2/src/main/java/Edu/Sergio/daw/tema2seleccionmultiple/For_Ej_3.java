package Edu.Sergio.daw.tema2seleccionmultiple;
/* Desarrolla un programa que te pida un número del 1 al 10 y
 * te muestre la tabla de multiplicar correspondiente a dicho número.*/

import java.util.Scanner;

public class For_Ej_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 10: ");
		int numero = sc.nextInt();
		sc.close();
		int resultado;
		for (int i = 0; i < 10; i++) {
			resultado = (i + 1) * numero;
			System.out.println(resultado);
		}
	}
}
