package Bucles;

/*Desarrolla un programa que visualice en la pantalla la siguiente figura:
*
* * *
* * * * *
* * * * * * *
* * * * *
* * *
*
@author Serj*/
public class Bucles_Ej_11 {
	public static void main(String[] args) {
		for (int altura = 1; altura <= 4; altura++) {						//Para imprimir la mitad superior del rombo
			for (int espacio = 4 - altura; espacio > 0; espacio--) {		//Para imprimir los espacios de cada fila en la mitad superior
				System.out.print(" ");
			}
			for (int asterisco = 1; asterisco < 2 * altura; asterisco++) {	//Para imprimir cada fila en la mitad superior
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int altura = 3; altura >= 1; altura--) {						//Para impripir la mitad inferior del rombo
			for (int espacio = 4 - altura; espacio > 0; espacio--) {		//Para imprimir los espacios de cada fila en la mitad inferior
				System.out.print(" ");
			}
			for (int asterisco = 1; asterisco < 2 * altura; asterisco++) {	//Para imprimir cada fila en la mitad inferior
				System.out.print("*");
			}
			System.out.println("");											//Para salto de fila

		}
	}
}
