package Rectangulo;

public class init {
	public static void main(String[] args) {
		
		Rectangulo rec = new Rectangulo();
		
		rec.imprimeRectangulo();
		
		System.out.println("Es horizontal?: " + rec.isHorizontal());
		
		System.out.println("Área: " + rec.getArea());
		System.out.println("Perímetro: " + rec.getPerimetro());
	}
}
