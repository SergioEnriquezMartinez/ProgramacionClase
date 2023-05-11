package Pdf2_Ej2_Peonadas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		Path file = Paths.get("Ficheros/Trabajadores.txt");
		
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
	
	
	public static void totalPeonadas(ArrayList<Trabajador> lista) {
		
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
		trabajadores = lista;
		Path file = Paths.get("Ficheros/Peonadas.txt");
		
		try (BufferedReader br = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
			
			String linea = null;
			String [] filtrados = null;
			
			while((linea = br.readLine()) != null) {
				filtrados = linea.split("[:,]");
				for (int i = 0; i < lista.size(); i++) {
					for (int j = 0; j < filtrados.length; j++) {
						if (lista.get(i).getNombre().equals(filtrados[j])) {
							lista.get(i).setPeonadas();
						}
					}
					
				}
			}
			System.out.println("Generando fichero.");
			
			Path file2 = Paths.get("Ficheros/TotalPeonadas.txt");
			
			try (BufferedWriter bw = Files.newBufferedWriter(file2, StandardCharsets.UTF_8)) {
				
				for (Trabajador t : trabajadores) {
					bw.write(t.toString() + "\n");
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Acabado.");
	}
	
	public static void main(String[] args) {
		totalPeonadas(crearListaTrabajadores());
	}
	
}
