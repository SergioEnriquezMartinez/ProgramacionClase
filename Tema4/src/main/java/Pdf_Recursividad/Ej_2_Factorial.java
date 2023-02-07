package Pdf_Recursividad;

import java.math.BigInteger;

/*Calcula el factorial de un número, de forma recursiva*/

public class Ej_2_Factorial {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("60");
		
		System.out.println(factorial(n));
	}
	
	public static BigInteger factorial(BigInteger n) {
		if (n == null || n.signum() == -1) {
			return null;
		} else if(n.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}
