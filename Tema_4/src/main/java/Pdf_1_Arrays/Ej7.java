package Pdf_1_Arrays;

/*Dado un array de 3x3 elementos, calcular la suma de sus filas y sus columnas 
almacenándolas en dos array de 3 elementos*/

public class Ej7 {
	public static void main(String[] args) {
		int [][] array3 = new int [3][3];
		int [] columna = new int [array3.length];
		int [] fila = new int [array3.length];
		
		for (int i = 0; i < array3.length; i++) {	//Generamos el array
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = (int)((Math.random() * 10) + 1);
			}
		}
		for (int i = 0; i < array3.length; i++) {	//Recorremos el array y sumamos las filas y las columnas
			for (int j = 0; j < array3[i].length; j++) {
				fila[i] += array3[i][j];
				columna[j] += array3[i][j];
			}
		}
		for (int i = 0; i < array3.length; i++) {	//imprimmimos el array
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] + "  ");
			}
			System.out.println();
		}
		for (int i = 0; i < array3.length; i++) {	//Imprimimos las sumas
			System.out.print("Fila: " + fila[i] + "  ");
			System.out.print("Columna: " + columna[i] + "  ");
			System.out.println();
		}
	}
}
