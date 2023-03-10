package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;
import java.lang.Math;

public class While_Ej_4 {
	public static void main(String[] args) {
		
		System.out.print("Introduce un número entero del 1 al 10: ");
		int random = (int)(Math.random() * 10 + 1);
		Scanner sc = new Scanner(System.in);
		int num;
		
			do {
				num = sc.nextInt();
				if (num < random) {
					System.out.print("El número que buscamos es mayor, vuelva a intentarlo: ");
				} else if (num > random) {
					System.out.print("El número que buscamos es menor, vuelva a intentarlo: ");
				}
			} while (num != random);
		sc.close();
		System.out.print("Enhorabuena, has acertado");
	}
}
