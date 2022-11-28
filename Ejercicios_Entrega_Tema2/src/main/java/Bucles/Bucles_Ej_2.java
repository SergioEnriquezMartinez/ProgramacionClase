package Bucles;

import java.util.Scanner;

public class Bucles_Ej_2 {
		//Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i =  0, suma = 0;
		
		do {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			suma += num;
			if (num == 0) {
				i++;
			}
		} while (i < 5);
		sc.close();
		
		System.out.println(suma);
	}
}
