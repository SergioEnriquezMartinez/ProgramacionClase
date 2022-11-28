package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_5_UT1 {
	static final double GRAVEDADTIERRA = 9.8f;
	static final double GRAVEDADLUNA = 1.62f;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu peso:");
		double pesoTierra = sc.nextDouble(), pesoLuna, cociente;
		
		/*pesoTierra = Double.valueOf(sc.next()); - Tambien lo podriamos poner asi */
		
		sc.close();
		
		cociente = pesoTierra / GRAVEDADTIERRA;
		
		pesoLuna = cociente * GRAVEDADLUNA;
		
		System.out.println(pesoLuna);
			
	}

}
