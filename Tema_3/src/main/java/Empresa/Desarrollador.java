package Empresa;

public class Desarrollador extends Empleados {
	private boolean jv;
	private boolean js;
	private boolean net;
	
	public Desarrollador(String nombre, String dni, int edad, int sueldo, boolean jv, boolean js, boolean net) {
		super(nombre, dni, edad, sueldo);
		this.jv = jv;
		this.js = js;
		this.net = net;
	}

	public boolean isJv() {
		return jv;
	}
	public void setJv(boolean jv) {
		this.jv = jv;
	}

	public boolean isJs() {
		return js;
	}
	public void setJs(boolean js) {
		this.js = js;
	}

	public boolean isNet() {
		return net;
	}
	public void setNet(boolean net) {
		this.net = net;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nJava: " + jv + "\nJavaScript: " + js + "\n.Net: " + net;
	}
}
