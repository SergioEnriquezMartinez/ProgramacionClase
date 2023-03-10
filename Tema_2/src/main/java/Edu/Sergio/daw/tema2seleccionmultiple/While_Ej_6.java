package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class While_Ej_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int tabla = 0;
		
		do {
			System.out.print("Introduce un número del 1 al 10: ");
			num = sc.nextInt();
		} while (num <= 0 && num >=10);
		sc.close();
		do {
			System.out.print(num + " * " + tabla + " = " + (num * tabla) + "\n");
			tabla++;
		} while (tabla <= 10);
	}
}
