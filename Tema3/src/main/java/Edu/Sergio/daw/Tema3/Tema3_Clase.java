package Edu.Sergio.daw.Tema3;

public class Tema3_Clase {
	public static void main(String[] args) {
		
		Cliente alejandro = new Cliente("Alejandro el jefe de la clase", "72342389-J");
		
		
		
		System.out.println("Nombre del cliente: " + alejandro.getNombre());
		System.out.println("DNI del cliente: " + alejandro.getDni());
		System.out.println("Telefono del cliente: " + alejandro.getTelefono());
	}
}
