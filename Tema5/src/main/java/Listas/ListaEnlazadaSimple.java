package Listas;

public class ListaEnlazadaSimple implements Lista {
	private Nodo primero;
	private int numElementos;

	public ListaEnlazadaSimple() {
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
		if (!isEmpty()) {
			return this.primero.getInfo();
		}
		return null;
	}

	@Override
	public Integer getLast() {
		if (!isEmpty()) {
			Nodo aux = this.primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}

	@Override
	public void insertAtBegin(Integer info) {
		Nodo nuevo = new Nodo(info);
		if (!isEmpty()) {
			nuevo.setSig(this.primero);
		}
		this.primero = nuevo;
		this.numElementos++;
	}

	@Override
	public void insertAtEnd(Integer info) {
		Nodo nuevo = new Nodo(info);

		if (isEmpty()) {
			// Lista vacía
			this.primero = nuevo;
		} else {
			Nodo aux = this.primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			aux.setSig(nuevo);
		}
		this.numElementos++;
	}

	@Override
	public void insertAtPosition(Integer info, int index) {
		if (index <= this.numElementos && index >= 0) {
			if (isEmpty()) {
				insertAtBegin(info);
			} else {
				if (index == 0) {
					// Inserto al principio
					insertAtBegin(info);
				} else if (index == this.numElementos) {
					insertAtEnd(info);
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
		Nodo aux = this.primero;
		while(aux != null) {
			if(aux.getInfo().equals(info)) {
				return true;
			}
			aux = aux.getSig();
		}
		
		return false;
	}

	@Override
	public Integer getElementAt(int index) {
		if(index <= numElementos && index >= 0 && !isEmpty()) {
			Nodo aux = primero;
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		
		return null;
	}

	@Override
	public boolean removeByInfo(Integer info) {
		if(!isEmpty()) {
			if(primero.getInfo().equals(info)) {
				// Borrado del primer elemento
				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				borrar = null;
				numElementos--;
				return true;
			} else {
				Nodo ant = primero;
				Nodo borrar = primero.getSig();
				while(borrar != null) {
					if(borrar.getInfo().equals(info)) {
						ant.setSig(borrar.getSig());
						borrar.setSig(null);
						borrar = null;
						numElementos--;
						return true;
					}
					ant = ant.getSig();
					borrar = borrar.getSig();
				}
			}
		}

		return false;
	}

	@Override
	public boolean removeAt(int index) {
		if(index <= numElementos && index >= 0 && !isEmpty()) {
			if(index == 0) {
				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				borrar = null;
				numElementos--;
				return true;
			} else {
				Nodo ant = primero;
				Nodo borrar = primero.getSig();
				int i = 1; //Variable para comparar con la posición que queremos encontrar
				while(borrar != null) {
					if(i == index) {
						ant.setSig(borrar.getSig());
						borrar.setSig(null);
						borrar = null;
						numElementos--;
						return true;
					}
					i++;
					ant = ant.getSig();
					borrar = borrar.getSig();
				}
			}
		}
		return false;
	}

	@Override
	public void print() {
		System.out.println("La lista contiene:");
		if(isEmpty()) {
			System.out.println("La lista está vacía");
		} else {
			Nodo aux = this.primero;
			while(aux.getSig() != null) {
				System.out.print(aux.getInfo() + " -> ");
				aux = aux.getSig();
			}
			System.out.println(aux.getInfo());
		}

	}

	@Override
	public boolean clearList() {
		while(!isEmpty()) {
			removeAt(0);
		}
		return isEmpty();
	}

	@Override
	public int size() {
		return numElementos;
	}

}
