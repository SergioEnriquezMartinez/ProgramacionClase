package Listas;

public class Init {
	public static void main(String[] args) {

		Lista lista = new ListaEnlazadaSimple();

		lista.insertAtBegin(Integer.valueOf(1));
		lista.insertAtBegin(Integer.valueOf(2));

		lista.print();

		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());

		lista.insertAtEnd(Integer.valueOf(3));

		lista.print();

		lista.insertAtPosition(Integer.valueOf(9), 2);

		lista.print();

		// Borrado en la primera posición
		lista.removeByInfo(2);
		lista.print();

		// Borrado en el medio
		lista.removeByInfo(9);
		lista.print();
		
		// Borrado en la última posición
		lista.removeByInfo(3);
		lista.print();
		
		// Llenamos la lista de nuevo:
		lista.insertAtBegin(Integer.valueOf(3));
		lista.insertAtBegin(Integer.valueOf(4));
		
		lista.print();
		
		// Limpio la lista por completo:
		
		lista.clearList();
		System.out.println("Lista vacía: ");
		lista.print();
		
		

		lista.insertAtBegin(Integer.valueOf(1));
		lista.insertAtBegin(Integer.valueOf(2));
		lista.insertAtEnd(Integer.valueOf(3));
		lista.insertAtPosition(Integer.valueOf(9), 2);
		
		lista.print();
		
		lista.removeAt(0);
		lista.print();
		lista.removeAt(2);
		lista.print();
	}

}
