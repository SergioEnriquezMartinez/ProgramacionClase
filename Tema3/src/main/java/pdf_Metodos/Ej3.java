package pdf_Metodos;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número del cual quiere saber el factorial: ");
		int num = sc.nextInt();
		sc.close();
		
		factorial(num);
	}
	
	public static void factorial(int num) {
		int factorial = num;
		if (num < 0) {
			factorial = -1;
		} else if (num == 0) {
			factorial = -2;
		} else {
			for(int i = num - 1; i > 1; i--) {
				factorial *= i;
			}
		}
		System.out.println(factorial);
	}

}