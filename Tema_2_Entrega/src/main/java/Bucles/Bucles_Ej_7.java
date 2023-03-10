package Bucles;

/*Realizar un programa que lea varios números por teclado hasta que se
introduzca un cero, y entonces indica cuál es el mayor de los números
introducidos y cuántas veces se repite ese número.
Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
Da como salida: El mayor es el 7
Se repite 2 veces
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, comparador = 0 , acumulador = 0;
		
		do {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			
			if (num > comparador) {
				comparador = num;
				acumulador = 1;
			} else if (num == comparador) {
				acumulador++;
			}
			
		} while (num != 0);
		sc.close();
		System.out.println("El número mayor es " + comparador + " y se ha repetido " + acumulador + " veces");
	}
}
