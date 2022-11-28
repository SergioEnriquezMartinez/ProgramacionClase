package Bucles;

/*Desarrolla un programa que solicite un número n y luego muestre por pantalla la siguiente figura
 * @author Serj*/

import java.util.Scanner;

public class Bucles_Ej_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();
		
		for (int filas = 1; filas <= n; filas++) {						//Para controlar las filas
			for (int columnas = 1; columnas <= filas; columnas++) {		//Para controlar las columnas
				System.out.print(columnas + " ");
			}
		System.out.println();
		}
		
	}
}
