package Bucles;

/*Realizar un programa que calcule la potencia de un número an . La
potencia se hará por medio de multiplicaciones, está prohibido usar
Math.pow().
si n es mayor que cero se hará una potencia normal
si n es menor que cero se hará
1/n^a
y si n cero la solución será 1
@author Serj*/

import java.util.Scanner;

public class Bucles_Ej_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		float base = sc.nextFloat();
		System.out.println("Introduce el exponente: ");
		float exp = sc.nextFloat();
		sc.close();
		float result = 1; 
		float result2 = 0;
		
		if (exp != 0) {							//Exponentes diferentes de cero
			float exp1 = Math.abs(exp);			//Hacemos valor absoluto al exponente para operar
			for (int i = 1; i <= exp1; i++) {	//Hacemos la operacion base
				result *= base;
			}
			if (exp > 0) {						//Para exponente positivo
				System.out.println(result);
			} else if (exp < 0) {				//Para exponentes negativos
				result2 = 1 / result;
				System.out.println(result2);
			}
		} else if (exp == 0) {					//Exponente igual a cero
			System.out.println("1");
		}
		
	}
}