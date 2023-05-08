package Pdf2_Ej1_Peonadas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Init {

	
	/**
	 * @return devuelve la lista de tipo Trabajador que crea este mismo método
	 */
	public static ArrayList<Trabajador> crearListaTrabajadores() {
		
		ArrayList<Trabajador> lista = new ArrayList<Trabajador>();
		Path file = Paths.get("/Trabajadores.txt");
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			
			System.out.println("Empezamos a crear la lista de trabajadores.");
			String linea = null;
			
			while ((linea = br.readLine()) != null) {
				String nombre = linea;
				lista.add(new Trabajador(nombre));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
}
