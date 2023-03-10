package Pdf_1_Arrays;

/*Desarrolla un programa que ordene los índices de un array de enteros, en 
función del contenido de cada elemento del array, de mayor a menor, es decir, 
hay que almacenar en otro array el índice del array original, en función del 
contenido del último*/

public class Ej4 {
	public static void main(String[] args) {
		int [] original = new int [5];
		int [] resultado = new int [5];
		
		for (int i = 0; i < original.length; i++) {	//Creamos el array de aleatorios
			original[i] =(int)((Math.random() * 10) + 1);
		}
		for (int i = 0; i < original.length; i++) {	//imprimimos el array original
			System.out.print(original[i] + " ");
		}
		System.out.println();
				
		for(int j = 0; j < resultado.length; j++) {	//recorremos el array del resultado para que en cada iteracion recorra el original
			int mayor = -1;
			int indice = 0;
			for (int i = 0; i < original.length; i++) {//recorremos el original
				if (original[i] > mayor) {	//si el valor es mayor que la variable mayor
					mayor = original[i];	//movemos el valor a la variable mayor
					indice = i;	//y guardamos ese indice en la variable indice
				}
			}
			original[indice] = -1;	//cambiamos el valor que hay en la poscion indice por -1
			resultado[j] = indice;	//introducimos ese valor de indice en el array resultado
		}
		
		for (int i = 0; i < resultado.length; i++) {	//imprimimos el array resultado
			System.out.print(resultado[i] + " ");
		}
	}
}
