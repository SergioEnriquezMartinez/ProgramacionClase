package Pdf1_Ej4_Parking;

import java.util.Scanner;

public class InitMenu {
	public static void main(String[] args) throws TicketException {

		boolean condicion = false;
		String menu;
		char opcionMenu;
		Scanner sc = new Scanner(System.in);

		while (condicion == false) {
			System.out.println("Elija la opción que desee: ");
			System.out.println("---------------------------");
			System.out.println("1. Entrar al parking");
			System.out.println("2. Pagar y salir del parking");
			System.out.println("3. Mostrar la información de los coches del parking");
			System.out.println("4. Mostrar la cantidad de plazas disponibles");
			System.out.println("5. Salir");

			menu = sc.nextLine();
			opcionMenu = menu.charAt(0);
			Parking p = new Parking();
			switch (opcionMenu) {
			case '1':
				System.out.println("Introduzca su matricula");
				String matricula = sc.nextLine();
				p.addTicket(new Ticket(matricula));
				System.out.println(p.addTicket(new Ticket(matricula)));
				System.out.println("Vehículo añadido correctamente");
				break;
			case '2':
				System.out.println("Introduzca su matricula");
				matricula = sc.nextLine();
				p.pagarTicket(matricula);
				condicion = true;
				break;
			case '3':
				p.mostrarInfo();
				break;
			case '4':
				p.mostrarPlazasLibres();
				break;
			case '5':
				condicion = true;
				break;
			}
		}

		sc.close();
	}
}
