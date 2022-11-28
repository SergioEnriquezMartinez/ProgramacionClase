package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_2_Seleccion_Simple {
	public static void main(String[] args) {
		System.out.print("Introduzca un número: ");
		Scanner numero = new Scanner(System.in);
		int num = numero.nextInt();
		if (num % 2 == 0) {
			System.out.println("El número es par");
			} else {System.out.println("El número es impar");}
		numero.close();
	}
}
