package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anio;
		
		
		do {
			System.out.print("Introduce el día: ");
			dia = sc.nextInt();
			System.out.print("Introduce el mes: ");
			mes = sc.nextInt();
			System.out.print("Introduce los año: ");
			anio = sc.nextInt();
			sc.close();
			
			if (mes < 1 || mes > 12) {
				System.out.print("Mes no válido");
			} else if (mes == 2 && (dia < 1 || dia > 28)) {
				System.out.print("Dia y mes no validos");
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
				System.out.print("Dia y mes no válidos");
			} else if (dia < 1 || dia > 31) {
				System.out.print("Dia y mes no válidos");
			}
		} while ((mes < 1 || mes > 12) && (mes == 2 && (dia < 1 || dia > 28)) && ((mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia < 1 || dia > 30)) && (dia < 1 || dia > 31)));
		
		if (mes == 12 && dia == 31) {
			mes = 1;
			dia = 1;
			anio++;
		} else if (mes == 2) {
			if (dia < 28) {
				dia++;
			} else if (dia == 28) {
				mes++;
				dia = 1;
			}
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia < 30) {
				dia++;
			} else if (dia == 30) {
				mes++;
				dia = 1;
			}
		} else {
			if (dia < 31) {
				dia++;
			} else if (dia == 31) {
				mes++;
				dia = 1;
			}
		}
		
		System.out.print("El dia siguiente al mostrado sería: " + dia + " , " + mes + " , " + anio);
	}
}
