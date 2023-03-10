package Edu.Sergio.daw.tema2seleccionmultiple;

import java.util.Scanner;

public class Seleccion_Multiple_Ej_8 {
	public static void main(String[] args) {
		System.out.print("Introduzca su peso en kg: ");
		Scanner sc = new Scanner(System.in);
		double peso = sc.nextDouble();
		System.out.print("Introduzca su altura en metros: ");
		double altura = sc.nextDouble();
		double imc = peso / (altura * altura);
		if (imc < 18.5) {
			System.out.println("Insuficiencia ponderal");
		} else if (18.5 >= imc && imc <= 24.9) {
			System.out.println("Intervalo normal");
		} else if (imc == 25.0) {
			System.out.println("Sobrepeso");
		} else if (imc > 25.0 && imc <= 29.9) {
			System.out.println("Preobesidad");
		} else if (imc == 30) {
			System.out.println("Obesidad");
		} else if (imc > 30.0 && imc <= 34.9) {
			System.out.println("Obesidad clase I");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidad clase II");
		} else if (imc >= 40.0) {
			System.out.println("Obesidad clase III");
		}
		sc.close();
	}
}
