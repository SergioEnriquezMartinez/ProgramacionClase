package pdf_Metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número que quiere aproximar: ");
		float num = sc.nextFloat();
		
		System.out.println("Introduzca el número de decimales que quiere: ");
		int decimal = sc.nextInt();
		
		sc.close();
		
		redondear(num, decimal);
	}
	
	public static void redondear(float num, int decimal) {
		num *= Math.pow(10, decimal);
		
		double lastCifra = num * Math.pow(10, decimal + 1);
		lastCifra %= 10;
		
		if (lastCifra >= 5) {
			num++;
		}
		
		num = (int) num;
		
		num /= Math.pow(10, decimal);
		
		System.out.println(num);
	}
	
	public static double redondeoB(float num, int decimal) {
		BigDecimal bd = new BigDecimal(num).setScale(decimal, RoundingMode.HALF_EVEN);
		return bd.doubleValue();
	}
}
