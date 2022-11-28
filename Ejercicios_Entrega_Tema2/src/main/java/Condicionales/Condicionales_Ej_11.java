package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, resto;
		
		
		do {
			System.out.print("Introduzca un número del 0 al 99: ");
			num= sc.nextInt();
			sc.close();
		} while (num < 0 || num > 99);
		
		if (num > 15 && num <20) {
			System.out.print("Diez y ");
		} else if (num > 20 && num < 30) {
			System.out.print("Veinti");
		} else if (num > 30 && num < 40) {
			System.out.print("Treinta y ");
		} else if (num > 40 && num < 50) {
			System.out.print("Cuarenta y ");
		} else if (num > 50 && num < 60) {
			System.out.print("Cincuenta y ");
		} else if (num > 60 && num < 70) {
			System.out.print("Sesenta y ");
		} else if (num > 70 && num < 80) {
			System.out.print("Setenta y ");
		} else if (num > 80 && num < 90) {
			System.out.print("Ochenta y ");
		} else if (num > 90 && num < 100) {
			System.out.print("Noventa y ");
		} else if (num <= 15 || num == 20 || num == 30 || num == 40 || num == 50 || num == 60 || num == 70 || num == 80 || num == 90) {
			switch (num) {
			case 0:
				System.out.print("Cero");
			break;
			case 1:
				System.out.print("Uno");
			break;
			case 2:
				System.out.print("Dos");
			break;
			case 3:
				System.out.print("Tres");
			break;
			case 4:
				System.out.print("Cuatro");
			break;
			case 5:
				System.out.print("Cinco");
			break;
			case 6:
				System.out.print("Seis");
			break;
			case 7:
				System.out.print("Siete");
			break;
			case 8:
				System.out.print("Ocho");
			break;
			case 9:
				System.out.print("Nueve");
			break;
			case 10:
				System.out.print("Diez");
			break;
			case 11:
				System.out.print("Once");
			break;
			case 12:
				System.out.print("Doce");
			break;
			case 13:
				System.out.print("Trece");
			break;
			case 14:
				System.out.print("Catorce");
			break;
			case 15:
				System.out.print("Quince");
			break;
			case 20:
				System.out.print("Veinte");
			break;
			case 30:
				System.out.print("Treinta");
			break;
			case 40:
				System.out.print("Cuarenta");
			break;
			case 50:
				System.out.print("Cincuenta");
			break;
			case 60:
				System.out.print("Sesenta");
			break;
			case 70:
				System.out.print("Setenta");
			break;
			case 80:
				System.out.print("Ochenta");
			break;
			case 90:
				System.out.print("Noventa");
			break;
			}
		} else if (num > 15) {
			resto = num % 10;
			switch (resto) {
			case 1:
				System.out.print("uno");
			break;
			case 2:
				System.out.print("dos");
			break;
			case 3:
				System.out.print("tres");
			break;
			case 4:
				System.out.print("cuatro");
			break;
			case 5:
				System.out.print("cinco");
			break;
			case 6:
				System.out.print("seis");
			break;
			case 7:
				System.out.print("siete");
			break;
			case 8:
				System.out.print("ocho");
			break;
			case 9:
				System.out.print("nueve");
			break;
			}
			
		} 
		
		
	}
}
