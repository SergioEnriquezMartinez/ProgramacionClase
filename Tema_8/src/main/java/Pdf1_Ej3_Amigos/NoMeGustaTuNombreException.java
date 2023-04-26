package Pdf1_Ej3_Amigos;

public class NoMeGustaTuNombreException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public NoMeGustaTuNombreException() {
		super();
	}
	
	public NoMeGustaTuNombreException(String message) {
		super(message);
	}
	
	public NoMeGustaTuNombreException(String message, Throwable e) {
		super(message, e);
	}
}
