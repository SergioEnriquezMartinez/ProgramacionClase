package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_7_UT1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el importe que desea retirar:");
		int b500, b200, b100, b50, b20, b10, b5, cantidad;
		
		cantidad = sc.nextInt();
		b500 = cantidad / 500;
		cantidad = cantidad % 500;
		b200 = cantidad / 200;
		cantidad = cantidad % 200;
		b100 = cantidad / 100;
		cantidad = cantidad % 100;
		b50 = cantidad / 50;
		cantidad = cantidad % 50;
		b20 = cantidad / 20;
		cantidad = cantidad % 20;
		b10 = cantidad / 10;
		cantidad = cantidad % 10;
		b5 = cantidad/ 5;
		cantidad = cantidad % 5;
		
		System.out.println(b500 + " billetes de 500€");
		System.out.println(b200 + " billetes de 200€");
		System.out.println(b100 + " billetes de 100€");
		System.out.println(b50 + " billetes de 50€");
		System.out.println(b20 + " billetes de 20€");
		System.out.println(b10 + " billetes de 10€");
		System.out.println(b5 + " billetes de 5€");
		
		sc.close();
	}
}