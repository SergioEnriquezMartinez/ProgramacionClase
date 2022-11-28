package Condicionales;

import java.util.Scanner;

public class Condicionales_Ej_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dni, result, aux, resto, dni_abs, result_abs;
		System.out.print("Introduce tu DNI sin la letra: ");
		dni = sc.nextInt();
		sc.close();
		
		result = dni / 23;
		dni_abs = Math.abs(dni);
		result_abs = Math.abs(result);
		
		result_abs = dni_abs / 23;
		aux = result_abs * 23;
		resto = dni_abs - aux;
		
		if (resto == 0) {
			System.out.print(dni + "-T");
		} else if (resto == 1) {
			System.out.print(dni + "-R");
		} else if (resto == 2) {
			System.out.print(dni + "-W");
		} else if (resto == 3) {
			System.out.print(dni + "-A");
		} else if (resto == 4) {
			System.out.print(dni + "-G");
		} else if (resto == 5) {
			System.out.print(dni + "-M");
		} else if (resto == 6) {
			System.out.print(dni + "-Y");
		} else if (resto == 7) {
			System.out.print(dni + "-F");
		} else if (resto == 8) {
			System.out.print(dni + "-P");
		} else if (resto == 9) {
			System.out.print(dni + "-D");
		} else if (resto == 10) {
			System.out.print(dni + "-X");
		} else if (resto == 11) {
			System.out.print(dni + "-B");
		} else if (resto == 12) {
			System.out.print(dni + "-N");
		} else if (resto == 13) {
			System.out.print(dni + "-J");
		} else if (resto == 14) {
			System.out.print(dni + "-Z");
		} else if (resto == 15) {
			System.out.print(dni + "-S");
		} else if (resto == 16) {
			System.out.print(dni + "-Q");
		} else if (resto == 17) {
			System.out.print(dni + "-V");
		} else if (resto == 18) {
			System.out.print(dni + "-H");
		} else if (resto == 19) {
			System.out.print(dni + "-L");
		} else if (resto == 20) {
			System.out.print(dni + "-C");
		} else if (resto == 21) {
			System.out.print(dni + "-K");
		} else if (resto == 22) {
			System.out.print(dni + "-E");
		} else {
			System.out.print("Introduce tu dni correctamente");
		}
	}
}
