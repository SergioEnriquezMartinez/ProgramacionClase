package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_3_UT1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número:");
		int numTeclado = sc.nextInt(), cociente;
		
		//Resto
		
		cociente = numTeclado % 7;
		
		//Comparacio
		
		String result = cociente == 0 ? "Este número SI que es múltiplo de 7" : "Este número NO es múltiplo de 7";
		System.out.println(result);
		
		sc.close();
		
	}
}
