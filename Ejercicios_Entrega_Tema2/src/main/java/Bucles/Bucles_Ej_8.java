package Bucles;
/*Desarrolla un programa que descomponga un número en sus factores
primos.
Introduciendo: 75
Da como salida : 3 5 5
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el núnmero que quiere factorizar: ");
		int num = sc.nextInt();
		int aux = num;
		sc.close();
		
		for (int i = 2; i <= num; i++) {		//bucle en el que i la inicializamos en 2 porque es el primo mas pequeño
			if (aux % i == 0) {					//utilizamos la variable aux para no operar con num ya que sino cambiariamos el valor de num para el bucle
				System.out.print(i + " ");		
				aux /= i;
				i -= 1;							//restamos 1 para los numeros que sean varias veces divisibles por el mismo primo
			}
		}
		
	}
}
