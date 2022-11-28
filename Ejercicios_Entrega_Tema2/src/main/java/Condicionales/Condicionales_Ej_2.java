package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hor, Min, Seg;
		
		System.out.print("Introduzca las horas: ");
		Hor = sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		Min = sc.nextInt();
		System.out.print("Introduzca los segundos: ");
		Seg = sc.nextInt();
		sc.close();
		
		if (Seg >= 60 && Min >= 60) {
			int aux1 = 0, aux2 = 0;
			aux1 = Seg / 60;
			Seg = Seg % 60;
			Min = Min + aux1;
			aux2 = Min / 60;
			Min = Min % 60;
			Hor = Hor + aux2;
		} else if (Seg >= 60 && Min < 60) {
			int aux = 0;
			aux = Seg / 60;
			Seg = Seg % 60;
			Min = Min + aux;
		}
		System.out.println(Hor + "h " + Min + "m " + Seg + "s" );
		System.out.printf("Tiempo correcto: %d : %02d : %02d", Hor, Min, Seg); //Imprimir con formato
	}
}
