package Bucles;
/*Calcular todos los números de tres cifras tales que la suma de los cubos
de las cifras es igual al valor del número. (Dado el 153 entonces
1³+5³+3³=153).
Da como salida: 153 370 371 407
@author Serj*/

public class Bucles_Ej_10 {
	public static void main(String[] args) {
		String cifra;
		int a, b, c;
		
		for (int i = 100; i < 1000; i++) {
			cifra = Integer.toString(i);							//Convertimos i a string con integer para tener el numero guardado en una cadena
			a = Character.getNumericValue(cifra.charAt(0));			//Guardamos el valor numerico de cada una de las cifras en una variable
			b = Character.getNumericValue(cifra.charAt(1));
			c = Character.getNumericValue(cifra.charAt(2));
			if (i == (a * a * a) + (b * b * b) + (c * c * c)) {		//Realizamos la comparacion
				System.out.print(i + " ");
			}
		}
	}
}
