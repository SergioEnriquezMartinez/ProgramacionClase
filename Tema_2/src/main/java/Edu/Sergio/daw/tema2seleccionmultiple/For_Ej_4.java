package Edu.Sergio.daw.tema2seleccionmultiple;
/*Desarrola un programa que te muestre todas las tablas de multiplicar del 1 al 10*/

public class For_Ej_4 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i * j);
			}
		}
	}
}
