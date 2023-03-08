package Clases_1;

import java.util.ArrayList;

/**
 * @author sergi
 * Almacén de facturas.
 */
public class CajonFacturas {
	
	private ArrayList<Factura> facturas;

	public CajonFacturas() {
		this.facturas = new ArrayList<Factura>();
	}
	
	public boolean añadirFactura(Factura factura) {
		boolean result = false;
		if (!this.facturas.contains(factura)) {
			facturas.add(factura);
			result = true;
		}
		return result;
	}
	
	public Factura buscarFactura(int numeroFactura) {
		for (Factura factura : this.facturas) {
			if(factura.getNumeroFactura() == numeroFactura);
			return factura;
		}
		return null;
	}
	
	public ArrayList<Factura> facturasPendientesCobro() {
		ArrayList<Factura> facturasPendientes = new ArrayList<Factura>();
		for (Factura factura : this.facturas) {
			if(factura.isPagada() == false) {
				facturasPendientes.add(factura);
			}
		}
		return facturasPendientes;
	}
}
