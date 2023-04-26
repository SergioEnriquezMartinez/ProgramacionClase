package Pdf1_Ej3_Amigos;

public class Init {
	public static void main(String[] args) {
		
		Pandilla p = new Pandilla();
		
		Amigo a1 = new Amigo("Jose", "Pepe");
		Amigo a2 = new Amigo("Manuel", "Manolo el del bombo");
		Amigo a3 = new Amigo("Michel", "El Roman Grosjean de Avila");
		Amigo a4 = new Amigo("Sergio", "Amigo de @rCobre");
		Amigo a5 = new Amigo("Andres", "EL PEREGRINO");
		
		try {
			p.addAmigo(a1);
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.addAmigo(a2);
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.addAmigo(a3);
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.addAmigo(a4);
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.addAmigo(a5);
		} catch (NoMeGustaTuNombreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PandillaCompletaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.mostrarLista();
		
	}
}
