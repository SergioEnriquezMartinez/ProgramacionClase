package Vivero;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InitCrearArchivoPlantas {

	private static final String RUTA = "Ficheros";
	
	public static void main(String[] args) {
		
		Path fichero = Paths.get(RUTA + "/plantas.bin");
		
		
		try (OutputStream os = Files.newOutputStream(fichero); ObjectOutputStream oos = new ObjectOutputStream(os)) {
			
			System.out.println("Empezamos la escritura del fichero");
			
			oos.writeObject(new Planta(1, "Mimosa", "Acacia dealbata", 19.5, 16));
			oos.writeObject(new Planta(2, "Camelia", "Camellia japonica", 9.95, 28));
			oos.writeObject(new Planta(3, "Hortensia", "Hydrangea macrophylla", 19.5, 4));
			oos.writeObject(new Planta(4, "Acebo", "Ilex Aquifolium", 18, 55));
			oos.writeObject(new Planta(5, "Lirio", "Iris germanica", 3, 36));
			oos.writeObject(new Planta(6, "Madreselva", "Lonicera japonica", 2.50, 40));
			oos.writeObject(new Planta(7, "Cala", "Zantedeschia aethiopica", 8.90, 9));
			oos.writeObject(new Planta(8, "Tejo", "Taxus bacata", 16.50, 5));
			oos.writeObject(new Planta(9, "Romero", "Salvia rosmarinus", 4.5, 68));
			oos.writeObject(new Planta(10, "Azalea", "Rhododendron indicum", 10, 20));
		
			System.out.println("Fin de escritura del fichero");
			
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error al escribir el fichero");
			e.printStackTrace();
		}
	}
}
