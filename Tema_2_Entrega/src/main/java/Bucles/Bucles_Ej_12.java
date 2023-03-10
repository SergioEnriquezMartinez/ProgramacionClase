package Bucles;
/*Desarrolla un programa que solicite un número n y luego muestre por
pantalla la siguiente figura:
Introduciendo: 6
Da como salida:
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();

		for (int fila = 1; fila <= n; fila++) {								//Primer bucle para generar las filas
			for (int columna = fila; columna < n; columna++) {				//Para generar los espacios antes de cada fila
				System.out.print("  ");
			}
			for (int numero = 1; numero <= fila; numero++) {				//Para generar los numeros de manera ascendente hasta i
				System.out.print(numero + " ");
			}
			for (int numero = fila - 1; numero >= 1; numero--) {			//Para generar los numeros descendentes desde i-1
				System.out.print(numero + " ");
			}
			System.out.println("");											//Para saltar de fila
		}

	}
}
