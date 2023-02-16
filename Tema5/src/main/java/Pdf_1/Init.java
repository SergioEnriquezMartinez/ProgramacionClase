package Pdf_1;

public class Init {
	public static void main(String[] args) {
		
VideoClub vc = new VideoClub();
		
		Cliente cli = new Cliente(12345, "Fran");
		
		System.out.println(vc.aniadirCliente(cli));
		System.out.println(vc.aniadirCliente(cli));
//		vc.aniadirCliente(cli);
//		vc.aniadirCliente(cli);
		
		Cliente clienteBuscar = vc.buscarCliente(1235);
//		clienteBuscar.setNombre("Fran2");
		if(clienteBuscar != null) {
			clienteBuscar.setNombre("Fran2");
		}
		
		
		System.out.println(clienteBuscar);
	}
}
