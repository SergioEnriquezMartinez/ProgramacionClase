package Pdf_1_Arrays;

import java.util.Scanner;

/*Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura*/

public class Ej10 {
	public static void main(String[] args) {
		//El ejercicio no lo pide pero lo hago para un caso de n tamaño
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De que tamaño quieres el array?: ");
		int n = sc.nextInt();
		sc.close();
		
		
		int [][] array5 = new int [n][n];
		
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5[i].length; j++) {
				if (i + j < array5.length) {
					System.out.print(i + j + " ");
				} else {
					System.out.print(((array5[i].length - 1) - i + ((array5[j].length - 1) - j)) + " ");
				}
			}
			System.out.println();
		}
	}
}
