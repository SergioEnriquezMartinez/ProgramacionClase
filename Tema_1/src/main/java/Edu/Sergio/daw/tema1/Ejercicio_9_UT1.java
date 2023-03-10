package Edu.Sergio.daw.tema1;

import java.util.Scanner;

public class Ejercicio_9_UT1 {
	public static void main (String[] args) {
		 Scanner leer = new Scanner(System.in); //se crea objeto tipo scanner


	        System.out.println("Ingrese valores ax,bx,c separados por ',': ");

	        String valores = leer.nextLine(); //obtiene los valores a,b,c separados por ','


	        String [] numeros = valores.split(","); //separa los numeros


	        int a = Integer.parseInt(numeros[0]); //variable a almacenada es trasformada a int

	        int b = Integer.parseInt(numeros[1]); //variable b almacenada es trasformada a int

	        int c = Integer.parseInt(numeros[2]); //variable v almacenada es trasformada a int

	        //Obtiene los valores x1,x2 de la ecuación

	        double x1 = (-b + Math.sqrt((b*b) - (4 * a * c))) / (2 * a);

	        double x2 = (-b - Math.sqrt((b*b) - (4 * a * c))) / (2 * a);

	        //imprime los valores

	        System.out.println("La solucion de x1: " + x1);

	        System.out.println("La solucion de x2: " + x2);
        
        leer.close();
	     
	}
}
