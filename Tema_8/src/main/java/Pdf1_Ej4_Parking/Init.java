package Pdf1_Ej4_Parking;


public class Init {
	public static void main(String[] args) {
		Parking p = new Parking();
		Ticket t = new Ticket("434343X");
		Ticket t2 = new Ticket("434343X");
		Ticket t3 = new Ticket("523453X");
		Ticket t4 = new Ticket("434343c");
		Ticket t5 = new Ticket("1234343X");
		Ticket t6 = new Ticket("78t343X");
		Ticket t7 = new Ticket("78t343f");

		try {
			p.addTicket(t);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();w
			System.err.println(e.getMessage());
		}
		try {
			p.removeTicket(t);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.err.println(e.getMessage());
		}

		try {
			p.addTicket(t2);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		try {
			p.addTicket(t3);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		try {
			p.addTicket(t4);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		try {
			p.addTicket(t5);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		try {
			p.addTicket(t6);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		try {
			p.addTicket(t7);
		} catch (TicketException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		
	}
}
