package Bucles;

public class arbol {
	public static void main(String[] args) {
		 int n = 13;
	        
	        for (int altura = 1; altura <= n; altura++) {
	            for (int espacios = n - altura; espacios > 0; espacios--) {
	                System.out.print(" ");
	            }
	            for (int asteriscos = 1; asteriscos < 2 * altura; asteriscos++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for(int tronco = 1; tronco <= ((n / 2) / 2); tronco++) {
	            for (int espacios = (n / 2); espacios > 0; espacios--) {
	                System.out.print(" ");
	            }
	            for (int asteriscos = 1; asteriscos < n; asteriscos++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
	