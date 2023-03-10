package Herencias_1;

import java.util.ArrayList;
import java.util.List;

public class Init {
	public static void main(String[] args) {
		
		
		
		List<Figuras> listado = new ArrayList<Figuras>();
		Figuras circulo = new Circulo("Rojo", 10);
		
		System.out.println("Primera figura " + circulo);
		
		Figuras cuadrado = new Cuadrado("Verde", 5);
		
		System.out.println("Segunda figuar " + cuadrado);
		
		Figuras triangulo = new Triangulo("Amarillo", 2, 2, 2, 2, 5);
		
	}
}
