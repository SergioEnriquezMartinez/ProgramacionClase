package ListasColasPilas;

public class AlgoritmosOrdenacion {
	
	
	public static void burbuja(Integer[] lista) {//colocamos el elemento mayor en la ultima posicion
		for (int i = 1; i < lista.length; i++) {
			boolean cambios = false;
			for (int j = 0; j < lista.length - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					int aux = lista[j];
					lista[j] = lista[j + 1];
					lista [j + 1] = aux;
					cambios = true;
				}
			}
			if (!cambios) {
				break;
			}
		}
	}
	
	public static void seleccion(Integer[] lista) {//busca el elemento menor e intercambia su posición con el elemento actual
		for (int i = 0; i < lista.length - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < lista.length; j++) {
				if (lista[j] < lista[menor]) {
					menor = j;
				}
			}
			int aux = lista [i];
			lista[i] = lista[menor];
			lista[menor] = aux;
		}
	}
	
	
	public static void insercion(Integer[] lista) {//insertamos el elemento actual en su posicion correspondiente, desplazamos todos
		for (int i = 1; i < lista.length; i++) {//elementos mayores una posicion a la derecha
			int aux = lista[i];
			int j = i - 1;
			while (j >= 0 && lista[j] > aux) {
				lista[j + 1] = lista[j];
				j--;
			}
			lista[j + 1] = aux;
		}
		
	}
}
