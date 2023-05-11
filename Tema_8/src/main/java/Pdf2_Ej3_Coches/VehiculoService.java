package Pdf2_Ej3_Coches;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class VehiculoService {

	
	/**
	 * @param v le pasamos vehiculo v
	 * @return devuelve un true en caso de que hayan pasado mas de 5 dias y un false en caso de que no lo haya hecho
	 */
	public boolean diasExposicion(Vehiculo v) {
		LocalDateTime fechaActual = LocalDateTime.now();
		long dias = ChronoUnit.DAYS.between(v.getEntradaEnExposicion(), fechaActual);
		
		return dias > 5;
	}
	
	/**
	 * @param v le pasamos un vehiculo v
	 * @return si el metodo anterior es true actualiza el precio a uno con un descuento del 15%, sino lo deja como esta
	 */
	public double descuento15(Vehiculo v) {
		if (diasExposicion(v) == true) {
			v.setPrecio(v.getPrecio() * (1 - (v.getDESCUENTO() / 100)));
		}
		return v.getPrecio();
	}
}
