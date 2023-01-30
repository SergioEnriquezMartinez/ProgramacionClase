package Pdf_Recursividad;

/*Escribe un método recursivo Fibonacci() que calcule el valor de la serie para un 
valor dado, siendo:
F(1)=0
F(2)=1
F(n)=F(n-1)+F(n-2), para n>=3*/

import java.util.Scanner;

public class Ej_1_Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(n));
		
	}
	
	public static int fibonacci(int n) {
		if (n == 1) {
			return 0; 
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n -1) + fibonacci(n - 2);
		}
	}

}
