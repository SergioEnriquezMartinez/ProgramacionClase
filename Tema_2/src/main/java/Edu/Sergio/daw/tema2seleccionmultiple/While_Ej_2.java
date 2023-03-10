package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class While_Ej_2 {
	public static void main(String[] args) {
		int num;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Introduce un número entero: ");
			num = sc.nextInt();
			i++;
		} while (num != 0);
		
		sc.close();
		System.out.println(i + " intentos.");
		
	}
}
