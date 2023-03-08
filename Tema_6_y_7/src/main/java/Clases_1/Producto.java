package Clases_1;

import java.util.Objects;

/**
 * @author sergi
 * Contiene la información de cada producto en la tienda.
 */
public class Producto {
	
	private int codigo;
	private String descripcion;
	private float precio;
	private int cantidad;
	private int minimo;
	
	
	public Producto(int codigo, String descripcion, float precio, int cantidad, int minimo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.minimo = minimo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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


	public int getMinimo() {
		return minimo;
	}


	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cantidad, codigo, descripcion, minimo, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cantidad == other.cantidad && codigo == other.codigo && Objects.equals(descripcion, other.descripcion)
				&& minimo == other.minimo && Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio);
	}


	@Override
	public String toString() {
		return "Producto = > código de producto '" + codigo + "', descripcion del producto '" + descripcion + "', precio '" + precio + "', cantidad '"
				+ cantidad + "', minimo '" + minimo + "'\n";
	}
	
	
	
	
	
}
