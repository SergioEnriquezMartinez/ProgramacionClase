package Listas;

public class ListaEnlazadaSimpleExtendida implements Lista {
	private Nodo primero;
	private int numElementos;
	
	public ListaEnlazadaSimpleExtendida() {
		this.primero = null;
		this.numElementos = 0;
	}
	
	
	@Override
	public boolean isEmpty() {
//		return primero == null;
		return numElementos == 0;
	}


	@Override
	public Integer getFirst() {
		if(!isEmpty()) {
			return this.primero.getInfo();
		}
		return null;
	}


	@Override
	public Integer getLast() {
		if(!isEmpty()) {
			Nodo aux = this.primero;
			while(aux.getSig() != null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}


	@Override
	public void insertAtBegin(Integer info) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insertAtEnd(Integer info) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void insertAtPosition(Integer info, int index) {
		if(index <= this.numElementos && index >= 0) {
			if(isEmpty()) {
				// Lista vacía
				Nodo nuevo = new Nodo(info);
				this.primero = nuevo;
				this.numElementos++;
			} else {
				if(index == 0) {
					// Inserto al principio
					Nodo nuevo = new Nodo(info);
					nuevo.setSig(this.primero);
					this.primero = nuevo;
					this.numElementos++;
				} else if(index == this.numElementos) {
					// Inserto al final
					Nodo nuevo = new Nodo(info);
					Nodo aux = this.primero;
					while(aux.getSig() != null) {
						aux = aux.getSig();
					}
					aux.setSig(nuevo);
					this.numElementos++;
				} else {
					// Inserto en algun punto "intermedio"
					Nodo nuevo = new Nodo(info);
					Nodo aux = this.primero;
					for (int i = 1; i < index; i++) {
						aux = aux.getSig();
					}
					nuevo.setSig(aux.getSig());
					aux.setSig(nuevo);
					this.numElementos++;
				}
			}
		}
		
	}


	@Override
	public boolean containsInfo(Integer info) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Integer getElementAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean removeByInfo(Integer info) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean removeAt(int index) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean clearList() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
