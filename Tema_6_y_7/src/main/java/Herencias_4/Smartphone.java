package Herencias_4;

public class Smartphone {
	public static void main(String[] args) {
		
		
		Comanda c1 = new Comanda(1, 4);
		c1.añadirPlatos(new Primero("Patatas", 5.99f, true));
		c1.añadirPlatos(new Primero("Arroz", 9.99f, false));
		c1.añadirPlatos(new Carne("Filete", 8, 1));
		c1.añadirPlatos(new Carne("Toston", 29, 2));
		c1.añadirPlatos(new Carne("Cordero", 25, 3));
		c1.añadirPlatos(new Carne("Solomillo", 15, 4));
		c1.añadirPlatos(new Pescado("Lubina", 15));
		c1.añadirPlatos(new Postre("Helado de chocolate", 2, false));
		c1.añadirPlatos(new Postre("Tarta sin azucar", 5, true));
		
		System.out.println(c1);
		
	}
}
