package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_6_UT1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int num, hora, minuto, segundo, resto;
			System.out.print("Ingrese el número de segundos que dura el concierto:");
			
			num = sc.nextInt();
			/*hora = num / 3600;
			minuto = (num - (hora * 3600)) / 60;
			segundo = num - ((hora * 3600) + (minuto * 60));*/
			
			hora = num / 3600;
			resto = num % 3600;
			minuto = resto / 60;
			segundo = resto % 60;
			
			System.out.println(hora + " horas " + minuto + " minutos " + segundo + " segundos ");
			sc.close();
	}
}
