package Pdf_1_Arrays;

/*Dado un array de 50 números entre 1 y 100, aleatorios, escribir una lista 
ordenada con los valores que no aparecen en el array.*/

public class Ej5 {
	public static void main(String[] args) {
		int [] array50 = new int [50];
		int [] array100 = new int [100];
		
		for (int i = 0; i < array50.length; i++) {	//Creamos el array de 50
			array50[i] = (int)((Math.random() * 100) + 1);
		}
		
		for (int i = 0; i < array100.length; i++) {	//Creamos el array de 100
			array100[i] = i + 1;
		}
		
		for (int i = 0; i < array50.length; i++) {	//Recorremos el bucle de 50 y los valores los igualamos a 0 en el array de 100
			for (int j = 0; j < array100.length; j++) {
				if (array50[i] == array100[j]) {
					array100[j] = 0;
				}
			}
		}
		
		for (int aleatorios : array50) {	//Imprimimos array50
			System.out.print(aleatorios + " ");
		}
		System.out.println();
		for (int i = 0; i < array100.length; i++) {	//Imprimimos array100
			if (array100[i] > 0) {
				System.out.print(array100[i] + " ");
			}
		}
	}
}