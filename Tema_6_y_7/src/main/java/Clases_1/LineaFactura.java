package Clases_1;

/**
 * @author sergi
 * Contiene información del producto, cantidad y precio.
 */
public class LineaFactura {
	
	private int codigo;
	private float precio;
	private int cantidad;
	public LineaFactura(int codigo, float precio, int cantidad) {
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
