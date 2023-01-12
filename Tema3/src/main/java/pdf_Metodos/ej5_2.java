package pdf_Metodos;

import java.util.Scanner;

/*Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de 
caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o 
descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que 
está dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta 
que el cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de 
descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán 
ningún cambio*/

public class ej5_2 {
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
		StringBuilder sb = new StringBuilder();
		
		clave = clave % 26;
		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isLowerCase(cadena.charAt(i))) {
				int letraResultante = cadena.charAt(i) + clave;
				if (letraResultante > 'z') {
					letraResultante -= 26;
				}
				sb.append((char)letraResultante);
			} else if (Character.isUpperCase(cadena.charAt(i))) {
				if (cadena.charAt(i) + clave > 'Z') {
					sb.append((char) (cadena.charAt(i) + clave - 26));
				} else {
					sb.append((char) (cadena.charAt(i) + clave));
				}
			}
		}
		return sb.toString();
	}
	
	public static String descifrar(String cadenaCifrada, int clave) {
		StringBuilder sb = new StringBuilder();
		
		clave = clave % 26;
		for (int i = 0; i < cadenaCifrada.length(); i++) {
			if (Character.isLowerCase(cadenaCifrada.charAt(i))) {
				int letraResultante = cadenaCifrada.charAt(i) - clave;
				if (letraResultante < 'a') {
					letraResultante += 26;
				}
				sb.append((char)letraResultante);
			} else if (Character.isUpperCase(cadenaCifrada.charAt(i))) {
				if (cadenaCifrada.charAt(i) + clave > 'A') {
					sb.append((char) (cadenaCifrada.charAt(i) - clave + 26));
				} else {
					sb.append((char) (cadenaCifrada.charAt(i) - clave));
				}
			}
		}
		return sb.toString();
	}
	
}
