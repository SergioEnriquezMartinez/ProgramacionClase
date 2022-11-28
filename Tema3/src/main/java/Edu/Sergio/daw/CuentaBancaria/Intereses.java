package Edu.Sergio.daw.CuentaBancaria;

import java.time.LocalDate;

public class Intereses {
	public static double calculaIntereses(Cuenta cuenta) {
		double result = 0;
		if (cuenta.getfechcrea().isBefore(LocalDate.now().minusYears(3)) && cuenta.getfechcrea().isAfter(LocalDate.now().minusYears(5))) {
			result = 0.05;
		} else if (cuenta.getfechcrea().isBefore(LocalDate.now().minusYears(5))) {
			result = 0.1;
		}
		return result;
	}

}
