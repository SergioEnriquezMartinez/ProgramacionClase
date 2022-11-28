package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número del décimo premiado: ");
		String premio = sc.next();
		System.out.print("Introduzca el número de su décimo: ");
		String num = sc.next();
		sc.close();
		
		if ((premio.charAt(0) == (num.charAt(0))) && (premio.charAt(4) == (num.charAt(4)))) {
			System.out.print("Si tiene reintegro");
		} else {
			System.out.print("No tiene reintegro");
		}
	}
}
