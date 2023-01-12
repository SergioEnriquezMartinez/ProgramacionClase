package pdf_Metodos;

/*Método fecha() que calculará el día del año al que corresponde una fecha en 
formato día, mes.
fecha(1,1)=1
fecha(11,3)=70
fecha(31,12)=365*/

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		int dia, mes;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduce un día: ");
		dia = sc.nextInt();
		System.out.println("Introduce un mes: ");
		mes = sc.nextInt();
		} while (!comprobarValidez(dia, mes));
		
		sc.close();
		System.out.println("Los días que han transcurrido del año hasta el dia " + dia + " del mes " + mes + " son: " + fecha(dia, mes));
	}
	
	
	public static boolean comprobarValidez(int dia, int mes) {
		if (mes == 2) {
			if (dia >0 && dia <= 28) {
				return true;
			}
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 0 && dia <= 31) {
				return true;
			}
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 0 && dia <= 30) {
				return true;
			}
		}
		return false;
	}
	
	public static int fecha(int dia, int mes) {
		int fecha = dia;
		switch (mes) {
		case 2: fecha += 31; break;
		case 3: fecha += 59; break;
		case 4: fecha += 90; break;
		case 5: fecha += 120; break;
		case 6: fecha += 151; break;
		case 7: fecha += 181; break;
		case 8: fecha += 212; break;
		case 9: fecha += 243; break;
		case 10: fecha += 273; break;
		case 11:fecha += 304; break;
		case 12: fecha += 334; break;
		}
		return fecha;
	}
}
