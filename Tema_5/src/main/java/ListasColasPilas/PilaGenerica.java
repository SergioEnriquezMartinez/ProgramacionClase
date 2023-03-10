package ListasColasPilas;

public class PilaGenerica<T> {
	private NodoGenerico<T> primero;
	private NodoGenerico<T> ultimo;
	private int tamaño;
	
	
	public PilaGenerica() {
		this.primero = this.ultimo = null;
		this.tamaño = 0;
	}
	
	
	/**
	 * @return nos devuelve un booleano si la cola esta o no vacia
	 */
	public boolean isEmpty() {
		return tamaño == 0;
	}
	
	
	/**
	 * añade un elemento a la pila por el final
	 * tomamos como referencia que ultimo es el ultimo en entrar
	 * y primero es el primero en entrar(ultimo en salir)
	 * Las referencias en lugar de apuntar desde el ultimo al nuevo, apuntan del nuevo al ultimo
	 */
	public void apilar(T info) {
		NodoGenerico<T> nuevo = new NodoGenerico<T>(info);
		if(isEmpty()) {
			this.primero = this.ultimo = nuevo;
		} else {
			nuevo.setSig(this.ultimo);//
			this.ultimo = nuevo;
		}
		this.tamaño++;
	}
	
	/**
	 * extrae un elemento de la pila por el final(cima)
	 */
	public T desapilar() {
		if(!isEmpty()) {
			NodoGenerico<T> desapilar = this.ultimo;
			this.ultimo = desapilar.getSig();
			T info = desapilar.getInfo();
			desapilar.setSig(null);
			desapilar = null;
			this.tamaño--;
			return info;
		}
		return null;
	}
	
	/**
	 * @return nos muestra el elemento de la cima sin extraerlo
	 */
	public T mostrarCima() {
		if(!isEmpty()) {
			return this.ultimo.getInfo();
		}
		return null;
	}
	
	/**
	 * nos muestra la pila segun el orden de salida de sus elementos
	 */
	public void mostrarPilaSalida() {
		if(!isEmpty()) {
			NodoGenerico<T> aux = this.ultimo;
			while(aux != this.primero) {
				System.out.print(aux.getInfo() + "");
				aux = aux.getSig();
			}
			System.out.println(aux.getInfo());//== this.primero.getInfo()
		} else {
			System.out.println();
		}
		
	}
	
}
