package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_4_UT1 {
	public static void main (String[] args) {
		
		System.out.print("Introduce un año:");
		
		Scanner sc = new Scanner(System.in);
		
		int anio = sc.nextInt();
		boolean isbisiesto = false;
		
		
		sc.close();
		
		
		isbisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
		
		
		
		System.out.println(isbisiesto ? "Es bisiesto" : "No es bisiesto");
			
	}

}
