package pruebas.pruebas;

import java.util.Objects;

public class NodoGenerico<T> {
	
	private T info;
	private NodoGenerico<T> sig;
	
	
	
	/**
	 * @param info
	 * @param sig
	 * constructor
	 */
	public NodoGenerico(T info, NodoGenerico<T> sig) {
		this.info = info;
		this.sig = sig;
	}
	
	
	
	public NodoGenerico(T info) {
		this.info = info;
	}



	/**
	 * @return informacion del nodo
	 */
	public T getInfo() {
		return info;
	}
	/**
	 * @param info
	 * guarda informacion
	 */
	public void setInfo(T info) {
		this.info = info;
	}
	/**
	 * @return
	 * devuelve el siguiente al nodo en el que estamos
	 */
	public NodoGenerico<T> getSig() {
		return sig;
	}
	/**
	 * @param sig
	 * guarda un puntero al siguiente nodo
	 */
	public void setSig(NodoGenerico<T> sig) {
		this.sig = sig;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(info, sig);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodoGenerico<T> other = (NodoGenerico<T>) obj;
		return Objects.equals(info, other.info) && Objects.equals(sig, other.sig);
	}
	
	
	
}
