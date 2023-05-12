package edu.alonso.daw.tema9_world.dao;

import java.util.Set;

import edu.alonso.daw.tema9_world.model.City;

public interface CityDAO {

	Set<City> getAll();

	boolean hashCity(long codigoCiudad);

	Set<City> getCitiesByCountry(String countryName);

}
