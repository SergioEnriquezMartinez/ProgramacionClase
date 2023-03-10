package Edu.Sergio.daw.tema1;

public class EjercicioDaw1 {
	public static void main (String[] args ) {
		
		float real1 = 3f;
		float real2 = 2f;
		
		float division1;
		double division2;
		
		
		division1 = real1 / real2;
		
		division2 = real1 / real2;
		
		
		int num1 = 3;
		int num2 = 2;
		
		float division3;
		
		division3 = ((float)num1 / num2);
		
		
		System.out.println( "El resultado de la división es: " + division1 );
		System.out.println( "El resultado compeleto de la division es: " + division2);
		System.out.println( "El resultado compeleto de la division es: " + division3);
		
		
		
		final float CONSTANTE_GRAVEDAD_TIERRA = 9.8f; 
			
		System.out.println(CONSTANTE_GRAVEDAD_TIERRA);
		
			
			
			
			
			
	
	
		final float GRAVITY = 9.8f;
	
	
			System.out.println(GRAVITY);
			
			
		char texto = '~';
					
			System.out.println(texto);
					
		String cad = "Hola DAW";
					
			System.out.println(cad);
			
			System.out.println(cad + texto);
			
			
			
		int num4 = 12;					/*Se pueden crear variables simplemente poniendo coma: int num = , num =*/
		int num5 = 2;
		
		boolean comparacion = num4>num5;   /*El resultado de esta operacion es boleano*/
		
			System.out.println(comparacion);
		
		String result = num4 == num5 ? "Se cumple la condicion" : "No se cumple la condicion"; /*String lo ponemos porque vamos a escribir una cadena de caracteres*/
		System.out.println(result);
			/*System.out.println(num4 == num5 ? "Se cumple la condiciion" : "No se cumple la condicion"); 
			 * Si ponemos la operacion como en la primera opcion solo se ejecuta una vez y 
			 * si lo ponemos como en la segunda se ejecuta todas las veces que queramos mostrarlo en pantalla*/
		
				
					
					
	}
				
					

}
 