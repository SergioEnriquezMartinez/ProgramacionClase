package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_9_2_UT1 {
	public static void main (String[] args) {
		Scanner variables = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de a:");
		int a = variables.nextInt();
		
		System.out.println("Introduzca el valor de b");
		int b = variables.nextInt();
		
		System.out.println("Introduzca el valor de c");
		int c = variables.nextInt();
		
		variables.close();
		
		double dentroRaiz = Math.pow(b,2) - 4 * a * c;
		
		String solucion1 = (dentroRaiz < 0) ? "No tiene solución 1" : "Primera solución" + (- b + Math.sqrt(dentroRaiz)) / (2 * a);
		String solucion2 = (dentroRaiz < 0) ? "No tiene solución 2" : "Segunda solución" + (- b - Math.sqrt(dentroRaiz)) / (2 * a);
		
		System.out.println(solucion1);
		System.out.println(solucion2);
		
		}
	}