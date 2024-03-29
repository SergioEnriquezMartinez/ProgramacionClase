package Clases1_1;

public class Cuenta {
	private String nombre;
	private String ap1;
	private String ap2;
	private double cantidad;
	private double ingreso;
	private double retiro;
	
	public Cuenta(String nombre, String ap1, String ap2, double cantidad) {
		this.nombre = nombre;
		this.ap1 = ap1;
		this.ap2 = ap2;
		this.cantidad = cantidad;
	}
	public double ingresar(double cantidad) {
		
		if (ingreso > 0) {
			this.cantidad += ingreso;
		}
		return cantidad;
	}
	
	public double retirar(double cantidad) {
		this.cantidad -= retiro;
		if (this.cantidad < 0) {
			return 0;
		} else {
			return cantidad;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAp1() {
		return ap1;
	}
	public void setAp1(String ap1) {
		this.ap1 = ap1;
	}


	public String getAp2() {
		return ap2;
	}
	public void setAp2(String ap2) {
		this.ap2 = ap2;
	}


	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Cuenta nombre=" + nombre + ", ap1=" + ap1 + ", ap2=" + ap2 + ", cantidad=" + cantidad;
	}
	
	
}
