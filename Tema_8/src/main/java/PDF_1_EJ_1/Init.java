package PDF_1_EJ_1;

public class Init {
	public static void main(String[] args) {
		
		Cliente cli = new Cliente("Fran", "123456789A");
		
		CuentaCorriente cc = new CuentaCorriente("ES91 1234 1234 12 1234123409", cli);
		
		//Hacemos un ingreso
		cc.ingreso(100);
		
		System.out.println(cc);
		
		try {
			cc.reintegro(120);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		
		System.out.println(cc);
	}
	
}
