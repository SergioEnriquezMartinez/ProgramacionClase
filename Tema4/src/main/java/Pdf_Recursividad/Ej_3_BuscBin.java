package Pdf_Recursividad;

import java.util.Scanner;

/*Desarrolla el algoritmo de búsqueda binaria.
“La búsqueda binaria funciona en arrays ordenados. El algoritmo comienza por 
comparar el elemento del medio del array con el valor buscado. Si el valor 
buscado es igual al elemento del medio, se devuelve la posición. Si el valor 
buscado es menor o mayor que el elemento del medio, la búsqueda continua en 
la primera o segunda mitad, respectivamente, dejando la otra mitad fuera de 
consideración.”*/

public class Ej_3_BuscBin {
	public static void main(String[] args) {
		int[] arrayOrdenado = {1, 2, 3, 4, 6, 7, 8, 9, 10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero a buscar (Si no está nos devuelve un -1): ");
		int n = sc.nextInt();
		sc.close();
		
		
		System.out.println(busquedaIndice(arrayOrdenado, n, 0, arrayOrdenado.length));
	}

	public static int busquedaIndice(int arrayOrdenado[], int n, int izquierda, int derecha){
	    if (izquierda >= derecha) {
	    	return -1;
	    }
	 
	    int indiceDeLaMitad = (izquierda + derecha) / 2;
	 
	    int valorQueEstaEnElMedio = arrayOrdenado[indiceDeLaMitad];
	    if (n == valorQueEstaEnElMedio) {
	        return indiceDeLaMitad;
	    }
	    
	    if (n < valorQueEstaEnElMedio) {
	        derecha = indiceDeLaMitad - 1;
	    } else {
	        izquierda = indiceDeLaMitad + 1;
	    }
	    return busquedaIndice(arrayOrdenado, n, izquierda, derecha);
	}
}
