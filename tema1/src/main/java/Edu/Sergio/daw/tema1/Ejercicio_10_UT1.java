package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_10_UT1 {
	final static double PI = 3.141592;
	final static int EXPONENTE = 2;
	public static void main (String[] args) {
		Scanner radio = new Scanner(System.in);
		System.out.println("Introduzca el radio de la circunferencia: ");
		double longitud, area, r = radio.nextDouble();
		radio.close();
		
		longitud = 2 * PI * r;
		area = PI * (Math.pow(r,EXPONENTE));
		
		System.out.println("La longitud de la circunferencia es " + longitud + " y su área es " + area);
//		La libreria Math tiene valores como Math.PI
	}

}
