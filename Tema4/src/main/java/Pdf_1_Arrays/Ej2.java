package Pdf_1_Arrays;

/* Dado un array de números enteros, realiza un programa que indique si está 
ordenado o no.*/

public class Ej2 {
	public static void main(String[] args) {
		int [] arrayNum = {15, 27, 36, 48, 52};
		boolean mayor = true;
		boolean menor = true;
		
		for (int i = 0; i < arrayNum.length - 1; i++) {
			if (arrayNum[i] <= arrayNum[i + 1]) {			
			} else {
				menor = false;
			}
			
			if (arrayNum[i] >= arrayNum[i + 1]) {
			} else {
				mayor = false;
			}
		}
		
		if (menor == false && mayor == false) {
			System.out.println("No Ordenados");
		} else {
			System.out.println("Ordenados");
		}
	}
}
