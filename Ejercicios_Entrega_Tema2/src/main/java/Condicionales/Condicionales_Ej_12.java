package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, seg;
		
		do {
			System.out.print("Introduce la hora: ");
			hora = sc.nextInt();
			System.out.print("Introduce los minutos: ");
			min = sc.nextInt();
			System.out.print("Introduce los segundos: ");
			seg = sc.nextInt();
			sc.close();
		} while (min < 0 || min > 59 || seg < 0 || seg > 59);
		
		if (seg < 59) {
			seg++;
		} else if (seg == 59 && min < 59) {
			min++;
			seg = 00;
		} else if (seg == 59 && min == 59) {
			hora++;
			min = 00;
			seg = 00;
		}
		
		System.out.print("La hora un segundo más tarde será: " + hora + ":" + min + ":" + seg);
	}
}
