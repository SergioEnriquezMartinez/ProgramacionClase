package Pdf_1_Arrays;

import java.util.Scanner;

/* En un array de 20 elementos hay almacenados números enteros. Haz un 
programa que pida un número y diga cuántas veces aparece el número dentro 
del array.*/

public class Ej1 {
	public static void main(String[] args) {
		int contador = 0;
		int num;
		int arrayNum [] = {0, 156, 7, 67, 890, 4, 15, 45, 23, 78, 67, 31, 62, 45, 89, 67, 18, 27, 58, 79};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número que quiere comprobar: ");
		num = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum[i] == num) {
				contador++;
			}
		}
		
		System.out.println("El número " + num + " aparece " + contador + " veces");
	}
}
