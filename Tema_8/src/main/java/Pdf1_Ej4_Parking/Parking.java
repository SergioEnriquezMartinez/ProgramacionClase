package Pdf1_Ej4_Parking;

import java.util.Arrays;

public class Parking {

	private int capacidad;
	private Ticket[] tickets;

	public Parking() {
		this.capacidad = 0;
		this.tickets = new Ticket[5];
	}

	public boolean addTicket(Ticket t) throws TicketException {
		if (this.capacidad < this.tickets.length) {
			for (int i = 0; i < tickets.length; i++) {
				if (tickets[i] == null) {
					tickets[i] = t;
					this.capacidad++;
					System.out.println("Nuevo ticket añadido.");
					return true;
				} else {
					if (tickets[i].getMatricula().equals(t.getMatricula())) {
						throw new TicketException("Ya existe un ticket para esa matrícula.");
					}
				}
			}
		} else {
			throw new TicketException("El parking está lleno.");
		}
		return false;
	}

	public void removeTicket(Ticket t) throws TicketException {
		if (t.isPagado() == true) {
			t = null;
			System.out.println("El ticket ha sido eliminado correctamente");
		} else {
			throw new TicketException("Ha de abonar el importe del ticket antes de poder eliminarlo");
		}
	}

	public void pagarTicket(String matricula) throws TicketException {
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null) {
				if (tickets[i].getMatricula().equalsIgnoreCase(matricula)) {
					tickets[i].calcularPrecio(matricula);
					tickets[i].setPagado(true);
					removeTicket(tickets[i]);
					break;
				}
			}
		}
		System.out.println("No existe esa matricula");
	}

	public void mostrarInfo() {

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] != null) {
				System.out.println("Entro aquí");
				System.out.println(tickets[i]);
			}
		}
	}

	public void mostrarPlazasLibres() {
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i] == null) {
				System.out.println(tickets[i]);
			}
		}
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Ticket[] getTickets() {
		return tickets;
	}

	public void setTickets(Ticket[] tickets) {
		this.tickets = tickets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tickets);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parking other = (Parking) obj;
		return Arrays.equals(tickets, other.tickets);
	}

	@Override
	public String toString() {
		return "Parking [tickets=" + Arrays.toString(tickets) + "]";
	}

}
