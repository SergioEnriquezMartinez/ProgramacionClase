package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_10_Seleccion_Simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca un segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + ">" + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + ">" + num1);
		} else if (num1 == num2) {
			System.out.println(num1 + "y" + num2 + "son iguales.");
		}
		sc.close();
}
}