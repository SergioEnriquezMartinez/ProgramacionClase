package edu.alonso.daw.tema9_world;

import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.alonso.daw.tema9_world.model.City;
import edu.alonso.daw.tema9_world.service.CityService;
import edu.alonso.daw.tema9_world.utils.DBConnection;

public class Init {

	private static Logger logger = LogManager.getLogger(Init.class);
	
	public static void main(String[] args) {
		
		
		
		logger.debug("Example log from");
		logger.info("Example log from");
		logger.warn("Example log from");
		logger.error("Example log from");
		logger.fatal("Example log from");
		

		Scanner sc = new Scanner(System.in);
		int opt = 0;
		CityService cs = new CityService();
		Set<City> ciudades = null;

		do {

			System.out.println("\n----MENU----");
			System.out.println("\t1-MOSTRAR CIUDADES");
			System.out.println("\t2-MOSTRAR PAÍSES");
			System.out.println("\t3-COMPROBAR CIUDAD");
			System.out.println("\t4-COMPROBAR PAÍS");
			System.out.println("\t5-BUSCAR CIUDAD");
			System.out.println("\t6-BUSCAR PAÍS");
			System.out.println("\t7-BUSCAR CIUDADES DE UN PAÍS");
			System.out.println("\t8-BUSCAR PAÍS DE UNA CIUDAD");
			System.out.println("\t9-COMPROBAR CIUDAD DE UN PAÍS");
			System.out.println("\t10-NÚMERO DE CIUDADES");
			System.out.println("\t11-NÚMERO DE PAÍSES");
			System.out.println("\t12-NÚMERO DE CIUDADES DE UN PAÍS");
			System.out.println("\t13-CAMBIAR NOMBRE CIUDAD");
			System.out.println("\t14-AÑADIR CIUDAD");
			System.out.println("\t15-AÑADIR PAÍS");
			System.out.println("\t16-CERRAR CONEXIÓN CON BD");
			System.out.println("\t17-SALIR");
			System.out.println("\n\n");

			do {
				System.out.println("Introduzca la opción deseada: ");
				opt = Integer.valueOf(sc.nextLine());
			} while (opt < 1 || opt > 17);

			switch (opt) {
			case 1:
				System.out.println("----Muestro las ciudades----");
				ciudades = cs.listadoCiudades();

				for (City city : ciudades) {
					System.out.println(city);
				}

				break;
			case 3:
				System.out.println("----Compruebo una ciudad----");
				System.out.println("Introduzca el código de la ciudad a comprobar: ");
				
				long codigoCiudad = Long.valueOf(sc.nextLine());
				
				System.out.println(cs.existeCiudad(codigoCiudad) ? "Sí está en la BD" : "No encontrado.");

				break;
			case 7:
				System.out.println("----Muestro las ciudades por nombre de país----");
				
				System.out.println("Introduzca el código de la ciudad a comprobar: ");
				
				String nombrePais = sc.nextLine();
				
				ciudades = cs.listaCiudades(nombrePais);

				for (City city : ciudades) {
					System.out.println(city);
				}

				break;
				
			case 16:
				System.out.println("----Cerrar la conexión de DB----");
				DBConnection.getInstance().destroyConnection();
				break;

			default:
				break;
			}
		} while (opt != 17);
		
		// Fin del programa
		DBConnection.getInstance().destroyConnection();
		
		sc.close();

	}

}
