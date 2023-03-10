package Bucles;

import java.util.Scanner;

/*Desarrolla un programa que visualice en la pantalla la siguiente figura:
*
* * *
* * * * *
* * * * * * *
* * * * *
* * *
*
@author Serj*/
public class Rombo_n {
	public static void main(String[] args) {
		System.out.println("Introduzca el número máximo de asteriscos: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		
		//Para imprimir la mitad superior del rombo
		for (int fila = 1; fila <= (n / 2) + 1; fila++) {				
			//Para imprimir los espacios de cada fila en la mitad superior
			for (int columna = n - fila; columna > 0; columna--) {		
				System.out.print(" ");
			}
			//Para imprimir cada fila en la mitad superior
			for (int columna = 1; columna < 2 * fila; columna++) {	
				System.out.print("*");
			}
			System.out.println("");
		}
		//Para impripir la mitad inferior del rombo
		for (int fila = (n / 2); fila >= 1; fila--) {					
			//Para imprimir los espacios de cada fila en la mitad inferior
			for (int columna = n - fila; columna > 0; columna--) {		
				System.out.print(" ");
			}
			//Para imprimir cada fila en la mitad inferior
			for (int columna = 1; columna < 2 * fila; columna++) {	
				System.out.print("*");
			}
			//Para salto de fila
			System.out.println("");											

		}
	}
}
