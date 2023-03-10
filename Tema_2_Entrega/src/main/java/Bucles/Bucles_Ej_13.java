package Bucles;
/*Desarrolla un programa que obtenga el mínimo común múltiplo(mcm) de dos números.
Ejemplo: descomponemos los números en sus factores 10 (2 * 5) y 18 (2 * 9) entonces el mcm es (2 * 5 * 9).
Introduciendo: 10 18
Da como salida: 90
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_13 {
	public static void main(String[] args) {
		int num1, num2, mayor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		sc.close();
		
		if (num1 > num2) {			//Comparamos cual de los dos es el mayor para ahorrar bucles al sistema
			mayor = num1;
		} else {
			mayor = num2;
		}
		
		while ((mayor % num1 != 0) || (mayor % num2 != 0)) {		//Mientras alguno de los numeros no sea divisor del mayor el bucle se repite
			mayor++;												//y va sumando 1 a la variable mayor para encontrar uno que sea divisible entre alguno
		}															//de los números
		System.out.println(mayor);
	}
}
