package Pdf_1_Arrays;

/*Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro 
mágico aquel en el que las filas, las columnas y las diagonales suman igual.*/

public class Ej8 {
	public static void main(String[] args) {
		int [][] array5 = new int [5][5];
		int [] filas = new int [array5.length];
		int [] columnas = new int [array5.length];
		int diagonal = 0;
		int diagonalInvertida = 0;
		boolean suma = false;
		boolean repetido = false;
		
		for (int i = 0; i < array5.length; i++) {	//Generamos el array
			for (int j = 0; j < array5[i].length; j++) {
				array5[i][j] = (int)((Math.random() * 100) + 1);
			}
		}
		
		for (int i = 0; i < array5.length; i++) {	//imprimmimos el array
			for (int j = 0; j < array5[i].length; j++) {
				System.out.print(array5[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < array5.length; i++) {	//Recorremos el array y sumamos las filas, las columnas y las diagonales
			for (int j = 0; j < array5[i].length; j++) {
				filas[i] += array5[i][j];
				columnas[j] += array5[i][j];
				if (i == j) {
					diagonal += array5[i][j];
				}
				if (i == (array5[j].length - 1 - i)) {
					diagonalInvertida += array5[i][j];
				}
			}
		}
		
		for (int i = 0; i < array5.length; i++) {	//comprobacion de que no hay ningun numero repetido
			for (int j = 0; j < array5[i].length; j++) {
				int aux = array5[i][j];
				for (int k = 0; k < array5.length; k++) {
					for (int l = 0; l < array5[k].length; l++) {
						if ((i != k) && (j != l) && (repetido == false)) {
							if (array5[k][l] == aux) {
								repetido = true;
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < filas.length - 1; i++) {	//comprobacion de que las sumas son iguales
			if (filas[i] == filas [i + 1]) {
				if (columnas[i] == columnas[i + 1]) {
					if (diagonal == diagonalInvertida) {
						suma = true;
					}
				} 
			}
		}
		
		for (int i = 0; i < array5.length; i++) {	//Imprimimos las sumas
			System.out.print("Fila: " + filas[i] + " ");
			System.out.print("Columna: " + columnas[i] + " ");
			System.out.println();
		}
		System.out.println("Diagonal: " + diagonal);
		System.out.println("Diagonal invertida: " + diagonalInvertida);
		
		if ((repetido == false) && (suma == true)) {
			System.out.println("Es un cuadrado mágico");
		} else if ((repetido == true) && (suma == true)){
			System.out.println("No es un cuadrado mágico, tiene números repetidos");
		} else if ((repetido == false) && (suma == false)) {
			System.out.println("No es un cuadrado mágico, la suma de cada una de sus filas, columnas y diagonales no es la misma");
		} else if ((repetido == true) && (suma == false)) {
			System.out.println("No es un cuadrado mágico, la suma de cada una de sus filas, columnas y diagolanes no es la misma,"
					+ " y además tiene números repetidos");
		}
	}
}
