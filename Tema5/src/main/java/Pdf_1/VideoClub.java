package Pdf_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoClub {
	
	private List<Cliente> listaClientes;
	private List<Pelicula> listaPeliculas;
	private List<Prestamo> listaPrestamos;

	public VideoClub() {
		this.listaClientes = new ArrayList<>();
		this.listaPeliculas = new ArrayList<>();
		this.listaPrestamos = new ArrayList<>();
	}

	public boolean aniadirCliente(Cliente c) {
		boolean result = false;
		if (!this.listaClientes.contains(c)) {
			this.listaClientes.add(c);
			result = true;
		}

		return result;
	}

	public boolean aniadirPelicula(Pelicula p) {
		boolean result = false;
		if (!this.listaPeliculas.contains(p)) {
			this.listaPeliculas.add(p);
			result = true;
		}

		return result;
	}

	public boolean aniadirPrestamo(Prestamo p) {
		boolean result = false;
		if (!listaPrestamos.contains(p)) {
			listaPrestamos.add(p);
			result = true;
		}

		return result;
	}

	/**
	 * Método que permite buscar clientes en el listado del videoclub
	 * 
	 * @param numCarnet del cliente a buscar
	 * @return cliente si está en la lista. En caso contrario, null.
	 */
	public Cliente buscarCliente(int numCarnet) {

		for (Cliente elem : this.listaClientes) {
			if (elem.getNumCarnet() == numCarnet) {
				return elem;
			}
		}

		return null;
	}

	/**
	 * Método que permite buscar pelicula en el listado del videoclub
	 * 
	 * @param codPelicula de la película a buscar
	 * @return película si está en la lista. En caso contrario, null.
	 */
	public Pelicula buscarPelicula(String codPelicula) {

		for (Pelicula elem : listaPeliculas) {
			if (elem.getCodigo().equals(codPelicula)) {
				return elem;
			}
		}
		return null;
	}

	public List<Prestamo> getPrestamos() {
		return listaPrestamos;
	}

	/** Método que devuelve un listado de préstamos de un cliente concreto.
	 * @param numCarnet del cliente
	 * @return una lista de prestamos para ese cliente. Lista vacía en caso de que
	 *         no exista ese cliente
	 */
	public List<Prestamo> getPrestamos(int numCarnet) {
		List<Prestamo> lista = new ArrayList<>();

		for (int i = 0; i < listaPrestamos.size(); i++) {
			if (listaPrestamos.get(i).getCliente().getNumCarnet() == numCarnet) {
				lista.add(listaPrestamos.get(i));
			}
		}

		return lista;
	}
	
	public boolean devolucion(String codPelicula, int numCarnet) {
		
		/*for (Prestamo prestamo : listaPrestamos) {
			if(prestamo.getCliente().getNumCarnet() == numCarnet &&
					prestamo.getPelicula().getCodigo().equals(codPelicula)) {
				listaPrestamos.remove(prestamo);
				return true;
			}
		}*/
		
		Iterator<Prestamo> it = listaPrestamos.iterator();
		
		while(it.hasNext()) {
			Prestamo prestamo = it.next();
			if(prestamo.getCliente().getNumCarnet() == numCarnet &&
					prestamo.getPelicula().getCodigo().equals(codPelicula)) {
				listaPrestamos.remove(prestamo);
				return true;
			}
		}
		
		return false;
	}
}
