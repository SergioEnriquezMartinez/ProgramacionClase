package Bucles;

import java.util.Scanner;

public class Bucles_Ej_1 {
	public static void main(String[] args) {
//		Desarrolla un programa que lea números hasta que se introduzca un número negativo y después indique si se ha dado el mismo número dos veces consecutivas:
		
		Scanner sc = new Scanner(System.in);		
		int num,  aux = 0, repetido = 0;
		
		do {
			System.out.println("Introduzca todos los números que quieras y por último uno negativo: ");	/*Inicializamos escaner y variables*/
			num = sc.nextInt();
			if (num == aux) {
				repetido = 1;
			}
			aux = num;
		} while (num > 0);
		sc.close();
		
		if (repetido == 1) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
	}
	
}
