package Bucles;

/*Desarrolla un programa que lea un número entero positivo y lo
transforme a su representación binaria.
Introduciendo: 18
Da como salida: 10010
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, resto;
		final int DIVISOR = 2;
		System.out.println("Introduza un número positivo y se lo transformaré a binario: ");
		num = sc.nextInt();
		String binario = "";
		while (num != 0) {			//Mientras el numero sea mayor o igual que 1
			resto = num % DIVISOR;		//sacamos el resto de esta operacion y de la siguiente sacamos el nuevo dividendo
			num = num / DIVISOR;
			binario = resto + binario;		//guardamos los restos de manera invertida para sacar el binario
		}
		sc.close();
		System.out.println(binario);
		
	}
}
//Si quisieramos utilizarlo para cualquier otra conversion, por ejemplo de decimal a octal solo tendríamos que cambiar el valor de la constante por 8