package Clases_1;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, codigo, precio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaFactura other = (LineaFactura) obj;
		return cantidad == other.cantidad && codigo == other.codigo
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}
	
	@Override
	public String toString() {
		return "LineaFactura => codigo '" + codigo + "', precio '" + precio + "', cantidad '" + cantidad + "'\n";
	}
	
}
