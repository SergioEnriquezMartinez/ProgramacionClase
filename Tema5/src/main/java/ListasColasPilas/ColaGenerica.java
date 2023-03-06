package pruebas.pruebas;

public class ColaGenerica<T> {
	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	private int tamaño;
	
	public ColaGenerica() {
		this.primero = this.ultimo = null;
		this.tamaño = 0;
	}
	
	/**
	 * @return devuelve un booleano si la cola esta vacia o no
	 */
	public boolean isEmpty() {
		return tamaño == 0;
	}
	
	/**
	 * añade elementos a la cola por el final
	 */
	public void encolar(T info) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
		if(isEmpty()) {
			this.primero = this.ultimo = nuevo;
		} else {
			this.ultimo.setSig(nuevo);
			this.ultimo = nuevo;
		}
		this.tamaño++;
	}
	
	/**
	 * extrae elementos de la cola por el principio
	 */
	public T desencolar() {
		if(!isEmpty()) {
			NodoGenerico<T> desencolar = this.primero;
			this.primero = desencolar.getSig();
			desencolar.setSig(null);
			T info = desencolar.getInfo();
			desencolar = null;
			this.tamaño--;
			return info;
		}
		return null;
	}
	
	/**
	 * @return muestra el primer elemento de la cola sin extraerlo de ella
	 */
	public T front() {
		if(!isEmpty()) {
			return this.primero.getInfo();
		}
		return null;
	}
	
	/**
	 * nos muestra la cola segun su orden de salida y entrada
	 */
	public void mostrarCola() {
		if(!isEmpty()) {
			NodoGenerico<T> aux = this.primero;
			while(aux != this.ultimo) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getSig();
			}
			System.out.println(this.ultimo.getInfo()); //== aux.getInfo()
		} else {
			System.err.println("Está vacía");
		}
	}
	
}
