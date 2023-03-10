package pdf_Metodos;

import java.util.Scanner;

/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de 
caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o 
descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que 
está dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta 
que el cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de 
descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán 
ningún cambio*/

public class ej5 {
	public static int clave;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String cadena = sc.nextLine();
		System.out.println("Introduzca la clave de cifrado: ");
		clave = sc.nextInt();
		sc.close();
		String cadCifrada = cifrar(cadena, clave);
		System.out.println("Cadena cifrada: " + cadCifrada);
		String cadDescifrada = descifrar(cadCifrada, clave);
		System.out.println("Cadena descifrada: " + cadDescifrada);
	}
	
	public static String cifrar(String cadena, int clave) {
		String cadCifrada = "";
		int resto = clave % 26;
		for (int i = 0; i < cadena.length(); i++) {
			int numVal = cadena.charAt(i);
			if (numVal != 32) {
				if (numVal == 89) {
					numVal = 65 + resto;
				} else if (numVal == 90) {
					numVal = 66 + resto;
				} else if (numVal == 121) {
					numVal = 97 + resto;
				} else if (numVal == 122) {
					numVal = 98 + resto;
				} else {
					numVal += resto;
				}
			}
			cadCifrada += (char) numVal;
		}
		return cadCifrada;
	}
	
	public static String descifrar(String cadenaCifrada, int clave) {
		String cadDescifrada = "";
		int resto = clave % 26;
		for (int i = 0; i < cadenaCifrada.length(); i++) {
			int numVal = cadenaCifrada.charAt(i);
			if (numVal != 32) {
				if (numVal == 65) {
					numVal = 89 + resto;
				} else if (numVal == 66) {
					numVal = 90 + resto;
				} else if (numVal == 97) {
					numVal = 121 + resto;
				} else if (numVal == 98) {
					numVal = 122 + resto;
				} else {
					numVal -= resto;
				}
			}
			cadDescifrada += (char) numVal;
		}
		return cadDescifrada;
	}
	
}
