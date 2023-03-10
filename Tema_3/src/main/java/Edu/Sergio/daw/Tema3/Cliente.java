package Edu.Sergio.daw.Tema3;

public class Cliente {
		
	//Atributos
	
	private String nombre;
	private String dni;
	private int telefono;
	
	//Metodos
	
		//Constructor
		public Cliente(String nombre, String dni) {
			this.nombre = nombre;
			this.dni = dni;
		}
		
		//Getters y Setters
		public String getNombre() {
			return this.nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getDni( ) {
			return this.dni;
		}
		
		public void setDni(String dni) {
			this.dni = dni;
		}
		
		public int getTelefono() {
			return this.telefono;
		}
		
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
}
