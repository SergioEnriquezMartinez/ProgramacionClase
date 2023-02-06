package Pdf_1_Arrays;

import java.util.Scanner;

/*Crea un programa que mezcle dos arrays ordenados de N elementos, 
consiguiendo otro array de N*2 elementos igualmente ordenados.*/

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De que tamaño quiere que sean los arrays?: ");
		int n = sc.nextInt();
		sc.close();
		
		
		int [] arrayA = new int[n];
		int [] arrayB = new int[n];
		int [] arrayAB = new int[n * 2];
		
		//arrayA
		for (int i = 0; i < arrayA.length; i++) {	//rellenamos
			arrayA[i] = (int)((Math.random() * 100) + 1); 
		}
		for (int i = 0; i < arrayA.length; i++) {	//ordenamos
			for (int j = i + 1; j < arrayA.length; j++) {
				if (arrayA[i] > arrayA[j]) {
					int aux = arrayA[i];
					arrayA[i] = arrayA[j];
					arrayA[j] = aux;
				}
			}
		}
		for (int i = 0; i < arrayA.length; i++) {	//imprimimos
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		
		//arrayB
		for (int i = 0; i < arrayB.length; i++) {	//rellenamos
			arrayB[i] = (int)((Math.random() * 100) + 1); 
		}
		for (int i = 0; i < arrayB.length; i++) {	//ordenamos
			for (int j = i + 1; j < arrayB.length; j++) {
				if (arrayB[i] > arrayB[j]) {
					int aux = arrayB[i];
					arrayB[i] = arrayB[j];
					arrayB[j] = aux;
				}
			}
		}
		for (int i = 0; i < arrayB.length; i++) {	//imprimimos
			System.out.print(arrayB[i] + " ");
		}
		System.out.println();
		
		//arrayAB
		for (int i = 0; i < arrayA.length; i++) {	//rellenamos hasta la mitad con arraya y a partir de la mitad con arrayb
			arrayAB[i] = arrayA[i];
			arrayAB[arrayAB.length - 1 - i] = arrayB[i];
		}
		for (int i = 0; i < arrayAB.length; i++) {	//ordenamos
			for (int j = i + 1; j < arrayAB.length; j++) {
				if (arrayAB[i] > arrayAB[j]) {
					int aux = arrayAB[i];
					arrayAB[i] = arrayAB[j];
					arrayAB[j] = aux;
				}
			}
		}
		for (int i = 0; i < arrayAB.length; i++) {	//imprimimos
			System.out.print(arrayAB[i] + " ");
		}
	}
}
