package edu.alonso.daw.tema9_world.service;

import java.util.Set;

import edu.alonso.daw.tema9_world.model.City;
import edu.alonso.daw.tema9_world.repository.CityRepository;

public class CityService {
	
	
	// Aquí vienen todas las funcionalidades
	
	public Set<City> listadoCiudades() {
		return CityRepository.getInstace().getAll();
	}
	
	public boolean existeCiudad(long codigoCiudad) {
		return CityRepository.getInstace().hashCity(codigoCiudad);
	}
	
	public Set<City> listaCiudades(String nombrePais) {
		return CityRepository.getInstace().getCitiesByCountry(nombrePais);
	}

}
