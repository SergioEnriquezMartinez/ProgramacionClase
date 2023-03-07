package ListasColasPilas;

public class ListaGenerica<T> {

	private NodoGenerico<T> primero;
	private int numElementos;
	
	
	
	/**
	 * @param primero
	 * @param numElementos
	 * constructor para la lista
	 */
	public ListaGenerica() {
		this.primero = null;
		this.numElementos = 0;
	}
	
	/**
	 * @return true en caso de que la lista este vacia
	 * comprobamos si la lista está vacia
	 */
	public boolean isEmpty() {
		return numElementos == 0;
	}
	
	/**
	 * @return la info del primer elemento de la lista
	 */
	public T getPrimero() {
		if (!isEmpty()) {
			return this.primero.getInfo();
		}
		return null;
	}
	
	/**
	 * @return la info del ultimo elemento de la lista
	 */
	public T getUltimo() {
		if (!isEmpty()) {
			NodoGenerico<T> aux = this.primero;
			while (aux.getSig()!= null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}
	
	/**
	 * @param info
	 * inserta nodos en la primera posicion de la lista
	 */
	public void insertarAlPrincipio(T info) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
		if (isEmpty()) {
			this.primero = nuevo;
		} else {
			nuevo.setSig(this.primero);
			this.primero = nuevo;
		}
		this.numElementos++;
	}
	
	/**
	 * @param info
	 * inserta nodos al final de la lista
	 */
	public void insertarAlFinal(T info) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
		NodoGenerico<T> aux = this.primero;
		if (isEmpty()) {
			this.primero = nuevo;
		} else {
			while(aux.getSig()!= null) {
				aux = aux.getSig();
			}
			aux.setSig(nuevo);
		}
		this.numElementos++;
	}
	
	/**
	 * @param info
	 * @param index
	 * inserta informacion a partir de la posicion que le indiquemos
	 */
	public void insertarEnUnaPosicion(T info, int index) {
		if(index <= this.numElementos && index >= 0) {
			if(isEmpty()) {
				insertarAlPrincipio(info);
			} else {
				if(index == 0) {
					insertarAlPrincipio(info);
				} else if (index == this.numElementos) {
					insertarAlFinal(info);
				} else {
					NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
					NodoGenerico<T> anterior = this.primero;
					for (int i = 1; i < index; i++) {
						anterior = anterior.getSig();
					}
					nuevo.setSig(anterior.getSig());
					anterior.setSig(nuevo);
					this.numElementos++;
				}
			}
		}
	}
	
	/**
	 * @param info
	 * @return boolean si la info que le pasamos se encuentra dentro de la lista o no
	 */
	public boolean contieneInfo(T info) {
		if(!isEmpty()) {
			NodoGenerico<T> aux = this.primero;
			while(aux != null) {
				if(aux.getInfo().equals(info)) {
					return true;
				}
				aux = aux.getSig();
			}
		}
		return false;
	}
	
	/**
	 * @param info
	 * @param index
	 * @return info que hay en el nodo situado en la posicion seleccionada
	 */
	public T getElementoPorPosicion(int index) {
		if(index <= this.numElementos && index >= 0 && !isEmpty()) {
			NodoGenerico<T> aux = this.primero;
			for(int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}
	
	
	/**
	 * Borra el primer elemento de la lista
	 */
	public void borrarPrimero() {
		if(!isEmpty()) {
			NodoGenerico<T> borrar = this.primero;
			this.primero = this.primero.getSig();
			borrar.setSig(null);
			borrar = null;
			this.numElementos--;
		}
	}
	
	/**
	 * borra el ultimo elemento de la lista
	 */
	public void borrarUltimo() {
		if(!isEmpty()) {
			NodoGenerico<T> anterior = this.primero;
			NodoGenerico<T> borrar = this.primero.getSig();
			while(borrar.getSig() != null) {
				anterior = borrar;
				borrar = borrar.getSig();
			}
			anterior.setSig(null);
			borrar = null;
			this.numElementos--;
		}
	}
	
	/**
	 * @param info
	 * borra el nodo que contenga la informacion que  queremos borrar
	 */
	public void borrarInfo(T info) {
		if(!isEmpty()) {
			if(this.primero.getInfo().equals(info)) {
				borrarPrimero();
			} else {
				NodoGenerico<T> anterior = this.primero;
				NodoGenerico<T> borrar = this.primero.getSig();
				while(!borrar.getInfo().equals(info)) {
					anterior = borrar;
					borrar = borrar.getSig();
				}
				anterior.setSig(borrar.getSig());
				borrar.setSig(null);
				borrar = null;
				this.numElementos--;
			}
		}
	}
	
	/**
	 * @param index
	 * borra el nodo que se encuentre en la posicion indicada
	 */
	public void borrarPosicion(int index) {
		if(!isEmpty()) {
			if(index == 0) {
				borrarPrimero();
			} else if(index == this.numElementos - 1) {
				borrarUltimo();
			} else {
				NodoGenerico<T> anterior = this.primero;
				NodoGenerico<T> borrar = this.primero.getSig();
				for(int i = 1; i < index; i++) {
					anterior = borrar;
					borrar = borrar.getSig();
				}
				anterior.setSig(borrar.getSig());
				borrar.setSig(null);
				borrar = null;
				this.numElementos--;
			}
		}
	}
	
	/**
	 * @param info
	 * @return muestra la lista completa
	 */
	public void mostrarLista() {
		if(!isEmpty()) {
			NodoGenerico<T> aux = this.primero;
			for(int i = 0; i < this.numElementos; i++) {
				System.out.print(aux.getInfo() + " ");
				aux = aux.getSig();
			}
			System.out.println();
		} else {
			System.out.println("Está vacia");
		}
	}
	
	/**
	 * vacia la lista
	 */
	public void borrarLista() {
		while(!isEmpty()) {
			borrarPrimero();
		}
	}
	
	public int tamaño() {
		return this.numElementos;
	}
}
