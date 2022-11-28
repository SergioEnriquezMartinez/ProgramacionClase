package Bucles;
/*Desarrolla un programa que escriba los n primeros números de la sucesión de Fibonacci.
 * El primer número de la serie es 0, el segundo es 1 y cada uno de los siguientes es la suma de los dos anteriores a él.
 * @author Serj*/

import java.util.Scanner;

public class Bucles_Ej_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();							/*Creamos las variables n, y n1 y n2 para iniciar la secuencia en 0 y 1*/
		int suma, n1 = 0, n2 = 1;
		sc.close();
		System.out.print("0 1 ");
		for (int i = 2; i < n; i++) {					/*Comenzamos la secuencia en 2 ya que tenemos los dos pirmeros numeros guardados en n1 y n2*/
			suma = n1 + n2;
			System.out.print(suma + " ");				/*Aqui imprimimos la suma y cambiamos los valores de las variables por los anteriores para quedarnos con los 2 ultimos*/
			n1 = n2;
			n2 = suma;
		}
	}
}
