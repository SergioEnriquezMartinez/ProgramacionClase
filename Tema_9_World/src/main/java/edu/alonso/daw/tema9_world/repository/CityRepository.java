package edu.alonso.daw.tema9_world.repository;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.alonso.daw.tema9_world.dao.CityDAO;
import edu.alonso.daw.tema9_world.dao.CityDAOMySql;
import edu.alonso.daw.tema9_world.model.City;
import edu.alonso.daw.tema9_world.utils.ConfigLoader;

public class CityRepository {
	
	private CityDAO dao;
	
	private static CityRepository instance;
	
	private static Logger logger = LogManager.getLogger(CityRepository.class);
	
	public static synchronized CityRepository getInstace() {
		if(instance == null) {
			instance = new CityRepository();
		}
		return instance;
	}
	
	private CityRepository() {
		logger.info("Creando el dao para City...");
		
		if(ConfigLoader.getInstance().getDb_type().equalsIgnoreCase("mysql")) {
			this.dao = new CityDAOMySql();
		}
		
		logger.info("Dao para City creado con éxito");
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
