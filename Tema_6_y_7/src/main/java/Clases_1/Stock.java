package Clases_1;

import java.util.ArrayList;

/**
 * @author sergi
 * Es el conjunto de todos los productos de la tienda. Gestiona todos los productos.
 */
public class Stock {

	private ArrayList<Producto> productos;

	public Stock() {
		this.productos = new ArrayList<Producto>();
	}
	
	/**
	 * Añade un producto a la lista
	 */
	public boolean añadirProducto(Producto producto) {
		boolean result = false;
		if (!this.productos.contains(producto)) {
			productos.add(producto);
			result = true;
		}
		return result;
	}
	
	/**
	 * Borra un producto de la lista
	 */
	public boolean borrarProducto(int codigo) {
		boolean result = false;
		for (Producto producto : this.productos) {
			if (producto.getCodigo() == codigo) {
				productos.remove(producto);
				result = true;
				return result;
			}
		}
		return result;
	}
	
	/**
	 * @return Devuelve un producto buscado
	 */
	public Producto buscarProducto(int codigo) {
		for (Producto producto : this.productos) {
			if(producto.getCodigo() == codigo);
			return producto;
		}
		return null;
	}
	
	/**
	 * @return lista de productos agotados actualmente
	 */
	public ArrayList<Producto> productosAgotados() {
		ArrayList<Producto> productoAgotado = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getCantidad() == 0) {
				productoAgotado.add(producto);
			}
		}
		return productoAgotado;
	}
	
	/**
	 * @return lista de productos que estan agotados actualmente
	 */
	public ArrayList<Producto> productosBajoMinimos() {
		ArrayList<Producto> productoBajoMinimos = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getCantidad() < producto.getMinimo() && producto.getCantidad() > 0) {
				productoBajoMinimos.add(producto);
			}
		}
		return productoBajoMinimos;
	}
}
