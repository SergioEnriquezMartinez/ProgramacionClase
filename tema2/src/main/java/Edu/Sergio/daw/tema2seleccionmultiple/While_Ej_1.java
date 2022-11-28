package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class While_Ej_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
				
		int num = sc.nextInt();
		int i = 0;
		sc.close();
		
		if (num == 0) {
			System.out.println("1 cifra");
		} else {
			while (num != 0) {
				num = num / 10;
				i++;
			}
		System.out.println("El número tiene " + i + " cifras.");
		}
	}
}
