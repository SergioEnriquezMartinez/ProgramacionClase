package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Seleccion_Simple_Ej_9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mes;
		int dia;
		
		do {
			System.out.print("Introduzca su mes de nacimiento, por favor: ");
			mes = sc.nextInt();
			if (mes < 1 || mes > 12) {
				System.out.println("Mes inexistente, introduzca un mes válido.");
			}
		} while (mes < 1 || mes > 12);
		
		do {
			System.out.print("Introduce tu día de nacimiento, por favor: ");
			dia = sc.nextInt();
			if ((dia < 1 || dia > 31) || (mes == 2 && dia > 28) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)) {
				System.out.println("Día inexistente, introduzca un día válido.");
			}
		} while ((dia < 1 || dia > 31) || (mes == 2 && dia > 28) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30));

		sc.close();
		
		
		if ((dia >= 21 && mes == 3) || (dia <= 20 && mes == 4)) {
			System.out.println("Tu signo de zodiaco Aries");
		} else if ((dia >= 21 && mes == 4) || (dia <= 21 && mes == 5)) {
			System.out.println("Tu signo del zodiaco es Tauro");
		} else if ((dia >= 22 && mes == 5) || (dia <= 21 && mes == 6)) {
			System.out.println("Tu signo del zodiaco es Géminis");
		} else if ((dia >= 22 && mes == 6) || (dia <= 22 && mes == 7)) {
			System.out.println("Tu signo del zodiaco es Cáncer");
		} else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
			System.out.println("Tu signo del zodiaco es Leo");
		} else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
			System.out.println("Tu signo del zodiaco es Virgo");
		} else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
			System.out.println("Tu signo del zodiaco es Libra");
		} else if ((dia >= 23 && mes == 10) || (dia <= 22 && mes == 11)) {
			System.out.println("Tu signo del zodiaco es Escorpio");
		} else if ((dia >= 23 && mes == 11) || (dia <= 21 && mes == 12)) {
			System.out.println("Tu signo del zodiaco es Sagitario");
		} else if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) {
			System.out.println("Tu signo del zodiaco es Capricornio");
		} else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) {
			System.out.println("Tu signo del zodiaco es Acuario");
		} else if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) {
			System.out.println("Tu signo del zodiaco es Piscis");
		} else {
			System.out.println("Por favor introduce una fecha válida");
		}
	}

}
