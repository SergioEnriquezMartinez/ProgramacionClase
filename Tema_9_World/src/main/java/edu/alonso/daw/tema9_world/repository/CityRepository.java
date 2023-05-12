package edu.alonso.daw.tema9_world.repository;

import java.util.Set;

import edu.alonso.daw.tema9_world.dao.CityDAO;
import edu.alonso.daw.tema9_world.dao.CityDAOMySql;
import edu.alonso.daw.tema9_world.model.City;

public class CityRepository {
	
	private CityDAO dao;
	
	private static CityRepository instance;
	
	public static synchronized CityRepository getInstace() {
		if(instance == null) {
			instance = new CityRepository();
		}
		return instance;
	}
	
	private CityRepository() {
		// Si estuviera perfecto: Aquí elegiría el tipo de SGBD y lo instanciaría
		// Leería la configuración y decidiría el motor de BBDD
		/*switch (tipoBBDD) {
		case value:
			this.dao = new CityDAOMySql();
			break;

		default:
			this.dao = new CityDAOOracle();
		}*/
		this.dao = new CityDAOMySql();
	}
	
	
	public Set<City> getAll() {
		return dao.getAll();
	}

	public boolean hashCity(long codigoCiudad) {
		return dao.hashCity(codigoCiudad);
	}

	public Set<City> getCitiesByCountry(String countryName) {
		return dao.getCitiesByCountry(countryName);
	}
	
}
