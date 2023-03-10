package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_8_UT1 {
	public static void main (String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Introduzca el primer número:");
			int numero1 = num1.nextInt();
			
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Introduzca el segundo número");
			int numero2 = num2.nextInt();
			
		
		Scanner num3 = new Scanner(System.in);
		System.out.println("Introduzca el tercer número");
			int numero3 = num3.nextInt();
			
			
		String result = ((numero1 > numero2) && (numero2 > numero3)) || ((numero1 < numero2) && (numero2 < numero3)) ? "Está ordenado" : "No está ordenado";
		System.out.println(result);
			
		num1.close();
		num2.close();
		num3.close();
//También podemos iniciar un scanner para varios valores		
		
	}
}
