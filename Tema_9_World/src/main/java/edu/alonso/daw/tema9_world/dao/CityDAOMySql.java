package edu.alonso.daw.tema9_world.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import edu.alonso.daw.tema9_world.model.City;
import edu.alonso.daw.tema9_world.utils.DBConnection;

public class CityDAOMySql implements CityDAO {

	private final String SELECT_CITIES = "SELECT * FROM CITY";
	private final String SELECT_CITY = "SELECT * FROM CITY WHERE ID=?";

	private final String SELECT_CITIES_BY_COUNTRY_NAME = "SELECT C.*" + " FROM CITY C  "
			+ " INNER JOIN COUNTRY CO ON CO.CODE = C.COUNTRYCODE" + " WHERE CO.NAME=?";

	@Override
	public Set<City> getAll() {
		Set<City> ciudades = new HashSet<>();

		try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_CITIES);) {

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				City c = new City(rs.getLong("id"), rs.getString("name"), rs.getString("countrycode"),
						rs.getString("district"), rs.getLong("population"));
				ciudades.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ciudades;
	}

	@Override
	public boolean hashCity(long codigoCiudad) {
		boolean res = false;

		try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_CITY);) {

			// Preparo la consulta
			stmt.setLong(1, codigoCiudad);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				// System.out.println("Comprobación: " + rs.getString("name"));

				if (rs.getLong("id") == codigoCiudad) {
					res = true;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

	@Override
	public Set<City> getCitiesByCountry(String countryName) {
		Set<City> ciudades = new HashSet<>();
		try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(SELECT_CITIES_BY_COUNTRY_NAME);) {

			// Preparo la consulta
			stmt.setString(1, countryName);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				City c = new City(rs.getLong("id"), rs.getString("name"), rs.getString("countrycode"),
						rs.getString("district"), rs.getLong("population"));
				ciudades.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ciudades;
	}

}
