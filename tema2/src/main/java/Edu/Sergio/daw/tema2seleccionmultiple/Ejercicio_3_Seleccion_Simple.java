package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Ejercicio_3_Seleccion_Simple {
	public static void main(String[] args) {
		System.out.print("Introduce un número del 1 al 7: ");
		Scanner numero = new Scanner(System.in);
		int dia = numero.nextInt();
				switch (dia) {
				case 1:
					System.out.println("Lunes");
					break;
				case 2:
					System.out.println("Martes");
					break;
				case 3:
					System.out.println("Miércoles");
					break;
				case 4:
					System.out.println("Jueves");
					break;
				case 5:
					System.out.println("Viernes");
					break;
				case 6:
					System.out.println("Sábado");
					break;
				case 7:
					System.out.println("Domingo");
					break;
				default:
					System.out.println("No has introducido un número válido, por favor introduce un número del 1 al 7, por favor: ");
					
				}
				numero.close();
	}
}
