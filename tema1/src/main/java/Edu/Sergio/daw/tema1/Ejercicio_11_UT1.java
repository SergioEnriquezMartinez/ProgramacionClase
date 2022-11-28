package Edu.Sergio.daw.tema1;
import java.util.Scanner;
public class Ejercicio_11_UT1 {
	public static void main (String[] args) {
		Scanner entero = new Scanner(System.in);
		System.out.print("Introduce un entero: ");
		
		int num = entero.nextInt();
		char conversion = (char)num;
		
		entero.close();
		
		System.out.println("El entero introducido corresponde a : " + conversion);
	}
}
