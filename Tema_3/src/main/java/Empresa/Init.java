package Empresa;

public class Init {
	public static void main(String[] args) {
		
		
		Directivo e1 = new Directivo("Fran", "123456789A", 30, 30000, 0.1);
		Desarrollador d1 = new Desarrollador("Juan", "987654321B", 24, 19000, true, true, false);
		Tester t1 = new Tester("Sara", "2342356C", 25, 17000, 4);
		
		
		
		Empresa em1 = new Empresa(e1, d1);
		em1.setTester1(t1);
		
		System.out.println(em1);
	}
	
}
