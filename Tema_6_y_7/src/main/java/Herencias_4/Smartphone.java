package Herencias_4;

public class Smartphone {
	public static void main(String[] args) {
		
		Plato p1 = new Primero("Patatas", 5.99f, true);
		Plato p2 = new Primero("Arroz", 9.99f, false);
		
		Plato p3 = new Carne("Filete", 8, 1);
		Plato p4 = new Carne("Toston", 29, 2);
		Plato p5 = new Carne("Cordero", 25, 3);
		Plato p6 = new Carne("Solomillo", 15, 4);
		
		Plato p7 = new Pescado("Lubina", 15);
		
		Plato p8 = new Postre("Helado de chocolate", 2, false);
		Plato p9 = new Postre("Tarta sin azucar", 5, true);
		
		Comanda c1 = new Comanda(1, 4);
		c1.añadirPlatos(p1);
		c1.añadirPlatos(p2);
		c1.añadirPlatos(p3);
		c1.añadirPlatos(p4);
		c1.añadirPlatos(p5);
		c1.añadirPlatos(p6);
		c1.añadirPlatos(p7);
		c1.añadirPlatos(p8);
		c1.añadirPlatos(p9);
		
		System.out.println(c1);
		
	}
}
