package edu.alonso.daw.tema9_world.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.alonso.daw.tema9_world.repository.CityRepository;

public class DBConnection {
	
	private static Logger logger = LogManager.getLogger(DBConnection.class);
	
	/*private final String DB_NAME = "world";
	private final String URL ="jdbc:mysql://127.0.0.1:3306/" + DB_NAME;
	private final String USER = "root";
	private final String PASS = "";*/

	private Connection conn = null;
	
	// Específico del singleton
	
	// Instancia de él mismo
	private static DBConnection instance;
	
	// Método para recuperar el objeto
	public static synchronized DBConnection getInstance() {
		if(instance == null) {
			instance = new DBConnection();
		}
		
		return instance;
	}

	
	// Constructor siempre privado en un singleton
	private DBConnection() {
		// Esto cambia de un singleton a otro
		logger.info("Creando la conexión con la BBDD...");
		
		// SOLO PARA MYSQL
		// Registramos el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.conn = DriverManager.getConnection(ConfigLoader.getInstance().getDb_url() + ConfigLoader.getInstance().getDb_name(), ConfigLoader.getInstance().getDb_user(), ConfigLoader.getInstance().getDb_pass());
			logger.info("Conexión de BBDD creada con éxito!!");
		} catch (SQLException e) {
			logger.error("Error al crear la conexión con la base de datos.", e);
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	
	public void destroyConnection() {
		try {
			logger.info("Cerrando la conexión de BBDD...");
			this.conn.close();
			logger.info("Conexión de BBDD cerrada con éxito!!");
		} catch (SQLException e) {
			logger.error("Error al cerrar la conexión con la base de datos.", e);
		} finally {
			instance = null;
		}
	}
	
	
}
