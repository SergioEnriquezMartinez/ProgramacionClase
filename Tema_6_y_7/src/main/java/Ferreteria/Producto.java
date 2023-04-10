package Ferreteria;

import java.util.Objects;

public class Producto {
	
	private int idProducto;
	private String marca;
	private double precio;
	
	
	public Producto(int idProducto, String marca, double precio) {
		this.idProducto = idProducto;
		this.marca = marca;
		this.precio = precio;
	}


	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idProducto, marca, precio);
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
		return idProducto == other.idProducto && Objects.equals(marca, other.marca)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
}
