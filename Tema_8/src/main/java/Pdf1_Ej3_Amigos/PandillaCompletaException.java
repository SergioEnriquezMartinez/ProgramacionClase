package Pdf1_Ej3_Amigos;

public class PandillaCompletaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PandillaCompletaException() {
		super();
	}
	
	public PandillaCompletaException(String message) {
		super(message);
	}
	
	public PandillaCompletaException(String message, Throwable e) {
		super(message, e);
	}
}
