package Pdf_1_Arrays;

/*Crea un programa que rellene un array de 4x4 de la siguiente manera*/

public class Ej6 {
	public static void main(String[] args) {
		
		int [][] array4x4 = new int [4][4];
		
		for (int i = 0; i < array4x4.length; i++) {
			for (int j = 0; j < array4x4[i].length; j++) {
				if (i == j) {
					array4x4 [i][j] = 1;
				} else {
					array4x4 [i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < array4x4.length; i++) {
			for (int j = 0; j < array4x4[i].length; j++) {
				System.out.print(array4x4[i][j] + " ");
			}
			System.out.println();
		}
	}
}
